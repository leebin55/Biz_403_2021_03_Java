package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV4 {

	String[] subject;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	Scanner scan;
	
	public ScoreServiceV4(int members) {
		scan = new Scanner(System.in);
		subject =new String[] {"국어", "영어",	"수학"};
		//선언하는곳과 생성하는곳 분리될때에는 이렇게 써야!!!
	
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
		
	}
	
	public void makeScores() {//V3에서 실제로 for 문이 사용되기 애매 
		for(int i = 0; i < intKor.length ; i++) {//학생수만큼 반복
			System.out.printf("%d 번 학생의 성적 입력\n",i+1);
			intKor[i]= this.inputScore(subject[0]);
			intEng[i]= this.inputScore(subject[1]);
			intMath[i]= this.inputScore(subject[2]);
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
