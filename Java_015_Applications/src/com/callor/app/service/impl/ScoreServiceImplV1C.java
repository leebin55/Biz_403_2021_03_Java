package com.callor.app.service.impl;

//InputService 를 이용해서 다시 한 번 작성해보기!!

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1C implements ScoreService {

	protected Scanner scan;
	List<ScoreVO> scoreList;
	String[] subs;

	public ScoreServiceImplV1C() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		subs = new String[] { "국어", "영어", "수학" };
	}

	@Override
	public void selectMenu() {
		// TODO 메뉴선택
		while (true) {
			System.out.println("┌──────────┐");
			System.out.println("│ 메뉴선택 │");
			System.out.println("└──────────┘");

			System.out.println("┌────────────────────────┐");
			System.out.println("│ ① 성적입력            │");
			System.out.println("│ ② 성적출력            │");
			System.out.println("│ ③ 종료                │");
			System.out.println("└────────────────────────┘");
			System.out.println("-".repeat(70));
			System.out.print("보기선택 >> ");
			String strMenu = scan.nextLine();
			Integer intMenu = 0;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (NumberFormatException e) {
				System.out.println("잘못 입력하셨습니다");
				continue;
			}
			if (intMenu == 1) {
				this.inputScore();
			} else if (intMenu == 2) {
				this.printScore();
			} else if (intMenu == 3) {
				System.out.println();
				System.out.println("종료합니다 BYE");
				return;
			} else {
				System.out.println("보기의 메뉴만 입력해주세요 ");
				continue;
			}
		}
	}

	@Override
	public String inputName() {
		// TODO 학생의 이름 입력 (QUIT : 선택메뉴로 / 빈칸 : 다시입력)
		while (true) {
			System.out.println("┌──────────┐");
			System.out.println("│   이름   │");
			System.out.println("└──────────┘");
			System.out.print(" >> ");
			String name = scan.nextLine();
			if (name.trim().equals("QUIT")) {
				System.out.println("【  선택메뉴로 돌아갑니다 】");
				this.selectMenu();//selectMenu 비효율적 다시 만들기 InputService호출해서
			} else if (name.trim().equals("")) {
				System.out.println("【  이름을 입력해 주세요 】");
				continue;
			}
			return name;
		}
	}

	public String inputNum() {
		// TODO 학생의 학번 입력 (QUIT : 선택메뉴로 / 빈칸 : 다시입력)
		while (true) {
			System.out.println("┌──────────┐");
			System.out.println("│   학번   │");
			System.out.println("└──────────┘");
			System.out.print(" >> ");
			String strNum = scan.nextLine();
			if (strNum.trim().equals("QUIT")) {
				System.out.println("【  선택메뉴로 돌아갑니다 】");
				this.selectMenu();
			} else if (strNum.trim().equals("")) {
				System.out.println("【  학번을 입력해 주세요 】");
				continue;
			}
			return strNum;
		}
	}

	@Override
	public void inputScore() {
		// TODO 0에서 100까지 정수만 입력

		String strNum = this.inputNum();
		String strName = this.inputName();
		int[] scores = new int[subs.length];
		for (int i = 0; i < subs.length; i++) {
			while (true) {
				System.out.println(strName + "학생의 " + subs[i] + " 점수를 입력하세요");
				System.out.print(" >> ");
				String strScore = scan.nextLine();
				try {
					scores[i] = Integer.valueOf(strScore);
				} catch (NumberFormatException e) {
					System.out.println();
					System.out.println("정수만 입력해주세요");
					System.out.println();
					continue;
				}
				if (scores[i] < 0 || scores[i] > 100) {
					System.out.println();
					System.out.println(" ---- 점수는 0 ~ 100 만 입력 ----");
					System.out.println();
					continue;
				}
				break;
			}
		}
		ScoreVO scVO = new ScoreVO();
		scVO.setKor(scores[0]);
		scVO.setEng(scores[1]);
		scVO.setMath(scores[2]);
		scVO.setName(strName);
		scVO.setNum(strNum);
		scoreList.add(scVO);
		return;
		/*
		 * while (true) { 
		 * String strName = this.inputName();
		 * System.out.println(strName+ "학생의 국어성적"); 
		 * System.out.print(" >>  ");
		 * String strKor = scan.nextLine();
		 * Integer intKor;
		 * try { 
		 * intKor = Integer.valueOf(strKor); 
		 * } catch
		 * (NumberFormatException e) { 
		 * System.out.println("정수만 입력");
		 *  continue; 
		 *  }
		 * 
		 * System.out.println(strName + "학생의 영어성적");
		 *  System.out.print(" >>  "); 
		 *  String strEng = scan.nextLine(); 
		 *  Integer intEng; 
		 *  try { 
		 *  intEng =Integer.valueOf(strKor); 
		 *  } catch (NumberFormatException e) {
		 * System.out.println("정수만 입력"); 
		 * continue; 
		 * }
		 * 
		 * System.out.println(strName + "학생의 수학성적"); 
		 * System.out.print(" >>  "); 
		 * StringstrMath = scan.nextLine(); 
		 * Integer intMath; 
		 * try { 
		 * intMath = Integer.valueOf(strKor); 
		 * } catch (NumberFormatException e) 
		 * {
		 * System.out.println("정수만 입력"); continue; }
		 * 
		 * ScoreVO scVO = new ScoreVO(); scVO.setKor(intKor); scVO.setEng(intEng);
		 * scVO.setMath(intMath); scVO.setName(strName);
		 * 
		 * scoreList.add(scVO); }
		 */
	}

	private String scoreGrade() {
		String strGrade = null;
		for(int i = 0; i < scoreList.size(); i++) {
			Integer totalScore = scoreList.get(i).getTotal();
			if(totalScore > 250) {
				strGrade = "최우수";
				break;
			}else if(totalScore > 200) {
				strGrade = "우수";
				break;
			}else if(totalScore > 150) {
				strGrade = "보통";
				break;
			}else {
				strGrade = "노력필요";
			}
		}
		return strGrade;
	}

	@Override
	public void printScore() {
		// TODO 성적출력
		System.out.println();
		System.out.println("=".repeat(70));
		System.out.println("성정출력");
		System.out.println("=".repeat(70));
		System.out.println("학번\t 이름\t국어\t영어\t수학\t총점\t평균\t등급");
		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\t", vo.getAvg());
			System.out.println(this.scoreGrade());
			System.out.println();
		}
		return;
	}
}
