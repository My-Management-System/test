package com.my.eight;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

enum Season{
	
	SPRING,SUMMER,FALL,WINTER
}
public class EnumSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*EnumSet es = EnumSet.allOf(Season.class);
		System.out.println(es);
		EnumSet es1 = EnumSet.noneOf(Season.class);
		System.out.println(es1);
		es1.add(Season.WINTER);
		es1.add(Season.SPRING);
		System.out.println(es1);*/
		Collection c = new HashSet();
		c.clear();
		c.add(Season.SPRING);
		c.add(Season.FALL);
		EnumSet es = EnumSet.copyOf(c);
		System.out.println(es);
		/*c.add("hello");
		c.add("world");
		es = EnumSet.copyOf(c);*/
	}

}

