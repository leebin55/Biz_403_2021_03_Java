package com.callor.method.service;

import java.util.Scanner;

public class InputServiceV2 {

	protected Scanner scan;

	/*
	 * 전통적인 (구조적 프로그래밍)방법 원칙적으로 같은 클래스에서 같은 이름 method 중복불가
	 * public Integer inputValue1(String title);
	 * public Integer inputValue2(String title, int start);
	 * public Integer inputValue3(String title, int start, int end);
	 * 
	 * 호출 >> inputValue1("새우깡");
	 * 			inputValue2("새우깡",100);
	 * 			inputValue3("새우깡",0,100);
	 * 
	 * inputValue1("새우깡",0,100); - 매개변수 오류
	 * 
	 * 
	 * 객체지향 개발방법에서는 단, 매개변수의 개수, 타입, 순서가 다르면 같은 이름의 method중복 작성가능
	 * 
	 * public Integer inputValue(String title);
	 * public Integer inputValue(String title, int start);
	 * public Integer inputValue(String title, int start, int end);
	 * 
	 * 호출 >> 객체.inputValue("새우깡",100); - 자동으로 알아서 method연결, 호출
	 * 		
	 * 객체.inputValue(100,"새우깡"); - 매개변수 오류 (매개변수 타입이 다름)
	 */
	public InputServiceV2() {
		scan = new Scanner(System.in);

	}

	public Integer inputValue(String title, int start) {

		String msgTitle = String.format("%s ( %d 이상의 ) ", title, start);
		while(true) {
		Integer intNum = this.inputValue(msgTitle);
		if(intNum != null) {
			if(intNum < start) {
				System.out.printf("입력값은 %d 이상이어야 합니다 \n", start);
				continue;
			}
		}
		return intNum;
		}
	}

	public Integer inputValue(String title) { 
		// TODO 정수와 QUIT 만 입력하도록
		/*
		 * exception이 발생했을때 사용자에게 안내 메세지를 보여주고 다시 입력할 수 있도록
		 */
		while (true) {
			System.out.println(title + " 값을 입력하세요");
			System.out.print(" >> ");
			String strNum = scan.nextLine();
			if (strNum.equals("QUIT")) { // QUIT가 아닌 다른 값을 입력하면 if 조건 false
				// 굳이 else 를 사용하지 않아도 문제 없는 코드
				return null;
			}
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				System.out.println("오류오류오류오류오류오류오류오류오류");
				System.out.println("정수나 QUIT만 입력 ");
				continue;

			}
			// try-catch block의 코드가 정상적으로 모두 완료 되었을때 실행되는 부분
			// 입력한 값이 정상적 정수형 데이터로 변환되어 intNum 변수에 담겨있다.
			// 입력한 정수값 return
			return intNum;
		}
	}

	public Integer inputValue(String title, int start, int end) {
		// TODO 이미 만들어진 inputValue(String title) 과 연동하여 유효성 검
		// 사 수행

		// 유효성 검사를 수행하겠다는 메시지를 미리 작성
		String msgTitle = String.format("%s 성적 (%d ~ %d) / 입력종료 : QUIT", title, start, end);// title 을 ~~(범위 ~ 범위)로 나타내겟다.
		while (true) {
			Integer intNum = this.inputValue(msgTitle); // ~~값을 입력하세요
			//this.inputValue(String title)method 가 return 해준값이 null 이 아니면 유효성 검사 수행
			if (intNum != null) {
				//유효성 검사 통과하지 못하면 메시지 보여주고 다시 inputValue(String title) 호출하여 입력받음
				if (intNum < start || intNum > end) {
					System.out.printf("입력값은 %d ~ %d 까지 입력\n",start,end);
					continue;
				}
			}
			//inputValue(String title) 이 null 을 return 했거나
			// 유효한 범위의 정수를 return 했으면 그 값이 담겨 있음 >> 그 갑을 return
			return intNum;
		}
	}
}
