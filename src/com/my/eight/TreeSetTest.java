package com.my.eight;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TreeSet set = new TreeSet();
		Z z1 = new Z(6);
		set.add(z1);
		System.out.println(set.add(z1));
		System.out.println(set);
		((Z)(set.first())).age = 9;
		System.out.println(((Z)(set.last())).age);*/
		TreeSet ts = new TreeSet((o1,o2)->
		{
			
			M m1 = (M)o1;
			M m2 = (M)o2;
			return m1.age>m2.age?-1:m1.age<m2.age?1:0;
		});
		ts.add(new M(1));
		ts.add(new M(5));
		ts.add(new M(9));
		System.out.println(ts);
	}

}

class M{
	
	int age;
	public M(int age){
		this.age = age;
	}
	public	String toString(){
		return "M[age :"+age+"]";
	}
}



class Z implements Comparable{
	
	int age;
	public Z(int age){
		this.age = age;
	}
	public boolean equals(Object obj){
		return true;
	}
	public int compareTo(Object obj){
		return 1;
	}
}
