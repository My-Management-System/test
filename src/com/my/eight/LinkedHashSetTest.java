package com.my.eight;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetTest {
	public static void main(String[] args){
		
		/*LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("java");
		lhs.add("c");
		lhs.add("c++");
		System.out.println(lhs);
		lhs.remove("java");
		lhs.add("java");
		System.out.println(lhs);*/
		TreeSet tree = new TreeSet();
		tree.add(5);
		tree.add(0);
		tree.add(3);
		tree.add(-1);
		tree.add(2);
		System.out.println(tree);
		System.out.println(tree.headSet(2));
		System.out.println(tree.tailSet(4));
		System.out.println(tree.subSet(-1, 1));
		
	}
}
 
