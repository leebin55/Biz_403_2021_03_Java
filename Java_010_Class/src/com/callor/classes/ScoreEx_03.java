package com.callor.classes;
/*
 * V2까지는 학생의 성적을 입력받다가
 * 중단을 하면 리스트를 보여주는 형식 이었음
 * V3 에서는 업무를 선택할 수 있는 형식 추가
 * 선택된 menu에 따라 업무를 진행하도록 업그레이드
 * ===============================================
 * 빛나라 고교 성적 시스템 V1
 * -----------------------------------------------
 * 1. 성적입력
 * 2. 성적리스트 출력
 * 0. 업무종료
 * ----------------------------------------------
 * 업무선택 >>>
 */
import com.callor.classes.service.ScoreServiceV3;

public class ScoreEx_03 {

	public static void main(String[] args) {
		
		ScoreServiceV3 ssV3 = new ScoreServiceV3();
		
		ssV3.menuScore();
	}
}
