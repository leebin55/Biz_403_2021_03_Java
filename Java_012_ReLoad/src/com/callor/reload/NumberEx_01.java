package com.callor.reload;

import com.callor.reload.service.InputServiceV1;

public class NumberEx_01 {

	public static void main(String[] args) {
		
		InputServiceV1 ipV1 = new InputServiceV1();
		
		for(int i = 0; i <5 ;i++) {
		ipV1.inputNum(); }
		ipV1.printNum();
		
	}
}
