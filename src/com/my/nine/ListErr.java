package com.my.nine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListErr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	List<String> strList = new ArrayList<>();
		strList.add("java");
		strList.add("ccc");
 		strList.forEach((str)->System.out.println(str));
 		
 		Map<String,List<String>> schoolInfo = new HashMap<>();
 		List<String> schools = new ArrayList<>();
 		schools.add("qinghua");
 		schools.add("beida");
 		schoolInfo.put("sunwukong", schools);
 		schoolInfo.forEach((key,value)->System.out.println("key is "+key+" value is "+value));
	*/
		List c = new ArrayList();
		c.add(1);
		c.add(5);
		test(c);
	
	}
 public static void test(List c){
		 for(int i=0;i<c.size();i++){
			 
			 System.out.println(c.get(i));
		 }
		 
	 }

}
