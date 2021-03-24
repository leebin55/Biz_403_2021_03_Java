package com.callor.apps_a;

public class Money_001 {

	public static void main(String[] args) {
	
		int nPay = 3274895;
		int n5Man = 50000;
		
		int sw = 1;
		
		for (;;) {
			if (nPay < 0 ) {
				break;}
			
			int nCount = nPay / n5Man;
			System.out.printf("%d 원권 : %d 매\n",n5Man, nCount);
			nPay %= n5Man;
			if (sw>0) {
				n5Man /= 5;
			
			}else {
					
						n5Man /=2;
					
			}
		}
	}
}
