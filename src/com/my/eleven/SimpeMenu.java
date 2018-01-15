package com.my.eleven;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

import com.sun.glass.events.KeyEvent;
import com.sun.glass.events.WindowEvent;

public class SimpeMenu {
	private Frame f = new Frame("菜单");
	private MenuBar mb = new MenuBar();
	PopupMenu pop = new PopupMenu();
	Menu file = new Menu("文件");
	Menu edit = new Menu("编辑");
	MenuItem newItem = new MenuItem("新建");
	MenuItem saveItem = new MenuItem("保存");
	
	MenuItem exitItem = new MenuItem("退出",new MenuShortcut(KeyEvent.VK_X));
	CheckboxMenuItem autoWrap = new CheckboxMenuItem("自动换行");
	
	MenuItem copyItem = new MenuItem("复制");
	MenuItem pasetItem = new MenuItem("粘贴");
	Menu format = new Menu("格式");
	MenuItem comentItem = new MenuItem("注释",new MenuShortcut(KeyEvent.VK_SLASH,true));
	
	MenuItem cancelItem = new MenuItem("取消注释");
	private TextArea tx = new TextArea(6,40);
	
	public void init(){
		ActionListener menuListener = e ->{
			String cmd = e.getActionCommand();
			tx.append("单击“"+cmd+"”菜单"+"\n");
			if(cmd.equals("退出")){
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
