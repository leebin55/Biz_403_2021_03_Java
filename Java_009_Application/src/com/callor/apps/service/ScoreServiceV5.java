package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV5 {

	String[] subject;
	int[] intKor;
	int[] intEng;
	int[] intMath;

	Scanner scan;

	public ScoreServiceV5(int members) {
		scan = new Scanner(System.in);
		subject = new String[] { "국어", "영어", "수학" };
		// 선언하는곳과 생성하는곳 분리될때에는 이렇게 써야!!!

		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];

	}

	/*
	 * V4까지는 학생수 만큼 모든 과목의 점수 입력을 끝내야만 다른 업무로 진행이 됨 몇몇의 학생, 일부 과목 점수만 입력을 마치고 잠시 업무를
	 * 멈추고 싶을때 V4까지는 불가능 =>일부만 입력하고 업무를 중단하는 기능 넣기
	 */
	public void makeScores() {
		// 과목의 개수만큼 점수를 담을 임시 배열
		// 클래스영역 말고 method영역에 =>이 안에서만 쓸거기 때문
		Integer[] scores = new Integer[subject.length];
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d 번 학생의 성적 입력\n", i + 1);
			for (int j = 0; j < subject.length; j++) {
				scores[j] = this.inputScore(subject[j]);
				/*
				 * 입력 업무중에 -1을 입력했을때는
				 * 입력 업무를 중단하고 main() 으로 되돌아가고 싶다
				 * 이때 break를 사용하면 for() 가 겹쳐있어서 
				 * 코드가 원하는 대로 작동되지 않음
				 * => 이럴경우 return type이 void이지만 
				 * return 명령을 실행하여 method코드를 중단할 수 있음
				 */
				if(scores[j] == -1){
					return;//break 이건 뭐건 여기서 끝낸다
					
					
				}
			}

			intKor[i] = scores[0];
			intEng[i] = scores[1];
			intMath[i] = scores[2];
		}

	}

	private Integer inputScore(String sub) {

		Integer score = 0;
		while (true) {
			System.out.println(sub + "점수를 입력하세요(Quit : -1)");
			//-1을 입력하면 끝내겠다
			System.out.print(">>");
			score = scan.nextInt();
			//점수 입력을 하는 중에 -1을 입력하면
			//입력하는 업무를 중단
			if(score == -1) {
				return -1;
			}
			else if (score < 0 || score > 100) {
				System.out.println(sub + "점수는 0 ~ 100 까지");
				continue;

			}
			break;
		}
		return score;
		}
	/*
	 * 프로젝트를 만들고 컴파일을 수행하고 실행 했을때
	 * 
	 * 선언한 클래스는 코드만 존재하는 상태가 됨
	 * 이 클래스를 객체로 선언하고, 생성한 후에 (마치 필요할때 변수를 선언하고 값을 담아서 쓸때처럼)
	 * 여러가지 method를 호출하여 업무를 수행할 수 있음
	 * 
	 * method나 변수에 static을 부착하면
	 * 사용하지 않아도 method 코드나 , 변수가 메모리에 상주하게 된다.
	 * static이 많아지면 사용하는 데이터가 많아짐 
	 */
	public static String dLine() {
		return"=============================================================";
		
	}

}
