package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class App_02 {

	
	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
		ssV1.makeScroe();
		ssV1.makeTotal();
		//ssV1.makeDesc(); intTotal 만 바뀜
		//ssV1.makeRanking();
		ssV1.printScore();
	}
}
