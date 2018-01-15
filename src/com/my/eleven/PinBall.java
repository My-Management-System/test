package com.my.eleven;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.Timer;
 
 
public class PinBall {

	private final int TABLE_WIDTH = 300;
	private final int TABLE_HEIGHT = 400;
	private final int RACKET_Y = 340;
	private final int RACKET_WIDTH = 60;
	private final int RACKET_HEIGHT = 20;
	private final int BALL_SIZE = 16;
	private Frame f = new Frame("弹球游戏");
	
	Random rm = new Random();
	private int ySpeed = 10;
	private double xyRate = rm.nextDouble()-0.5;
	private int xSpeed = (int)(ySpeed*xyRate*2);
	
	private int ballX = rm.nextInt(200)+20;
	private int ballY = rm.nextInt(20)+20;
	
	private int RACKET_X = rm.nextInt(200);
	private MyCanvas mycanvas = new MyCanvas();
	
	Timer timer;
	boolean isLose = false;
	public void init(){
		mycanvas.setPreferredSize(new Dimension(TABLE_WIDTH, TABLE_HEIGHT));
		f.add(mycanvas);
		KeyAdapter keyada = new KeyAdapter() {
			public void keyPressed(KeyEvent ke){
				if(ke.getKeyCode() == KeyEvent.VK_LEFT){
					if(RACKET_X>0)
					RACKET_X -= 10;
				}if(ke.getKeyCode() == KeyEvent.VK_RIGHT){
					if(RACKET_X < TABLE_WIDTH-RACKET_X)
					RACKET_X += 10;
				}
			}
		};
		f.addKeyListener(keyada);
		mycanvas.addKeyListener(keyada);
		
		ActionListener taskPerformer = evt ->{
			if(ballX<=0 || ballX >=TABLE_WIDTH -BALL_SIZE){
				xSpeed = -xSpeed;
			}
			if(ballX >=RACKET_Y-BALL_SIZE && ballX<RACKET_X || ballX>RACKET_X+RACKET_WIDTH){
				 timer.stop();
				 isLose = true;
				 mycanvas.repaint();
				
			}else if(ballY<=0||ballY>=RACKET_Y-BALL_SIZE && ballX>RACKET_X && ballX<=RACKET_X+RACKET_WIDTH){
				ySpeed = -ySpeed;
			}
			ballX += xSpeed;
			ballY += ySpeed;
			mycanvas.repaint(); 
			
		};
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		timer = new Timer(100,taskPerformer);
		timer.start();
		f.pack();
		f.setVisible(true);
		
	}

	class MyCanvas extends Canvas{
		public void paint(Graphics g){
			if(isLose){
				g.setColor(new Color(250, 0, 0));
				g.setFont(new Font("Times",Font.BOLD,30));
				g.drawString("游戏已结束", 50, 200);
				
			}else{
				g.setColor(new Color(240, 240, 80));
				g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);
				
				g.setColor(new Color(20,80,200));
				g.fillRect(RACKET_X, RACKET_Y, RACKET_WIDTH, RACKET_HEIGHT);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PinBall().init();
	}

}
