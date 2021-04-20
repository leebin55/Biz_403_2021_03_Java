package com.callor.word.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import com.callor.word.domain.ScoreVO;
import com.callor.word.domain.WordVO;

/* 
 * 점수 처리 
 * 변수 하나로 처리할 수도 있지만  ScoreVO 를 생성해서 이용
 * 단어를 맞추면 점수를 +
 * 단어를 틀리면 재도전 기회 3번까지 , 점수 - 
 * 힌트 요구하면 점수 -
 * 건너뛰기 점수 -
 */
public class WordServiceImplV2 extends WordServiceImplV1 {

	protected WordVO gameWord;
	protected ScoreVO score;
	protected String basePath;
	protected final int 맞은개수 = 0;
	protected final int 틀린개수 = 1;
	protected final int 포인트 = 2;
	
	
	public WordServiceImplV2() { // 생성자를 생성
		score = new ScoreVO(3); // 변수를 모아서 사용
		basePath = "src/com/callor/word/";
	}

	/*
	 * getShuffleWord() method를 호출하여 shuffle된 영단어를 받고 그 단어를 inputWord() 에게 전달하여 게임을
	 * 진행.
	 */
	public void startGame() {
		// 게임용단어 만들기
		/*
		 * 반복문 { 반복문{ } } 반복문{ 반복문 { } } break 안쪽의 반복문에서 break 를 실행하면 한단계씩 반복문 해제
		 * 
		 * return 겹침에 관계없으 거기서 현재 method자체가 끝남
		 */
		while (true) {
			int nWordIndex = rnd.nextInt(nWordCount);
			WordVO wordVO = wordList.get(nWordIndex);
			// getShuffleWord를 사용하지 않고 직접 shuffleWord를 호출
			String viewWord[] = this.shuffleWord(wordVO.getEnglish());
			while (true) {
				String strInput = this.inputWord(viewWord);
				if (strInput.equals("QUIT")) {
					System.out.println("게임종료");
					return;
				} else if (strInput.equals("1")) {
					break;// 2번재 while
				} else if (strInput.equals("2")) {
					this.hint(wordVO);
				} else {
					this.yesNo(wordVO, strInput);
					// 점수계산
//					String strEng = wordVO.getEnglish();
//					if (strEng.equalsIgnoreCase(strInput)) {
					// // if(wordVO.getEnglish().equalsIgnoreCase(strInput)) {
					// System.out.println("CORRECT");
					// }
				}
			}
		}
	}

	/*
	 * 셔플된 단어배열을 매개변수로 받고 게임을 진행
	 */

	protected void hint(WordVO wordVO) {
		System.out.println("+".repeat(50));
		System.out.println("힌트보기");
		System.out.println(wordVO.getKorea());
		System.out.println("+".repeat(50));
		score.set힌트보기(score.get힌트보기() + 1);
		this.viewScore();

	}

	protected void yesNo(WordVO wordVO, String input) {
		String strEng = wordVO.getEnglish();
		if (strEng.equalsIgnoreCase(input)) {
			score.set맞은개수(score.get맞은개수() + 1);
			System.out.println("맞았어");

		}
	}

	protected void viewScore() {
		System.out.println("=".repeat(50));
		System.out.println("현재 점수");
		System.out.println("=".repeat(50));
		System.out.printf("맞은개수 :%d\n", score.get맞은개수());
		System.out.printf("틀린개수 :%d\n", score.get틀린개수());
		System.out.printf("점수  :%d\n", score.get포인트());

	}

	protected void saveScore() {

		
		while (true) {
			System.out.println("저장할 파일이름 입력");
			System.out.print("  >>  ");
			String fileName = scan.nextLine();
			if (fileName.trim().equals("")) {
				System.out.println("파일이름 반드시 입력!!");
				continue;
			}
			FileWriter fileWriter = null;
			PrintWriter out = null;

			try {
				fileWriter = new FileWriter(basePath + fileName);
				out = new PrintWriter(fileWriter);
				out.printf("%d : %d : %d\n", score.get맞은개수(), score.get틀린개수(), score.get포인트());
				out.flush();
				out.close();
				
				System.out.println("게임저장 완료");
				return; // 또는 break; 여기서는 상관 없음
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(fileName + "생성 오류");
				System.out.println("파일 이름 다시 입력");
				// continue; 어짜피 다시 돌아감 >> 마지막줄
			}
		}
	}

	protected void loadScore() {
		
		while (true) {
			System.out.println("불러올 파일 이름 입력해");
			System.out.print("  >>  ");
			String fileName = scan.nextLine();
			if(fileName.trim().equals("")) {
				System.out.println("게임 첨부터 시작한다");
				score = new ScoreVO();// ScoreVO 초기화 
				return;
			}
			FileReader fileReader = null;
			BufferedReader buffer = null;
			
			try {
				fileReader = new FileReader(basePath + fileName);
				buffer = new BufferedReader(fileReader);
				
				String reader = buffer.readLine(); //한줄만 읽음
				String[] sc = reader.split(":");
				this.score = new ScoreVO();
				score.set맞은개수(Integer.valueOf(sc[맞은개수]));
				score.set틀린개수(Integer.valueOf(sc[틀린개수]));
				score.set포인트(Integer.valueOf(sc[포인트]));
				
				buffer.close();
				return;
				
			} catch (FileNotFoundException e) {
				System.out.println("파일없어");
				System.out.println("다시입력");
				continue;
			} catch (IOException e) {
				System.out.println("파일 읽을 수 없어");
				score = new ScoreVO();//걍끝냄 초기화
				return;
			}
			
		}
	}

	protected String inputWord(String[] viewWord) {
		System.out.println("=".repeat(50));
		System.out.println("루팡의 영단어 게임 V2 ");
		System.out.println("-".repeat(50));
		System.out.println("다음 보여지는 단어를 알아맞춰보세요");
		System.out.println(Arrays.toString(viewWord));
		System.out.println("-".repeat(50));
		while (true) {
			System.out.println("1. Skip");
			System.out.println("2. Hint");
			System.out.println("QUIT. Quit");
			System.out.println("-".repeat(50));
			System.out.print("  >>  ");
			String strInput = scan.nextLine();
			if (strInput.trim().equals("")) {
				System.out.println(" 단어 혹은 메뉴를 입력하세요");
				continue;
			}
			return strInput;

		}
	}
	/*
	 * getShuffleWord() 메소드를 아예 사용하지 않고 List에서 영단어VO를 getter 하고 직접 데이터를 관리하도록 !! >>
	 * startGame에서 통제
	 * 
	 * list에서 getter 된 영단어VO를 정역변수(클래스영역에 멤버변수)로 선언하고 단어 저장
	 * 
	 * => 영단어VO 는 다른 메소드에서도 사용 (서로 다른 메소드 여도 관심을 가져야 함) 영단어VO(gameWord) 변수의 상태를 주의
	 * 깊게 관리해야 함 (어디선가 값이 변경 될수도 있는 상황)
	 */

}
