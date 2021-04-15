package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService {
	protected List<StudentVO> studentList;
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 학과 = 4;
	protected final int 주소 = 5;

	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
		this.loadStudent();

	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadStudent() {
		// TODO student.txtㅠ파일을 읽어 학생정보 추출 후 List<StudentVO>studentList추가

		String fileName = "src/com/callor/score/student.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;
				String[] students = reader.split(":");
				StudentVO vo = new StudentVO();
				vo.setNum(students[학번]);
				vo.setName(students[이름]);
				vo.setGrade(students[학년]);
				vo.setDept(students[학과]);
				vo.setAddress(students[주소]);
				studentList.add(vo);
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO 파일을 여는 동안 문제발생
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 파일을 읽는 동안 문제 발생
			e.printStackTrace();
		}

	}

	@Override
	public StudentVO getStudent(String num) {
		// TODO 학생의 학번을 전달받아 stdentList에서 해당 학번의 학생찾기
		// 학생정보 있으면 VO정보 return
		// 없으면 null
		int nSize = studentList.size();
		for (int i = 0; i < nSize; i++) {
			StudentVO vo = studentList.get(i);
			if (num.equals(vo.getNum()))return vo;
		}
		return null;
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub

	}

}
