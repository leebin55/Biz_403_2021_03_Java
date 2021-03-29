package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV2 {

	Scanner scan;

	public ScoreServiceV2() {

		scan = new Scanner(System.in);
	}

	/* 
	 * this (현재객체, 현재클래스)
	 * 같은 클래스 내에 있는 코드
	 */
	public void makeScores() {
		System.out.println("국어점수 입력");	
		/*
		 * method return type 이 void가 아닌 경우에는
		 * method가 return 한 값을
		 * 변수에 저장(받기) 할 수 있다
		 * 이때 변수는 method 의 return type과 같은 type(형)이어야 함
		 */
		inputScore();//inputScore 호출
		Integer intKor = this.inputScore();
		
		System.out.println("영어점수 입력");	
		inputScore();//inputScore 호출
		Integer intEng = this.inputScore();//점수 입력하는 코드가 실행
		//void형은 리턴된 값을 다른 변수에 담을 수 없다
		
		System.out.println("수학점수 입력");	
		inputScore();//inputScore 호출
		Integer intMath = this.inputScore();
		
		System.out.println(LineService.dLines(20));
		System.out.printf("국어점수 : %d\t ",intKor);
		System.out.printf("영어점수 : %d\t ",intEng);
		System.out.printf("수학점수 : %d\n ",intMath);
		
	}

	private Integer inputScore() {
		Integer score = 0;//코드 실행될때 score 은 0
		while (true) {
			System.out.println("점수를 입력하세요 ( 0 ~ 100 )");
			score = scan.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("점수는 0~ 100까지만 입력해야만 합니다.");
				continue; //continue를 만나면 while 문으로 되돌아감
				//0미만 100초과면 계속 continue
			}
			break;//break만나서 while 문 종료
		}
		//score 변수에 저장된 값을 호출한 곳으로 되돌려 주어라
		return score;//makeScore한테 return 
		
	}
	
	
	
}
