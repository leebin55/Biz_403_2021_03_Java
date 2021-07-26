package com.callor.lam;

import com.callor.lam.service.OnclickService;

public class AppEx_02 {

	public static void main(String[] args) {
		/*
		 * 아주 단순한 interface를 사용하여 아주 단순한 일을 수행하는 객체를 만들고 
		 * 싶을 때
		 * interface 를 상속하여 클래스를 만들고 클래스를 사용하여 객체를 생성하고 
		 * 객체의 method를 호출하여 일을 수행하는 복잡한 방법을 사용하고 싶지 않을 때
		 */
		OnclickService on1 = new OnclickService() {

			@Override
			public void onClick(String msg) {
				// TODO Auto-generated method stub
				System.out.println(msg);
			}
		};
		on1.onClick("울 나라 만세");
		
		OnclickService on2 = (msg)->System.out.println(msg);
		on2.onClick("Wow");
	}
}
