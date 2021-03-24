package com.callor.apps;

import java.util.Random;

public class App_06 {

	public static void main(String[] args) {

		// for() 중첩
		// 바깥 for(int i) 가 한 번 반복할때마다
		// 안쪽 for (int i ) 가 5번 반복하라
		int nCount = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {// for 안에 for가 있기때문에 변수다르게 이용
				System.out.println(++nCount);//안쪽 코드는 총 25번 반복 (5* 5)
			}
		}
		System.out.println("==============================");
		//한줄에 별 다섯개 찍고 줄바꿈
		//다섯번 반복
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		System.out.println("==============================");
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1 ; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		System.out.println("=================================");
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
