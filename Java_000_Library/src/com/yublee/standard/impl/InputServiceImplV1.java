package com.yublee.standard.impl;

import java.util.Scanner;

import com.yublee.standard.InputService;
/*
 * 인터페이스 implements 한 클래스는 이름을 지을때
 * 보통 앞에 Impl을 붙임
 * 
 * 인터페이스를 impl한 클래스는 인터페이스에 설계된 추상메서드를 
 * "반드시'!!!!!!!! 구체적인 코드로 구현 해야함
 * 
 * 만약 아직 구체적인 코드가 구현되지 않았더라도  method의 형태는
 * 삭제 할 수 없음 > 안그럼 오류 발생
 * 
 * 이러한 규칙을 적용하여 다른 클래스와 연동할 때 편리하고, 오류가 없도록 하기 위함
 */
public class InputServiceImplV1 implements InputService{
	
	protected Scanner scan;
	
	public InputServiceImplV1() {
		scan = new Scanner(System.in);
	}
//반드시 InputService 를 상속받아라 > 클래스 오류 발생
	@Override
	public Integer inputValue(String title) {
		// TODO prompt 타이틀 보여주고 정수 입력받기
		while(true) {
			
			System.out.println(title + "값을 입력 (QUIT : 입력중단)");
			System.out.print(" >>  ");
			String strIn = scan.nextLine();
			if(strIn.equals("QUIT")) {
				System.out.println(" 입력 취소!!");
				return null;
			}
			Integer intIn = null;
			try {
				intIn = Integer.valueOf(strIn);
			} catch (NumberFormatException e) {
				System.out.println("정수나 QUIT 만 입력!");
				continue;
			}
			return intIn;
		}//end while
	}

	@Override
	public Integer inputValue(String title, int start) {
		// TODO 시작값을 갖는 유효성 검사 추가한 method
		title = String.format("%s ( %d 이상 ) ",title,start);
		while(true) {
			//intIn에 저장된 값 == inputValue(String)에서 return한 값
			Integer intIn = this.inputValue(title);
			if(intIn !=null ) {
				if(intIn<start) {
					System.out.printf("입력값은 %d 이상으로!!\n",start);
					continue;
				}
			}return intIn;
		}//end while
	}

	@Override
	public Integer inputValue(String title, int start, int end) {
		// TODO 제목, 시작값, 종료값 으로 유효성 검사 method
		title = String.format("%s (%d ~ %d)", title,start,end);
		while(true) {
			Integer intIn = this.inputValue(title);
			if(intIn != null) {
				if(intIn < start || intIn >end) {
					System.out.printf("값은 %d ~ %d 만\n",start,end);
					continue;
				}
			}
			return intIn;
			
		}//end while
	}

}
