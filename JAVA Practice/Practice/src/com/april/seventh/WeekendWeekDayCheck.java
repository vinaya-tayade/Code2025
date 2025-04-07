package com.april.seventh;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekendWeekDayCheck {
public static void main(String[] args) {
	LocalDate date=LocalDate.now();
	DayOfWeek day = date.getDayOfWeek();
	if(day==DayOfWeek.SATURDAY || day==DayOfWeek.SUNDAY) {
		System.out.println(day+" is a Weekend.");
	}else {
			
		
		System.out.println(day+" is a Weekday");
	}
	
}
}
