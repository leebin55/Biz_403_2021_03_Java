package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {

	List<Integer> korList;
	List<Integer> engList;
	List<Integer> mathList;

	InputServiceV2 inService;
	String[] subjects;

	public ScoreServiceV5() {
		korList = new ArrayList<Integer>();
		engList = new ArrayList<Integer>();
		mathList = new ArrayList<Integer>();

		inService = new InputServiceV2();
		subjects = new String[] { "국어", "영어", "수학" };
	}

	public void inputScore3() {

		for (int i = 0; i < 5; i++) {

			Integer score = inService.inputValue(subjects[i], 0, 100);
			if (score == null) {
				return;

			}
		}
	}

	public void inputScore2() {// 과목늘어날때마다 esle if 써줘야
		for (int i = 0; i < 5; i++) {
			Integer score = inService.inputValue(subjects[i], 0, 100);
			if (score == null) {
				return;
			} else if (subjects[i].equals("국어")) {
				korList.add(score);
			} else if (subjects[i].equals("영어")) {
				korList.add(score);
			}
		}
	}

	public void inputScore() {
		for (int i = 0; i < 5; i++) {
			Integer[] scores = new Integer[subjects.length];
			for(int sb = 0; sb < subjects.length ; sb++) {
				scores[sb]= inService.inputValue(subjects[sb], 0, 100);
			}
			korList.add(scores[0]);
			engList.add(scores[0]);
			mathList.add(scores[0]);
			
		}
		
	}
	public void printScore() {
		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		
		for(int i= 0 ; i < korList.size() ; i++) {
			System.out.print(korList.get(i)+ "\t");
			System.out.print(engList.get(i)+ "\t");
			System.out.print(mathList.get(i)+ "\t");
			
		}
		System.out.println("=".repeat(50));
	}
}
