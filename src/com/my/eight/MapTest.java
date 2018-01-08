package com.my.eight;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
class ATest{
	
	int count;
	public ATest(int count){
		this.count = count;
	}
	public boolean equals(Object obj){
		
		if(obj == this){
			return true;
		}if(obj!=null && obj.getClass() == ATest.class){
			ATest a = (ATest)obj;
			return this.count == a.count;
		}
		return false;
		
	}
	public int hashCode(){
		
		return this.count;
	}
}
class BTest{
	 
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Map map = new HashMap();
		map.put("1", "java");
		map.put("2","c");
		map.put("3","c++");
		System.out.println(map);
		map.put("2", "hello");
		System.out.println(map);
		System.out.println(map.containsKey("5"));
		System.out.println(map.containsValue("java"));
		for(Object key:map.keySet()){
			System.out.println(key+"  "+map.get(key));
		}
		map.remove("2");
		System.out.println(map);*/
		
		/*Hashtable ht = new Hashtable();
		ht.put(new ATest(5), "java");
		ht.put(new ATest(9),"C");
		ht.put(new ATest(0), new BTest());
		System.out.println(ht);
		System.out.println(ht.containsValue("hello"));
		System.out.println(ht.containsKey(new ATest(9)));
		ht.remove(new ATest(0));
		System.out.println(ht);*/
		
		HashMap hm = new HashMap();
		hm.put(new ATest(1), "java");
		hm.put(new ATest(2), "hello");
		Iterator it = hm.keySet().iterator();
		ATest  at = (ATest)it.next();
		at.count = 2;
		System.out.println(hm);
		hm.remove(new ATest(2));
		System.out.println(hm);
	
	}

}

