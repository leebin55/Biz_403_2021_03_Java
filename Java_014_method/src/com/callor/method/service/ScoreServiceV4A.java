package com.callor.method.service;

public class ScoreServiceV4A {

	/* 
	 * 과목의 이름이 저장될 배열을 클래스 영역에 선언
	 * 
	 * 과목점수 입력, 성적리스트 출력 등에서 사용하기 때문에
	 * 멤버변수 영역, 클래스 영역에 선언
	 */
	
	protected String[] subjects;
	InputServiceV2 inService;
	/*
	 * 생성자 method
	 * ScoreServiceV4클래스에 사용하여 객체를 생성할 때 호출할  method
	 */
	public ScoreServiceV4A() {
		/*
		 * 생성한다 == 변수에 
		 * 생성자에 작성되는 코드
		 * 멤버변수 영역에 선언된 변수, 객체를 생성하는 코드
		 * 
		 */
		subjects = new String[] {"국어","영어","수학"};
		inService = new InputServiceV2();
	}
	
	public void inputScore() {
		// 키보드를 사용하여 3과목 점수 입력 받음 (Input~V2에 선언된 메서드를 사용할 예정
											//     >Scanner등의 클래스, 객체를 사용할 필요 없음
/* 배열 선언 
 * 
 * 여기서 과목명을 배열로 선언
 * 왜??
 * 점수를 입력받는 method호출 코드 한번만 작성하고 for() 반복문으로 처리 		
 */
		
		int[] scores = new int[subjects.length];
		
		
		for(int i = 0; i < subjects.length; i++) {
			Integer score = inService.inputValue(subjects[i], 0, 100);
			if(score == null) {
				System.out.println();
				System.out.println("-- END --");
				/*
				* break
				*break;를 쓰면 for가 끝나는 시점으로 jump
				*break 를 실행하면 for() 반복문만 중단 for() 이후 코드 실행
				*for 반복문 이후 다른 연산(코드) 실행할 필요 없다면 break
				*
				*return
				*  return 현재 method 무조건 종료
				*   method를 호출했던 곳으로 돌아감
				*   
				 */
				return;
			}
			scores[i] = score; //return받은 점수를 scores의 i 번째에 저장
			
		}//for end
		int sum = 0;
		for(int i = 0; i < scores.length;i++) {
			sum += scores[i];
		}
		float avg = (float)sum / subjects.length; //과목의 갯수만큼 계산
		System.out.println("===============================================");
		System.out.printf("총점 : %d\t평균 : %3.2f\n",sum, sum/3.0f);
		System.out.println("===============================================");
	}
}
