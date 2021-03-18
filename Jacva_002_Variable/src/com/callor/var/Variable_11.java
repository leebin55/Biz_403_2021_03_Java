package com.callor.var;

public class Variable_11 {

	public static void main(String[] args) {
		
		int intNum =1 ;
		
		/*for( ; intNum< 10 ;) {
			System.out.println(intNum++); //(intNum)이면 0이 무한대로 - <10 에 만족하기때문
			
		}
		*/
		intNum = 100000 ;
		// intNum 에 담긴 값을 1 증가 시키고
		//출력하라
		System.out.println(++intNum); //100001
		System.out.println(++intNum); //100002
		
		int intSum = 0; //결과를 저장할 변수를 생성
		intNum = 1; //시작값을 1로
		
		System.out.println("===============================");
		System.out.printf("intNum : %d, intSum : %d\n", intNum, intSum); //intNum : 1, intSum : 0
		
		//intSum = intSum + intNum;
		intSum += intNum;
		System.out.printf("intNum : %d, intSum : %d\n", ++intNum, intSum); //intNum : 2, intSum : 1
		
		//intSum = intSum + intNum;
		intSum += intNum;
		System.out.printf("intNum : %d, intSum : %d\n", ++intNum, intSum += intNum); //intNum : 3, intSum : 6 
		
		intNum = intNum + 1;
		intSum = intSum + intNum;
		System.out.printf("intNum : %d, intSum : %d", intNum, intSum); //intNum : 4 , intSum : 10
		}
}
