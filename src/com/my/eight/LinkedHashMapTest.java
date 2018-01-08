package com.my.eight;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;


public class LinkedHashMapTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		/*LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("yuwen", 89);
		lhm.put("shuxue", 100);
		lhm.put("yingyu", 90);
	    lhm.forEach((key,value)->System.out.println(key+" ---> "+value));*/
		
		IdentityHashMap map = new IdentityHashMap();
		 map.put(new String("java"), "23");
		 map.put(new String("java"), "53");
		 System.out.println(map);
		 
		 
		

	}

}
