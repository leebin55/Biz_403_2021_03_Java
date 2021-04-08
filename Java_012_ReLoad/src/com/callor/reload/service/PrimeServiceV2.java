package com.callor.reload.service;

public class PrimeServiceV2 extends PrimeServiceV1{

	//자동으로 protected로 선언된 객체, 변수는 상속 받은 곳에서 사용가능
	//Random rnd; 를 안만들어도 가능
	
	public void primNum() {
		
		int rndNum = rnd.nextInt(51)+ 50;
		
		//flag 변수
		//상태를 설정하여 사용할 변수
		boolean notPrime =false;
		for(int i = 2 ; i < rndNum ; i++) {
			if(rndNum % i == 0) {
				notPrime =true;
				break;
			}
		}
		//boolean의 값에 따라 소수,소수가 아님을 출력
		if(notPrime) { //notPrime == true
			System.out.println(rndNum + " 는 소수가 아님");
		}else {
			System.out.println(rndNum + " 는 소수임");
		}
	}
}
