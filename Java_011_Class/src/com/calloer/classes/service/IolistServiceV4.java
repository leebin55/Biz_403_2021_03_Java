package com.calloer.classes.service;

import com.calloer.classes.model.IolistVO_A;

public class IolistServiceV4 extends IolistServiceV1A{

//	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("==============================================");
		System.out.println("매입 매출 등록");
		System.out.println("----------------------------------------------");
		String pname = null;
		while(true) {
			System.out.print("상품명(QUIT : 입력중단) >> ");
			
			pname = scan.nextLine();//next(); 는 enter누르면 계속 줄바꿈만
			if(pname.equals("QUIT")) {
				return;
			}else if(pname.equals("")) {
				System.out.println("상품명은 반드시 입력해야 합니다");
				continue;
			}
			break;
		}
		
		
		System.out.print("거래일자(yyyy-mm-dd) >> ");
		String date = scan.next();

		System.out.print("거래처명 >> ");
		String dname = scan.next();

		System.out.print("매입매출 구분 >> ");
		String inout = scan.next();

		System.out.println("수량 >> ");
		Integer qty = scan.nextInt();
		
		Integer iprice =  this.inputPrice("매입");
		if(iprice == null) {
			return;
		}
		Integer oprice = this.inputPrice("매출");
		if(oprice == null) {
			return;
		}
		IolistVO_A vo = new IolistVO_A();
		vo.setPname(pname);
		vo.setDate(date);
		vo.setInout(inout);
		vo.setQty(qty);
		vo.setIprice(iprice);
		vo.setIprice(iprice);
		vo.setOprice(oprice);
		
		
		
		
	}
	
	private Integer inputPrice(String title) {
		
		while(true) {
			System.out.println(title + "단가를 입력하세요");
			System.out.println(title + "단가는 0 이상 입력하세요");
			System.out.println("-1 : 단가 입력 중단");
			System.out.print(title + "단가 >> ");
			Integer price = scan.nextInt();
			if(price == -1) { 
				return null;
			}else if(price < 0) {
				System.out.println(title + "단가는 0 이상이여야 합니다.");
			}else {
				return price;//0 이상이면 price를 바로 return
			}
						
		}
		
	}
	

}
