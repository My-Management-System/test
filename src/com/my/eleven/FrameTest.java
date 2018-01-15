package com.my.eleven;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextField;
  
public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame fm = new Frame("²âÊÔ´°¿Ú");
		 //Panel  p = new Panel();
		 
		ScrollPane sp  = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		sp.add(new TextField(200));
		sp.add(new Button("µ¥»÷ÎÒ"));
		fm.add(sp);
	    fm.setBounds(100, 100, 250, 300);
		fm.setVisible(true); 
		//System.exit(1);
		
	}

}
