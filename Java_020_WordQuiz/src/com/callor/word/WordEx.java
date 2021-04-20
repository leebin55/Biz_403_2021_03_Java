package com.callor.word;

import com.callor.word.service.WordService;
import com.callor.word.service.impl.WordServiceImplV2;

public class WordEx {

	public static void main(String[] args) {
		WordService wService = new WordServiceImplV2();
		for(int i = 0; i < 10 ; i++) {
		wService.startGame();
		}
		
	}
}
