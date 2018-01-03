package com.my.test;

import java.util.Locale;

public class LocalList {
	public static void main(String[] args){
		
		Locale[] localelist = Locale.getAvailableLocales();
		for(int i=1;i<=localelist.length;i++)
		{
			System.out.println(localelist[i].getDisplayCountry()+"="
								+localelist[i].getCountry()+"  "
								+localelist[i].getDisplayLanguage()+"="
								+localelist[i].getLanguage());
			
		}
	}

}
