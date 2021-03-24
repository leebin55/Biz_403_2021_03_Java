package com.callor.apps;

import java.util.Random;

public class App_07_a {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] intNums = new int[5];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i]=rnd.nextInt(10)+1;
			for (int j = i + 1; j < 5; i++) { //int j =i 라고 함 >>오류남 
				int t = 0;
			
				if (intNums[i + 1] > intNums[i]) {
					t = intNums[i];
					intNums[i] = intNums[i + 1];
					intNums[i + 1] = t;

				}
			}System.out.println(intNums[i]);
		}
	}
}
