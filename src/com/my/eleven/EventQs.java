package com.my.eleven;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 
public class EventQs {

	 Frame f = new Frame("ceshi");
	 Button ok = new Button("ok");
	 TextField tf = new TextField(30);
	 public void init(){
		 ok.addActionListener(new OkAction());
		 f.add(ok,BorderLayout.NORTH);
		 f.add(tf);
		 f.pack();
		 f.setVisible(true);
		 
		 
	 }
	 class OkAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("dianjiok");
			tf.setText("hello world!!!");
		}
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventQs().init();
	} 
}

