package com.my.eight;

import java.util.HashSet;

public class HashSetTest {
	
	public static void main(String[] args){
		HashSet hs = new HashSet();
		hs.add(new A());
		hs.add(new A());
		hs.add(new B());
		hs.add(new B());
		hs.add(new C());
		hs.add(new C());
		System.out.println(hs);
		
	}
}
class A{
	public boolean equals(Object obj)
	{
		return true;
	}
	
}
class B{
	public int hashCode()
	{
		return 1;
	}
	
}
class C{
	
	public boolean equals(Object obj)
	{
		return true;
	}
	public int hashCode()
	{
		return 2;
	}
}