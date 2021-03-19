package com.callor.controller;

public class Cont_03 {

	public static void main(String[] args) {
		
		//0 ~ 9 가지 출력
		for (int i = 0; i< 10 ; i++) {
			System.out.println(i);
	}
	/*
	 *  i++ 와 i + 1 차이
	 *  
	 *  1. 변수 i 의 저장된 값이 변경되느냐 아니야
	 *  
	 *  i ++ : i에 저장된 값이 1증가하는 값으로 변경
	 *  		변경된 i 값을 다른 명령에서 사용하려고 할 때ㅑ
	 *  		for() 반복문내에서 i++를 사용할 때에는
	 * 			매우 주의 하기!!
	 * 			for() 반복문의 반복 횟수가 변경되어 버림
	 * 
	 *  i + 1 : i에 저장된 값은 변경되지 않음
	 *  		i 변수에 저장된 값에 1을 더하여
	 *  임시적으로 다른 명령에서 사용하려고 할 때
	 *  	
	 */
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i + 1);
		}
		
		System.out.println("===========================");
		
		for(int i = 0; i < 10 ; i++) {
			System.out.println("우리나라"); //10 번출력
			
		}
	System.out.println("===========================");
		
		for (int i = 0; i < 10 ; i++) {
			int sum = i + 1;
	
			System.out.println("대한민국"); //10번
		}		
	
	System.out.println("===========================");
		
		for(int i = 0; i < 10 ; i++) {
			i++;//변수값 또 한번 변경
			System.out.println("Republic of Korea");//5번
	
		}
	
	System.out.println("===========================");
		
		for(int i = 0; i < 10 ; i += 2) { //i 값 변경할때 주의 하기
			System.out.println("Republic of Korea"); //5번
		}
	
	System.out.println("===========================");
		
		for(int i = 0; i < 10 ; i++) {
			i--;
			//System.out.println("대한민국 만세");
			System.out.println(i); //-1 이 무한대 출력
		}
		/* for() 반복문내에서 i++ 를 실행하고 
		 * {for 본문명령문} 내에서 i-- 를 실행
		 * 이런 상황이 되면 i 값은 i < 10 조건에서 
		 * 항상 true  
		 * 무한 반복 됨.
		 */
	}
}
