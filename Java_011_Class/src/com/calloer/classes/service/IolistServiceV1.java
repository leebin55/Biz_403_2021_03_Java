package com.calloer.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.calloer.classes.model.IolistVO_A;

/*
 * IolistVO는 1개의 데이터를 담을 수 있도록 설계
 * But, 실제 프로젝트에서는 1개의 데이터만 있는 경우는 없다
 * 
 * 여러개의 데이터 묶음으로 연산을 수행해야 함
 * 
 * 데이터의 묶음을 처리할 때는 보통 배열을 많이 사용하지만 
 * 배열은 그 구조상 사용이 다소 불편
 * => Java에서는 배열을 사용해야 하는 프로젝트에서 List 클래스를 사용한 객체를
 * 		생성하여 진행을 함
 */
public class IolistServiceV1 {

	/*
	 * 매입매출 데이터들을 사용하여 연산을 수행하는데
	 * 매입매출 데이터들의 묶음을 List 형 객체를 사용하겠다
	 * 
	 * List형 객체에 포함된 (개별)데이터는 IolistVO형으로 담아서 사용하겟다.
	 * 
	 * 낱개 데이터는 IolistVO클래스 형으로 사용하고
	 * 그 데이터 들을 묶ㄷ어서 List형으로 연산 수행을 하겠다라는 선언
	 * 
	 * 
	 * iolist 를 private으로 설정한 이유
	 *  - 혹시 외부에서 iolist데이터에 접근하여 값을 저장하는 일을 방지하기 위함
	 *  
	 *  protected 
	 *   - V1 클래스를 상송하여 사용할 예정이라면 protected로 선언
	 */
	protected List<IolistVO_A> iolist;
	protected Scanner scan;
	//선언된 객체를 그대로 쓰려면 nullpointexeption이남 > 생성자만들어서
	public IolistServiceV1() {
		
		iolist = new ArrayList<IolistVO_A>();
		scan = new Scanner(System.in);
	}
	
	public void input() {
		
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
		
		//iolistVO에 저장한 데이터 확인
		this.printIolist(iolistVO);
		
		//입력된 매입매출 데이터를 데이터 리스트에 담기
		iolist.add(iolistVO);
		}
	
	public void printIolist(IolistVO_A vo) {
		System.out.print(vo.getPname() + "\t");
		System.out.print(vo.getDate() + "\t");
		System.out.print(vo.getDname() + "\t");
		System.out.print(vo.getInout() + "\t");
		System.out.print(vo.getQty() + "\t");
		System.out.print(vo.getIprice() + "\t");
		System.out.print(vo.getOprice() + "\n");
		
	
	}
	public void selectMenu() {
		
		System.out.println("==================================");
		System.out.println("KMS 쇼핑몰 업무관리");
		System.out.println("----------------------------------");
		System.out.println("1. 매입매출 등록");
		System.out.println("2. 매입매출 리스트 출력");
		System.out.println("0. 업무종료");
		System.out.println("----------------------------------");
		System.out.print("업무선택 >> ");
		int num = scan.nextInt();
		if(num == 1 ) {
			this.input();
		}else if(num == 2) {
			this.printIolist(null);
		}else if (num == 0) {
			System.out.println("업무종료");
		return;	
		}
	}
}
