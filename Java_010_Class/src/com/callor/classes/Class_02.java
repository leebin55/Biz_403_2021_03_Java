package com.callor.classes;

import java.util.ArrayList;
import java.util.List;

public class Class_02 {

	public static void main(String[] args) {
		
		/*
		 * List<Integer> intList;
		 * 
		 * Java에서 제공되는
		 * 매우 사용이 편리한 배열 자료구조
		 *  - 몇개의 데이터를 저장할지 미리 정하지 않아도 됨
		 *  - 필요에 따라서 개수를 늘리거나 줄이기 가능
		 *  - 다양한 여러가지 가능이 이미 준비되어 있음
		 *  
		 *  Integer 형 (type)의 데이터를 다수 저장(List형 데이터) 할 
		 *  intList객체 선언
		 *  
		 *  Integer[] intList = new integer[???};
		 *  
		 *  List 클래스를 사용하여 intList객체를 선언한다
		 *  단, intList에는 Integer형 데이터만 저장
		 *  <Integer> : Generic 선언
		 *  		저장된 데이터 TYPE을 규정하는 방법
		 *  		primitive 형(기본형) 포함 불가
		 *  		반드시 wrapper class형 만!!
		 *  
		 *  List 형 객체 : List클래스를 사용한 객체
		 * 					선언 - List 사용 (intList,strList....)
		 * 					생성(초기화) - ArrayList() 생성자 사용
		 * 
		 *  List 형 객체를 선언하고 ArrayList() 로 생성하면
		 *   		size가 0인 배열개체가 생성되는 것과 유사
		 */
		//기본형 사용불가 
		List<Integer> intList = new ArrayList<Integer>(); 
		//List<Integer> intList = new ...; 으로 초기화 할수 없음
		 //intList객체선언 할텐데 Integer타입의 데이터만 저장하겟다
		List<String> strList = new ArrayList<String>();
		List<Long> longList = new ArrayList<Long>();
		List<Double> doubleList = new ArrayList<Double>();
		List<Boolean> booList = new ArrayList<Boolean>();
		List<Float> floatList = new ArrayList<Float>();
		List<Character> charList = new ArrayList<Character>();
		
		//배열에 값을 저장할 때는 원하는 length만큼 배열을 선언 생성하고
		//첨자를 사용하여 위치를 지정한 후 값을 저장
		int[] nums = new int[5];
		nums[0] = 100;
		
		//List형 객체에 데이터를 저장할때는 "추가"를 하여 저장
		// 추가 : .add() 메서드를 사용하여 데이터 추가
		intList.add(100);//add라는 메서드를 통해서 값을 저장 >
		//intList 의 크기가 1이되고 자동으로 0번 위치에 100이 저장
		intList.add(200);//1위치
		
		intList.add(300);//2번위치
		
		//intList 0번 위치에 저장된 값 읽기
		System.out.println(intList.get(0));
		System.out.println(intList.get(1));//1번 위치에 저장된 값 읽이
		System.out.println(intList.get(2));
		//값을 읽을때 저장된 데이터 개수의 index범위를 벗어날 수 없음
		//위에서 add() 3번 실행했기 때문에
		// 		size는 3이 되고
		//		 get(index)를 수행할대
		//		index 값은 size-1까지만 사용가능
		//System.out.println(intList.get(3));
	}
}
