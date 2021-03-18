package com.callor.var;

public class Variable_06 {

	public static void main(String[] args) {
		
		int intNum = 0 ; //0으로 clear
		//System.out.println( intNum = intNum +1)
		System.out.println( intNum++ ); //결과 0 
		System.out.println( intNum++ ); //1
		System.out.println( intNum++ ); //2
		System.out.println( intNum++ ); //3
		System.out.println( intNum++ ); //4
		System.out.println( intNum++ ); //5 (1씩증가 but 왜 맨처음 값이 0일까?)
										//변수 뒤에 연산자가 붙으면 우선순위가 엄청 낮다
		System.out.println((intNum = intNum) + 1);
		System.out.println("숫자 : " + (intNum +1));
		
		intNum = 0;
		
		
		System.out.println(++intNum);
		System.out.println(++intNum);
		System.out.println(++intNum);
		System.out.println(++intNum);
		System.out.println(++intNum);
		System.out.println(++intNum);
		System.out.println(++intNum);
		
		
		
		System.out.println((intNum = intNum) + 1);
		System.out.println("숫자 : " + (intNum +1));
		
		
		/*         ++intNum 와 intNum++ 의 차이       */
		
		intNum = 0 ;
		//1
		intNum += 1; 
		System.out.println(intNum);
		//22와 23 명령문을 한 명령문으로 만들면
		System.out.println(++intNum);
		
		
		System.out.println(intNum);
		intNum += 1;
		//28과 29 명령문을 한 명령문으로 만들면
		System.out.println(intNum ++);
		
	}
}
