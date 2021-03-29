package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV3 {

	String[] subject;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	Scanner scan;
	
	public ScoreServiceV3(int members) {
		scan = new Scanner(System.in);
		subject =new String[] {"국어", "영어",	"수학"};
		//선언하는곳과 생성하는곳 분리될때에는 이렇게 써야!!!
	
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
		
	}
	/*
	 * 점수를 입력받을 과목명을 배열로 만들어 두고
	 * 각 과목명 문자열을 inputScore()에 전달하여
	 * 3과목의 점수를 입력받는 코드
	 */
	public void makeScores() {
		for(int i = 0; i < subject.length ; i++) {
			Integer score = this.inputScore(subject[i]);
		}
		
	}
	
	private Integer inputScore(String sub) {
		
		Integer score = 0;
		while(true) {
			System.out.println(sub + "점수를 입력하세요");
			System.out.print(">>");
			score = scan.nextInt();
			if(score < 0 || score > 100) {
				System.out.println(sub + "점수는 0 ~ 100 까지");
				continue;//continue 대신 else{break;} else사용하여 코드생성
		
			}
			break;
			}
		return score; //return 0; 우선 임시로 함 하지만 while(true)했을때 오류남
		//while 이 무한 반복이기때문에 return이 사용될 일이 없어서
		//break 쓰면 while 빠져나가 오류 안남
		//그리고 return하고자 하는 값으로 고치기!!!! 
		//return 0; 이면 아무리 해도 갑싱 0
	}
	
}
