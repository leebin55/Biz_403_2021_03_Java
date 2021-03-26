package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	int[] intKor;
	int[] intEng;
	int[] intMath;

	int[] intTotal;
	float[] floatAvg;
	int[] intRank;

	public ScoreServiceV1() {
		intKor = new int[5];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];
		intRank = new int[intKor.length];
	}

	public void makeScroe() {
		System.out.println("학생들의 각 과목 점수를 입력하세요");
		System.out.println(LinesService.dLines(50));
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < intKor.length; i++) {
			System.out.println((i + 1) + "번 학생의 점수를 입력하세요");
			System.out.print("국어 점수 : ");
			intKor[i] = scan.nextInt();
			System.out.print("영어 점수 : ");
			intEng[i] = scan.nextInt();
			System.out.print("수학 점수 : ");
			intMath[i] = scan.nextInt();
			System.out.println("");
		}
	}

	public void makeTotal() {
		for (int i = 0; i < intKor.length; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];

			floatAvg[i] = (float) intTotal[i] / 3;

		}
	}

	public void printScore() {
		System.out.println(LinesService.dLines(50));
		System.out.println("학생들의 점수");
		System.out.println("");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println(LinesService.dLines(50));
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%3d번\t%3d\t%3d\t%3d\t%3d\t%3.2f\n", i + 1, intKor[i], intEng[i], intMath[i],
					intTotal[i], floatAvg[i]);

		}
	}

	public void makeRanking() {

		for (int i = 0; i < intKor.length; i++) {
			for (int j = i; j < intKor.length; j++) {
				if (intTotal[i] < intTotal[j]) {
					intRank[i]++;
				}
			}
		}

	}

	public void makeDesc() {
		int temp = 0;
		for (int i = 0; i < intKor.length; i++) {
			for (int j = i; j < intKor.length; j++) {
				if (intTotal[i] < intTotal[j]) {
					temp = intTotal[i];
					intTotal[i] = intTotal[j];
					intTotal[j] = temp;

				}

			}

		}
	}
}