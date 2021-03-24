package com.callor.apps_a;

import java.util.Random;

public class Random_001 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		for(int i = 0; i < 5 ; i++) {
			int intNum= rnd.nextInt(100)+1;
			if(intNum % 3 == 0) {
				System.out.println(intNum + "는 3의 배수");
			}else {
				System.out.println(intNum + "는 3의 배수 아님");
			}
		}
	}
}
