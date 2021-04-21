package com.callor.app.model;

public class DeckVO {
	
	private String suit;
	private String denomination;
	private Integer value = 0;
	
	/*
	 * 기본 생성 : 매개변수가 없는 생성자 
	 * 				super constructor
	 * 				new Deck()처럼 호추
	 * 
	 * 클래스를 정의하고 아무런 생성자를 만들지 않으면
	 * 			기본 생성자는 자동으로 만들어져
	 * 			언제든지 객체를 생성할 때 호출 가능
	 * 
	 * 하지만!!
	 * 			매개변수가 ( 단 한개라도) 있는 생성자를 만들면
	 * 			기본생성자는 만들어지지 않음 
	 * 
	 * 초기화를 자동으로 할때
	 *  class ScoreVo {
	 *  	Integer score = 0;  
	 *  또는 
	 *  	{
	 *  	 score = 10;
	 *  	}  처럼 클래스 영역에 초기화 블록을 사용해서 가능
	 *  }	
	 *  또는 
	 *  public ScoreVO(){
	 *  	score = 20;
	 *  	}
	 *  생성자에서 초기화 
	 *  만약 위에 세가지 방법이 다 진행 된다면 마지막에 실행된
	 *  score = 20; 으로 초기화 됨
	 *   
	 * 
	 */
	public DeckVO() {
		
	}
	/* 
	 * 필드(멤버)변수를 매개변수로 갖는 생성자
	 * 				Field Constructor
	 * 				new DeckVO(값.....) 처럼 호출
	 */
public DeckVO(String suit, String denomiation, Integer vlaue) {
		super();
		this.suit= suit;
		this.denomination = denomiation;
		this.value = vlaue;
	}
@Override
public String toString() {
	return "DeckVO [suit=" + suit + ", denomination=" + denomination + ", value=" + value + "]";
}
public String getSuit() {
	return suit;
}
public void setSuit(String suit) {
	this.suit = suit;
}
public String getDenomination() {
	return denomination;
}
public void setDenomination(String denomination) {
	this.denomination = denomination;
}
public Integer getValue() {
	return value;
}
public void setValue(Integer value) {
	this.value = value;
}

}
