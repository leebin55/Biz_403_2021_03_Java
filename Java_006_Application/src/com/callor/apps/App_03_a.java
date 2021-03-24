package com.callor.apps;

import java.util.Random;

public class App_03_a {

	/* 요소 : 배열의 몇번째 값
	 * 위치 ; 배열의 몇번째
	 * 첨자 : 배열의 몇번째 인가를 알려주는 값
	 * 
	 */
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intLength = 20;
		int[] intNum = new int[intLength];
		
		for(int i = 0; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(100)+1;
			
			}
		for(int i = 0; i < intNum.length ; i++) {
			if(intNum[i]% 2 == 0) {
				
				//짝수인 값을 출력
				System.out.println(intNum[i]);
				
				//몇번째 위치 (요소, 첨자)에 저장??
				//	System.out.println(i);
				System.out.printf("%d 번째 값 : %d\n",i+1,intNum[i]);
			}
		}
			
		
		
	}
}
