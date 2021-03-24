package com.callor.apps;

import java.util.Random;
/*
 * 정수형 배열을 20개 선언
 * 짝수들의 리스트 출력
 * 짝수들의 합을 계산하여 출력
 * 
 * {   } 내에 있는 코드는 최소화 하자
 * 작은 일들로 분해하기 
 * Divide and Conquer(나누어서 정복) >>추가나 변경할때 다른 코드 수정방지
 */
public class App_001_a {

	public static void main(String[] args) {

		int numsLength = 20;//배열의 수 
		//공통된 값들을 변수로 만듬 >> 효율적 수정가능
		/* 
		 * 배열의 크기를 변수에 설정해 두고 
		 * 코드내에서 공통으로 사용하기 
		 */
		Random rnd = new Random();
		int[] nums = new int[numsLength];
		int intSum = 0;
//배열에 값 저장
		for (int i = 0; i < numsLength; i++) {
			//"먼저 선언"되어있는!!
			//배열에 값을 저장하기
			nums[i] = rnd.nextInt(100) + 1;}
//짝수 리스트 출력
		for(int i = 0; i < numsLength; i++) {
			//배열에 저장된 값을 읽기
			//읽은 값이 짝수인가 검사
			if(nums[i] % 2 == 0) {
				//짝수이면 출력
				System.out.println(nums[i]);
			}
		}
		//intSum에 이전 코드에서 어떤값이 저장되어  있을지 모르게 때문에
		//clear하고 시작
		intSum = 0;
//합계출력
		for (int i = 0; i < numsLength; i++) {
			if(nums[i] % 2 == 0) {
				//짝수이면 intSum에 합산(누적)하라
				intSum += nums[i];
			}
		}
		System.out.println("==============================");
		System.out.println(intSum);
	}

}
