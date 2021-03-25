package com.callo.apps;

import com.callo.apps.service.ScoreServiceV1;

public class App_08 {

	public static void main(String[] args) {
		
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ssV1.makeScore();
		ssV1.makeSA();
		ssV1.printScore();
	}
}
