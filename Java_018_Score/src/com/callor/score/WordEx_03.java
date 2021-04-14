package com.callor.score;

import com.callor.score.service.WordService;
import com.callor.score.service.impl.WordServiceImplV2A;

public class WordEx_03 {

	public static void main(String[] args) {
		WordService wService = new WordServiceImplV2A();
		wService.viewWord();
	}
}
