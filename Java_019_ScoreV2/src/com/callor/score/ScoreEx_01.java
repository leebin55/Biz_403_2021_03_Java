package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1A;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		
		ScoreService sSer = new ScoreServiceImplV1A();
		sSer.insertScore();
	}
}
