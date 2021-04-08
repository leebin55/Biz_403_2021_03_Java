package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV1A {

	List<Integer> intList;
	Scanner scan;

	public InputServiceV1A() {
		intList = new ArrayList<Integer>();
		scan = new Scanner(System.in);
	}

	public void InputNum() {
		while (true) {
			System.out.println("정수 를 입력하세요(범위 : 0 ~ 100)");
			System.out.print("정수 1 >>  (리스트출력 : -1)    ");
			try {Integer num1 = scan.nextInt();
			if(num1 == -1) {
				System.out.println("리스트 출력");
				this.printNum();
				break;
			}else if(num1 <0 || num1>100) {
				System.out.println("오류");
				continue;
			}
			intList.add(num1);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("오류 : 정수만 입력하세요");
				continue;
				
			}
			
			
		}
	}

	public void printNum() {
		System.out.println("=======================================");
		System.out.println(intList);
		System.out.println("=======================================");
	}

}
