package com.calloer.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.calloer.classes.model.IolistVO_A;

public class IolistServiceV1A {
	
	// TODO 맴버변수 선언하기
	protected List<IolistVO_A> iolist;
	protected Scanner scan;

	// 선언된 객체를 그대로 쓰려면 nullpointexeption이남 > 생성자만들어서
	public IolistServiceV1A() {

		// TODO 클래스 생성자
		iolist = new ArrayList<IolistVO_A>();
		scan = new Scanner(System.in);
	}

	/*
	 * public 으로 선언된 method는 객체.method() 형식으로 호출이 가능한 method return type이 명확히 결정되지
	 * 않았을 때는 void형으로 작성
	 */
	public void selectMenu() {
		// TODO 업무선택하기 메뉴
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("KMS 쇼핑몰 업무 관리");

			System.out.println("-".repeat(50));
			System.out.println("1. 매입매출 등록");
			System.out.println("2. 매입매출 리스트 출력");
			System.out.println("0. 업무종료");
			System.out.println("-".repeat(50));
			System.out.print("업무선택 >> ");
			int intMenu = scan.nextInt();
			if (intMenu == 0) {
				break;
			} else if (intMenu == 1) {
				this.input();
			} else if (intMenu == 2) {
				this.printAllList();

			}
		} // end while
		System.out.println("업무종료!!!");
	}

	public void input() { //상품 1개를 입력받음

		// TODO 매입매출 등록
		
		System.out.println("==============================================");
		System.out.println("매입 매출 등록");
		System.out.println("----------------------------------------------");
		System.out.print("상품명 >> ");
		String pname = scan.next();

		System.out.print("거래일자(yyyy-mm-dd) >> ");
		String date = scan.next();

		System.out.print("거래처명 >> ");
		String dname = scan.next();

		System.out.print("매입매출 구분 >> ");
		String inout = scan.next();

		System.out.println("수량 >> ");
		Integer qty = scan.nextInt();

		System.out.print("매입단가 >> ");
		Integer iprice = scan.nextInt();

		System.out.println("매출단가 >> ");
		Integer oprice = scan.nextInt();

		IolistVO_A iolistVO = new IolistVO_A();
		iolistVO.setPname(pname);
		iolistVO.setDate(date);
		iolistVO.setDname(dname);
		iolistVO.setInout(inout);
		iolistVO.setIprice(iprice);
		iolistVO.setOprice(oprice);
		iolistVO.setQty(qty);

		// iolistVO에 저장한 데이터 확인
		this.printIolist(iolistVO);
		

		//입력된 매입매출 데이터를 데이터 리스트에 담기
		iolist.add(iolistVO);
	}//end input

	
	
	public void printAllList() {
		
		// TODO 저장된 리스트 출력
		
		System.out.println("=".repeat(50));
		System.out.println("매입매출 리스트");
		System.out.println("-".repeat(50));
		System.out.println("상품명\t거래일\t거래처\t구분\t수량\t매입단가\t매출단가");
		for(int i = 0; i < iolist.size() ; i++) {//iolist에 담겨있는 데이터 개수만큼 반복
			//IolistVO_A vo = iolist[i]
			//IolistVO_A vo = iolist.get(i);
			//this.printIolist(vo);
			this.printIolist(iolist.get(i));//바로위에 두줄을 한줄로
			//직접 getter한테 받아서 printIolist에게 직접전달
		}
		System.out.println("=".repeat(50));
	}
	public void printIolist(IolistVO_A vo) {
		
		// TODO 1개 데이터 출력
		
		System.out.print(vo.getPname() + "\t");
		System.out.print(vo.getDate() + "\t");
		System.out.print(vo.getDname() + "\t");
		System.out.print(vo.getInout() + "\t");
		System.out.print(vo.getQty() + "\t");
		System.out.print(vo.getIprice() + "\t");
		System.out.print(vo.getOprice() + "\n");

	}

}
