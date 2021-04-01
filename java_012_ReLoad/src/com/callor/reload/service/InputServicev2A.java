package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServicev2A {

	protected Scanner scan;
	protected List<Integer> intList;
	
	public InputServicev2A() {

	scan = new Scanner(System.in);
	intList = new ArrayList<Integer>();
	}
	
	public void inputNum() {
		Integer num = 0;
		while(true) {
			System.out.println("정수 1개를 입력하세요");
			System.out.print(">>  ");
			num = scan.nextInt();
			if(num < 50 || num>150) {
				System.out.println("범위를 벗어났습니다. 50 ~ 150");
				continue;
			}
			intList.add(num);
			break;
		}
	}
	
	public void printNum() {
		System.out.println("=".repeat(30));
		for(int prime : intList) {
			
			System.out.print(prime + "\t");
		}
	}
}
