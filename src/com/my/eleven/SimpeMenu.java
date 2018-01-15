package com.my.eleven;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

import com.sun.glass.events.KeyEvent;
import com.sun.glass.events.WindowEvent;

public class SimpeMenu {
	private Frame f = new Frame("�˵�");
	private MenuBar mb = new MenuBar();
	PopupMenu pop = new PopupMenu();
	Menu file = new Menu("�ļ�");
	Menu edit = new Menu("�༭");
	MenuItem newItem = new MenuItem("�½�");
	MenuItem saveItem = new MenuItem("����");
	
	MenuItem exitItem = new MenuItem("�˳�",new MenuShortcut(KeyEvent.VK_X));
	CheckboxMenuItem autoWrap = new CheckboxMenuItem("�Զ�����");
	
	MenuItem copyItem = new MenuItem("����");
	MenuItem pasetItem = new MenuItem("ճ��");
	Menu format = new Menu("��ʽ");
	MenuItem comentItem = new MenuItem("ע��",new MenuShortcut(KeyEvent.VK_SLASH,true));
	
	MenuItem cancelItem = new MenuItem("ȡ��ע��");
	private TextArea tx = new TextArea(6,40);
	
	public void init(){
		ActionListener menuListener = e ->{
			String cmd = e.getActionCommand();
			tx.append("������"+cmd+"���˵�"+"\n");
			if(cmd.equals("�˳�")){
				System.exit(0);
			}
		};
		comentItem.addActionListener(menuListener);
		exitItem.addActionListener(menuListener);
		file.add(saveItem);
		file.add(newItem);
		file.add(exitItem);
		edit.add(autoWrap);
		edit.addSeparator();
		edit.add(pasetItem);
		edit.add(copyItem);
		format.add(comentItem);
		format.add(cancelItem);
		edit.add(new MenuItem("-"));
		edit.add(format);
		
		pop.add(copyItem);
		pop.add(cancelItem);
		pop.addSeparator();
		pop.add(autoWrap);
		pop.add(new MenuItem("-"));
		pop.add(pasetItem);
		pop.add(format);
		
		
		final Panel p = new Panel();
		p.setPreferredSize(new Dimension(300, 160));
		p.add(pop);
		
		p.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e){
				if(e.isPopupTrigger()){
					pop.show(p, e.getX(), e.getY());
				}
			}
		});
		
		mb.add(file);
		mb.add(edit);
		f.setMenuBar(mb);
		f.addWindowListener(new WindowAdapter() {
			 
			@SuppressWarnings("unused")
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
				
			}
		});
		f.add(p);
		f.add(tx,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpeMenu().init();
		
	}

}
