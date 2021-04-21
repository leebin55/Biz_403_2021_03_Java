package com.callor.word.domain;



public class ScoreVO {

	
	private Integer 포인트 ;
	private Integer 맞은개수;
	private Integer 틀린개수;
	private Integer 재도전;
	private Integer 힌트보기;

	public ScoreVO() {// 재도전 횟수를 3으로 처음부터 지정
		this(3);
	}
	public ScoreVO(Integer 재도전) { // 재도전 횟수를 입력받고 싶을때 
		this.재도전 = 재도전;
		this.포인트 = 0;
		this.틀린개수 = 0;
		this.맞은개수 = 0;
		this.힌트보기 =0;
		
	}
	
	@Override
	public String toString() {
		return "ScoreVO [포인트=" + 포인트 + ", 맞은개수=" + 맞은개수 + ", 틀린개수=" + 틀린개수 + ", 재도전=" + 재도전 + ", 힌트보기=" + 힌트보기 + "]";
	}
	public Integer get포인트() {
		return 포인트;
	}
	public void set포인트(Integer 포인트) {
		this.포인트 = 포인트;
	}
	public Integer get맞은개수() {
		return 맞은개수;
	}
	public void set맞은개수(Integer 맞은개수) {
		this.맞은개수 = 맞은개수;
	}
	public Integer get틀린개수() {
		return 틀린개수;
	}
	public void set틀린개수(Integer 틀린개수) {
		this.틀린개수 = 틀린개수;
	}
	public Integer get재도전() {
		return 재도전;
	}
	public void set재도전(Integer 재도전) {
		this.재도전 = 재도전;
	}
	public Integer get힌트보기() {
		return 힌트보기;
	}
	public void set힌트보기(Integer 힌트보기) {
		this.힌트보기 = 힌트보기;
	}
	public ScoreVO(Integer 포인트, Integer 틀린개수, Integer 맞은개수) {
		this.포인트 = 포인트;
		this.틀린개수 = 틀린개수;
		this.맞은개수 = 맞은개수;
	}
	
}
