package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

/*
 * 데이터를 입력(키보드, Random,파일, 인터넷)
 * 데이터를 VO에 담고
 * 입력된 데이터를 List에 추가
 * 연산을 수행
 * 다시 List저장
 * 데이터 읽어
 * 	List에서 추출하여 VO에 담고
 * 출력
 */
import com.callor.method.model.ScoreVO;

public class ScoreServiceV6 {
	/*
	 * final + 변수 = 상수
	 * 한 번 저장된 값을 변경할 수 없는 특별한 변수
	 */
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	protected String[] subjects;
	protected List<ScoreVO> scoreList;
	protected InputServiceV2 inService;
	
	public ScoreServiceV6() {
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceV2();
		subjects = new String[] {"국어","영어","수학"};
	}

	public void inputScore() {
		
		for(int i = 0; i < 5 ; i++) {
			Integer[] scores = new Integer[subjects.length];
			for(int sb = 0; sb <subjects.length; sb++) {
				scores[i] = inService.inputValue(subjects[i],0 ,100);
				if(scores[i] == null) {
					return;
				}
			}
			ScoreVO scVO = new ScoreVO();
			int sbIndex= 0;
			scVO.setKor(scores[sbIndex++]);
			scVO.setEng(scores[sbIndex++]);
			scVO.setMath(scores[sbIndex++]);

			//scVO.setKor(scores[this.국어]);
			//scVO.setEng(scores[영어]);
		//	scVO.setMath(scores[수학]);
			
			scoreList.add(scVO);
		}
		
	}
	public void inputScore1() {
		
		for(int st = 0; st < 5 ; st++) {
			
			Integer intKor = inService.inputValue("국어", 0, 100);
			if(intKor == null) {
				return;
			}
			Integer intEng = inService.inputValue("국어", 0, 100);
			if(intKor == null) {
				return;
			}
			Integer intMath = inService.inputValue("국어", 0, 100);
			if(intKor == null) {
				return;
			}
			ScoreVO scVO = new ScoreVO();
			scVO.setKor(intKor);
			scVO.setEng(intEng);
			scVO.setMath(intMath);
			scoreList.add(scVO);
			
		}
	}
	public void printScore() {
		
		int nSize = scoreList.size();
		System.out.println("=".repeat(50));
		for(int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i] + "\t");
		}
		for(int i = 0; i < nSize ; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			
			System.out.print(scoreVO.getKor() + "\t");
			System.out.print(scoreVO.getEng() + "\t");
			System.out.print(scoreVO.getMath() + "\n");
		}
	}
}
