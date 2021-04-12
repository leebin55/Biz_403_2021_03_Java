package com.callor.app.service;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriterEx_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		String fileName = "src/com/callor/app/data.txt";
		int intNum1 = rnd.nextInt(101);
		int intNum2 = rnd.nextInt(101);
		FileWriter fileWriter= null;
		PrintWriter out= null;
		
		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileName);
			out.println("=".repeat(50));
			out.printf("%d + %d = %d\n", intNum1,intNum2, intNum1 + intNum2);
			if(intNum1 < intNum2 ) { 
				out.printf("%d - %d = %d\n", intNum2,intNum1, intNum2 - intNum1);
			}else {
			out.printf("%d - %d = %d\n", intNum1,intNum2, intNum1 - intNum2);}
			out.printf("%d * %d = %d\n", intNum1,intNum2, intNum1 * intNum2);
			if(intNum1 < intNum2) {
				out.printf("%d + %d = %d\n", intNum2,intNum1, intNum2 / intNum1);
			}
			out.println("-".repeat(50));
			
			out.flush();
			out.close();
			
		} catch (IOException e) {
			System.out.println("파일을 만들수 없음");
		}
		
	}
}
