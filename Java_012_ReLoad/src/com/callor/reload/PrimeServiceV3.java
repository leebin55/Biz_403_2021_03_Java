package com.callor.reload;

import com.callor.reload.service.PrimeServiceV1;

public class PrimeServiceV3 extends PrimeServiceV1{

	public void primeNum() {
		int rndNum = rnd.nextInt(51)+50;
		//for() 반복문이 중단(break)?? 아니면 모두수행??
		
		int index = 0;
		for(index = 2; index <rndNum; index++) {
			if(rndNum % index ==0) {
				break;
			}
		}
		/*
		 * for() 끝났을때 break된 경우 : 항상 index < rndNum
		 * 그렇지 않은 경우를 확인하여 코드진행 : index >= rndNum
		 */
		if(index < rndNum ) {//break 만났다
			System.out.println(rndNum + " 는 소수아님");
		}else {
			System.out.println(rndNum + " 는 소수");
		}
	}
}
