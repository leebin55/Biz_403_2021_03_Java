package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;
//StudentEx_01
public class StudentServiceImplV1A2 implements StudentService {
	// 클래스영역에 선언할 때 private 이나 상속할 예정이면 protected
	protected List<StudentVO> studentList;
	protected String studentFile;
	
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 반 = 3;
	protected final int 학과 = 4;
	protected final int 주소 = 5;

 
	public StudentServiceImplV1A2() { //처음에 이 생성자가 호출됨 
		
		this("src/com/callor/score/student.txt"); //""안에 문자열을 this 에 
		
	}

	public StudentServiceImplV1A2(String fileName) {
		this.studentFile = fileName; //생성자에서 파일이름을 전달받아
		studentList = new ArrayList<StudentVO>();
		
		this.loadStudent();
	}

	

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub

	}

	/*
	 * student.txt 파일에서 학생정보를 읽어 studentList에 데이터 준비
	 */
	@Override
	public void loadStudent() {
		
		FileReader fileReader= null;
		BufferedReader buffer= null;
		
		try {
			fileReader = new FileReader(this.studentFile);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null )break;
				
				String[] sts = reader.split(":");
				StudentVO studentVO = new StudentVO();
				studentVO.setNum(sts[학번]);
				studentVO.setName(sts[이름]);
				studentVO.setGrade(sts[학년]);
				studentVO.setDept(sts[학과]);
				studentVO.setAddress(sts[주소]);
				
				
				studentList.add(studentVO);
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(this.studentFile +"파일이 없음");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽는 동안 문제 발생 !!");
		}
		
		

	}

	@Override
	public StudentVO getStudent(String num) {
		
		int nSize = studentList.size();
		for(int i  = 0; i < nSize ; i++) {
			StudentVO vo = studentList.get(i);
			if(vo.getNum().equals(num)) {
				return vo;
			}
		}
		
		//<    2 번 코드  : 향상된 for, for Each     >
		for(StudentVO vo :studentList) { //studentList 가 새로 하나씩 만들어지면서 
			if(vo.getNum().equals(num)) return vo;
		}
		return null;// for문이 전체 반복되고 return 되지 않았을때
	}

	@Override
	public void printStudent() {
		
		int nSize = studentList.size();
		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균");
		
		for(int i = 0; i < nSize ; i++) {
			StudentVO vo = studentList.get(i);
			
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getDept() + "\t");
			System.out.print(vo.getGrade() + "\t");
			System.out.print(vo.getAddress() + "\t");
			
		}
		System.out.println("=".repeat(80));

	}

}
