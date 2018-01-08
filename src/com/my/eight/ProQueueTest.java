package com.my.eight;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;

 
public class ProQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*PriorityQueue pq = new PriorityQueue();
		pq.add(3);
		pq.add(-1);
		pq.add(-6);
		pq.add(2);
	
		System.out.println(pq);
		System.out.println(pq.poll());*/
		
		/*ArrayDeque arrd = new ArrayDeque();
		arrd.push("java");
		arrd.push("c");
		arrd.push("c++");
		System.out.println(arrd);
		System.out.println(arrd.peek());
		System.out.println(arrd.pop());
		System.out.println(arrd);*/
		
		LinkedList ll = new LinkedList();
		ll.offer("java");
		ll.offer("c++");
		ll.push("c");
		System.out.println(ll);
		
	}

}
