package com.callor.var;

public class Variable_20 {

	public static void main(String[] args) {
		
		
		int intKor = 90;
		int intEng = 80;
		
		int intSum = intKor + intEng; //변수 만들었으면 이용하기
		
		System.out.printf("%d + %d = %d\n", intKor, intEng, intSum); //intKor + intEng ==>>intSum자리에 쓰면 잘못된 코드
		
		int avg = ( intKor + intEng) /2;
		avg = intSum / 2;
		System.out.printf("%d + %d = %d\n", intKor, intEng, avg);
		
		 
		
		intKor = 91;
		 intEng = 82;
		
		intSum = intKor + intEng; //변수 만들었으면 이용하기
		
		System.out.printf("%d + %d = %d\n", intKor, intEng, intSum); //intKor + intEng ==>>intSum자리에 쓰면 잘못된 코드
		
		 avg = ( intKor + intEng) /2;
		avg = intSum / 2;
		System.out.printf("%d + %d = %d\n", intKor, intEng, avg);
		/*
		 * 변수선언을 잘못해서 오차 발생
		 * >>avg 정수로 선언해서
		 */
	}
}
