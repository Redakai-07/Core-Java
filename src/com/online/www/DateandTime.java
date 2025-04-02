package com.online.www;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateandTime {

	public static void main(String[] args) {
		LocalDate l=LocalDate.now();
		System.out.println(l);
		LocalTime t=LocalTime.now();
		System.out.println(t);
		System.out.println("*********************");
		int d=l.getDayOfMonth();
		int m=l.getMonthValue();
		int y=l.getYear();
		System.out.printf("%d-%d-%d",d,m,y);
		System.out.println();
		System.out.println("**********************");
		System.out.println("Day of Month:"+l.getDayOfMonth());
		System.out.println("Day of Year:"+l.getDayOfYear());
		System.out.println("Day of Week:"+l.getDayOfWeek());
		System.out.println("**********************");
		int h=t.getHour();
		int mi=t.getMinute();
		int s=t.getSecond();
//		int n=t.getNano();
		System.out.printf("%d:%d:%d",h,mi,s);
		System.out.println();
		System.out.println("*********************");
		
		System.out.println("Using DateTime Method");
		LocalDateTime o=LocalDateTime.now();
		int d1=o.getDayOfMonth();
		int m1=o.getMonthValue();
		int y1=o.getYear();
		System.out.printf("%d-%d-%d",d1,m1,y1);
		System.out.println();
		System.out.println("**********************");
		System.out.println("Day of Month:"+o.getDayOfMonth());
		System.out.println("Day of Year:"+o.getDayOfYear());
		System.out.println("Day of Week:"+o.getDayOfWeek());
		System.out.println("**********************");
		int h1=o.getHour();
		int mi1=o.getMinute();
		int s1=o.getSecond();
//		int n=t.getNano();
		System.out.printf("%d:%d:%d",h1,mi1,s1);
	}

}
