package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV1(); //ScoreService인터페이스를 이용해 만든
		//ScoreServiceImplV1을 불러옴
		
		/*
		 * 아직 ScoerServiceImplV1() 클래스의 method들은 코드가 구체적으로 구현되지 않음
		 * >> method안에 아직 코드가 미완성, method만 만들어져 있음
		 * 
		 * 이런 상황에 다른 팀원이 ScoreServiceImplV1 클래스의 method를 호출하는 코드를 작성했을때
		 * 1. method가 없어서 발생하는 문법 오류는 없음
		 * 2. 언젠가는 호출하는 method코드가 구현 될 것임을 약속받은 상태
		 * 3. 따라서 ScoreServiceImplV1 의 method를 호출하는 코드는 잠시 만들어만 두고
		 * 		이후의 코드에 집중하고 코딩을 계속할 수 있음
		 */
		sService.inputScore();
		sService.printScore();
		sService.saveScore();
		
		if(sService.checkScore() == 0){
			// checkScore() 가 0을 return 하면 수행할 코드
		}else {
			//그렇지 않을 경우 수행할 코드
		}
	}
}
