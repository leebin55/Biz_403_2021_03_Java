package com.calloer.classes;

import com.calloer.classes.model.IolistVO_A;

public class IolistEx_01 {

	/*
	 * 진입점 method
	 * 시작점 method
	 * Run을 했을때 제일 먼저 실행(호출)되는 method
	 * 
	 * 1. 소스코드 코딩하기 : *.java 파일 작성하기
	 * 2. 컴파일 : "javac *.java" 라고 입력하면 파일(*.java)을 번역하여
	 * 				컴퓨터가 알 수 있는 부호들(코드)로 변환하는 작업
	 * 3. 실행 : 컴파일 되어 생성된 *.java 파일을 컴퓨터 메모리에 load(메모리에 
	 * 			적재한다. 입력한다)하고 프로젝트 실행
	 * 			"java * "라는 명령어 실행
	 * 4. 가상머신 : 자바코드를 번역한 *.class 파일을 열어서 코드를 한개씩
	 * 				운영체제 혹은 CPU에게 보내서 결과를 얻을 수 있게 하는 어플리케이션
	 * 				운영체제, CPU에 관계없이 코드를 실행하여 같은
	 * 				결과를 내도록 하는 역할을 수행
	 * 5. 진입점 method : 현재 이 클래스는  static으로 작성된 main() method
	 * 					가상머신이 java로 컴파일된 코드파일에서 제일 먼저
	 * 					찾는 method
	 * 					*.main("~~~~~~") 제일 먼저 이런 식으로 실행
	 * 
	 *   				java IolistEx_01 이라고 실행을 지시하면
	 *   				IolistEx_01.main("@@@@@@@@")를 호출하여 코드를 실행하기 시작
	 * 
	 */
	public static void main(String[] args) {
		
		/* 
		 * VO클래스는 데이터를 저장하여 연산이 필요한 곳으로 이동, 복사등을 할 때
		 * 사용하는 도구, 바구니 역할을 함
		 * 
		 * VO클래스에 데이터를 저장한다
		 * 		== VO클래스에 만들어진 멤버변수에 값을 저장한다
		 * 
		 * 1. VO클래스를 사용하여 객체를 생성해야 함
		 * 2. 객체.맴버변수 = 값 형식으로 데이터를 저장
		 * 3. 지금 만든 IolistVO_A 클래스의 맴버변수는 모두  private 이기 때문에
		 * 		객체.맴버변수 형식으로 값을 저장할 수 없음
		 * 4. 맴버변수에 값을 저장할 때 setter method를 통하여저장을 해야함
		 */
		IolistVO_A iolistVo = new IolistVO_A();
		
		iolistVo.setPname("신라면");
		iolistVo.setDate("2021-03-31");
		iolistVo.setDname("농심");
		iolistVo.setInout("매입");
		iolistVo.setIprice(500);
		iolistVo.setQty(100);
		printIolist(iolistVo);//iolistVo에 담겨있는 내용이 복사가 되서 밑에 로 가서
		//printIolist( )안의 이름과  밑에 (IolistVO_A  ....  )이름과 같지 않아도 됨
		//값만 복사되기 때문
		
		
		
		
	}//main
	public static void printIolist(IolistVO_A iolistVo) {
		System.out.println("=================================================");
		System.out.println("상품명\t일자\t\t거래처\t구분\t수량");
		System.out.println("-------------------------------------------------");
		System.out.print(iolistVo.getPname() + "\t");
		System.out.print(iolistVo.getDate() + "\t");
		System.out.print(iolistVo.getDname() + "\t");
		System.out.print(iolistVo.getInout() + "\t");
		System.out.print(iolistVo.getIprice() + "\n");
		
	}
}
