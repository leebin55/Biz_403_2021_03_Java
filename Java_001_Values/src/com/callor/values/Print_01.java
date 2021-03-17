package com.callor.values;

public class Print_01 {

	public static void main(String[] args) {
		//Console에 출력하는 명령문
		/*
		 * 빈라인(Enter)만 축력하자
		 * new line 기호, 새로 줄바꿈 하기
		 * 
		 */
		System.out.println("A");
		System.out.println(); //다음줄 이동(줄바꿈) 역할 프린트될 위치 지정
		System.out.println("B");
		
		/* print() 
		 * 괄호 안이 비어있는 채로 실행할 수 없다
		 * 줄바꿈이 없이 값을 출력할 때
		 예 ) 34가 Console  에 출력 */
		System.out.print(3);
		System.out.print(4);
		
		/*한줄에 연속된결과를 출력 한 후
		 * 다음 줄에 다른 결과를 출력하고 싶으면
		 * println() 을 한번 실행해준다 
		 */
		System.out.println();
		System.out.println("============================");
		
		/*
		 * printf()
		 * form(형식)에 맞추어서 출력하는 명령문
		 * 
		 * printf("형식 문자열", 값들.....)
		 * %와 함께 시작되는 기호들을 사용하여 
		 * 출력되는 문자열 형식을 만들고 
		 * 실제 값들을 채워 넣어서 문자열을 완성하여
		 * 출력하는 명령문 
		 *
		 */
		System.out.printf("%d + %d = %d ", 3,4,3+4);
		System.out.println(); //줄 바꿈
		
		System.out.printf("%d x %d = %d\n", 3,3,3*3); // 형식기호\n >> 줄바꿈  
		
		System.out.println("3 x 3 = " + 3*3);
		System.out.println();
		System.out.println("25 x 33 = " + 25*33);//이렇게 수정하고 싶을때 변경 용이, 오류 발생 줄어듬
		/* 
		 * printf() 는 형식에 맞추어서 출력하고자 할때
		 * %d : 정수를 표시하는 형식기호
		 * %s : 문자열을 표시하는 형식 기호
		 * %f : 실수를 표시하는 형식 기호
		 * 
		 */
				
				
				
	}
}
