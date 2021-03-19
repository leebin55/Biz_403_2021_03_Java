package com.callor.controller;

public class Cont_04 {

	public static void main(String[] args) {
		int intNum = 0;
		for(int index = 0; index < 10 ; index++) {
			//for()반복문이 실행된느 동안에
			// intNum 변수는 생성과 소멸은 반복횟수만큼
			//실행
			//과거에는 이러한 문제가 이슈가 됨
			//int intNum = 0;
			intNum = index + 1;//int intNum 만 쓰면 intNum변수선언되고 지워지는 과정 10번반복
			//int intNum = index + 1; for()안에 선언하는 것보다 밖에서 선언하고 사용하기
			System.out.println(intNum);
			//i + 1
			
		}
		System.out.println("=================================");
		int intSum = 0;
		// index 는 for()반복문에 의해서 0 ~ 0 까지 변함
		//		index++ 명령문에 의해서 index가 변한다
		
		for(int index =0 ; index < 10 ; index++) {
		// 0~9 까지의 값이 index에 저장된 상태로
			//명령이 실행
			//intNum 에는 index값에 1을 더한 값이 저장
			//결국 intNum는 0 ~ 9까지 값이 하나식 저장
			//		index++
			//		intNum = index +1
			intNum = index + 1;
			
			//intSum = intSum + intNum;
			
			intSum += intNum;
			System.out.println(intSum); //for()안
			System.out.println("==============================");
		}
		System.out.println(intSum); //for() 밖
		System.out.println("===============================");
		intSum = 0;
		for(int i = 0 ; i < 10 ; i++)
		{
			int n = i +1;
			intSum +=n;
			
		}
		System.out.println(intSum);
		System.out.println("===============================");
		intSum = 0;
		for(int index = 0; index < 10 ; index += 2) {
			intSum += index;
			
		}
		System.out.println(intSum);
		System.out.println("===============================");
	
		intSum = 0;
		for(int index = 0; index < 10 ; index += 2) {
			intNum = index+ 1;
			intSum += intNum;
			
		}
		System.out.println(intSum);
		System.out.println("===============================");

		
		for(int index = 0; index < 10 ; index += 2) {
			System.out.println(index);
			
		}
		System.out.println("===============================");
	
		for(int index = 0; index < 10 ; index += 2) {
			intNum += index + 1;
			System.out.println(intNum);
		}	
		
	}
}
