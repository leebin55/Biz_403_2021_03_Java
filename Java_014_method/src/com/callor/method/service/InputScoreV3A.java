package com.callor.method.service;

public class InputScoreV3A {
/*
 * null 입력받았을때 오류 
 * null 값일때 종료한다는 실행 해주기
 */
	public InputScoreV3A() {

	}

	public void inputScore() {

		InputServiceV2 inService = new InputServiceV2();

		Integer intKor = inService.inputValue("국어", 0, 100);
		Integer intEng = inService.inputValue("영어", 0, 100);
		Integer intMath = inService.inputValue("수학", 0, 100);
		
		Integer total = intKor;
		total += intEng;
		total += intMath;
		
		float avg = (float)total /3;
		
		System.out.println("==================================================");
		System.out.printf("총점 : %d\t 평균 : %4.2f\n",total,avg);
		System.out.println("==================================================");
		 
		
	}
}
