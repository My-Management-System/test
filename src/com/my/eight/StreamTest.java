package com.my.eight;

import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args){
		
		IntStream is =  (IntStream) IntStream.builder()
				        .add(20)
				        .add(30)
				        .add(-1)
				        .add(-3)
				        .add(10);
		System.out.print(is.max().getAsInt());
		System.out.print(is.min().getAsInt());
		System.out.print(is.sum());
		System.out.print(is.average());
		
		
	}
}
