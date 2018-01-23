package com.my.twelve;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;

import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class HandDraw {
	private final int AREA_WIDTH = 500;
	private final int AREA_HEIGHT = 400;
	private int preX = -1;
	private int preY = -1;
	JPopupMenu jpm = new JPopupMenu();
	JMenuItem chooseColor = new JMenuItem("选择颜色");
	BufferedImage buffimage = new BufferedImage(AREA_WIDTH, AREA_HEIGHT, BufferedImage.TYPE_INT_ARGB);
	Graphics g  = buffimage.getGraphics();
	private JFrame jf = new JFrame("简单手绘程序");
	private DrawCanvas drawCanvas = new DrawCanvas();
	
	private Color foreColor = new Color(255, 0, 0);
	
	public void init(){
		chooseColor.addActionListener(ele ->{
			
			final JColorChooser  colorPane = new JColorChooser(foreColor);
			JDialog jd = JColorChooser.createDialog(jf, "选择画笔颜色", false, colorPane, e->foreColor=colorPane.getColor(), null);
			jd.setVisible(true);
		});
		
		jpm.add(chooseColor);
		drawCanvas.setComponentPopupMenu(jpm);
		g.fillRect(0, 0, AREA_WIDTH, AREA_HEIGHT);
		drawCanvas.setPreferredSize(new  Dimension(AREA_WIDTH, AREA_HEIGHT));
		//监听鼠标移动事件
		drawCanvas.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e){
				if(preX>0 && preY>0){
					g.setColor(foreColor);
					g.drawLine(preX, preY, e.getX(), e.getY());
				}
				preX = e.getX();
				preY = e.getY();
				drawCanvas.repaint();
			}
		});
		//监听鼠标事件
		drawCanvas.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e){
				preX =-1;
				preY =-1;
			}
		});
		jf.add(drawCanvas);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	
	class DrawCanvas extends JPanel{
		public void pain(Graphics g){
			g.drawImage(buffimage, 0, 0, null);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HandDraw().init();
	}

}
