package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV3 {

	Scanner scan;
	List<Integer> intList;

	public InputServiceV3() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();

	}

	public void inputNum() {
		while (true) {
			System.out.println("정수 50 ~ 150 까지 입력");
			System.out.print(" >>   ");
			String strNum = scan.nextLine();
			Integer intNum = 0;
			// int intNum1 = Integer.valueOf(strNum); // strNum 형을 Integer 클래스형으로 변환했다가
			// 또 int형으로 변환
			// 문법적인 오류는 없지만 Integer형을 int형으로 변환하는 과정이 이루어짐
			// strNum 에 담겨있는 문자열을 정수형으로 변환 (int형이 아닌 Integer형!!을 사용)
			try {
				intNum = Integer.valueOf(strNum);

			} catch (Exception e) {
				System.out.println("값은 정수형 숫자로만 입력!!");
				continue;
			}
			if (intNum > 50 && intNum < 150) {
				intList.add(intNum);// intList 는 Integer 타입만 입력 문자열 >> 정수형
				break;
			}else {
				System.out.println("정수의 범위는 50 ~ 150");
			}
		}
	}
}
