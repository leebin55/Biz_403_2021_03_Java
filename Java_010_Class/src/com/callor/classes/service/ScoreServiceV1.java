package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.ScoreVO;

public class ScoreServiceV1 {

	/*
	 * 접근제한자(참조제한자)
	 * public, private, protected
	 * 
	 * class, method, 맴버변수를 선언할때 사용하는 keyword
	 * 접근제어자를 사용하지 않아도 문법적인 오류는 발생하지 않음
	 * 		객체지향 이론에 "정보은닉"(감춤 ,제한적으로 접근하게 함,데이터를 보호)
	 * 
	 * public : 모두에게 개방한다. 모두에게 공개한다.
	 * 			누구나 접근(읽기, 쓰기, 실행)을 하게함
	 * 			Class obj = new Calss()
	 * 			obj.method();
	 * 			obj.변수 = 100;
	 * 
	 * private : 현재 클래스(파일)에 있는 코드에서만 접근가능(가장 정보은닉 )
	 * 			그 클래스 내에서만 접근
	 * 			obj.변수 = 100; >>문법오류
	 * protected : 생성된 객체를 통해서는 직접 접근 금지
	 * 			Class obj = new Class()
	 * 			obj.method() 방식으로 접근 안됨
	 * 			클래스를 상속받게 하겠다라는 전제하에 상속을 받은 클래스에서는
	 * 			자유롭게 접근가능
	 * 			부모클래스와 자식클래스(상속받은) 간에 공유하는 목적
	 */
	
	/*
	 * 멤버변수를 protected로 선언을 해 두면
	 * 현재클래스(V1)를 상속받은 자식클래스에서 변수가 
	 * 선언된 것처럼 동작 할 수 있다. 
	 * 
	 * 상속을 허락하고 멤버변수를 공유하고자 할때는 protected를 추가한다.
	 */
	protected Scanner scan; //protected 접근제한자
	
	protected List<ScoreVO> scoreList;

	public ScoreServiceV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
	}

	public Integer inputScore() {// void를 Integer로 return ; return -1;
		// 코드 맨끝에 return 0;
		// System.out.println("학번을 001 형식으로 입력하세요");
		// System.out.print(">>");
		// String strNum = scan.next();

		/*
		 * scoreList의 데이터 개수를 계산하여 입력할 학번을 자동으로 생성
		 */
		int nSize = scoreList.size();
		int intKor = 0;
		String strNum = String.format("%03d", nSize + 1);// 현재 입력된 학생수를 이용해서 만듬
		while (true) {
			System.out.println(strNum + "번의 국어점수를 입력하세요 (중단 : -1)");

			intKor = scan.nextInt();
			if (intKor == -1) {
				return -1;
			} else if (intKor < 0 || intKor > 100) {
				System.out.println("국어점수는 0 ~ 100 까지!!");
				continue;// 정상 실행되면 continue 안만나고 break
			}
			break;
		}
		
		int intEng = 0;
		while(true) {
		System.out.println(strNum + "번의 영어점수를 입력하세요");
		System.out.print(">>");
		intEng = scan.nextInt();
		if(intEng >100 || intEng<0) {
			System.out.println("입력오류 : 0 ~ 100");
			continue;
		}break;
		}

		System.out.println(strNum + "번의 수학점수를 입력하세요");
		System.out.print(">>");
		int intMath = scan.nextInt();

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.num = strNum;
		scoreVO.kor = intKor;
		scoreVO.eng = intEng;
		scoreVO.math = intMath;
		scoreList.add(scoreVO);
		return 0;
	}// inputScore()

	public void printScore() {
		this.printHeader();

		for (int i = 0; i < scoreList.size(); i++) {
			// scorList의 i 번째 저장된 값을 읽어서
			// ScoreVO형 sVO 객체에 담기
			ScoreVO sVO = scoreList.get(i);

			System.out.print(sVO.num + "\t");
			System.out.print(sVO.kor + "\t");
			System.out.print(sVO.eng + "\t");
			System.out.print(sVO.math + "\n");

		}
	}// printScore

	private void printHeader() {

		System.out.println("* 빛나라 고교 성적처리 V1");
		System.out.println(Lines.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Lines.sLine(50));

	}

}
