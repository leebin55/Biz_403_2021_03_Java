package com.callor.fine;

public class MainEx_07 {

	
	/* 
	 * ===========================================================
	 * 5단 구구단
	 * -------------------------------------------------------------
	 * 5 x 1 = 5
	 * 5 x 2 = 10
	 * 5 x 3 = 15
	 *    .
	 *    .
	 *    .
	 *    .
	 * 5 x 9 = 45
	 * =====================================================================
	 * 
	 */
	public static void main(String[] args) {
	int num = 5;
	System.out.println("=".repeat(50));
	System.out.println(num + "단 구구단");
	System.out.println("-".repeat(50));
	
	for(int i = 0; i< 9 ; i++) {
		System.out.printf("%d x %d = %d \n", num , i+1,num*(i+1));
	}
	System.out.println("=".repeat(50));
	}
}
