package com.callo.apps.service;

import java.util.Random;

//생성자안에 괄호안에 변수선언 int members
public class ScoreServiceV2 extends ScoreServiceV1 {

	// for(int = 0)
	// int members = 5
	// method 의 괄호()안에 선언된 변수
	// 매개변수, parameter라고 함
	public ScoreServiceV2(int members) {

		intKor = new int[members];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];

		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];
	}

}
