package com.my.eleven;

import java.awt.*;

public class SendMailer {
	Frame f = new Frame("fayoujian");
	TextField tf = new TextField(40);
	Button send = new Button("fasong");
	public void init(){
		send.addActionListener(new MailerListener(tf));
		f.addWindowListener(new MailerListener());
		f.add(tf);
		f.add(send,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args){
		new SendMailer().init();
	}

}
