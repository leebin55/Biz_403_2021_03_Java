package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1aaa;

public class ScoreTest_01 {

	public static void main(String[] args) {
		
		ScoreService sSer = new ScoreServiceImplV1aaa();
		sSer.insertScore();
	}
}
