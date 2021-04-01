package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {

	Scanner scan;
	List<NumberVO> numList;

	public InputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {
		
		System.out.println("2개 정수");
		System.out.println("두번째 정수는 첫번째보다 작게");
		System.out.print(" 1번째 >>");
		String strNum1 = scan.nextLine();
		Integer intNum1 =0;
		try {
			intNum1 = Integer.valueOf(strNum1);
		} catch (Exception e) {
			System.out.println("숫자로만 입력");
			//continue
		}
		System.out.print(" 2번째 >>");
		String strNum2 = scan.nextLine();
		Integer intNum2 = 0;
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	public void printNum() {
			for(int i = 0; i < numList.size(); i++) {
				
			}
		}
	}