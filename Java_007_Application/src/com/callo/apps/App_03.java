package com.callo.apps;

import com.callo.apps.service.PrimeServiceV1;

public class App_03 {

	public static void main(String[] args) {
		
		PrimeServiceV1 psV1 = new PrimeServiceV1();
		PrimeServiceV1 psVA = new PrimeServiceV1();
		PrimeServiceV1 psVB = new PrimeServiceV1();
		
		psV1.makeNums();
		psVA.makeNums();
		psVB.makeNums();//이 세 배열에 들어있는 값은 서로 다르다 == 독립적이다.
		
		System.out.println("==================================");
		System.out.println("psV1");
		System.out.println("====================================");
		psV1.printPrime();
		
		System.out.println("====================================");
		System.out.println("psVA");
		System.out.println("-----------------------------------");
		System.out.println();
		
		System.out.println("====================================");
		System.out.println("psV1");
		System.out.println("-----------------------------------");
		System.out.println();
	}
}
