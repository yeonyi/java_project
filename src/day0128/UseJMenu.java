package day0128;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class UseJMenu extends JFrame {
	
	private JMenuItem jmiNew, jmiSave, jmiSaveAs, jmiClose, jmiFont, jmiMemoInfo;
	
	public UseJMenu() {
		super("�޸���");
		
		JTextArea jta = new JTextArea();
		
		//1.�޴��ٸ� ����
		JMenuBar jmb = new JMenuBar();
		
		JMenu jm = new JMenu("����");
		jmiNew = new JMenuItem("���ۿ���"); 
		jmiSave = new JMenuItem("����"); 
		jmiSaveAs = new JMenuItem("�ٸ��̸����� ����");
		jmiClose = new JMenuItem("�ݱ�"); 
		
		JMenu jm2 = new JMenu("����");
		jmiFont = new  JMenuItem("�۲�");
		
		JMenu jm3 = new JMenu("����");
		jmiMemoInfo = new JMenuItem("�޸��� ����");
		
		//�̺�Ʈ ���
		jm.add(jmiNew);
		jm.add(jmiSave);
		jm.add(jmiSaveAs);
		jm.add(jmiClose);
		jm2.add(jmiFont);
		jm3.add(jmiMemoInfo);
		
		//�޴��� �޴��ٿ� ��ġ
		jmb.add(jm);
		jmb.add(jm2);
		jmb.add(jm3);
		
		//�޴��ٸ� �����ӿ� ��ġ
		setJMenuBar(jmb);
		
		//�޴������ۿ� �̺�Ʈ ���
		//has a
		UseJMenuEvt ujme = new UseJMenuEvt(this);
		jmiNew.addActionListener(ujme);
		jmiClose.addActionListener(ujme);
		jmiFont.addActionListener(ujme);
		
		
		
		setSize(800, 600);
		setVisible(true);
		
	}//UseJMenu
	

	
	public static void main(String[] args) {
		new UseJMenu();
	}//main

}//class
