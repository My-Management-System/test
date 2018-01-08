package com.my.eight;

import java.util.LinkedList;
import java.util.List;

public class PracticeEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new LinkedList();
		list.add(-1);
		list.add(5);
		list.add(-5);
		list.add(0);
		list.add(8);
		System.out.println(list);
		System.out.println(list.get(4));
		list.remove(list.get(2));
		System.out.println(list);
	}

}
