package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.ScoreVO_01;

public class ScoreServiceEx01 {
	
	Scanner scan;
	List<ScoreVO_01> scoreList;
	String[] strSub;
	public ScoreServiceEx01() {
		
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO_01>();
		strSub = new String[] {"국어","영어","수학"};
	}
	
	public void inputScore(String sub) {
		int score = 0;
		System.out.println(Lines.dLine(50));
		while(true) {
			System.out.println(sub + "과목의 점수를 입력하세요 ");
			System.out.print(">>");
			score = scan.nextInt();
			if(score > 100 || score < 0) {
				System.out.println("오류 : 0 ~ 100 까지의 점수를 입력해 주세요");
				continue;
			}break;
		}
	}

	public void makeScore() {
		
		for(int i = 0; i < strSub.length; i++) {
			this.inputScore(strSub[i]);
		}
		
	}
}
