package com.my.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpre {
	public static void main(String[] args)
	{
		String s1 = "hello ,java!";
		System.out.println(s1.replaceFirst("\\w*?", "a"));
		
		Pattern p = Pattern.compile("\\w");
		Matcher m = p.matcher("1212");
		boolean b = m.matches();
		System.out.println(b);
		
		
		
		
	}

}
