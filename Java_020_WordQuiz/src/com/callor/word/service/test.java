package com.callor.word.service;

import com.callor.word.service.impl.WordServiceImplV2;

public class test {

	public static void main(String[] args) {
		
		WordService wSer = new WordServiceImplV2();
		wSer.startGame();
	}
}
