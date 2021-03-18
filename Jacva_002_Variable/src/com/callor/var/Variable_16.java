
package com.callor.var;
/*
 * intDan, intNum 변수를 선언하고
 * 3단 구구단을 출력
 */
public class Variable_16 {

	public static void main(String[] args) {
		
		int intNum =1;
		int intDan =  (++intNum)*3;
		
		
	    System.out.println("================================");	
		System.out.printf("3 x %d = %2d\n", intNum, intDan);
		intDan +=3;
		System.out.printf("3 x %d = %2d\n", ++intNum, intDan);
		intDan +=3;
		System.out.printf("3 x %d = %2d\n", ++intNum, intDan);
		intDan +=3;
		System.out.printf("3 x %d = %2d\n", ++intNum, intDan);
		intDan +=3;
		System.out.printf("3 x %d = %2d\n", ++intNum, intDan);
		intDan +=3;
		System.out.printf("3 x %d = %2d\n", ++intNum, intDan);
		intDan +=3;
		System.out.printf("3 x %d = %2d\n", ++intNum, intDan);
		intDan +=3;
		System.out.printf("3 x %d = %2d\n", ++intNum, intDan);
		System.out.println("================================");
		
		intNum = 2;
		intDan = 3 * intNum;
		
		System.out.println("================================");
		System.out.printf("3 x %d = %2d \n", intNum, intDan);
		++intNum; 
		intDan = 3 * intNum;
		System.out.printf("3 x %d = %2d \n", intNum, intDan);
		++intNum;
		intDan = 3 * intNum;
		System.out.printf("3 x %d = %2d \n", intNum, intDan);
		++intNum;
		intDan = 3 * intNum;
		System.out.printf("3 x %d = %2d \n", intNum, intDan);
		++intNum;
		intDan = 3 * intNum;
		System.out.printf("3 x %d = %2d \n", intNum, intDan);
		++intNum;
		intDan = 3 * intNum;
		System.out.printf("3 x %d = %2d \n", intNum, intDan);
		++intNum;
		intDan = 3 * intNum;
		System.out.printf("3 x %d = %2d \n", intNum, intDan);
		++intNum;
		intDan = 3 * intNum;
		System.out.printf("3 x %d = %2d \n", intNum, intDan);
		System.out.println("==============================");
		//3단을 표시하기 위한 변수
		intDan= 3;
		//2~9까지의 숫자를 만들고
		//실제 구구단을 계산하고 출력하기 위한 변수
		 intNum =2;
		 
		 //단 * 숫자
		 System.out.printf("%d x %d =%d\n", intDan, intNum, intDan*intNum);//다시하기
		 System.out.printf("%d x %d =%d\n", intDan, ++intNum, intDan*intNum);
		 System.out.printf("%d x %d =%d\n", intDan, ++intNum, intDan*intNum);
		 System.out.printf("%d x %d =%d\n", intDan, ++intNum, intDan*intNum);
		 System.out.printf("%d x %d =%d\n", intDan, ++intNum, intDan*intNum);
		 System.out.printf("%d x %d =%d\n", intDan, ++intNum, intDan*intNum);
		 System.out.printf("%d x %d =%d\n", intDan, ++intNum, intDan*intNum);
		 System.out.printf("%d x %d =%d\n", intDan, ++intNum, intDan*intNum);
		 System.out.printf("%d x %d =%d\n", intDan, ++intNum, intDan*intNum);
		 
		 
		 
		 
	
	}
}
