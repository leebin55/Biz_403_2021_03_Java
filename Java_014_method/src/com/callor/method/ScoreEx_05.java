package com.callor.method;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

public class ScoreEx_05 {

	public static void main(String[] args) {
		/*
		 * scoreVo 라는 집을 짓고 ( Heap 메모리에 생성)
		 * 값을 setter 한 다음
		 * 그 집의 주소를 scoreList에 저장
		 */
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		ScoreVO scoreVo = new ScoreVO();
		scoreVo.setKor(90);
		scoreVo.setEng(90);
		scoreVo.setMath(90);
		scoreList.add(scoreVo);
		
		/*
		 * 만약 scoreVo = new ScoerVO(); 코드를 생량하면
		 * 이미 지어져있는 scoreVo 데이터를 변경한 후 그 주소를 scoreList에 추가
		 * >> 첫번째 List가 가리키고 있는 집의 데이터가 변경되서
		 *  모든 리스트의 데이터가 같아져 버림
		 *  
		 *  그럼 List에 저장하려면?
		 *  VO클래스를 사용하여 집을 짓고 List에 추가하려면 항상 새집을 먼저 지어여 함
		 */
		scoreVo = new ScoreVO();
		scoreVo.setKor(90);
		scoreVo.setEng(90);
		scoreVo.setMath(90);
	
		scoreList.add(scoreVo);
		
		for(int i = 0; i < scoreList.size() ; i++) {
			System.out.print(scoreList.get(i).getKor() + "\t");
			System.out.print(scoreList.get(i).getEng() + "\t");
			System.out.print(scoreList.get(i).getMath() + "\n");
		}
		
	}
}
