package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriterEx_01 {
	
	public static void main(String[] args) {
		/*
		 * eClipse 를 사용하여 프로젝트 만들었을 때
		 * 
		 * Project 의 소스코드가 저장되는 곳은 
		 * Project/src 폴더 이후에 패키지 이름으로 만들어짐
		 * 새로운 파일을 만들기 위해서
		 * src/package-name 폴더를 지정하는데
		 * 오타 방지를 위해 Copy Qualified 를 사용하여 임의 파일이름을 가져오고
		 * 필요한 파일
		 * 
		 * 로 이름을 변경하여 사용
		 */
		String fileName = "src/com/callor/app/data1.txt";//
		Random rnd = new Random();
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		//2개의 난수로 4칙연산을 수행
		// 뺄셈과 나눗셈은 반드시 큰수 - 작은수, 큰수 / 작은수
		if(num1 < num2 ) { //두개의 수를 비교해서 큰수가 앞으로 
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int sum = num1 + num2;
		int minus = num1 - num2;
		int times = num1 * num2;
		int div = num1 /num2;
		/* 
		 * 파일 file 과 관련된 클래스를 사용할 때는 객체 선언과 생성문을 분리하여 작성!!!(추천)
		 */
		
		//FileWriter와 PrintWriter를 객체로 선언
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		//객체 생성
		//FileWriter 클래스를 객체로 생성할 때 만들 (작성할, 새로 생성할) 파일이름 (경로포함)을 생성자 매개변수로 전달 해 주어야 함
		try {
			//FileWriter 클래스의 객체만으로도 파일에 기록할 수 있지만 
			//복잡하고, 불편한 코드를 만들어야 함
			// >> PrintWriter 클래스의 객체를 FileWriter클래스의 객체와 연결하여
			// 		System.out 의 print 관련 method와 똑같은 방법으로 파일에 text를 저장
			
			/*
			 * OS(운영체제) <-> FileWriter 연결
			 * 데이터를 파일에 기록
			 */
			fileWriter = new FileWriter(fileName); //파일이 만들어져서 기록되기를 기다리는 상태
			//파일이 열려있는 상태 가급적이면 코드 많이 쓰지 말지
			out = new PrintWriter(fileName);//연결의 연결 pipe line
			out.printf("%d + %d = %d\n",num1,num2,num1 + num2);
			out.printf("%d - %d = %d\n",num1,num2,num1 - num2);
			out.printf("%d * %d = %d\n",num1,num2,num1 * num2);
			out.printf("%d / %d = %d\n",num1,num2,num1 / num2);
			
			out.flush();
			out.close();
			
			System.out.println("작업완료");
			
			//PrintWriter 를 닫으면 FileWriter도 같이 닫히기 때문에
			//일부러 close 하지 않아도 무방
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace(); >> exception 발생하면 여기서 끝남
			System.out.println(fileName + "파일을 생성할 수 없음");
		}
	}
}
