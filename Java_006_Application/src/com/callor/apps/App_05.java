package com.callor.apps;

import java.util.Random;

public class App_05 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intLength = 50;
		int intNums[] = new int[intLength];
		
		for (int i = 0; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		
		for (int i = 0; i < intNums.length ; i++) {
			
			//한줄에 다섯개씩 나누어서 출력
			
			//리스트를 한줄에 출력 하다가
			//다섯번째 요소를 출력한 후 Enter를 눌러서
			//다음 요소는 줄바꿈 
			
			System.out.print(intNums[i] + "\t");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
	}
}
