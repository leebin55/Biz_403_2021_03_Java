package com.calloer.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_02 {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeForm = new SimpleDateFormat("hh:mm:ss");
		
		String curDate = dateForm.format(date);
		String curTime = timeForm.format(date);
		
		System.out.printf("오늘 날짜 : %s, 현재시각 : %s\n",curDate,curTime);
		/*
		 * 현재날짜와 시간을 가지고 문자열로 바꾸면 괜찮지만
		 * 그 날짜와 시간을 가지고 연산을 하려면 안된다.
		 */
	}
}
