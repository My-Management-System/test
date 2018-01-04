package com.my.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class NewFormatterTest {
	public static void main(String[] args){
		
		DateTimeFormatter[] dtf = new DateTimeFormatter[]{
			DateTimeFormatter.ISO_LOCAL_DATE,
			DateTimeFormatter.ISO_LOCAL_TIME,
			DateTimeFormatter.ISO_LOCAL_DATE_TIME,
			
			DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.MEDIUM),
			DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
			DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")
		 };
		LocalDateTime ldt = LocalDateTime.now();
		for(int i=0;i<dtf.length;i++){
			System.out.println(ldt.format(dtf[i]));
			//System.out.println(dtf[i].format(ldt));
			
		}
		newFormatterParse();
	}
	
	public static void newFormatterParse(){
		
		String str = "2018==01==04 09时36分25秒";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy==MM==dd HH时mm分ss秒");
		LocalDateTime ldt = LocalDateTime.parse(str, dtf);
		System.out.println(ldt);

	}

}
