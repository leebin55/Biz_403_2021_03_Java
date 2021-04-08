package com.callor.app;

import com.callor.app.service.InputServiceV1A;

public class Test_01 {

	public static void main(String[] args) {
		
		InputServiceV1A isV1 = new InputServiceV1A();
		Integer intNum1 = isV1.inputValue("ts", 100);
		if(intNum1 == null) {
			System.out.println("종료");
		}
		
		Integer intNum2= isV1.inputValue("tt", 0,100);
		if(intNum1 == null) {
			System.out.println("종료");
		}
		
		
	}
}
