package com.callor.values;

public class Values_03 {
	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.printf("%d 구구단\n", 5);
		System.out.println("------------------------------");
		System.out.printf("%d x %d = %d\n" ,5,1,5*1); // % 와 d 사이에 2를 넣음 
		System.out.printf("%d x %d = %d\n" ,5,2,5*2);
		System.out.printf("%d x %d = %d\n" ,5,3,5*3);
		System.out.printf("%d x %d = %d\n" ,5,4,5*4);
		System.out.printf("%d x %d = %d\n" ,5,5,5*5);
		System.out.printf("%d x %d = %d\n" ,5,6,5*6);
		System.out.printf("%d x %d = %d\n" ,5,7,5*7);
		System.out.printf("%d x %d = %d\n" ,5,8,5*8);
		System.out.printf("%d x %d = %d\n" ,5,9,5*9);
		System.out.println("==============================");
		
		
		// %2d : 값을 출력할 때 2개의 칸을 만들고 값을 오른쪽 정렬하여 출력
		// %5d : 값을 출력할 때 5개의 칸을 만들고 값을 오른쪽 정렬하여 출력
		System.out.println("==============================");
		System.out.printf("%d 구구단\n", 5);
		System.out.println("------------------------------");
		System.out.printf("%d x %d = %2d\n" ,5,1,5*1); // % 와 d 사이에 2를 넣음 > 2자리인 자릿수 중에 오른쪽정렬(3자리 이면 3을 넣음)
		System.out.printf("%d x %d = %2d\n" ,5,2,5*2);
		System.out.printf("%d x %d = %2d\n" ,5,3,5*3);
		System.out.printf("%d x %d = %2d\n" ,5,4,5*4);
		System.out.printf("%d x %d = %2d\n" ,5,5,5*5);
		System.out.printf("%d x %d = %2d\n" ,5,6,5*6);
		System.out.printf("%d x %d = %2d\n" ,5,7,5*7);
		System.out.printf("%d x %d = %2d\n" ,5,8,5*8);
		System.out.printf("%d x %d = %2d\n" ,5,9,5*9);
		System.out.println("==============================");
	
		
	
	}

}
