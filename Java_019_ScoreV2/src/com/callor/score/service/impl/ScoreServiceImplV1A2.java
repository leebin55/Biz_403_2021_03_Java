package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentAndScoreVO;
import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;
import com.yublee.standard.InputService;
import com.yublee.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1A2 implements ScoreService {
	/*
	 * ScoreService 인터페이스를 implements
	 */

	protected InputService inService;
	protected StudentService sService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;

	public ScoreServiceImplV1A2() {

		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceImplV1();
		sService = new StudentServiceImplV1WithT();
		scan = new Scanner(System.in);
	}

	@Override
	/*
	 * 학번을 입력하면 scoreList 에 같은 학번의 성적이 있는 지 확인 >> 이미 존재 : 다시학번 입력
	 */
	public void insertScore() {
		// TODO 성적 입력
		// 유효성 검사가 끝난 후 학번을 VO 에 담아야 하기 때문에
		// while전에 선언
		String strNum = null;
		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			if (intNum == null)
				return;

			strNum = String.format("%05d", intNum);

			ScoreVO scoreVO = this.numCheck(strNum);
			if (scoreVO != null) {
				continue;
			}

			StudentVO stVO = sService.getStudent(strNum);
			if (stVO == null) {
				System.out.println("학적부에 없는 학생");
				System.out.println("학번을 다시 입력해 주세요");
				continue;

			}

			System.out.println("=".repeat(30));
			System.out.printf("학번 : %s\n", stVO.getNum());
			System.out.printf("이름 : %s\n", stVO.getName());
			System.out.printf("학과 : %s\n", stVO.getDept());
			System.out.printf("학년 : %s\n", stVO.getGrade());
			System.out.printf("주소 : %s\n", stVO.getAddress());
			System.out.println("=".repeat(30));
			System.out.println("학생정보가 맞습니까???");
			System.out.println(" 맞으면 : Enter, 틀리면 : No ");
			System.out.print("  >>  ");
			String yesNo = scan.nextLine();
			if (yesNo.equals("No")) {
				continue;
			}
			break;

		}

		Integer intKor = null;
		intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);

	}

	protected ScoreVO numCheck(String num) {
		for (ScoreVO vo : scoreList) {// 확장된 for
/*
 *			 int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i); 가 줄여져서 쓰이는 것과 같다
 */
			
			if (vo.getNum().equals(num)) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.println();
			System.out.println("=".repeat(80));

		}
	}
}
