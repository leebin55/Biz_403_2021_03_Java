package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.yublee.standard.InputService;
import com.yublee.standard.impl.InputServiceImplV1;
/*
 * 현재 클래스 내부에서만 호출되는 method private으로 선언
 * 현재 클래스를 상속받아 확장하여 사용할 수 있도록 하려면
 * private => protected로 변경
 */
/*
 * 1. 메뉴를 먼저 보여줌
 * 2. 성적 입력 : 학생 수의 제한이 없음
 * 		가. 학번
 * 		나. 학생이름 : inputName() 
 * 		다. 과복별 성적 : inputScore()
 * 
 * 		가. 학생성적입력 : inputScore() 시작
 * 			- 학번입력
 * 			- 이름입력 : inputName() 호출을 해서 입력값을 return 받음
 * 			- 점수입력
 * 		
 *  	나. 학생의 이름을 입력하는 inputName() method는 return 타입이 String 형
 *  		> 학생이름을 입력받고 입력받은 학생이름을 return
 *  		> 이 return받은 학생이름을 inputNum() method에서 사용가능`ㅡㅂ		
 */
public class ScoreServiceImplV1T implements ScoreService {
	// 저장소
	protected List<ScoreVO> scoreList;

	// 학번, 점수를 입력받을 때 사용할 객채
	protected InputService inService; // InputService 클래스호출해서 method사용

	// 학생의 이름을 입력받을떄
	protected Scanner scan;
	

	public ScoreServiceImplV1T() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceImplV1();
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("메뉴선택");
			System.out.println("-".repeat(50));
			System.out.println("1. 성적입력");
			System.out.println("2. 성적 리스트 출력");
			System.out.println("QUIT. 업무종료");
			String strM = scan.nextLine();
			if (strM.trim().equals("QUIT")) {
				break;
				// System.out.println("업무종료");
				// return;
			}
			Integer intM = null;
			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				System.out.println("메뉴는 정수 QUIT만 입력");
			}
			if (intM == 1) {
				this.inputScore();
			} else if (intM == 2) {
				this.printScore();
			}
		} // end while
		System.out.println("업무종료");
	}

	public void inputName1() { // 만약 inputName이 void형이라면

		this.inputName("무명");

	}

	@Override
	public String inputName() {
		// TODO 학생의 이름 입력받고 이름을 return
		return null;
	}

	protected String inputNum() {
		// 학번입력처리 : 001 , 002 형식으로 >> 문자열
		// 정수 1 이상을 입력하면 정수 값이 intNum 에 담기고
		// QUIT 입력했으면 null 값이 intNum에 담김

		Integer intNum = inService.inputValue("학번", 1);
		// intNum에 null 값이 담겨있으면 종료하고 다시 메뉴로 돌아감
		// >> 왜? selectMenu() 에서 inputScore() 을 호출했으니까 다시 return
		if (intNum == null) {
			return null;
		}
		// 정수를 입력했으면 입력받은 정수값을
		// 학번의 문자열 형식(001,002)으로 변환 >> String.format 이용
		// String.format("%3d" , 1 )
		// : 전체 자릿수를 3개 만들고 정수값을 오른쪽 정렬하는 문자열
		// : " 1"
		// String.format("%03d", 1)
		// : 전체 자릿수를 3개 만들고 정수값을 오른쪽 정렬
		// : 왼쪽의 빈칸을 0으로 채움
		// : "001"
		String strNum = String.format("2021%03d", intNum); // 2021001
		// return intNum; > String type 다름 Integer 에서 String 로 바꿈
		return strNum;

	}

	@Override
	public void inputScore() {
		// TODO 학번, 이름, 과목점수를 입력받아 List에 추가

		String strNum = this.inputNum();
		if (strNum == null) {
			return;
		}
		// 학생의 이름입력
		String strName = this.inputName(strNum);
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
		/*
		 * 아래 비교문은 3과목을 모두 입력하는 prompt가 나타난 후 한 과목이라도 QUIT 를 하면 종료하는 코드 만약 국어 과목에서 QUIT
		 * 를 하여도 영어, 수학 점수를 입력 받은 prompt 가 나타나고 3과목을 모두 통과한 후 입력종로
		 * 
		 * if(intKor == null || intEng == null || intMath == null){ 
		 * return;
		 * }
		 */

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		scoreVO.setName(strName);
		scoreVO.setNum(strNum);
		
		//VO에 담긴 데이터를 List저장소에 추가
		scoreList.add(scoreVO);
	}

	protected String inputName(String strNum) {
		// TODO 학번으로 보여주고 이름을 입력받는 method

		while (true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT : 입력취소)");
			System.out.print("  >>  ");
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

	/*
	 * private String inputName(String strNum) { 
	 * while(true) {
	 * System.out.println(strNum + "학생의 이름 입력(QUIT : 입력취소)");
	 * System.out.print("  >>  "); String strName = scan.nextLine();
	 * if(strName.trim().equals("QUIT")) {
	 * 
	 * }else if(strName.trim().equals("")) { 
	 * System.out.println("학생이름은 반드시 입력");
	 * continue;
	 *  } 
	 *  return strName;
	 *   } 
	 *   return null;
	 *    }
	 */
	/*
	 * @Override public void inputName()
	 * 
	 * 
	 */
	@Override
	public void printScore() {
		// TODO 리스트 출력
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));

		for (int index = 0; index < scoreList.size(); index++) {
			ScoreVO vo = scoreList.get(index);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");

		}
		System.out.println("=".repeat(80));
	}
}
