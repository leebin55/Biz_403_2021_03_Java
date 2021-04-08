package com.callor.reload.service;

import java.util.Random;

public class PrimeSeviceV1A {

	private Random rnd;
 int num;

	public PrimeSeviceV1A() {
		rnd = new Random();
		num = 0;
	}

	public void primNum() {
		int num = 0;
		int index = 0;
		num = rnd.nextInt(51) + 50;
		
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				break;
			}
		}
		if (index < num) {
			System.out.println(num + " : 소수아님");
		} else {
			System.out.println(num + " : 소수");
		}

	}
}
