package com.my.twelve;

 
import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
 
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class JToolBarTest {
	JFrame jf = new JFrame("≤‚ ‘π§æﬂÃı");
	JToolBar jtb = new JToolBar();
	JTextArea jta = new JTextArea(6,35);
	JMenuBar jmb = new JMenuBar();
	JMenu edit = new JMenu("±‡º≠");
	
	Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
	Action pasetAction = new AbstractAction("’≥Ã˘") {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(cb.isDataFlavorAvailable(DataFlavor.stringFlavor)){
				
				try {
					String contens = (String) cb.getData(DataFlavor.stringFlavor);
					jta.replaceRange(contens, jta.getSelectionStart(), jta.getSelectionEnd());
					
				}  catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		}
	};
	Action copyAction = new AbstractAction("∏¥÷∆") {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		StringSelection contents = new StringSelection(jta.getSelectedText());
		cb.setContents(contents, null);
		if(cb.isDataFlavorAvailable(DataFlavor.stringFlavor)){
			pasetAction.setEnabled(true);
		}
		}
	};
	public void init(){
		pasetAction.setEnabled(false);
		jf.add(new JScrollPane(jta));
		JButton jbcopy = new JButton(copyAction);
		JButton jbpaset = new JButton(pasetAction);
		
		JPanel jp = new JPanel();
		jp.add(jbcopy);
		jp.add(jbpaset);
		jf.add(jp,BorderLayout.SOUTH);
		jtb.add(copyAction);
		jtb.addSeparator();
		jtb.add(pasetAction);
		jmb.add(edit);
		jf.setJMenuBar(jmb);
		jtb.setMargin(new Insets(20, 10,5,30));
		jf.add(jtb,BorderLayout.NORTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JToolBarTest().init();
	}

}
