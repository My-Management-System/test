package com.my.eleven;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class GridBagTest {
	private Frame f = new Frame("²âÊÔ´°¿Ú");
	private GridBagLayout bgl = new GridBagLayout();
	private GridBagConstraints gbc = new GridBagConstraints();
	private Button[] b = new Button[10];
	private void init(){
		 f.setLayout(bgl);
		 for(int i =0;i<b.length;i++){
			 
			 b[i] = new Button("°´Å¥"+i);
		 }
		 gbc.fill = GridBagConstraints.BOTH;
		 gbc.weightx=1;
		 
	 }
	 private void addButton(Button button){
		// bgl.setConstraints(comp, constraints);
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
