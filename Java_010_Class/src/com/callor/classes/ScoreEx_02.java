package com.callor.classes;

import com.callor.classes.service.ScoreServiceV2;

public class ScoreEx_02 {

	public static void main(String[] args) {
		
		ScoreServiceV2 ssV2 = new ScoreServiceV2();
		ssV2.printScore();//ScoreServiceV2에 없지만 V1을 상속받아서 사용가능

		for(int i = 0; i <100 ; i++) {
			ssV2.inputScore();
				}
	}
}
