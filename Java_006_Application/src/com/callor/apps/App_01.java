package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] intNum = new int[20];
		int intSum = 0;
	
		for(int i = 0; i < 20 ; i++) {
			intNum[i] = rnd.nextInt(100)+1;
			
			if(intNum[i] % 2 == 0) { 
				System.out.println(intNum[i]);
				intSum += intNum[i];
			}
		}
		System.out.println("=======================");
		System.out.println(intSum);
	}
}
