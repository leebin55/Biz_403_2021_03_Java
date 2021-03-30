package com.callor.classes;

public class Value_03 {

	public static void main(String[] args) {
		
		int num1 = getInt();
		Integer num2 = getInteger();
		
	}
	private static int getInt() {
		return 0;//return할 값없을때
		//method의 return type 이 int형일 경우 
		//아직 return할 값이 정해지지 않으면 0을 return
		
	}
	private static Integer getInteger() {//100을 retur 100이라는값이 다시 되돌아와서 
		//num2 에 저장
		//method의 return type이 Integer형일 경우
		//아직 return할 값이 전해지지 않으면
		//null값을 return 가능
		return null;
	}
}
