package com.callor.classes;

import java.util.Random;

public class Value_01 {

	public static void main(String[] args) {
		/*
		 * java Keyword 이면서 값인 경우
		 * true 와 false 는 boolean 형의 값
		 * 참 과 거짓을 나타내는 java언어의 고유값
		 * 
		 * 비교연산문의 결과를 표현하기 위한 독특한 값
		 */
		boolean bYes = true;//굵은 주황색 : keyword
		bYes = false;
		
		int num = 30;
		//30 : 정수값, 리터럴
		
		/* 
		 * null값 : 아무것도 아닌 값
		 */
		Integer num1 = 0;
	
		/*
		 * -1 이 num1 변수에 담겨있으면 코드를 종료
		 * 이러한 코드를 작셩했는데 이 경우는 num1에 -1 값이 의미 없는
		 * 값이기 때문에 가능한 코드이다.
		 * 
		 * 만약 -1이 실제값으로 존재하는 필요한 값이라면
		 * 이런 코드는 사용이 어려워짐
		 * 
		 * 이럴때 사용할 수 있는 값 : null
		 */
		
		if(num1 == -1) {
			//코드종료
		}
		
			num1 = method();//이 메서드()가 호출이 되서 아래코드에 전달??
			//return문에 와서 num1에 전달
			if(num1 == null) {
				System.out.println("3의 배수도 아니고" +" 4의 배수도 아님");
			}
			
			num1 = 0;//0이라는값운 Integer일때 0일때 0 엔터치면 null값 
			
	}
	// 0 ~ 99 중의 난수 1개를 생성하여 
	//return 하는 method
	private static Integer method() { //41번 코드오 ㅏ연관 
		//원하는 값이 들어있나 확인하는 코드
		Random rnd = new Random();
		Integer num = rnd.nextInt(100);
		if(num % 3 == 0) {
			return 1;
		}else if( num % 4 == 0) {
			return -1;
		}else {
			return null;
		}
				
	}
}
