package com.my.eleven;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionListener;

public class CardLayoutTest {
	Frame f = new Frame("���Դ���");
	Dialog d1 = new Dialog(f,"ģʽ�Ի���",true);
	Dialog d2 = new Dialog(f,"��ģʽ�Ի���",false);
	Button b1 = new Button("��ģʽ�Ի���");
	Button b2 = new Button("�򿪷�ģʽ�Ի���");
	
	public void init(){
		 d1.setBounds(30,40,300,400);
		 d2.setBounds(30,40,300,400);
		 b1.addActionListener(e -> d1.setVisible(true));
		 b2.addActionListener(e -> d2.setVisible(true));
		 f.add(b1);
		 f.add(b2,BorderLayout.NORTH);
		 f.pack();
		 f.setVisible(true);
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CardLayoutTest().init();
	}

}