package com.calloer.classes;

import java.util.Scanner;

public class ScannerEx_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("두개의 숫자를 입력");
		System.out.println("단, QUIT를 입력하면 중단");

		System.out.print("숫자 1 >> ");
		String strNum = scan.nextLine();
		// if(strNum == "QUIT") {//Exception발샹 numberformatexception
		if (strNum.equals("QUIT")) {
			System.out.println("입력종료");
			return;// main() method를 끝내라 >> 더이상 진행하지 마라
		}
		try {
			Integer intNum = Integer.valueOf(strNum); // 입력한 문자열을 Integer.value...의 매개변수로
			//

			System.out.println("입력한 숫자의 제곱 : " + (intNum * intNum));

		} catch (Exception e) {// catch는 {} 안의 코드를 진행하고 다음 코드로 진행
			System.out.println("입력한 값이 숫자가 아니어서 계산할 수 없음");
			// exception을 피해서 코드가 정상적으로 작동할 수 있도록
			// 코드중단 막는 목적
		}

	}
}
