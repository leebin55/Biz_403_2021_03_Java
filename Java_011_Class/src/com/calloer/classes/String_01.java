package com.calloer.classes;

public class String_01 {

	public static void main(String[] args) {
		
		int num1  = 30;
		int num2 = 30;
		boolean bYes = num1 == num2;
		
		String str1 = "대한민국";
		String str2 = "우리나라";
		
		bYes = str1 == str2;
		str2 = "대한민국";
		bYes = str1 == str2; //true
		if(str1 == str2) {
			System.out.println("맞음");
			
		}
		
		str1= "우리나라";
		str2 =  new String("우리나라"); 
		
		
		System.out.println(str1);
		System.out.println(str2);
		/*
		 * 문자열 변수에 담긴 문자열이 같은가 확인
		 * 
		 * 동등연산자(==) 를 사용해서는 안됨
		 * 문자열 변수는 변수에 문자열을 저장하는 방법에 다라 다른 특성을 갖음
		 * 문자열의 독특한 특성때문에 문자열에 저장된값이 같은지 확인이
		 * 안되는 경우가 있음
		 * 
		 * 문자열 변수에 저장된 값이 같은가 비교를 할 때는 
		 * 		문자열.equals("비교대상" or 변수) method를 사용
		 */
		
		//if(str1 == str2) {//console의 결과 값은 같지만 출력이 안됨 >>사용금지
		if(str1.equals(str2)) {
			System.out.println("Str1과 Str2 는 같은 값");
			/*
			 * 출력이 안됨... 왜?? 문자열 변수의 특성(숫자는 저장방법이 달라도 비교가능)
			 * 문자열은 변수에 담겨있는 값이 같더라도  저장하는 방법에 따라서 
			 * " == "이 성립안될때가 있음
			 * 상당히 자주 발생
			 * 
			 */
		}else {
			System.out.println("두 값은 서로 다름");
		}
		str1 = "대한민국";
		str2 = "대한민국";
		System.out.println(str1.equals(str2));
		
		str1 = "Korea";
		str2 = "KOREA";
		System.out.println(str1.equals(str2));//false : 
		//영문 문자열이 저장된 경우
		// 대소문자구분해야함 
		
		//대소문자 구분없이 단어 스펠링만 비교 : equalsIngnorCase()
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
