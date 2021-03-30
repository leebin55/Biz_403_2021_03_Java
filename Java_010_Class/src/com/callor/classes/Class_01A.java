package com.callor.classes;

import java.util.Arrays;
import java.util.Random;

public class Class_01A {
	/* 
	 * 배열의 개수를 어떤조건에 맞춰서 생성 할때 
	 */

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intNum = rnd.nextInt(51)+50;
		
		//i값이 0에서 시작하여 1씩증가하면서 100 미만일경우 
		//{  }안의 명령을 실행
		//i : 0~ 99
		for(int i = 0; i < 100 ; i++) {
			
		}
		
		//i : 2~( intNum -1) 연속으로 생성
		//intNumd의 약수가 몇개인가 구하기
		int nCount = 0;
		for(int i = 2 ; i <intNum ; i++) {
			if(intNum % i == 0) {
				nCount++;
				
			}
		}
		System.out.println("생성된 난수 : " + intNum);
		System.out.println("약수의 갯수 : " + nCount);
		int[] divisor = new int[nCount];
		
		int index = 0;
		for(int i = 2; i <intNum ; i++) {
			if(intNum % i == 0) {
				divisor[index++] = i;
			}
		}
		
		System.out.println(Arrays.toString(divisor));
	}
}
