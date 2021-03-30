package com.callor.classes;

public class String_01 {

	public static void main(String[] args) {
		
		System.out.printf("%50d\n",0);//바로출력
		String dLine = String.format("%50d",0);
		System.out.println(dLine);//"변수에 담아서" 쓸수 있게 만들어주는 method
		
		dLine = String.format("%050d", 0);//0대신 =을 넣으면 오류 > 뒤에서 replace사용
		System.out.println(dLine);//0이 50개
		
		/*
		 * %50d : 칸을 50개 만들고 오른쪽 끝부터 정수값을 채움
		 * 
		 * %050d : 칸을 50개 만들고 오른쪽 끝부터 정수값 채우고
		 * 			만약 값이 남으면 빈칸을 0을로 채움
		 */
		
		//dLine 문자열 변수에 문자열 0을 문자열 = 으로 ㄹ변경
		dLine = dLine.replace("0", "=");
		System.out.println(dLine);
	}
}
