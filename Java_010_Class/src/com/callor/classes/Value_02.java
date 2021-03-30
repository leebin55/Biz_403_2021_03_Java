package com.callor.classes;

import java.util.Scanner;
/*
 * null 값
 * 프로그래밍, 정보처리에서는 어떤 항목의 데이터가 있는가 없는가를 판단해야하는
 * 경우가 있다
 * 
 * 문자열의 경우는 값이 없는 경우를 ""으로 표현 가능
 * 
 * 숫자형일 경우는 일반적으로 0이라는 값을 없는 값으로 표현을 하기도 한다.
 * 
 * if(변수 == 0) : 없다라는 표현을 사용할수 있다
 *  >문제 생길수 잇음
 *  	실제로 어떤값이 0인 값을 갖는지.
 *  	아니면 아무것도 없어서 0인지 구별 못함
 *  null 값을 사용하여 실제로 아무것도 없는 상태 표현
 *  
 *  java primitive type 변수들은 null 값을 저장할 수 없다.
 *  => wrapper class를 사용하여 선언된 변수는 null을 저장할 수 있음
 */

public class Value_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(">>");
		//키보드에서 숫자를 입력하고 Enter를 누르면
		// 값이 num변수에 저장되고 다음 코드 실행
		//Integer num = scan.nextInt();
		//System.out.println(num);
		
		//키보드에서 문자열 입력하고 Enter누르면 값이 str변수에
		//저장되고 다음 코드 실행
		//그냥 Enter만 눌려도 입력종료하고 다음 코드가 실행
		System.out.print("숫자1>>  ");
		String str1 = scan.nextLine();//그냥 enter치면 값을 입력하지 않아도 통과
		if(str1 == "") {//아무런 문자열이 아님 
			//"" : 문자열변수의 null값과 유사한 성격을 가짐 
			System.out.println(" 아무것도 없는 값 입력");
		}
		System.out.println("숫자2>> ");
		String str2 = scan.nextLine();
		
		Integer num1 = Integer.valueOf(str1);
		Integer num2 = Integer.valueOf(str2);
		
		System.out.println(num1 + num2 );
		
		if(num1 == 0) {
			System.out.println("num1 변수에 0이 담겨있다.");
		}
		if(num1 == null) {
			System.out.println("num1 변수에 값이 없다.");
		}
		
	}

}
