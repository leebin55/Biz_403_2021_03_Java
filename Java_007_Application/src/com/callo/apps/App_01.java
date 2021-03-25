package com.callo.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[20];
		int num = 0;

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(51) + 50;

			for (int j = 2; j < intNums[i]; j++) {
				if (intNums[i] % (j + 1) == 0) {
					
					break;
				}

			}
			
		}

	}
}
