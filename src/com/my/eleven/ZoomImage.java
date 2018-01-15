package com.my.eleven;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

 
public class ZoomImage {
	private final int WIDTH = 80;
	private final int HEIGHT = 60;
	
	BufferedImage bi = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	Graphics gh  = bi.getGraphics();
	
	public void zoo() throws Exception{
		Image im = ImageIO.read(new File("/image/board.jpg"));
		gh.drawImage(im, 0, 0,WIDTH,HEIGHT,null);
		ImageIO.write(bi, "hpeg", new File(System.currentTimeMillis()+".jpg"));
		
	}
	
	public static void main(String[] args) throws Exception{
		new ZoomImage().zoo();
	}
}
