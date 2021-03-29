package com.callor.apps;

import com.callor.apps.service.ScoreServiceV5;

public class App_05 {

	public static void main(String[] args) {
		
		ScoreServiceV5 ssV5 = new ScoreServiceV5(10);
		/*
		 * ssV5.makeScores() 명령이 실행되면 
		 * Score..V5 클래스의 makeScores() method의 코드가 실행
		 * 코드가 모두 정상 종료 되거나
		 * 중간에 return 명령문을 만나면
		 * Systme.out.println("입력...!!!");명령문이 이어서 실행
		 */
		ssV5.makeScores();//이 명령을 실행하려면 \클래스 이용해 객체 생성
		
		System.out.println("입렵업무 중단!!!");
		
		//method에 static keyword가 부착되면
		//객체를 생성하는 절차 없이 method "직접 호출"할 수 있다
		//클래스.method()
		System.out.println(ScoreServiceV5.dLine());
	}
}
