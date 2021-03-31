package com.calloer.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_01 {
	
	public static void main(String[] args) {
		
		// 컴퓨터의 내장된 시계로 부터
		//현재 날짜 시간 데이터를 읽어와서 
		//today 객체로 만들기
		Date today = new Date();
		
		// today 객체를 문자열로 변환시키기위한 보조클래스
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");//MM 대문자 : 월
		
		String curDate = dateForm.format(today);//날짜값을 문자값으로 바꿔서
		
		System.out.println(curDate);
		
		SimpleDateFormat timeForm = new SimpleDateFormat("hh:mm:ss");//mm을 대문자로 쓰면 month
		
		
		String curTime = timeForm.format(today);
		System.out.println(curTime);
		
		timeForm = new SimpleDateFormat("HH:mm:ss");//hh : 12시간대 HH : 24시간대
		System.out.println(timeForm.format(today));
		
	}

}
