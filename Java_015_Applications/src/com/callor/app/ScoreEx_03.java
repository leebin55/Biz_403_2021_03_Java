package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceimplV2A;

public class ScoreEx_03 {

	public static void main(String[] args) {
		
	ScoreService sService = new ScoreServiceimplV2A();
	sService.selectMenu();
	}
}
