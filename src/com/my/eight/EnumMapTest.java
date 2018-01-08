package com.my.eight;

import java.util.EnumMap;

enum Season1
{
	
	SPRING,SUMMER,FALL,WINTER
}
public class EnumMapTest{ 
   

	public static void main(String[] args){
		EnumMap em = new EnumMap(Season1.class);
		em.put(Season1.SPRING,"123");
		em.put(Season1.SUMMER,"223");
		
		System.out.println(em);
		
		
	}
 
}