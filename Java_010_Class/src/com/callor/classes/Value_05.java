package com.callor.classes;



import com.callor.classes.service.ValueService;

public class Value_05 {

	public static void main(String[] args) {
		
		ValueService vs = new ValueService();
		//retNum 맴버변수를 public 으로 선언하면 아래와 같이 간편하게
		// 값을 읽을수 있지만
		//밑에 나와 있는 이유로 위험하므로 권장하지 않음
		//Integer result = vs.retNum;
		//vs.retNum = 200; //변수가 변경됨 >데이터가 오염됨 :result1 = 200 
		//retNum 변수는 ValueService의 멤버변수이다
		// 이 멤버변수를 외부에서 값을 변경하는 것은 
		//코드를 매우 위험스럽게 만드는 것이다
		// 좋은 방법은 멤버변수를 private으로 설정하고
		//getter() method를 통하여 읽기 전용으로 하는 것이 좋다.
		vs.nums();
		
		Integer result1 =vs.getRetNum(); // public 에서 private 변경 : 중간에 데이터 변경 방지
		
		Integer result2 = vs.numsRet();//중간에 누군가 끼어들어서 값을 변경시키기 어려움
	}
}
