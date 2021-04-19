package com.callor.word.domain;
/*
 * model package 
 * MVC(model view controller) 패턴의 프로젝트에서는 
 * VO 클래스가 저장되는 package 를 보통 model 로 작성
 * 
 * domain packager
 * DBMS 와 연됭되는 프로젝트에서 사용하기도 하는 이름
 * 
 * command package
 */

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// <  Annotation  >

//@Override 처럼 
//Annotation 으로 키워드를 지정하므로써 
//단순히 반복 작성해야 하는 코드를 자동으로 만들어 주는 효과

@Getter
@Setter
@ToString
//변수가 private 으로 되어 있어야
public class WordVO {

	//정보의 은닉
	private String english;
	private String korea;
	private Integer count;
}
