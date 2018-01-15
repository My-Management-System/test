package com.my.eleven;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
public class MailerListener extends WindowAdapter implements ActionListener{
	
	private TextField mailAdress;
	public MailerListener(){}
	public MailerListener(TextField mailAdress){
		this.mailAdress = mailAdress;
	}
	public void setMailAdress(TextField mailAdress){
		this.mailAdress = mailAdress;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("xiang "+mailAdress.getText()+"fasongyoujian");
	}
 
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	 
	
	

}
