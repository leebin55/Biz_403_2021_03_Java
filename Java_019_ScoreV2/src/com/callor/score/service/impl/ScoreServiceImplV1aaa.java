package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.yublee.standard.InputService;
import com.yublee.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1aaa implements ScoreService {
	protected InputService inSer;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	protected final int 국어 = 1;
	protected final int 영어 = 2;
	protected final int 수학 = 3;
	protected String[] subs;

	public ScoreServiceImplV1aaa() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		subs = new String[] { "국어", "영어", "수학" };
		inSer = new InputServiceImplV1();
	}

	public String inputNum() {
		Integer intNum = inSer.inputValue("학번", 1);
		if (intNum != null) {
			return null;
		}
		String strNum = String.format("%05d", intNum);
		return strNum;

	}

	@Override
	public void insertScore() {
		// TODO Auto-generated method stub

		String strNum = this.inputNum();
		if (strNum == null) {
			return;
		}
		Integer[] score = new Integer[subs.length];

		for (int i = 0; i < subs.length; i++) {
				score[i] =inSer.inputValue(subs[i],0, 100);
				if(score[i] == null) return;
			
			ScoreVO vo = new ScoreVO();
			vo.setNum(strNum);
			vo.setKor(score[국어]);
			vo.setEng(score[영어]);
			vo.setEng(score[수학]);
			scoreList.add(vo);
			
		}
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		int nSize = scoreList.size();
		for(int i = 0 ; i <nSize ;i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum()+ "\t");
			System.out.print(vo.getKor()+ "\t");
			System.out.print(vo.getMath()+ "\t");
			System.out.print(vo.getAvg()+ "\t");
			System.out.print(vo.getTotal()+ "\t");
			System.out.printf("%3.2f",vo.getAvg());
			
			
		}

	}

}
