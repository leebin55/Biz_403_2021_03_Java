package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

public class ScoretServiceV6A {

	List<ScoreVO> scoreList;
	InputServiceV2 inSer;

	public ScoretServiceV6A() {

		scoreList = new ArrayList<ScoreVO>();
		inSer = new InputServiceV2();

	}

	public void inputScore() {
		 
		Integer intKor = inSer.inputValue("국어", 0, 100);
		if(intKor == null) {
			System.out.println("종료");
			return;
		}
		Integer intEng = inSer.inputValue("영어", 0, 100);
		if(intEng == null) {
			System.out.println("종료");
			return;
		}
		Integer intMath = inSer.inputValue("수학", 0, 100);
		if(intMath == null) {
			System.out.println("종료");
			return;
		}
		
		ScoreVO scVO = new ScoreVO();
		scVO.setKor(intKor);
		scVO.setEng(intEng);
		scVO.setMath(intMath);
		scoreList.add(scVO);
		
		
		this.printScore();
		
	}
	public void printScore() {
		
		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학");
		System.out.println("-".repeat(50));
		
		for(int i = 0; i < scoreList.size();i++ ) {
			
			System.out.print(scoreList.get(i).getKor() + "\t");
			System.out.print(scoreList.get(i).getEng() + "\t");
			System.out.print(scoreList.get(i).getMath() + "\n");
			
			
		}
	
	}
}
