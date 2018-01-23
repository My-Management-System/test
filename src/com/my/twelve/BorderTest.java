package com.my.twelve;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

 
public class BorderTest {

	private JFrame jf = new JFrame("≤‚ ‘±ﬂøÚ");
	public void init(){
		jf.setLayout(new GridLayout(2, 4));
		Border bb = BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.red,Color.GRAY,Color.GREEN,Color.BLUE);
		jf.add(getPanleWithBorder(bb,"bevelBorder"));
		
		Border bl = BorderFactory.createLineBorder(Color.ORANGE,10);
		jf.add(getPanleWithBorder(bl, "LINEBORDER"));
		
		jf.pack();
		jf.setVisible(true);
		
		
	}
	private JPanel getPanleWithBorder(Border bb, String borderName) {
		// TODO Auto-generated method stub

		JPanel jp = new JPanel();
		jp.add(new JLabel(borderName));
		jp.setBorder(bb);
		return jp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderTest().init();
	}

}
