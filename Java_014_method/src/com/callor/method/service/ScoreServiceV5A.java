package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5A {

	String[] subjects;
	List<Integer> kors;
	List<Integer> engs;
	List<Integer> maths;

	public ScoreServiceV5A() {

		subjects = new String[] { "국어", "영어", "수학" };
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();

	}

	public void inputScore() {
		Integer[] intScore = new Integer[subjects.length];
		InputServiceV2 inService = new InputServiceV2();
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < subjects.length; i++) {
				intScore[i] = inService.inputValue(subjects[i], 0, 100);
				if(intScore[i]==null) {
					System.out.println("종료합니다");
					return;
				}
			
			}
			kors.add(intScore[0]);
			engs.add(intScore[1]);
			maths.add(intScore[2]);
			
		}
		this.printScore();
	}

	public void printScore() {
		
		System.out.print("번호\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("===============================================================");
		for (int i = 0; i < 5; i++) {
			int sum = kors.get(i) +engs.get(i)+maths.get(i);
			float avg = (float)sum /subjects.length;
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%3.2f\n", i + 1, kors.get(i), engs.get(i), maths.get(i),sum,avg);

		}
	}

}
