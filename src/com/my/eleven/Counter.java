package com.my.eleven;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Counter implements ActionListener {
	private Frame f = new Frame("¼ÆËãÆ÷");
	String[] names = new String[]{"1","2","3","4","5","6","7","8","9","0","+","-","*","/",".","="};
 	Button b[] = new Button[16];
	private TextField tx = new TextField(30);
	FlowLayout flowlay = new FlowLayout();
	Panel  p1 = new Panel();
	Panel  p2 = new Panel();
    boolean isflag =false;
    String contens ="";
    String contena ="";
    String contenb="";
    int contint;
    int inta;
    int intb;
	public void init(){
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		p1.add(tx);
		p2.setLayout(new GridLayout(4,5,4,4));
		
		 
		for(int i =0;i<names.length;i++){
			  b[i] = new Button(names[i]);
			  p2.add(b[i]); 
			  b[i].addActionListener(this);
			 
		} 
		
		f.add(p1, BorderLayout.NORTH);
		f.add(p2, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Counter().init();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String actionCommand = e.getActionCommand();
		//System.out.println(actionCommand);
		if(actionCommand.equals("+")){
			contenb = contena;
			contena ="";
			
		}else if(actionCommand.equals("=")){
			
			inta =  Integer.parseInt(contena);
			intb = Integer.parseInt(contenb);
			contint =inta+intb;
			contens = contint+"";
			tx.setText(contens);
			contena="";
			contenb="";
			contens="";
			contint=0;	
			inta=0;
			intb=0;
			
		}else{
			contena = contena+actionCommand;
			tx.setText(contena);
			
			
		}
		System.out.println(contint);
		
	}

}
