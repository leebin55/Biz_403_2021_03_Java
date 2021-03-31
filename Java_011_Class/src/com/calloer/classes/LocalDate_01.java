package com.calloer.classes;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDate_01 {

	public static void main(String[] args) {
		
		/*
		 * java1.8 부터 사용할 수 있는 새로운 날짜 관련 클래스
		 * 
		 * 기존에 Date, Calendar 클래스가 있는데 
		 * 날짜와 관련된 많은 이슈가 발생
		 * 
		 * java1.8 부터 새로운 날짜 시간과 관련된 코딩을 할 때 사용하는
		 * 클래스가 만들어짐
		 */
		LocalDateTime local = LocalDateTime.now();
		
		System.out.println(local.toString());
		System.out.println(local.getDayOfMonth());//오늘이 이달에 몇일인가
		System.out.println(local.getDayOfYear());
		System.out.println(local.getDayOfWeek());//오늘 요일

		System.out.println(local.plusDays(20));//지금부터 20일 후
		System.out.println(local.minusDays(10));//10일 전
		
		System.out.println(local.plusMonths(2)); //2달후
		System.out.println(local.plusMonths(1));
		
		//올해 첫날이 몇일 이냐
		System.out.println(local.with(TemporalAdjusters.firstDayOfYear()));
		
		System.out.println(local.with(TemporalAdjusters.firstDayOfMonth()));
		
		System.out.println(local.with(TemporalAdjusters.lastDayOfMonth()));//달의 마지막날
		//오늘 부터 3일 후가 포함된 달의 마지막 날
		System.out.println(local.plusDays(3).with(TemporalAdjusters.lastDayOfMonth())); 
		
		
	}
}
