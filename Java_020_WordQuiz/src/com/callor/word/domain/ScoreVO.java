package com.callor.word.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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
	
	public ScoreVO(Integer 포인트, Integer 틀린개수, Integer 맞은개수) {
		this.포인트 = 포인트;
		this.틀린개수 = 틀린개수;
		this.맞은개수 = 맞은개수;
	}
	
}
