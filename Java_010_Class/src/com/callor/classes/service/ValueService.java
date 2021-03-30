package com.callor.classes.service;

public class ValueService {

	/*
	 * 클래스의 맴버변수를 public 으로 선언하는 것은 매우 위험
	 * 어떤 이유로든 public으로 된 맴버변수는 값이 변경될수 있음
	 * 원하지 않는 값으로 변수 내용이 오염될 수 있음
	 * 
	 * 그러한 현상을 방지하기 위해
	 * 맴버변수는 가급적 private으로 선언하고 멤버변수값을
	 * 객체.변수 형식으로 읽어내고자 할때는 
	 * getter() method를 만들어주는 것이 좋다
	 * ==정보의 은닉
	 */
	private int retNum;
	//public int retNum;
	public int getRetNum();
	public void nums() {
		//nums method는 어떤 연산을 수행하고
		// 그 결과값인 100을 호출한 곳에 return하고 싶다
		// 하지만 void method 에서는 값을 return할 수 없음
		//그래서 멤버변수를 선언하고 멤버변수에 값을 세팅(저장)해 두었다
		retNum = 100;
		
	}
	public Integer numsRet() {
		return 100;
	}
}
