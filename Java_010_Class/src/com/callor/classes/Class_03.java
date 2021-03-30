package com.callor.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class_03 {

	public static void main(String[] args) {
		
		List<Integer> divisor = new ArrayList<Integer>();
		//List divisor = new ArrayList(); 만 써도 가능하지만
		/*
		 * Generic 사용 :<Integer> <>도 포함
		 * List 형 객체에 저장할 데이터의 type을 제한하므로써 코드의 
		 * 실행과 메모리 사용의 효유을 높이기 위함
		 */
		Random rnd = new Random();
		int intNum= rnd.nextInt(51)+50;
		
		for(int i = 2; i <intNum; i++) {
			if(intNum % i ==0) {
				divisor.add(i);
			}
		}
		System.out.println("생성된 난수 : "+ intNum);
		System.out.print("약수들의 리스트 : ");
		for(int i = 0; i <divisor.size();i++) {//List 에 이미 size라는 메서드가 이미 존재
			System.out.print(divisor.get(i)+ "\t");
		}
		
	}
}
