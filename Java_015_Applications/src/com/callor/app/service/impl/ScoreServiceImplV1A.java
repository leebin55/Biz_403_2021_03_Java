package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1A implements ScoreService {

	protected Scanner scan;
	List<ScoreVO> scoreList;
	String[] subs;

	public ScoreServiceImplV1A() {
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
			System.out.println();
			System.out.println(" ① 성적입력");
			System.out.println(" ② 성적출력");
			System.out.println(" ③ 종료");
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
			break;
		}

	}

	@Override
	public String inputName() {
		// TODO 이름입력 : 빈칸이면 다시 / QUIT 이면 다시 선택메뉴로 
		while(true) {
		System.out.println("┌──────────┐");
		System.out.println("│   이름   │");
		System.out.println("└──────────┘");
		System.out.print("이름( 종료할때는 QUIT ) >> ");
		String name = scan.nextLine();
		if (name.trim().equals("QUIT")) {
			System.out.println("【  선택메뉴로 돌아갑니다 】");
			this.selectMenu();
		}else if(name.trim().equals("")) {
			System.out.println("【  이름을 입력해 주세요 】");
			continue;
			
		}
		return name;
		}
	}

	public String inputNum() {

		while (true) {
			System.out.println("┌──────────┐");
			System.out.println("│   학번   │");
			System.out.println("└──────────┘");
			System.out.print("학번 ( 종료할때는 QUIT ) >> ");
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
		// TODO 5명 학생의 점수 받기
		for (int index = 0; index < 5; index++) {
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
		}

		/*
		 * while (true) { String strName = this.inputName(); System.out.println(strName
		 * + "학생의 국어성적"); System.out.print(" >>  "); String strKor = scan.nextLine();
		 * Integer intKor; try { intKor = Integer.valueOf(strKor); } catch
		 * (NumberFormatException e) { System.out.println("정수만 입력"); continue; }
		 * 
		 * System.out.println(strName + "학생의 영어성적"); System.out.print(" >>  "); String
		 * strEng = scan.nextLine(); Integer intEng; try { intEng =
		 * Integer.valueOf(strKor); } catch (NumberFormatException e) {
		 * System.out.println("정수만 입력"); continue; }
		 * 
		 * System.out.println(strName + "학생의 수학성적"); System.out.print(" >>  "); String
		 * strMath = scan.nextLine(); Integer intMath; try { intMath =
		 * Integer.valueOf(strKor); } catch (NumberFormatException e) {
		 * System.out.println("정수만 입력"); continue; }
		 * 
		 * ScoreVO scVO = new ScoreVO(); scVO.setKor(intKor); scVO.setEng(intEng);
		 * scVO.setMath(intMath); scVO.setName(strName);
		 * 
		 * scoreList.add(scVO); }
		 */

	}

	
	

	@Override
	public void printScore() {
		// TODO 성적출력
		System.out.println();
		System.out.println("=".repeat(70));
		System.out.println("성정출력");
		System.out.println("=".repeat(70));
		System.out.println("학번\t 이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\n", vo.getAvg());
		}

	}

}
