package com.callor.score;

import com.callor.score.service.StudentService;
import com.callor.score.service.impl.StudentServiceImplV1A;

public class StudentEx_01 {

	public static void main(String[] args) {
		//기본값으로 설정된 파일을 사용하여 객체 생성 진행
		StudentService sService1 = new StudentServiceImplV1A();
		
		// ../student.txt 파일을 사용하여 객체 생성해서 진행
		//StudentService sService2 = new StudentServiceImplV1A( "src/com/callor/score/studemt.txt");
		//""안에 파일을 이용해서 만들어달라는 조건
		//sService1.printStudent();
		sService1.getStudent("1");
	}
}

