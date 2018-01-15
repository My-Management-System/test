package com.my.eleven;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
import javax.swing.Box;
import javax.swing.BoxLayout;

 
  
public class SimpleClipboard {

	private Frame f = new Frame("¼òµ¥µÄ¼ôÌù°å³ÌÐò");
	private Clipboard cpboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	private TextArea txcopy = new TextArea(10,50);
	private TextArea txpaset = new TextArea(10,50);
	private Button copy = new Button("copy");
	private Button paset = new Button("paset");
	
	public void init(){
		Panel p = new Panel();
		p.add(copy);
		p.add(paset);
		copy.addActionListener(eve -> {
			
			StringSelection strsele = new StringSelection(txcopy.getText());
			cpboard.setContents(strsele, null);
			
		});
		paset.addActionListener(eve -> {
			if(cpboard.isDataFlavorAvailable(DataFlavor.stringFlavor)){
				try {
					String contents = (String) cpboard.getData(DataFlavor.stringFlavor);
					txpaset.append(contents);
				}  catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		Box box = new Box(BoxLayout.X_AXIS);
		box.add(txcopy);
		box.add(txpaset);
		
		f.add(p,BorderLayout.SOUTH);
		f.add(box, BorderLayout.CENTER);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleClipboard().init();
	}

}
