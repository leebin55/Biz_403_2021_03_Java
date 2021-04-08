package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1 {

	protected Random rnd;
	
	public PrimeServiceV1() {
		rnd = new Random();
	}
	public void printNum() {
		int rndNum = rnd.nextInt(51)+50;
		
		/*
		 * for() 반복문이 실행되거나 끝나는 경우
		 * 
		 * 비교문 : " i < rndNum " true 인 동안 반복
		 * 만약 rndNum 10 일때 i == 9 일때 까지 반복
		 *  
		 *  => for() 반복문이 종료되면 i 값은???
		 *  i 값이 rndNum 보다 작은면 {   } 내의 코드실행
		 *  {  } 실행 후에 i++ 를 실행
		 *  i가 9가 되었을때 {  } 을 실행을 하고 
		 *  다시 한번  i++ 실행된다.
		 *  때문에 for()반복문이 중단되지 않고 모두 정상 수행이 되면
		 *  	"i 값은 rndNum 값과 같아짐"
		 *  	i  == rndNum 인데 i < rndNum 냐고 묻는것
		 *  
		 *  만약 for() 반복문이 중간에 break 를 만났을때 
		 *  		i값은 항상 rndNum보다 작다
		 * 
		 */
		boolean notPrime = false;
		for(int i = 2 ; i < rndNum ; i++) {
			if(rndNum % i ==0) {
				notPrime = true; //
				break;
				//소수가 아닌 경우
				//rndNum % i 연산했을때 한번이라도 0이 나오면 그 수는 소수가 아닌 경우
				//더이상 그 이후 연산을 할 필요 없음
				
			}
			if(notPrime == true) {
				System.out.println("소수가 아님");
			}else {
				System.out.println("소수");
			}
			
			
		}
	}
}
