package com.my.nine;

import java.util.ArrayList;
import java.util.List;

public class Canvas  {
	public void drawAll(List<? extends Shape> shapes){
		for(Shape s:shapes){
			s.draw(this);
		}
	}
	
	public static void main(String[] args){
		List<Circle> cirlist = new ArrayList<>();
		Canvas c = new Canvas();
		c.drawAll(cirlist);
	}
	public void addRectangle(List<? extends Shape> shapes){
		
		//shapes.add(0,new Rectangle());
	}
}
