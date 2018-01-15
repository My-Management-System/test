package com.my.eleven;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class SimpleDraw {

	private Frame f = new Frame("huatu");
	private String RECT_SHAPE = "rect";
	private String OVAL_SHAPE = "oval";
	private Button rect = new Button("r");
	private Button oval = new Button("o");
	private String shape = "";
	private MyCanvas mycanvas = new MyCanvas();
	
	public void init(){
		Panel p = new Panel();
		rect.addActionListener(e -> {
			shape = RECT_SHAPE;
			mycanvas.repaint();
			
		});
		oval.addActionListener(e ->{
			
			shape = OVAL_SHAPE;
			mycanvas.repaint();
		});
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		p.add(rect);
		p.add(oval);
		mycanvas.setPreferredSize(new Dimension(500, 500));
		f.add(mycanvas);
		f.add(p,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	
	class MyCanvas extends Canvas{
		public void paint(Graphics g){
			Random rm = new Random();
			if(shape.equals(RECT_SHAPE)){
				g.setColor(new Color(220, 100, 80)); 
				g.drawRect(rm.nextInt(200), rm.nextInt(120), 40, 50);
			}
			if(shape.equals(OVAL_SHAPE)){
				g.setColor(new Color(80, 100, 220));
				//g.drawOval(rm.nextInt(200), rm.nextInt(120), 50, 40);
			    g.fillOval(rm.nextInt(200), rm.nextInt(120), 50, 40);
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleDraw().init();
	}

}
