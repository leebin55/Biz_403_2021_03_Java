package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5A {

	Scanner scan;
	List<NumberVO> numList;
	
	public InputServiceV5A() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}
	
	public void inputNum() {
		while(true) {
		System.out.println("정수 2개를 입력하세요  ");
		System.out.println("리스트 출력 : -1");
		System.out.print("정수 1 >>  ");
		String strNum1 = scan.nextLine();
		
		Integer intNum1 = Integer.valueOf(strNum1);
		if(intNum1 == -1) {
			this.printNum();
		}
		System.out.print("정수 2 >>  ");
		String strNum2 = scan.nextLine();
		Integer intNum2 = Integer.valueOf(strNum2);
		if(intNum2 < intNum1) {
			NumberVO numVo = new NumberVO();
			numVo.setNum1(intNum1);
			numVo.setNum2(intNum2);
			numList.add(numVo);
			
		}else {
			System.out.println("두번째 값은 첫번째 값보다 작아야합니다.");
			continue;
		}
		
		}
		
	}
	
	public void printNum() {
		System.out.println("=".repeat(50));
		for(int i = 0 ; i < numList.size();i++) {
			NumberVO vo = numList.get(i);
			System.out.printf("%d - %d = %d\n",vo.getNum1(),vo.getNum2(),vo.getNum1() - vo.getNum2());

		}
	}
}
