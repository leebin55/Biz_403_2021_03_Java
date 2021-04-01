package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV6 {

	protected Random rnd;
	protected List<Integer> primeList;

	public PrimeServiceV6() {

		rnd = new Random();
		primeList = new ArrayList<Integer>();
	}

	public void primeNum() {
		for (int i = 0; i < 50; i++) {
			int rndNum = rnd.nextInt(51) + 50;
			if(this.isPrime(rndNum)) {//isprime 이라는 메서드한테 rndNum를 전해줌
				primeList.add(rndNum);//if문이 성립하면 add
			}
		}
	}
	 
	//매개변수(rndNum) 로 전달 받은 정수가 소수인지(true) 아닌지 (false) 
	//return 값이 true이거나 false 인 method
	//isPrime() : 소수인가/?
	private boolean isPrime(int rndNum) {
		
		for(int i = 2; i < rndNum ; i++) {
			if(rndNum % i == 0) {
				return false;//더이상 코드진행되지 않고 isPrime전체가 끝남
			}
		}
		return true;
		
	}
	
	private void addPrime(int rndNum) {
		for ( int i =  2; i < rndNum ; i++) {
			if(rndNum% i == 0) {
				return; //void기 때문에 return값 안써도 됨
			}
		}
		primeList.add(rndNum);
	}
	
	public void printPrime() {
		int nSize = primeList.size();
		System.out.println("=".repeat(50));
		System.out.println("소수의 개수 : " + nSize);
		System.out.println("-".repeat(50));
		
		for(int i = 0 ; i < nSize ; i++) {
			
			System.out.print(primeList.get(i) + "\t");
			if( (i + 1 ) % 5 ==0	) {
				System.out.println();
				
			}
			
		}
		System.out.println();
		System.out.println("=".repeat(50));
	}
}
