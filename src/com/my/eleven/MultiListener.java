package com.my.eleven;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiListener {

	private Frame f = new Frame("≤‚ ‘");
	private TextArea ta = new TextArea(6,40);
	private Button b1 = new Button("anniu1");
	private Button b2 = new Button("anniu2");
	public void init(){
		FirstListener f1 = new FirstListener();
		b1.addActionListener(f1);
		b2.addActionListener(new SecondListener());
		f.add(ta);
		Panel p = new Panel();
		
		p.add(b1);
		p.add(b2);
		f.add(p,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
		
	}
	class FirstListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ta.append("diyigecufa"+e.getActionCommand()+"anniu");
		}
		
	}
	class SecondListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ta.append("dianjile"+e.getActionCommand()+"anniu");
		}
		
	}
	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultiListener().init();
	}

}
