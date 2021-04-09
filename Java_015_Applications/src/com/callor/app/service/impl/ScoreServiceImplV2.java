package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1T {

	private String inputNum1() {

		while(true) {
		String strNum = this.inputNum();
		if (strNum == null) {
			return null;
		} 
		int num = 0;
		for(int i = 0 ; i < scoreList.size() ; i++) {
			ScoreVO vo = scoreList.get(i);
			if(vo.getNum().equals(strNum)) {
				num++;
			}
		}
		if(num > 0) {
		System.out.println("이미 입력한 학번입니다");
			continue;
		}
		return strNum;
		}
	}

	/*
	 * 두번째
		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			String strNum = String.valueOf(intNum);
			if (intNum == null) {
				return null;
			} else {
				int index = 0;
				for (index = 0; index < scoreList.size(); index++) {
					if (strNum.trim().equals(scoreList.get(index).getNum())) {
						break;
					}
				}
				if (index < scoreList.size()) {
					System.out.println("중복된 값을 입력");
					continue;
				} else {
					return strNum;
			}
		}
	}
				*/
		//첫번째
					// for (int i = 0; i < scoreList.size(); i++) {
					// if (strNum.trim().equals(scoreList.get(i))) {
					// System.out.println("중복된 값입니다");
					// continue;
					// }
					// }
	

	@Override
	public void inputScore() {

		String strNum = this.inputNum1();
		if ( strNum == null) {
			return;
		}
		// 학생의 이름입력
		String strName = this.inputName(strNum);
		if (strName == null) {
			return;
		}

		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if (intEng == null) {
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if (intMath == null) {
			return;
		}

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		scoreVO.setName(strName);
		scoreVO.setNum(strNum);

	}
}

