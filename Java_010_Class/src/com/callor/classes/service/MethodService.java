package com.callor.classes.service;

public class MethodService {

	//변수는 "같은 {  } 구역 내"에서는 같은 이름으로 절대!! 중복 선언 할 수 없음
	
	public void method(int num) {
		System.out.println("여기는 1번 method");
		
		
	}
	//mehtod 는 같은 클래스의 {    } 구역내에서는 원칙적으로
	// 같은 이름으로 중복 선언할 수 없음
	// 예외1) method 에 매개변수의 유무
	// 예외2) 매개변수의 개수의 차이
	// 예외3) 매개변수의 type의 차이
	// 
	public void method(int num, int num1) {
		
	}
	public void method(float num, int num1) {
		
	}
	/* 
	 * method 코드를 작성 할 때 매개변수를 선언 하면 이 method를 호출 할때
	 * 반드시 매개변수에 해당하는  값을 전달해야 한다
	 * 선언된 매개변수의 개수와 type이 일치하도록 값을 전달
	 * 그렇지 않으면 method호출한 곳에 오류 발생
	 * 객체.method(30,30.0f);  
	 */
	public void method(int num, float num1) {
		
	}
	public void method() {//한 클래스 내에서 중복으로 같은 이름을 사용할 수 없음
		
	}
}
