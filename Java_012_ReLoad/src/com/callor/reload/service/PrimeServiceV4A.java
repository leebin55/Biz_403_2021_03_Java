package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4A {

	protected Random rnd;
	protected List<Integer> intList; 

	public PrimeServiceV4A() {
		rnd = new Random();
		intList = new ArrayList<Integer>();
	}

	public void primeNum() {
		int[] intNum = new int[50];
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(51) + 50;
			boolean bPrime = false;
			for (int j = 2; j < intNum[i]; j++) {
				if (intNum[i] % j == 0) {
					bPrime = true;
					break;
				}
			}
			if (!bPrime) {
				intList.add(intNum[i]);
			}
		}
	}

	public void printPrimeNum() {
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));//i위치에 있는 요소값 반환
		}
	}
}
