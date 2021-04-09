package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.yublee.standard.InputService;
import com.yublee.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected InputService inService;

	public ScoreServiceImplV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceImplV1();// InputService가 아니라
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

	protected String inputNum() {
		// TODO 학번
		Integer intNum = inService.inputValue("학번 ", 1);
		if (intNum == null) {
			return null;
		}
		String strNum = String.format("2021%03d", intNum);
		return strNum;
	}

	@Override
	public String inputName() {
		// TODO 이름 입력
		while (true) {
			System.out.println("이름을 입력하세요 ");
			System.out.print(" >> ");
			String strName = scan.nextLine();
			if (strName.trim().equals("QUIT")) {
				return null;
			} else if (strName.trim().equals("")) {
				System.out.println("학생이름은 반드시 입력");
				continue;
			}
			return strName;
		}
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		String strNum = this.inputNum();
		if (strNum == null) {
			return;
		}
		// 학생의 이름입력
		String strName = this.inputName();
		if (strName == null) {
			return;
		}
		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if (intEng == null) {
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if (intMath == null) {
			return;
		}

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		scoreVO.setName(strName);
		scoreVO.setNum(strNum);

		scoreList.add(scoreVO);

	}

	@Override
	public void printScore() {
		// TODO 출력
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
			System.out.printf("%3.2f\t", vo.getAvg());

			System.out.println();
		}
		return;
	}

}
