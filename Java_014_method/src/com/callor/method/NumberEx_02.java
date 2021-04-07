package com.callor.method;

import com.callor.method.service.InputServiceV1;

public class NumberEx_02 {

	public static void main(String[] args) {
		
		InputServiceV1 isV1 = new InputServiceV1();
		//문자열 1개만
		//문자열을 전달받아 값을 입력받아 결과를 return
		//isV1.inputValue("생깡");
		
		//문자열 1개와 정수 2개 전달
		//2개의 정수 범위내의 값이 입력됫는지 유효성 검사 수행
		Integer retNum = isV1.inputValue("새우깡",0,100);
		if(retNum == null) {
			System.out.println("종료");
			
		}else {
			System.out.println("점수 : " + retNum);
		}
		
	}
}
