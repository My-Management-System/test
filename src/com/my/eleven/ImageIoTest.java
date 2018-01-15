package com.my.eleven;

import javax.imageio.ImageIO;

public class ImageIoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] read = ImageIO.getReaderFormatNames();
		System.out.println("can read is-----");
		for(String re:read){
			System.out.print(re+"  ");
		}
		String[] write = ImageIO.getWriterFormatNames();
		System.out.println("can write is-----");
		for(String w:write){
			System.out.print(w+"  ");
			
		}
	}

}
