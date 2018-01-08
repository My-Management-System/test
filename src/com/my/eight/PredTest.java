package com.my.eight;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredTest {
	public static void main(String[] args){
		Collection books = new HashSet();
		books.add("java����");
		books.add("java�����");
		books.add("java helloworld");
		books.add("����ʯͷ");
		books.add("hello wodred");
		System.out.println(calAll(books,ell->((String)ell).contains("���")));
		System.out.println(calAll(books,ell->((String)ell).contains("java")));
		System.out.println(calAll(books,ell->((String)ell).length()<10));
		
		
	}
	public static int calAll(Collection books,Predicate p){
		
		int total = 0;
		for(Object obj:books)
		{
			if(p.test(obj))
			{
				total++;
			}
		}
		return total;
	}
}
