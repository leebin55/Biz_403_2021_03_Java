package com.callor.method;

import com.callor.method.model.ScoreVO;

public class ScoreEx_04 {

	public static void main(String[] args) {
		
		//stack 메모리에 2개의 저장소를 만들고 각각 100, 200 의 정수를 저장
		int intNum1 = 100;
		int intNum2 = 200;
	
		ScoreVO scoreVo = new ScoreVO(); //ScoreVO클래스 를 이용한 객체의 생성
		//Heap 메모리에 kor,eng, math....등의 값을 저장할 저장소를 만들고 저장소들의 첫번째 주소를 
		// stack 메모리에 저장하고 그곳에 scoreVo 라는 이름을 붙여라
		scoreVo.setKor(90);
		scoreVo.setEng(90);
		scoreVo.setMath(90);
		/*
		 * 자상가상머신이 기억장치에 구역을 나눔
		 * 1. stack 메모리 : 변수를 선언하면 이 메모리에 저장
		 * 			변수가 저장하는 공간
		 * 단 , 클래스를 이용해 객체를 만들면 저장공간이 두개 생김
		 *  별도로 분리해서  
		 *	ScopreVO.scoreVo = newScoreVO();
		 *scoerVo 의 주소만 저장.
		 * 
		 * 	
		 * 2. heap  메모리: 힙메모리에 데이터가 저장되는 공간을 또 만듬
		 *  동적임 : 자유롭게 크기를 늘렷다 줄엿다
		 *  클래스의 " 실제 데이터 " 가 저장되는 공간
		 */
		
		/*
		 * scoreVo 객체의 kor변수의 값을 읽어서 intKore 변ㅅ수에 저장해 달라
		 * 1. stack 메모리에 있는 scoreVo 변수를 찾아
		 * 2. scoreVo 변수에 저장된 주소 읽기
		 * 3. 그 주소에 해당하는 Heap 메모리를 찾고
		 * 4. Heap 메모리의 kor 변수에서 값을 읽어
		 * 5. intKor 변수에 저장
		 */
		int intKor = scoreVo.getKor(); 
		
		
	}
}
