package com.callor.apps;

import java.util.Random;

public class App_03 {

	public static void main(String[] args) {

		int intLength = 20;
		int[] intNum = new int[intLength];
		Random rnd = new Random();

		for (int i = 0; i < intLength; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
			System.out.println(intNum[i]);
		}
		System.out.println("====================================");
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] % 2 == 0) {
				System.out.println(i );
			}

		}
	}
}