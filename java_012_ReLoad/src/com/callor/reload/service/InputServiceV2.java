package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV2 {
	/*
	 * 클래스 영역에 선언된 변수 : 멤버변수
	 * 
	 * 멤버변수는 이 클래스의 어떤 method 에서든지 자유롭게 접근하여 저장, 읽기 가능
	 * 
	 * 
	 * method 의 { } 에 선언된 변수 : 지역변수 지역변수는 {} 를 벗어나면 변수가 소멸, 서로다른 {} {} 이면 이름이 같아서 서로
	 * 접근 불가 멤버변수에 같은 이름의 변수가 있는데 지역변수에 같은 이름으로 변수를 또 선언하면 멤버변수는 감춰져서 접근이 불가능
	 */
	protected Scanner scan; // scan 이라는 멤버변수 생성
	protected List<Integer> intList;
	// int num;

	// 변수가 선언되는 위치에 따라
	public InputServiceV2() { // {} 안에 선언된 변수 : 지역변수
		// 생성자에서 생성하는 Scanner를 생성하면 이름은 같지만 클래스에서 생성된
		// Scanner와ㅣ 이름은 같지만 완전히 다름
		// intputNum() method 에서 scan
		// Scanner scan = new Scanner(System.in); > 또 선언문 생성 : 잠재적 오류
		// 문법상의 오류가 없지만 null point exception이 발생
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
		// String num;> 변수 이름만 같을뿐 완전히 다른 변수
	}

	public void inputNum() {
		while (true) {
			System.out.println("범위 : 50 ~ 150");
			System.out.println("");
			System.out.print("정수 : ");
			int num = scan.nextInt();
			if (num > 50 && num < 150) {
				intList.add(num);
				break;
			} else {
				System.out.println("값은 50 ~ 150 범위내에서 입력");
			}
		}

	}
}
