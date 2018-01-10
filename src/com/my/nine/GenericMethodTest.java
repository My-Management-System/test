package com.my.nine;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodTest {
	
	static <T> void fromArrayToCollection(T[] a,Collection<T> c){
		for(T o:a){
			c.add(o);
		}
		System.out.println(c);
	}
	public static void main(String[] args){
		Object[] oa = new Object[10];
		Collection<Object> co = new ArrayList<>();
		fromArrayToCollection(oa,co);
		
		
		
	}

}
