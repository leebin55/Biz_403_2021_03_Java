package com.callor.classes;

import com.callor.classes.service.NumberServiceV1;

public class NumberEx_01 {

	public static void main(String[] args) {
		
		int intNum1 = 30;
		int intNum2 = 40;
		
		float fNum1 = 30.0f;
		float fNum2 = 40.0f;
		
		String str1 = "대한민국";
		String str2 = "우리나라만세";
		
		System.out.println(intNum1 + intNum2);
		
		NumberServiceV1 nsV1 = new NumberServiceV1();
		nsV1.intAdd(intNum1, intNum2);
		nsV1.floatAdd(fNum1,fNum2);
		nsV1.stringAdd(str1, str2); //어떤type을 덧셈을 할지 알아야
		
		
		nsV1.add(intNum1, intNum2);
		nsV1.add(fNum1, fNum2);
		nsV1.add(str1, str2); //어떤 type인지 몰라도 가능 >>객체지향 특징
		//다형성
		
	}
}
