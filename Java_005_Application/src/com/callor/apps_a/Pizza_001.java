package com.callor.apps_a;

import java.util.Random;

public class Pizza_001 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int pizzaPcs = 0;
		int pizzaBox = 0;
		pizzaPcs = 6;
		
		
		int intMembers = rnd.nextInt(26)+25;
		if(intMembers % pizzaPcs ==0) {
			pizzaBox = intMembers / pizzaPcs;
			
		}else {
			pizzaBox = (intMembers / pizzaPcs )+ 1;
			
		}
		System.out.printf("학생수 : %d ,피자 판 : %d",intMembers, pizzaBox);
	}
}
