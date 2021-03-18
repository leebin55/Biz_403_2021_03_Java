package com.callor.var;

public class Variable_07 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		
		/* 코드의 가독성이 높아짐*/
		// intNum +1
		// intSum = intSum + intNum
		
		intSum += ++intNum; // ++intNum 먼저 값을 구하고 그 값을 intSum에 더함
		
		
		System.out.println(intSum);
		intSum += ++intNum;
		System.out.println(intSum);
		intSum += ++intNum;
		System.out.println(intSum);
		intSum += ++intNum;
		System.out.println(intSum);
		intSum += ++intNum;
		System.out.println(intSum);
		intSum += ++intNum;
		System.out.println(intSum);
		intSum += ++intNum;
		System.out.println(intSum);
		intSum += ++intNum;
		System.out.println(intSum);
		intSum += ++intNum;
		System.out.println(intSum);
		intSum += ++intNum;
		System.out.println(intSum);
		intSum += ++intNum;
		System.out.println(intSum);
	}
}
