package com.callor.app;

import com.yublee.standard.InputService;
import com.yublee.standard.impl.InputServiceImplV1;

public class InputEx_01 {

	public static void main(String[] args) {
		
		InputService isV1 = new InputServiceImplV1();
		
		isV1.inputValue("새우깡");
		isV1.inputValue("새우깡" , 0, 100);
	}
}
