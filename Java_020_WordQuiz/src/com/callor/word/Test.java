package com.callor.word;

import com.callor.word.service.WordService;
import com.callor.word.service.impl.WordServiceImplV1;
import com.callor.word.service.impl.WordServiceImplV2;

public class Test {
	
	public static void main(String[] args) {
		WordService wService = new WordServiceImplV1();
		
		wService.startGame();
		
	}

}
