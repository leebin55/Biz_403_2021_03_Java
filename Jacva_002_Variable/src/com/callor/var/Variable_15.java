package com.callor.var;

public class Variable_15 {

	public static void main(String[] args) {
		int intNum = 0;
		
		//intNum 0, 2, 4, 6, 8, 10
		int intSum= 0;
		
		
		
		intSum = (++intNum)*2;
		intSum += (++intNum)*2;
		intSum += (++intNum)*2;
		intSum += (++intNum)*2;
		intSum += (++intNum)*2;
		
		System.out.println(intSum);
	
		intNum = 0;
		intSum = 0;
		
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		System.out.printf("짝수의 합 : %d\n",intSum);
	
	}
}
