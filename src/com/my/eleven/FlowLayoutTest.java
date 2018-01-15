package com.my.eleven;

import java.awt.BorderLayout;
import java.awt.Button;
 import java.awt.Frame;

public class FlowLayoutTest {

 

	public static void main(String[] args){
		/*Frame f = new Frame("²âÊÔ´°¿Ú");
		f.setLayout(new FlowLayout(FlowLayout.LEFT,20,5));
		for(int i =0;i<=10;i++){
			f.add(new Button("°´Å¥"+i));
		}
		f.pack();
		f.setVisible(true);*/
		Frame f = new Frame("²âÊÔ´°¿Ú");
		f.setLayout(new BorderLayout(30,15));
		f.add(new Button("dong"), BorderLayout.EAST);
		f.add(new Button("nan"), BorderLayout.SOUTH);
		f.add(new Button("xi"), BorderLayout.WEST);
		f.add(new Button("bei"), BorderLayout.NORTH);
		f.add(new Button("zhong"), BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
		
	}
}
