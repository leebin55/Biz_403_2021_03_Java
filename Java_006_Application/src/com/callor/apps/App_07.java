package com.callor.apps;

import java.util.Random;

public class App_07 {

	public static void main(String[] args) {
		
		/*
		 * 어떤 배열에
		 * 7, 2, 4, 3, 1 값이 저장되어 있을때
		 * 1, 2, 3, 4, 7 과같이 정령(Sort)하고자 할때
		 * 
		 * 최초 : 7, 2, 4, 3, 1 일때
		 * 0번요소(7)와 1번 요소(2) 두값을 크기 비교
		 * 0번에 2를 저장하고 1에 7을 저장하여 자리바꿈(큰값을 오른쪽으로)
		 * 2, 7, 4, 3, 1로 만듦
		 * 
		 *  0번 요소 (2) 2번요소 (4) 두값을 크기 비교
		 *  4가 더 큰값이므로 그냥 둠
		 *  2, 7, 4, 3, 1 로 그대로 유지
		 *  
		 *  0번 요소(2), 3번요소(3) 두값을 크기 비교
		 *  3이 더 큰값 자리변경XX
		 *  2, 7, 4, 3, 1 로 그대로 유지
		 *  
		 *  0번 요소(2) 와 4번요소(1) 두값 크기 비교
		 *  2가 더 큰값이므로 자리 바꿈
		 *  1, 7, 4, 3, 2 로 바꿈
		 *  
		 *  1번요소(7) 와 2번요소(4)두 값을 크기 비고
		 *  7이 더 크므로
		 *  1, 4, 7, 3, 2 로 바꿈
		 *  
		 *  1번요소(4) 3번요소(3) 비교
		 *  1, 3, 7, 4, 2 로 바꿈
		 *  
		 *  1번요소(3)과 4번요소(2) 두값을 비교
		 *  1, 2, 7, 4, 3 로 바꿈
		 *  
		 *  2번요소(7) 3번요소(4) 두 값 비교
		 *  1, 2, 4, 7, 3 로 바꿈
		 *  
		 *  2번요소(4) 4번요소(3) 비교
		 *  1, 2, 3, 7, 4 로 바꿈
		 *  
		 *  3번요소 (7) 4번요서(4) 비교
		 *  1, 2, 3, 4, 7 로 바꿈
		 *  
		 *  작은 값부터 큰값으로 정렬
		 */
		
		Random rnd = new Random();
		int[] intNums = new int[5];
		for(int i = 0; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(100)+1;
			
		}
		for(int num : intNums) {
			System.out.print(num + "\t");
		}
		System.out.println("==============================");
		System.out.println("오름차순 정렬"); //중첩된 for문 사용
		System.out.println("------------------------------");
		
		/*
		 *intNums[0] 에 저장된 값과 
		 *intNums[1] 에 저장된 값을 교환
		 *
		 */
		
		int t =intNums[0];
		
		intNums[0] = intNums[1];
		intNums[1] = intNums[0]; //intNums[0]=의 값과 intNums[1]의 값이 같아짐(intNums[1]으 값으로)
		
		t= intNums[0];
		intNums[0] = intNums[1];
		intNums[1]= t;
		/*
		 * 두 변수의 값을 서로 바꾸려면(교환)
		 * 제 3의 임시저장소 변수가 필요하다
		 */
		int num1 = 30;
		int num2 = 40;
		int temp = num1;//num1의 값을 임시저장
		num1 = num2;
		
		
		num2 = temp;
	}
}
