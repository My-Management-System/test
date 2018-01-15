package com.my.eleven;

import java.awt.*;
import java.awt.event.WindowEvent;

public class WindowListener {
	Frame f = new Frame();
	TextArea tx = new TextArea();
	
	public void init(){
		f.addWindowListener(new MyListener());
		f.add(tx);
		f.pack();
		f.setVisible(true);
	}
	class MyListener implements java.awt.event.WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			tx.append("���ڳ��α���");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			tx.append("�û��رմ���");
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			tx.append("�ɹ��رմ���");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			tx.append("������С��");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			tx.append("���ڱ��ָ�");
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			tx.append("���ڱ�����");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			tx.append("����ʧȥ����");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowListener().init();
	}

}
