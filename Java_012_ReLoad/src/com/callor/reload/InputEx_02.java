package com.callor.reload;

import com.callor.reload.service.InputServicev2A;

public class InputEx_02 {

	public static void main(String[] args) {

		InputServicev2A isV2 = new InputServicev2A();

		for(int i = 0; i < 5; i++) {
		isV2.inputNum();
		}
		isV2.printNum();
	}
}
