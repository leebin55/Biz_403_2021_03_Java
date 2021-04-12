package com.callor.app.service;

public interface ScoreService {
	/*
	 * interface
	 * 클래스를 만들기 위한 설계도(Prototype)역할 수행
	 * 팀 프로젝트에서 여러팀원이 
	 * 같은 연산을 수행하는 클래스를 만들 때, method의 이름을 통일하여 이후에 프로젝트를
	 * 통합할때 발생하는 오률르 최소화 하기 위함
	 * 
	 * interface를 implements한 클래스는 interface에 지정된 method를 반드시 구현해야 함
	 * 
	 * interface와 관련된 클래스를 사용하여 객체를 생성한 후 method를 호출하는 코드를 통해
	 * 연산을 새행하는 측에서는 아직 method코드가 구현이 덜 되었더라도 자신의 코드를 진해
	 * 할 수 있도록 함
	 */

	public void selectMenu();
	public void inputScore();
	public void printScore();
	public void saveScore();
	
	public void readScore();
	public Integer checkScore();
}
