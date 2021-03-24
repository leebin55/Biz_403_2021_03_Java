package com.callor.apps;

import java.util.Random;

public class App_02 {

	public static void main(String[] args) {

		/*
		 * 생성할 배열 개수를 변수에 설정해 두고 변수를 사용하여 배열을 만들기
		 * 
		 * 변수를 사용하여 배열을 선언하면
		 * 배열의 개수가 변경되었을때
		 * 이후에 for()반복문 등에서 코드를
		 * 변경해야하는 경우를 줄일수 있다.
		 */
		int numsLength = 20;
		int intNum = 0;
		
		//int, long, float, double 형 배열 생성
		// ==>>자동으로 모든 배열에 0으로 채워지고 clear
		
		//Stirng 배열 생성
		// ==>>자동으로 "" 으로 채워지고 clear
		
		int[] intNums = new int[numsLength];
		
		
		for (int i = 0; i < numsLength; i++) {
		
			intNums[i] = 0;			
		}
		Random rnd = new Random();
		/* 
		 * 배열.length
		 * 배열을 생성하면 자동으로 생성되는 내부변수
		 * 배열 전체를 반복하여
		 * 			연산을 수행할때 사용할수 있는 값
		 */
		for(int i = 0; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(100);
		}
		
		/*
		 * 배열을 읽는 용도로 반복하여 연산을 할 경우
		 * 사용하는 확장된 for() 반복문 / forEach라고도 한다. 
		 *  * 저장할때 사용XX 읽을때만 !!
		 *  
		 *  
		 *  for( 요소변수 : 배열) {   }
		 *  1. 배열을 일렬로 모두 나열
		 *  2. 첫번 배열요소로부터 한개씩 요소변수에 담아서
		 *  3. {   } 코드로 전달
		 *  4. {   } 코드에서는 요소변수를 사용하여 연산수행
		 
		 *  for(int num : intNums)
		 *  ==>>
		 *  	for(int i = 0 ; i < intNums.length ; i++) {
		 *  	int num = intNums[i];
		 *
		 *
		 *
		 *
		 */
		for(int num : intNums) { //intNums 배열 20개 나열후 0번째 요소부터 차근차근  num 에 값을 전달
			 					//
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
		/*
		 *intNums 배열중에서
		 *			3번 요소부터 끝까지
		 *			리스트를 출력하라
		 *  => 배열의 일부분만 연산을 수행하는 코드
		 *  	여기서는 forEach를 사용할수 없다.
		 */
		
		for(int i = 3 ; i < intNums.length ; i++) {
			System.out.println(intNums[i]); //부분만 사용하는 경우는 확장된 for 쓸수 없음
		}
	}
}
