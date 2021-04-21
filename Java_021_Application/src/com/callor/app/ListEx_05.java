package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class ListEx_05 {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> linkArr = new ArrayList<Integer>();
		
		//무조건 마지막자리에 추가됨
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(500);
		view(arr);//static method호출
		
		//중간에 위치를 지정하여 추가 (사이에 끼어들기))
		linkArr.add(0,100);
		linkArr.add(1,100);
		linkArr.add(2,100);
		linkArr.add(2,100);
		linkArr.add(2,100);
		view(linkArr);
		
		//특정 위치의 값을 변경하고 싶다면 set을 이용
		
	}//end main
	public static List<Integer> view(List<Integer> aList) {
		//Integer 자료형 List를 return
		return aList;
		
	}
}
