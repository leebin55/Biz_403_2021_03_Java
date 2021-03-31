package com.calloer.classes;

import java.util.Scanner;

public class ScannerEx_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		String str = scan.nextLine();
		System.out.println("입력한 문자열 : " + str);

//		if(str == "END") {
//			System.out.println("안녕"); //입력한 문자열이 END임에도 불구하고 실행 안됨
//		}else {
//			System.out.println("방가");
//			}//일반적으로 문자열 비교를 할때 "=="쓸때 자주 오류가 발생하므로 쓰지 않는게 좋다
//		
		if (str.equals("END")) {
			System.out.println("안녕");
		} else {
			System.out.println("두값은 다름");

		}

	}
}
