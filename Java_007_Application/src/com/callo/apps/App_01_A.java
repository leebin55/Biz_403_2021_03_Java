package com.callo.apps;

import java.util.Random;

public class App_01_A {
	/*for()반복문에서 사용할 num(index변수)를
	 * for 반복문 시작전에 선언을 하고 실행을 하면
	 * for()반복문이 종료된 후에 num값을 읽을 수 있다
	 * 
	 * 이때 
	 * 1.만약 중간에 break를 만나서 for()가 중단되거나
	 * 2.break 없이 for() 반복문이 모두 완료되거나
	 * 할텐데 1과 2의 경우에 num 변수의 상태가 다르다
	 * 
	 * 보통은 num 변수의 값은 조건문에 최대값과 같다
	 * 1번의 경우 num값은 num2보다 항상 작다
	 * 2번의 경dn num2보다 크거나 같다
	 * if(num == num2) 비교문을 사용하는 것보다
	 * 		if(num < num2) 조건문을 사용하는 것이 좋다
	 * 		=>논리적인 문제를 최소화
	 */
	public static void main(String[] args) {

		int num1 = 9;
		int num2 = 11;
		// 9가 소수가 아님을 알려주기
		for (int index = 2; index < num1; index++) {

			// 비교 연산문에서 결과 한번이라도 true가 되면
			if (num1 % index == 0) {
				System.out.println(num1 + "은 소수가 아님");
				break;
			} else {
				// num1의 값이 소수가 아니더라도
				// 계속해서 소수라는 메시지가 출력
				System.out.println(num1 + "은 소수다");
			}
		}
		// 11이 소수인것을 판별
		boolean notPrime = false; // flag변수 (boolean값은 true 와 false만)
		for (int i = 2; i < num2; i++) {

			if (num2 % i == 0) { // 결과값이 0이 아닌면(소수)이면 notPrime = true와 break가
									// 실행되지 않은

				// num2가 소수가 아닌것이 발견되면
				// notPrime변수에 true 설정
				notPrime = true; // flag변수의 setting 값을 바꿈
				break;
			}
		}
		// for() 반복문이 모두 완료되었거나
		// 중간에 break 만나서 중단되었거나

		// setting되거나 그렇지 않은 경우를 판단하여 결과 출력
		if (notPrime) { // notPrime == true
			System.out.println(num2 + "소수가 아님");
		} else {
			System.out.println(num2 + "소수임");

		}
		int num = 0;
		for (num = 2; num < num2; num++) {
			if (num2 % num == 0) {
				break;
			}
			//논리적오류를 일으킬 가능성이 있다.
			//num >=num2 (num ==num2보다 앞에 처럼 부등호이용하기) 
			//boolean은 값이 두개기때문에 상관 없음
			if (num == num2) {
				System.out.println(num2 + "소수");
			}else {
				System.out.println(num2 + "소수아님");
			}
			
			//논리적인 오류를 최소화 하기 위하여
			//비교연산자를 1개만 사용하여 검사할 수 있는 코드를 사용하는 것이 좋다
			if(num < num2) {
				System.out.println(num2 + "소수아님");
			}else {
				System.out.println(num2 + "소수");
				
			}
		}
		
		System.out.println("========================================");
		System.out.printf("num2 : %d, num : %d", num2, num);

		
	}
}
