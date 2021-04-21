package com.callor.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_04 {

	
	public static void main(String[] args) {
		
		List<Integer> inList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for( int i = 0; i < 10 ; i++) {
			//intList = rnd.nextInt();
			//inList.add =rnd.nextInt();
			//intList 는 List 형 자료형이기 때문에 위에 같이 사용 할 수 없음
			inList.add(rnd.nextInt(100)+1);
			//List에 저장해서 사용가능
			
		}
		System.out.println(inList.toString());
		List<Integer> varList = new ArrayList<Integer>();
		varList.add(30);
		varList.add(40);
		varList.add(50);
		varList.add(60);
		varList.add(70);
		inList.removeAll(varList);
		
		System.out.println(varList.toString());
		
		//------------add 와 set의 차이---------=
		// add 같을 말그대로 추가 이전에 있던 데이터 변경없음
		// set 변경 , 이전값위에 덮어씌워짐 이전값 지워짐
		
		//이전값에 대체되는게 아니라 추가!!
		inList.add(999); //맴끝에 추가하기 총11개
		inList.add(3,9999); //3번 위치에 값추가 총 12개
		System.out.println(inList.toString());
		
		inList.set(6, 77777);//6번 위치값을 변경
		System.out.println(inList.toString());
		
		//inList에 저장되어 있는 값 하나씩 출력하고 삭제
		while(true) {
			//inList에 저장되어 있는 값이 하나도 없다면 break
			//inList 의 값이 사라지니깐 inList.size를 while() 안에 사용
			if(inList.size() < 1)break;
			// inList 의 random 위치를 index 에 저장 (단, 랜덤숫자는항상 0~(inList size-1))
			int index = rnd.nextInt(inList.size());
			//랜덤으로 저장되어 있는 값 출력하고
			System.out.println(inList.get(index) + "\t");
			//방 금 출력햇던 index위치 에 있는 값 삭제 
			inList.remove(index);
		}
	}
}
