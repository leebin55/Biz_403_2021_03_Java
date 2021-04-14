package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.score.model.WordVO;
import com.callor.score.service.WordService;

public class WordserviceImplV1A implements WordService {
	protected List<WordVO> wordList;
	protected Scanner scan;
	protected final int 영어 = 0;
	protected final int 한글 = 1;

	public WordserviceImplV1A() {
		wordList = new ArrayList<WordVO>();
		scan = new Scanner(System.in);
		/*
		 * word.txt 파일을 읽어서 wordList 데이터를 생성하는 method를 생성자에서 호출하여
		 * 이클래스(WordServiceImplV1A)를 생성하면 자동으로 실행되어 wordList 데이터를 준비하도록 함
		 */
		this.loadWord(); // 생성자에서 객체 생성
	}

	@Override
	public void loadWord() {
		String wordFile = "src/com/callor/score/Word.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(wordFile);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;

				String words[] = reader.split(":");

				WordVO wordVO = new WordVO();
				wordVO.setEnglish(words[영어]);
				wordVO.setKorea(words[한글]);

				wordList.add(wordVO);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 여는 동안 문제 발생");
			// e.printStackTrace();
		} catch (IOException e) { // 그냥 Exception 가장 등급이 높음
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 읽는 동안 문제 발생");
		}

	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewWord() {
		// TODO wordList 에 담긴 데이터중 임의 데이터 1개를 추출해
		int nWinCount = 0;
		int nLossCount = 0;
		
		while (true) {
			WordVO vo = this.getWord();
			System.out.println(vo.toString());

			System.out.println("=".repeat(50));
			System.out.println("다음 뜻과 같은 영어 단어는?(Quit : 그만)");
			System.out.println(vo.getKorea());
			System.out.println("-".repeat(50));
			System.out.print(" >> ");
			String strKor = scan.nextLine();
			if(strKor.equals("Quit")) {
				break;
			}

			if (strKor.equalsIgnoreCase(vo.getEnglish())) {
				System.out.println("Nice");
				nWinCount++;
			} else {
				System.out.println("Wrong word");
				System.out.println(vo.getEnglish());
				nLossCount++;
			}
			System.out.println("=".repeat(50));
			System.out.printf("Win : %d\n",nWinCount);
			System.out.printf("Loss : %d\n",nLossCount);
		}
		System.out.println("Game Over BYE");
	}

	protected WordVO getWord() {

		Random rnd = new Random();
		rnd.nextInt(100); // 0~ 99 까지 중의 정수 1개 생성

		int nSize = wordList.size();
		int num = rnd.nextInt(nSize);// 0 ~ (nSize -1) 정수중 하나

		WordVO wordVO = wordList.get(num);
		// System.out.println(wordVO.toString());
		return wordVO;

	}

}
