package com.calloer.classes;

import java.util.Scanner;

public class ScannerEx_03 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 * Scanner의 nextInt() method 의 문제를 해결하기 위해
		 * 1. 숫자 입력을 문자열형으로 입력받음 (사칙연산불가)
		 * 2. 문자열형 숫자를 숫자형으로 변환
		 * 3. 4칙연산 수행
		 * 
		 */
		System.out.println("두 개의 숫자를 입력");
		System.out.println("숫자 1 >> ");
		String strNum1 = scan.nextLine();
		Integer intNum1 = Integer.valueOf(strNum1); // 문자를 적으면 Integer.valueOf(strNum1)에서 exception이 발생 
		//처리 훨씬 수월
		
		
		System.out.println("숫자 2 >> ");
		String strNum2 = scan.nextLine(); //숫자지만 문자열 형으로 받음
		//문자열로 받으면 곱셈이 안됨
		Integer intNum2 = Integer.valueOf(strNum2);
		
		System.out.printf("%d + %d = %d\n",intNum1 , intNum2 , intNum1 + intNum2 );
		System.out.printf("%d - %d = %d\n",intNum1 , intNum2 , intNum1 - intNum2 );
		System.out.printf("%d x %d = %d\n",intNum1 , intNum2 , intNum1 * intNum2 );
		System.out.printf("%d / %d = %d\n",intNum1 , intNum2 , intNum1 / intNum2 );
		
	}
}
