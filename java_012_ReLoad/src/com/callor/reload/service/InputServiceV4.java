package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4 {
	protected Scanner scan;
	protected List<NumberVO> numList;

	public InputServiceV4() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}
	public void inputNum() {
		System.out.println("정수 2개 ");
		System.out.println("정수 1 >>");
		String strNum1 = scan.nextLine();
		Integer intNum1 = Integer.valueOf(strNum1);
		

		System.out.println("정수 2 >>");
		String strNum2 = scan.nextLine();
		Integer intNum2 = Integer.valueOf(strNum2);
		
		NumberVO numberVo = new NumberVO();
		numberVo.setNum1(intNum1);
		numberVo.setNum2(intNum2);
		
		numList.add(numberVo);
		
	}

	
	
	public void printNum() {//리스트로 출력
		
		for(int i= 0 ; i <numList.size(); i++ ) {
			
			NumberVO vo = numList.get(i);
			System.out.println(vo.getNum1() + "\t");
			System.out.println(vo.getNum2());
			
		}
			
	}
	public void printNum(NumberVO vo) { //데이터 한개만 출력
		System.out.println(vo.getNum1() + "\t");
		System.out.println(vo.getNum2() + "\n");
	}
}
