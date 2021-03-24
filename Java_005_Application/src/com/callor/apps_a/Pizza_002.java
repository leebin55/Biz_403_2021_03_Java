package com.callor.apps_a;

import java.util.Random;

public class Pizza_002 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int pizzaPcs =0;
		pizzaPcs = 6;
		int pizzaBox = 0;
		int intMembers = rnd. nextInt(26)+1;
		
		pizzaBox =intMembers / pizzaPcs ;
		
		boolean bYes =intMembers % pizzaPcs ==0;
		if(!bYes) {
			pizzaBox++;
			
		}
		System.out.printf("학생수 : %d ,피자 판 : %d",intMembers, pizzaBox);
	}
}
