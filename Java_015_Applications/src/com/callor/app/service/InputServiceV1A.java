package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1A {

	Scanner scan;

	public InputServiceV1A() {

		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title) { // 정수값과 QUIT 만

		while (true) {
			System.out.println(title);
			System.out.print("입력 >>  ");
			String strNum = scan.nextLine();
			Integer intNum = 0;
			if (strNum.trim().equals("QUIT")) {
				return null;
			}
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {

				System.out.println("정수와 QUIT만!!!");
				continue;
			}
			return intNum;
		}
	}

	public Integer inputValue(String title, int start, int end) { // 값의 유효성검사
		// null 값은 그대로 null로 넘겨줌
		while (true) {
			String msgTitle = String.format(" %s 의 범위는 %d ~ %d ", title, start, end);
			Integer retNum = this.inputValue(msgTitle);
			if (retNum != null) {
				if (retNum < start || retNum > end) {
					System.out.println("다시 입력");
					System.out.printf(" - 범위는 %d 부터 %d 까지 입니다. - \n");
					continue;
				}
			}
			return retNum;
		}
	}

	public Integer inputValue(String title, int start) { // 시작범위만 그리고 null값과 정수값 return

		while (true) {
			String msgTitle = String.format("%s 는 %d 부터 시작~", title, start);
			Integer retNum = this.inputValue(msgTitle);
			if (retNum != null && retNum < start) {
				System.out.println("다시 입력");
				System.out.printf(" - 범위는 %d 부터 입니다. - \n",start);
				continue;
			}
			return retNum;
		}
	}
}
