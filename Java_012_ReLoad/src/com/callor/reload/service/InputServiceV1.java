package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  "*Service" 라는 클래스 (Sevice class)
 *   
 *   어딘선가 main() method{  }에서 객체로 선언, 생성한 후 
 *   method호출을 통해 명령을 실행하는 클래스
 */
public class InputServiceV1 {

	// 클래스 영역에 선언된 객체들 : "맴버변수" 들
	// 접근제어자
	// private : 혼자 단독으로 사용
	// protected : 이 클래스를 다른 클래스에서 상속하여 사용할 수 있도록 하기 위해
	// 정수형 데이터들을 담을 리스트형 객체
	// Integer wrapper 클래스 형 데이터 들을 담을 리스트
	protected List<Integer> intList; // 상속을 염두
	// 키보드 입력을 받아 코드를 수행하기 위해 선언
	protected Scanner scan;

	// 선언만 된 객체는 코드(method)를 호출하여 기능을 수행할 수 없음
	// >> 반드시 생성(초기화)를 해 주어야 함
	// 현재 서비스 클래스에 생성자 method에서 수행을 함
	public InputServiceV1() {
		// TODO InputServiceV1의 생성자 method
		intList = new ArrayList<Integer>();
		scan = new Scanner(System.in);

	}
	//method 의 선언문
	//클래스에 선언하는 기본 type의 method
	//{  } : 블레이드, 코드블럭
	//{  }(코드블럭)에 연산을 수행하는 코드를 작성하고 그 코드들의 묶음을 inputNum 라고
	//하겠다 라는 선언
	public void inputNum() {
		System.out.println("키보드로 정수를 입력하세요");
		System.out.println("정수 >>  ");
		Integer num = scan.nextInt(); //키보드로 값을 입력받아 변수 num에 저장
		
		// 키보드로 입력받은 정수를 intList 에 추가
		intList.add(num);
	}
	//TODO 생각했던 코드와 다름
	/*
	 * System.out.println("=======================================");
		System.out.println(intList);
		System.out.println("=======================================");
		
	 */
	public void printNum() {
		
		for(int i = 0; i < intList.size() ; i++) {
			Integer num = intList.get(i);
			System.out.println("정수 : " + intList.get(i));
			
		}
	}
}
