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
public class StudentServiceImplV1A implements StudentService {
	// 클래스영역에 선언할 때 private 이나 상속할 예정이면 protected
	protected List<StudentVO> studentList;
	protected String studentFile;
	
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 반 = 3;
	protected final int 학과 = 4;
	protected final int 주소 = 5;
/* 
 * 매개변수 있는 생성자 , 매개변수 없는 생성자
 * 호출할때 선택해서 가능
 * 
 *	new StudentSerciveImplV1() 생성자를 호출하여 객체를 생성하려고 하면
 *	고정된 파일 이름("src/com/callor/score/student.txt")을 사용하여 파일을 읽을 수 있도록
 *
 *	생성자에서 new StudentServiceImplV1A("파일명") 의 생성자 method를 다시 호출하는 구조
 */
	public StudentServiceImplV1A() { //처음에 이 생성자가 호출됨 
		/* 
		 * 여기에서 다음의 생성자 메서드를 또 한번 호출  this
		 * new StudentServiceImplV1A("src/com/callor/score/student.txt");
		 */
		this("src/com/callor/score/student.txt"); //""안에 문자열을 this 에 
		//this가 누구?? 자신과 이름이 같은 또다른 생성자 문자열의 매개변수를 가지는 
		//생성자에게 전달
	}

	public StudentServiceImplV1A(String fileName) {
		this.studentFile = fileName; //생성자에서 파일이름을 전달받아
		studentList = new ArrayList<StudentVO>();
		//studentList가 생성된 다음에 호출!!!!!반드시 중요
		//클래스를 객체로 생성할 때 method 를 호출하여 데이터를 사용하도록 준비해 달라
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
				
				//Debugging code!!!!!
				System.out.println(studentVO.toString());
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printStudent() {
		// nSize 변수를 따로 만든 이유: for문이 반복될때마다 studentList의 size를 세는
		// 연산이 계속 진행 >> 비효율적
		/*
		 * 배열 사용할때
		 * for() 반복문을 구현할때 배열.length 속성을 직접 반복문 조건으로 설정
		 * 
		 * List 사용할때
		 * List의 특성상 데이터 갯수가 수시로 변경되기 때문에 List에 담긴 데이터 개수를 다시
		 * 세는 코드가 실행
		 * 
		 * for()반복문 내에서 i <List.size() 를 사용하면 for 문이 반복된느 동안 
		 * 계속해서 갯수를 헤아리게 됨
		 * 데이터 갯수가 많아지면 성능이 떨어짐 >> 비효율적
		 * 
		 * list 전체를 for() 반복문을 사용할때는 size() 값을 int 형 변수에 담아놓고 시작
		 */
		int nSize = studentList.size();
		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t학과\t학년\t주소");
		
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
