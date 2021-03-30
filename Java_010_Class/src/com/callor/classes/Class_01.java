package com.callor.classes;

import java.util.Random;

public class Class_01 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int intNum = 0;
		intNum = rnd.nextInt(51) + 50;
		System.out.println("intNum : " +intNum);
		int num = 0;
		for (int i = 2; i < intNum; i++) {
			if (intNum % i == 0) {
				num++;

			}
			
		}
		int[] intArrays = new int[num];
		for (int i = 0; i < num; i++) {
			for (int j = 2; j < intNum; j++) {
				if (intNum % j == 0) {
					intArrays[i] = j;//같은 요소에 계속 값이 새로 저장
							//잘못된 코드
							//배열의 요소값이 1씩 증가함을 이용 
							
				}

			}

		}

		for (int i = 0; i < intArrays.length; i++) {
			System.out.println(intArrays[i]);
		}

	}

}
