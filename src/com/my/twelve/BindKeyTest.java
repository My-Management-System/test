package com.my.twelve;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class BindKeyTest {
	JFrame jf = new JFrame("≤‚ ‘º¸≈Ã∞Û∂®");
	JTextArea jta = new JTextArea(20,30);
	JButton jbutton = new JButton("∑¢ÀÕ");
	JTextField jtf = new JTextField(15);
	
	public void init(){
		jf.add(jta);
		JPanel jp = new JPanel();
		jp.add(jtf,BorderLayout.WEST);
		jp.add(jbutton,BorderLayout.EAST);
		jf.add(jp,BorderLayout.SOUTH);
		
		Action sendMsg = new AbstractAction() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jta.append(jtf.getText());
				jtf.setText("");
			}
		};
		jbutton.addActionListener(sendMsg);
		jtf.getInputMap().put(KeyStroke.getKeyStroke('\n',InputEvent.CTRL_MASK),"send" );
		jtf.getActionMap().put("send", sendMsg);
		jf.pack();
		jf.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BindKeyTest().init();
	}

}
