package com.callor.var;

public class Variable_09 {

	public static void main(String[] args) {
		
		/*int intNum =0 ;
		
		System.out.println(intNum++);
		System.out.println(intNum++);
		System.out.println(intNum++);
		System.out.println(intNum++);
		System.out.println(intNum++);
		System.out.println(intNum++);
		*/
		
		//1~100까지 출력
		 
		/*intNum = 0;
		
		//for(;;) { //지금부터 intNum 0으로 변수생성 for 명령문을 만나면 
			      //{}안 코드들을 terminate할때까지 무한히 반복
		 System.out.println(++intNum); */
		 
		 
		
		int intNum = 0;
		
		for(; intNum < 10;) { // (; 조건 ;)
			System.out.println(++intNum);
		
		}
	}
}
