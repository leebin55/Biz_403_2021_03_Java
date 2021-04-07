package com.callor.method.service;

public class ScoreServiceV4 {

	InputServiceV2 inService;
	
	public ScoreServiceV4() {
		inService = new InputServiceV2();
	}
	
	public void inputScore() {
		String[] subjects = new String[] {"국어","영어","수학"};
		int intSum = 0;
		
		for(int i = 0; i < subjects.length; i++) {
			Integer Score = inService.inputValue(subjects[i], 0, 100);
			if(Score == null) {
				System.out.println();
				System.out.println("-- END --");
				return;
			}
			intSum += Score;
		}
		System.out.println("===============================================");
		System.out.printf("총점 : %d\t평균 : %3.2f\n",intSum, intSum/3.0f);
		System.out.println("===============================================");
	}
}
