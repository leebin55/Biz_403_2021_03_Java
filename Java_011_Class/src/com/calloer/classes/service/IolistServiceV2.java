package com.calloer.classes.service;

import com.calloer.classes.model.IolistVO_A;

public class IolistServiceV2 extends IolistServiceV1A {

	/*
	 * V1A의 input method를 재정의
	 * 
	 * 매입단가, 매출단가는 반드기 0이상이어야한다는 유효성검사를 하도록 코드를 재정의
	 */
//	@Override
	public void input() {

		// TODO 매입 매출 등록

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

		// 매입단가와 매출단가는 0 이상만 입력
		// 매입단가가 0 이상이면 다음 항목을 입력받도록
		// while 반복문 중ㄷ단
		// 매입단가 < 0 이면 계속해서 반복문 내에서 입력을 받도록
		Integer iprice = 0;
		while (true) {
			System.out.print("매입단가 >> ");
			iprice = scan.nextInt();
			if (iprice < 0) {
				System.out.println("오류 : 매입단가는 0이상이여야 합니다.");
			} else {
				break;
			}
			Integer oprice = 0;
			while (true) {
				System.out.println("매출단가 >> ");
				oprice = scan.nextInt();
				if (oprice < 0) {
					System.out.println("오류 : 매출단가는 0이상이여야 합니다.");
					continue;
				}
				break;
			}
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

			// 입력된 매입매출 데이터를 데이터 리스트에 담기
			iolist.add(iolistVO);// List형 객체 iolist
		} // end input
	}
}
