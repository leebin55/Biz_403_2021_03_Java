package com.callor.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_02 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < 10 ; i++) {
			intList.add(rnd.nextInt(100)+1);
			//int num = rnd.nextInt(100) + 1;
			//intList.add(num);
			//이 두줄을 한줄로
		}
		//sort method 실행 전
		System.out.println(intList.toString());
		sort(intList);
		
		//intList
		System.out.println("=".repeat(50));
		//sort method실행 후 >>오름차순으로 변경
		System.out.println(intList.toString());
	}
	public static void sort(List<Integer> list) {
		//Integer형 List배열을 매개변수로 갇는 method
		// List의 n 번째 값이 n+1번째값보다 크다면 값을
		// 바꾸는 >> 오름차순
		
		/*
		 *  List.set();
		 *  E set(int index, E element)
		 *  	인덱스에 있는 객체와 주어진 객체를 교체한다.
		 */
		int nSize = list.size();
		for(int i = 0; i < nSize; i++) {
			for(int j = i+1; j < nSize;j++) {
				if(list.get(i) > list.get(j)) {
					Integer te = list.get(i);//임시적으로 te에 n번째 값을 담음
					list.set(i,list.get(j));
					list.set(j, te);
				
				}
			}
		}
		System.out.println(list);
		
	}
}
