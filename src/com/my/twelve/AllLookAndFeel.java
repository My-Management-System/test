package com.my.twelve;

import javax.swing.UIManager;

public class AllLookAndFeel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(UIManager.LookAndFeelInfo info:UIManager.getInstalledLookAndFeels()){
			System.out.println(info);
		}
	}

}
