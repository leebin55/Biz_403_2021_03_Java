package com.callor.var;

public class Variable_19 {

	public static void main(String[] args) {
		
		//Console 에 숫자 0이 무한반복되면 출력
		//무한이 반복되는 코드를 """"조건을 부여하여""""
		//유한 반복되도록 변경하기
		//for() 명령에 ;조건; 부여하기
		// 	for() 문의 두번째 명령구간에 비교연산자를 추가
		int intNum = 0;
		for (;intNum < 10;) {  //조건문 이 true? false? 물어보는것
			System.out.println(++intNum);}//조건문에서 넘어온 값에서 출력되기전에 1이 추가
			System.out.println();
			System.out.println();
			 // 1~10까지 출력
			/*
			 *  intNum = 0;
			 * for(;++intNum < 10;)
			 * sysout (intNum) >> 0~ 9까지
			 * 
			 */
			
			intNum = 0;
			for ( ; intNum < 10 ; ) {
				intNum += 2; //짝수
				System.out.println(intNum);}
				
			intNum = 1; //홀수
			for ( ; intNum < 10 ;) {
				intNum += 2;
				System.out.println(intNum);
				
			}
			
		
		
	}
}
