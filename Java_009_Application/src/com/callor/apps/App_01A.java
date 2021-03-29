package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1A;

public class App_01A {

	public static void main(String[] args) {
		
	
	ScoreServiceV1A ssV1 =new ScoreServiceV1A(5); //members라는 매개변수 사용해서 ()안에 
	//클래스를 객체로 만들어 주고
	
	/*
	 * ScoreServiceV1 클래스를 사용하여
	 * 객체를 생성할 때 정수 5를 전달해주고
	 * 
	 */
	/*
	 * method 호출 하여 명령실행
	 * ssV1.makeScores() 명령을 한 줄 실행하므로써
	 * ScoreServiceV1A 클래스에
	 * 정의되어 있는 "어떤코드"가 실행됨
	 */
	ssV1.makeScores();
	ssV1.addNum();
	//ssV1.inputScore(); 를 사용할 수 없음
	// 이 메소드는 private으로 선언 되었기 때문에
	//객체.inputScore();형식으로 사용할 수 없음
	}
}
