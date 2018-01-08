package com.my.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] books = {"java","c","c++"};
		List list = new ArrayList();
		for(int i=0;i<books.length;i++){
			list.add(books[i]);
		}
		ListIterator lit = list.listIterator();
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		System.out.println("----fanxiangdiedai-----");
		while(lit.hasPrevious())
		{
			
			System.out.println(lit.previous());
		}
	}
	

}
