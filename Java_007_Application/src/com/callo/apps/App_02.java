package com.callo.apps;

import java.util.Random;

import com.callo.apps.service.PrimeServiceV1;

public class App_02 {
	private void name() {
	
}//Ctrl Spacbar Enter

	public static void main(String[] args) {
		//모든 클래스에는 생성자method 가 존재
		
		//PrimeServiceV1 클래스를 사용하여
		//psV1객체를 선언하고
		//			 생성하여
		//			 인스턴스변수로 만듬
		//new PrimeServiceV1()
		//			 PrimeServiceV1클래스에 있는
		//			 생성자 method를 호출(실행)하여
		//			 psV1 객체를 사용할 수 있도록
		//			 생성, 초기화, 준비해달라
		PrimeServiceV1 psV1 = new PrimeServiceV1(); 
		//				new P~~V1();이 있어야 psV1이 사용할 준비
		
		psV1.makeNums();
		psV1.makeNums();
		psV1.printPrime();
		
		PrimeServiceV1 psV11 = new PrimeServiceV1();//psV1과 psV11는 둘이 완전이 다름
													//독립적
		psV1.makeNums();
		psV1.printPrime();
		
		int num1 = 30;
		int num2 = 40;
		
		num1  = 50;
		num1 = 60;
		num1 = 0;
		System.out.println(num2);
		
	}
}
