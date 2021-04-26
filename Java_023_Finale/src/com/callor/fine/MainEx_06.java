package com.callor.fine;

import java.util.ArrayList;
import java.util.List;

import com.callor.fine.model.ScoreVo;

public class MainEx_06 {

	public static void main(String[] args) {
		
		List<ScoreVo> scoreList = new ArrayList<ScoreVo>();
		
		for(int i = 0; i <10 ; i++ ) {
			
			ScoreVo scoreVO = new ScoreVo();
			scoreVO.setNum("0001");
			scoreVO.setKor(90);
			scoreList.add(scoreVO);
		
		}
		}
}
