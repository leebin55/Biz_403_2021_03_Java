package com.callor.method.service;

/*
 * InputServiceV2 의 inputValue method에 "국어" 0, 100 값을 전달한 후 
 * return 값이 null 이면 종료
 * 				정수 이면 점수 : ?? 형식으로 출력
 */
public class ScoreServiceV2 {
	/*
	 *  InputSrviceV2 클래스를 활용한 method가 2개 이상일때 클래스 영역에 선언하고 
	 * 
	 * InputSrviceV2 클래스를 활용한 method가 한 곳뿐일때 method 지역변수 영역에 선언하고 사용 I
	 */
	InputServiceV2 inService;

	public ScoreServiceV2() {
		inService = new InputServiceV2();
	}

	public void inputScore() {

		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			System.out.println("종료");

		} else {
			System.out.printf("국어 점수 : %d\n ", intKor);
		}

	}

}
