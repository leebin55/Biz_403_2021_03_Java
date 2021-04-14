package com.callor.score.service.impl;

import java.util.Arrays;
import java.util.Random;

import com.callor.score.model.WordVO;

public class WordServiceImplV2A extends WordServiceImplV2 {

	@Override
	public void viewWord() {
		Random rnd = new Random();

		WordVO word = this.getWord();// protected WordVO getWord() {}
		String engWord = word.getEnglish();
		String[] words = engWord.split("");
		System.out.println("┌────────────────┐");
		System.out.println("│   Word Game    │");
		System.out.println("└────────────────┘");
		Integer intM = null;
		while (true) {
			System.out.println(" 1. Play");
			System.out.println(" 2. Exit");
			System.out.print(" >>  ");
			String strM = scan.nextLine();
			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				System.out.println(" only 1 and 2");
				continue;
			}
		break;
		}
		if (intM == 1) {
			for(int i = 0; i <100;i++) {
				int num1 = rnd.nextInt(words.length);
				int num2 = rnd.nextInt(words.length);
				
				String temp = words[num1];
				words[num1] = words[num2];
				words[num2] = temp;
			}
			System.out.println(Arrays.toString(words));
			System.out.print("입력 >> ");
			String strAnswer = scan.nextLine();
			if(strAnswer.trim().equalsIgnoreCase(word.getEnglish())) {
				System.out.println("Correct!!!");
			}else {
				System.out.println("--Wrong--");
				System.out.println(word.getEnglish());
			}
		}

	}
}
