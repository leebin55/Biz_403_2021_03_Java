package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;
import com.yublee.standard.InputService;
import com.yublee.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1A implements ScoreService {
	/*
	 * ScoreService 인터페이스를 implements
	 */

	protected InputService inService;
	protected StudentService sService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;

	public ScoreServiceImplV1A() {
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
			// 00001 형식으로 학번 변환 (생성)
			strNum = String.format("%05d", intNum);

			// 이미 등록된 학번인가를 검사
			ScoreVO scoreVO = this.numCheck(strNum);
			if (scoreVO != null) { // 중복된값 없으면 null 을 return
				continue;
			}
			// continue; break 안만나면 바로 다시 while문으로 돌아가기 때문에 필요 없음
			// 학생정보에 등록된 학번인가를 검사하여 학생정보에 없으면
			// 다시 학번을 입력받고 있으면 점수를 입력하도록 break;
			StudentVO stVO = sService.getStudent(strNum);
			if (stVO == null) {// 데이터가 없는
				System.out.println("학적부에 없는 학생");
				System.out.println("학번을 다시 입력해 주세요");
				continue;

			}
			// <<<< 여기는 학적부에 있는 학번
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

		} // 학번입력 끝

		// 성적입력

		Integer intKor = null;
		intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		// 위에 담겨있던 데이터는 clear 되고
		// 새로운 scoreVO 가 생성
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);

	}// end insertScore

	// 매개변수로 전달받은 학번이 scoreList에 있는지 검사
	// 있으면 : scoreVO 를 return
	// 없으면 : null 값을 return
	
	
	protected ScoreVO numCheck(String num) {
		for (ScoreVO vo : scoreList) {// 확장된 for
			//scoreList가 한라인씩 만들어지면서 반복
			//StudentVO vo = studentList.get(i);를 한줄로 
			//int nSize를 만들필요 없음 
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

	}

}
