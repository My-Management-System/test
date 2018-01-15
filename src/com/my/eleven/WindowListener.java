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
			tx.append("窗口初次被打开");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			tx.append("用户关闭窗口");
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			tx.append("成功关闭窗口");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			tx.append("窗口最小化");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			tx.append("窗口被恢复");
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			tx.append("窗口被激活");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			tx.append("窗口失去焦点");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowListener().init();
	}

}
