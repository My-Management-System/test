package com.my.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {
	public static void main(String[] args) throws ParseException{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("Gyyyy年中的第M月第D天");
		String strdate = sdf.format(d);
		System.out.println(strdate);
		String str = "18###一月##21";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy###MMM##dd");
		System.out.println(sdf1.parse(str));
		
		
	}

}
