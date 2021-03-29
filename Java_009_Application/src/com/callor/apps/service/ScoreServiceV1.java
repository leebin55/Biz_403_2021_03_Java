package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intTotal;
	float[] floatAvg;
	String[] stringName;
	
	public ScoreServiceV1() {
		intKor = new int[5];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];
		stringName = new String[intKor.length];
	}
	
	public void makeScore() {
		System.out.println("학생들의 각 과목 점수를 입력하세요");
		System.out.println(LineService.dLines(50));
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < intKor.length ; i++) {
			System.out.printf("%d번 학생의 국어점수 : ",i+1);
			intKor[i]= sc.nextInt();
			while(intKor[i]<0 || intKor[i]>100) {
			if(intKor[i] <0) {
				System.out.println("입력할수 없는 점수 입니다.");
				System.out.print("다시 입력하세요 : ");
				intKor[i] = sc.nextInt();
						
			}else if (intKor[i]>100) {
				System.out.println("입력할 수 없는 점수 입니다.");
				System.out.print("다시 입력하세요 : ");
				intKor[i] = sc.nextInt();
			}
			}
			System.out.printf("%d번 학생의 영어점수 : ",i+1);
			intEng[i]= sc.nextInt();
			while(intEng[i]<0 || intEng[i]>100) {
			if(intEng[i] <0 || intEng[i] >100) {
				System.out.println("입력할수 없는 점수 입니다.");
				System.out.print("다시 입력하세요 : ");
				intEng[i] = sc.nextInt();
						
			}
			}
			System.out.printf("%d번 학생의 수학점수 : ",i+1);
			intMath[i]= sc.nextInt();
			while(intMath[i]<0 || intMath[i]>100) {
			if(intMath[i] <0 || intMath[i]>100) {
				System.out.println("입력할수 없는 점수 입니다.");
				System.out.print("다시 입력하세요 : ");
				intMath[i] = sc.nextInt();
						
			}
			}
			System.out.println("");
		}
	}
	
	public void makeTotal() {
		for(int i = 0; i <intKor.length ; i++) {
			intTotal[i]= intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			floatAvg[i] = (float)intTotal[i]/3;
		}
	}
	
	public void makeName() {
		System.out.println("이름을 입력하세요");
		System.out.println("----------------------------------------------------");
		Scanner sc1 = new Scanner(System.in);
		for(int i = 0; i <intKor.length ; i++) {
			System.out.printf("%d번 학생의 이름 : ",i+1);
			stringName[i] = sc1.next(); 
			
		}
		
	}
	
	public void printList() {
		System.out.println("==================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------------");
		for(int i = 0; i <intKor.length ; i++ ) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%3.2f\n",i+1,stringName[i],intKor[i],intEng[i], intMath[i], intTotal[i],floatAvg[i]);
			
		}
		System.out.println("====================================================");
	}
}
