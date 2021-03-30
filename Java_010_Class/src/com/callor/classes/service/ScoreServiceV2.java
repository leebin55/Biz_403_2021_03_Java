package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.ScoreVO;

public class ScoreServiceV2 extends ScoreServiceV1{
//상속
	//ScoreServiceV1 을 extends(상속, 확장)
	//V1 에 있는 method를 그대로 이어방아
	//V2 에 마치 복붙한것처럼 사용하겠다
	
	//V1에서 작성된 inputScore() 를 V2에서 새롭게 개선 (기능 업그레이드)
	//
	/*
	 * V1 에서 protected 로 만든 변수는 V2에서 바로 사용가능
	 * 
	 */
	public ScoreServiceV2() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
	}
	
	/* 
	 * 같은 이름가진 method 가 두개 
	 * 그리고 접근제어자가 public
	 * 차이 : 매개변수 유무차이
	 * 
	 */
	public Integer inputScore(String strNum, String strSub) {
		int intScore = 0;

		while (true) {
			System.out.println(strNum + "번의" + strSub + "점수를 입력하세요 (중단 : -1)");
			System.out.print(">>");
			intScore = scan.nextInt();
			if (intScore == -1) {
				return null;
			} else if (intScore < 0 || intScore > 100) {
				System.out.println(strSub + "점수는 0 ~ 100 까지!!");
				continue;
			}
			break;
		}
		return intScore;
		

	}
	public Integer inputScore() {
		
		String[] strSubject = {"국어","영어","수학"};
		Integer[] intScores = new Integer[strSubject.length];//과목의 수만큼
		int nSize = scoreList.size();
		String strNum = String.format("%03d",nSize +1);
		
		for(int i = 0; i < strSubject.length; i++) {
			intScores[i] 
					= this.inputScore(strNum, strSubject[i]);
			if(intScores[i] == null) {
				return null;
			}
		}
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.num = strNum;
		scoreVO.kor = intScores[0];
		scoreVO.eng = intScores[1];
		scoreVO.math = intScores[2];
		scoreList.add(scoreVO);
		return 0;
	}// inputScore()

	
	
}
