package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceExV5 {

	Scanner scan;
	List<NumberVO> intList;

	public InputServiceExV5() {
		scan = new Scanner(System.in);
		intList = new ArrayList<NumberVO>();

	}

	public void inputNum() {
		System.out.println(" 두 정수의 뺄셈 구하기 ( 리스트 출력 : 첫번째 정수에 -1)" );
		System.out.println("");
		while (true) {
			System.out.println(" 정수 2개를 입력하세요 단, 정수의 범위는 1 ~ 200!!");
			System.out.print("1번째 정수 >>  ");
			String strNum1 = scan.nextLine();
			Integer intNum1 = 0;
			try {
				intNum1 = Integer.valueOf(strNum1);

			} catch (Exception e) {
				System.out.println("-".repeat(30));
				System.out.println("정수로만 입력하세요");
				System.out.println("-".repeat(30));
				continue;

			}
			if(intNum1 == -1) {
				this.printNum();
				break;
			}if(intNum1<1 || intNum1 > 200) {
				System.out.println("범위를 벗어났습니다. (1 ~ 200)");
				continue;
			}

			System.out.print("2번째 정수 >>  ");
			String strNum2 = scan.nextLine();
			Integer intNum2 = 0;
			try {
				intNum2 = Integer.valueOf(strNum2);

			} catch (Exception e) {
				System.out.println("-".repeat(30));
				System.out.println("정수로만 입력하세요");
				System.out.println("-".repeat(30));
				continue;

			}
			if (intNum1 < intNum2) {
				System.out.println("첫번째 정수는 항상 두번째 정수보다 커야 합니다.");
				continue;
				
			}
			if(intNum2 <1 || intNum2 > 200) {
				System.out.println("범위를 벗어났습니다. (1 ~ 200)");
				System.out.println("");
				continue;
			}
			NumberVO numVo = new NumberVO();
			numVo.setNum1(intNum1);
			numVo.setNum2(intNum2);
			intList.add(numVo);
		}
	}
	public void printNum() {
		
		System.out.println("=".repeat(30));
		for(int i = 0; i < intList.size();i++) {
			NumberVO vo = intList.get(i);
			System.out.printf("%d - %d = %d\n",vo.getNum1(),vo.getNum2(),vo.getNum1() - vo.getNum2());
		}
	}
}
