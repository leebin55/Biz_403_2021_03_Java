package com.callor.classes;

public class Value_04 {
/*
 * main() method에서 같은 클래스 내의 다른 method를 호출하여
 * 코드를 실행하려면
 * 반드시 호출 되는 method도 다 static 이여야 한다.
 */
	public static void main(String[] args) {
		//System.out.println(0 / 0 );ArithmeticException
		//어떤값을 0으로 나누었을때 오류가 발생할 수 있음
		//0을 어떤값으로 나누면 0
		Integer result  = divid(30,40);
		result = divid(30,0);
		if(result == null) {
			System.out.println("나눗셈을 수행할 수 없음");
		}else {
			System.out.println(result);
		}
	}
	
	private static Integer divid(int num1, int num2) {//30은 num1변수에 저장
		if (num2 == 0) {
			return null;//오류가 발생했을때
		} else {
			return num1 / num2;
		}

	}
	/*
	 * 0 과 0을 나눗셈 연산을 수행하면 문제가 발생
	 * divide() method에 2개의 정수를 매개변수로 전달하고
	 * 전달한 숫자가 0이 아니면 나눗셈 연산을 하여 return
	 * 전달한 숫자가 한개라도 0 이며>>
	 */
}
