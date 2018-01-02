package com.my.test;

import java.util.Calendar;

public class LazyTest {
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(2018,01,31);
		cal.set(Calendar.DATE, 5);
		System.out.println(cal.getTime());
		
		cal.set(Calendar.MONTH, 1);
		System.out.println(cal.getTime());
	}
}
