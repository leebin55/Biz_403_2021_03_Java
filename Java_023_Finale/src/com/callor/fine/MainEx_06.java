package com.callor.fine;

import java.util.List;

import com.callor.fine.model.ScoreVo;

public class MainEx_06 {

	public static void main(String[] args) {
		
		List<ScoreVo> scoreList = null;
		
		for(int i = 0; i <10 ; i++ ) {
			
			ScoreVo scoreVO = null;
			scoreVO.setNum("0001");
			scoreVO.setKor(90);
			scoreList.add(scoreVO);
		}
	}
}
