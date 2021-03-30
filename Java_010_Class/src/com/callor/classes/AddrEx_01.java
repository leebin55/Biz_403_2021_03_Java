package com.callor.classes;

import com.callor.classes.model.AddressVO;

public class AddrEx_01 {

	public static void main(String[] args) {
		
		AddressVO aVO = new AddressVO();
		aVO.setAddr("홍길동");
		aVO.setAddr("서울");
		aVO.setTel("010--000-0000");
		aVO.setAge(200);
		/*
		 * age변수는 private이기 때문에 외부에서 직접접근 불가
		 * 
		 * 따라서 age변수에 값을 저장하려며 ㄴ
		 * 반드시 setAgre(setter() method)를 통해서 값을 저장해야함
		 * 
		 * setAge() method 는 매개변수로 받은 나이를 유효성 검사를
		 * 수행한 다음 유효범위에 있지 않으면 null 을 저장하여
		 * 이후 값을 조회 했을때 잘못된 값이 저장되었다는 것을
		 * 암시적 표현하도록 함(null을 저장하였다.
		 */
		
		System.out.println(aVO.getName()+"의 나이는 ? :" + aVO.getAge());
	}
}
