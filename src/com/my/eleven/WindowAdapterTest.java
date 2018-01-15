package com.my.eleven;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 

 
public class WindowAdapterTest {
 
	Frame f = new Frame("ceshi");
	TextArea ta = new TextArea(6,40);
	public void init(){
 		f.addWindowListener(new MyListener());
 		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	class MyListener extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.out.println("guanbi");
			System.exit(0);
		}
		
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new WindowAdapterTest().init();
	}

}
