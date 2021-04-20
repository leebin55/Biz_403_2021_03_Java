package com.callor.word.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.word.domain.WordVO;
import com.callor.word.service.WordService;
import com.yublee.standard.InputService;
import com.yublee.standard.MenuService;
import com.yublee.standard.impl.InputServiceImplV1;

public class WordServiceImplV1 implements WordService{

	protected InputService inService;
	protected MenuService mServince;
	protected Scanner scan;
	protected List<WordVO> wordList;
	protected int nWordCount; //wordList의 개수를 담을 변수
	protected Random rnd;
	
	protected final int 영어 = 0;
	protected final int 한글 = 1;
	
	//default생성자 
	//word.txt 파일을 기본으로 하여 객체를 생성 하기 위한 생성자
	public WordServiceImplV1() {
		this("src/com/callor/word/word.txt");
	}
	
	//객체를 생성할 때 파일 이름을 전달하여 word 파일을 지정하기
	public WordServiceImplV1(String wordFile) {
		inService = new InputServiceImplV1();
		scan = new Scanner(System.in);
		rnd = new Random();
		wordList = new ArrayList<WordVO>();
		this.loadWords(wordFile); //loadWords를 실행
		//nWordCount 는 wordList의 size를 담고 있는 변수인데 가급적 값을 setting하는
		//ㅋ드를 쉡게 발견할 수 있도록 하기 위하여 생성자에서 초기화
		nWordCount = wordList.size();
	}
	/*
	 * 게임이 시작되면 
	 *  1. wordList에서 임의 단어 1개를 추출하고
	 *  2. 단어의 영문 스펠을 나누어
	 *  3. 무작위로 섞고
	 *  4. 섞인 단어를 보여주고
	 *  5. 맞추기
	 * 
	 */
	
	public void startGame(){
		/*
		 * getSuffleWord() method가 return 하는 shuffle된 영단어를 그대로
		 * inputWord에게  toss
		 * 
		 * inputWord() 를 호출하고 다시 getSuffleWord() 호출하여 수행할 수 있는 코드를
		 * 
		 * getSuffleWord()를 호출하여 데이터만 (섞인 영단어)되돌려 받고
		 * 다시 그 데이터를 inputWord()에 전달하여
		 * 수행하는 코드로 변경
		 * 
		 * 첫번째 방법은 inputWord() 와 getSuffelWord()가 결합도가 높아져 한 method의 코드를
		 * 변경하면 다른 코드도 변경해야 하는 부분이 많아집
		 * 
		 * 두번째 방법은 데이터만 연결된 형태로 변경한 것으로 한 method의 코드를 변경하여도
		 * 다른 method코드는 변경하지 않아도 되는 구조 
		 * 
		 * 첫번째코드 : 결합도가 높은 코드
		 * 두번째 코드 : 결합도는 낮추고 응집도를 높인 코드가 됨
		 * 
		 * SW공학에서 좋은 코드라고 함
		 */
		//this.inputWord(this.viewWord()); 이 코드를 풀어서
		String viewWord[] = this.getShuffleWord();
		this.inputWord(viewWord);
	}
	
	/* viewWord 를 getSuffleWord 로 변경
	 * 1. wordList 에서 단어를 한개 추출하고
	 * 2. suffleEnglish() 에게 단어를 전달하고 
	 * 		suffle된 알파벳을 return 받아
	 */
	protected String[] getShuffleWord() {
		//Random 클래스를 사용한 코드가 startGame(), shuffleWord() 에서 사용
		// ==> Random 클래스를 사용한 객체 선언을 필드(멤버, 클래스)역역으로
		//Random rnd = new Random();
		// ==> 그리고 생성자에서 """초기화""""!!!
		//nWordCount = wordList.size(); //wordList 사이즈를 담음
		
		//wordList 의 개수 (size)를 담을 변수를 두개의  method에서 사용을 하고 있다
		// 이 변수를 필드영역으로 보내서 사용
		//0 ~ (wordList.size() -1) 범위의 임의 정수
		//생성된 index값으로 wordList중에 단어 1개 추출
		// 이 단어를 wordVO 에 담기
		
		int nWordIndex = rnd.nextInt(nWordCount); //nWordCount 생성자에서 초기화 됨
		WordVO wordVO = wordList.get(nWordIndex);
		
		//영문단어 알파벳을 뒤섞기 코드를 method로 분리하고 원래 영문단어를
		//매개변수로 전달하고 뒤섞인 단어를 return받아 다시 배열에 저장
		//영문 단어를 스펠링 단위로 잘라서 배열로 생성
		
		//영문단어를 매개변수로 전달하고 알파벡단위로 분되되고 뒤섞인 단어를 
		//return방아 suffleEnglish 에 저장
		String[] shuffleEnglish = this.shuffleWord(wordVO.getEnglish());//영어단어를 보내줌
		//System.out.println(Arrays.toString(suffleEnglish));
		return shuffleEnglish;
	}
	protected String inputWord(String[] viewWord) {
		System.out.println("=".repeat(50));
		System.out.println("루팡의 영단어 게임 v1");
		System.out.println("-".repeat(50));
		System.out.println("다음 단어를 바르게 바르게 배열하여 입력!!");
		//shuffle된 영단어 보여주기
		System.out.println(Arrays.toString(viewWord));
		System.out.print(" >> ");
		String strInput = scan.nextLine();
		return strInput;
	}
	
	/*
	 * 영문 단어를 매개변수로 받아서 알파벳 단위라 자르고 뒤섞어 배열로 만둔후 return
	 * private >> protected 로 변
	 */
	protected String[] shuffleWord(String strEnglish) {// 단어를 매개변수를 받고 배열을 return해줌
		//>> 독립적인 메소드가 됨
		String shuffleEnglish[] = strEnglish.split("");
		
		int nCount = shuffleEnglish.length;
		//shuffle 무작위로 뒤섞기
		//몇번 섞느냐에 따라 반복 ; 여기서는 1000번 
		for(int i = 0; i < 1000 ; i++) {
			//임의의 index값 2개를 만들고
			int index1 = rnd.nextInt(nCount);
			int index2 = rnd.nextInt(nCount);
			
			//index1에 저장된 값과, index2에 저장된 값 바꾸기
			String temp = shuffleEnglish[index1];
			shuffleEnglish[index1] = shuffleEnglish[index2];
			shuffleEnglish[index2] = temp;			
		}
		return shuffleEnglish;
	}

	private void loadWords(String wordFile) { //굳이 외부에서 볼필요가 없어서 : private
//TODO word.txt 파일을 읽어 wordList 만들어 두기		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(wordFile);
			buffer = new BufferedReader(fileReader);
			while(true){
				String reader = buffer.readLine();
				if(reader== null)break;
				
				String words[] =reader.split(":");
				
				WordVO wordVO = new WordVO();
				wordVO.setEnglish(words[영어]);
				wordVO.setKorea(words[한글]);
				wordList.add(wordVO);
			}
			//여기에서 wordList size를 계산하여 
			//nWordCount변수에 담을 수도 있지만 
			//복잡한 코드 속에 있어 보기가 불편하여 생성자 부분으로 이동
			//nWordCount = wordList.size();
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
