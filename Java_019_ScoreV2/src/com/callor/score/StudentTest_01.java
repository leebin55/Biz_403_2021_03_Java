package com.callor.score;

import com.callor.score.service.StudentService;
import com.callor.score.service.impl.StudentServiceImplV1;

public class StudentTest_01 {

	public static void main(String[] args) {
		
		StudentService sSer = new StudentServiceImplV1();
		
		sSer.getStudent("00056");
		
		
		
		
	}
}
