package com.my.test;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
 

	 
	public static void main(String[] args)
	{
		
		Calendar calendar =  Calendar.getInstance();
		Date date = calendar.getTime();
		//System.out.println(date);
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(date);
		System.out.println(date); 
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		
		c.add(Calendar.YEAR, -1);
		System.out.println(c.getTime());
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.MONTH, 13);
		System.out.println(c1.getTime());
		c1.setLenient(false);
		//c1.set(Calendar.MONTH, 13);
		//System.out.println(c1.getTime());
		
		
	}
}
