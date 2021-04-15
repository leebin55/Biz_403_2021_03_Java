package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoreService;
import com.yublee.standard.InputService;
import com.yublee.standard.impl.InputServiceImplV1;

/*
 * 
 */
public class ScoreServiceImplV1 implements ScoreService {
	protected InputService inSer;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	protected final int 국어 = 1;
	protected final int 영어 = 2;
	protected final int 수학 = 3;
	protected String[] subs;

	public ScoreServiceImplV1() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		subs = new String[] { "국어", "영어", "수학" };
		inSer = new InputServiceImplV1();
	}

	
	public String inputNum() {
		while (true) {
			System.out.println("학번을 입력하세요( QUIT : 입력종료 )");
			System.out.print(" >>>  ");
			String strNum = scan.nextLine();
			strNum = String.format("%05d", strNum);
			if (strNum.trim().equals("")) {
				System.out.println("학번을 꼭 입력해야 합니다.");
				continue;
			}
			if(strNum.trim().equals("QUIT")){
				return null;
			}
			
			int nSize = scoreList.size();
			int index = 0;
			for (index = 0; index < nSize; index++) {
				if (strNum.equals(scoreList.get(index).getNum()))
					break;
			}
			if (index < nSize) {
				System.out.println("이미 존재하는 학번입니다. ");
				continue;
			}
			return strNum;
		}
		
	}
	@Override
	public void insertScore() {
		// TODO Auto-generated method stub

		String strNum = this.inputNum();
		if(strNum == null) {
			return;
		}
		Integer[] score = new Integer[subs.length];
		while (true) {
			for (int i = 0; i < subs.length; i++) {
				System.out.println(subs + " 과목의 점수를 입력하세요");
				System.out.println("  >>  ");
				String strScore = scan.nextLine();
				try {
					score[i] = Integer.valueOf(strScore);
				} catch (NumberFormatException e) {
					System.out.println("제대로 입력해 주세요");
					continue;
				}
				break;
			}
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
		
		System.out.println("=".repeat(70));
		System.out.println("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(70));
		
		
		

	}

}
