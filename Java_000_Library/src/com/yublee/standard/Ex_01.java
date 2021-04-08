package com.yublee.standard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.yublee.standard.impl.InputServiceImplV2;

public class Ex_01 {

	public static void main(String[] args) {
		//List<> = new ArrayList<> ; 같이 사용가능 List도 인터페이스
		InputService isV1 = new InputServiceImplV2();
		
		isV1.inputValue("to");
		isV1.inputValue("to", 0);
		isV1.inputValue("to",0,10000);
		
		/*
		 * List인터페이스를 구현한 클래스는 
		 * ArrayList , LinkedList, Vector 가 있음
		 * 이 3가지의 클래스는 코드에 List인터페이스를 impl
		 * 이러한 클래스는 선언과 생성을 할 때
		 * 인터페이스로 선언을 하고, 클래스의 생성자로 객체를 생성하는 것이 좋음
		 * 
		 * List 인터페이스를 impl한 클래스들 :  List type의 클래스
		 */
		List<Integer> intList = new ArrayList<Integer>();
		intList = new LinkedList<>();
		intList = new Vector<Integer>();
		ArrayList<String> strList = new ArrayList<String>();
	}
}
