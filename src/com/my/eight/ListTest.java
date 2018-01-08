package com.my.eight;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println(list);
		list.add(1, "abc");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+"  ");		
		}
		list.remove(2);
		System.out.println(list);
		System.out.println(list.indexOf("aaa"));
		list.set(1, "bbb");
		System.out.println(list.subList(1, 2));
	
		List books = new ArrayList();
		books.add("abcdefg");
		books.add("abc");
		books.add("abcd");
		books.add("a");
		books.add("aaaaaaaaaaa");
		books.sort((o1,o2)->((String)o1).length()-((String)o2).length());
		System.out.println(books);
		books.replaceAll(ele->((String)ele).length());
		System.out.println(books);
		

	}

}
