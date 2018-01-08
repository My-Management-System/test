package com.my.eight;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class CollectionTest {
	public static void main(String[] args){
		
		Collection c =new ArrayList();
		c.add("java");
		c.add("c");
		c.add("c++");
		c.add("a");
		
		c.removeIf(ell->((String)ell).length()<2);
		System.out.println(c);
		/*c.forEach(obj->System.out.println(obj));
		
		Iterator it = c.iterator();*/
	
		/*while(it.hasNext())
		{
			String book = (String) it.next();
			System.out.println(book);
			if(book.equals("java"))
			{
				it.remove();
			}
			book = "helloworld";
		}*/
		//it.forEachRemaining(obj->System.out.println(obj)); 
	}
}
