package com.callo.apps;

import com.callo.apps.service.ScoreServiceV2;

public class App_09 {
	
	public static void main(String[] args) {
		
		//public ScoreSeviceV190
		//Public ScoreServiceV2( int members)
		
		ScoreServiceV2 ssV2 = new ScoreServiceV2(1);
		ssV2.makeScore();
		ssV2.makeSA();
		ssV2.printScore();
	}

	
}
