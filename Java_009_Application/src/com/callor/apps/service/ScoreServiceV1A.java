package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1A {

	// while문 이용해 무한반복
	/*
	 * 5명의 학생의 국어 영어 수학 점수를 입력받아서
	 */

	Scanner scan; // 클래스 영역에 Scanner 클래스를 사용하여 scan객체를 선언
	// Scanner 선언할때 가급적이면 클래스 영역에!!!!
	// 오류일으킬수 도 있음
	// 스캐너 선언만!!아직 사용할 준비 안됨
	// NullPointerException 이라는 오류문구
	// - JDK 또는 여러가지 클래스를 가져와 사용하는 경우 매우 자주 만나는
	// Exception
	// 클래스를 사용하여 객체를 "선언만!!"하고 아직 사용할 준비가
	// 되어 있지 않다
	// = 생성, 초기화가 안되었다.

	// 학생 만큼 과목 점수를 저장할 배열 선언
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intSum;

	// Service 클래스에서 배열의 개수를 고정하지 말고
	// 최초로 객체를 생성할 때 필요한 개수를
	// 매개변수로 전달하고
	// 전달받은 매개변수(members)의 값을
	// 사용하여 배열을 만듬
	public ScoreServiceV1A(int members) {
		//scan 객체를 생성(초기화)하기
		// 객체를 선언하고 생성하는 코드가 없으면
		//사용하는 과정에서 NullpointerException 이 발생
		scan = new Scanner(System.in);
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
	}

	public void makeScores() {
		/*
		 * while(true){  }
		 * 무한 반복문을 사용하여
		 * 국어점수가 정상범위를 벗어나면
		 * 메시지를 보여주고 다시 점수를 입력받도록 함
		 * 만약, 정상범위를 입력하면
		 * 반복문을 종료하고, 다음 코드가 실행되록 함.
		 */
		while (true) {
			System.out.print("국어점수를 입력하세요( 0 ~ 100 ) :");

			int score = scan.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("점수는 0 ~ 100까지 입력하세요");
			}else {
				break;
			}
		}
	}
	
	
	 
	/* 
	 * public : 전체 공용 모두 누구나 
	 * 			객체.addNum()형식으로 method를 호출하여
	 * 			명령을 실행할 수 있도록 하는 keyword
	 * 
	 * void : void 사용했을때는 return생략가능
	 * 			메서드의 반환형이다. void는 반환할 것이 없다는 의미가 된다.
	 *  		단지 해당 메서드가 종료되면 호출한 곳으로 돌아갈 뿐이다
	 * return : 현재 method코드의 끝이다 라는 선언
	 * .
	 * method 선언 키워드가 void이면 
	 * return 명령 생략가능
	 */ 
	public void addNum() {
		this.inputScore();
		return; //있거나 없거나 상관 없음
				//하지만, return쓸때는 단독으로 사용!!
	}
	/* private : 개인적인
	 * 			현재 클래스 에서만 method를 호출하여
	 * 			명령을 실행할 수 있도록 하는 keyword
	 * 			객체.inputScore()형식으로 사용 불가
	 *  		외부에 공개하지 않고, 현재 클래스에서만!!!
	 *  		호출할 수 있도록 제한하는 keyword
	 *  	Integer : void keyword 대신 정수를 선언하는
	 *  			키워드를 사용하여 method선언하기
	 *  	method 코드 끝에 반드시 return 명령문이 있어야 함!!
	 *  
	 *  method 에 void대신 Integer String등 자료형 이 쓰일때
	 *  반드시 return 과 함께
	 *  
	 *  여기에서 사용된 Integer 키워드는
	 *  변수를 선언하는 용도의 키워드가 아니고 
	 *  "return type" 키워드 라고 함.
	 *  method 코드 내에 "return 값;" 형식의 코드가
	 *  반드시!!! 있어야 함을 선언하는 것
	 *  
	 *  return type이 void형(type)일 경우는
	 *  return 명령문이 생략되거나
	 *  return 명령문만 단독으로 사용 가능
	 *  
	 *  but, return type 이 void형이 아닌 경우
	 *  		return 명령문은 반드시 코드 내에 
	 *  		적절한 위치에 있어야 하고
	 *  	return 값 형식을 사용해야 함
	 */
	private Integer inputScore() { //다른 코드 없더라도 "return 값;"이 무조건 있어야 함
		return null;
		
	}
	
	public String names() {
		return "홍길동" ;
		
	}
	public int add() {//최소한 0이라도 return 해야함
		return 0;
	}
	public float addFloat() {
		return 0.0f;
		
	}
	public long addLong() {
		return 0;
		
	}
	public boolean yesNo() {
		return false;
	}
	public boolean noYes() {
		return true;
	}

}
