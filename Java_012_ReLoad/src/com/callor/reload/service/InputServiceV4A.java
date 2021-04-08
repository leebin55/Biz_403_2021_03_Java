package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4A {

	Scanner scan;
	List<NumberVO> numList;
	
	public InputServiceV4A() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}
	public void inputNum() {
		System.out.println(" 정수 2 개를 입력하세요");
		System.out.println("정수 1 >>  ");
		String strNum1 = scan.nextLine();
		System.out.println("정수 2 >>");
		String strNum2 = scan.nextLine();
		
		Integer intNum1 = Integer.valueOf(strNum1);
		Integer intNum2 = Integer.valueOf(strNum2);
		
		NumberVO numVo = new NumberVO();
		numVo.setNum1(intNum1);
		numVo.setNum2(intNum2);
		
		numList.add(numVo);
		
	}
	public void printNum() {
		System.out.println("=".repeat(50));
		for(int i = 0; i < numList.size();i++) {
			NumberVO vo = numList.get(i);
			System.out.println(vo.getNum1());
			System.out.println(vo.getNum2());
		}
		
		
	}
}
