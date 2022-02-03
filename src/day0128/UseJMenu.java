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
		super("메모장");
		
		JTextArea jta = new JTextArea();
		
		//1.메뉴바를 생성
		JMenuBar jmb = new JMenuBar();
		
		JMenu jm = new JMenu("파일");
		jmiNew = new JMenuItem("새글열기"); 
		jmiSave = new JMenuItem("저장"); 
		jmiSaveAs = new JMenuItem("다른이름으로 저장");
		jmiClose = new JMenuItem("닫기"); 
		
		JMenu jm2 = new JMenu("서식");
		jmiFont = new  JMenuItem("글꼴");
		
		JMenu jm3 = new JMenu("도움말");
		jmiMemoInfo = new JMenuItem("메모장 정보");
		
		//이벤트 등록
		jm.add(jmiNew);
		jm.add(jmiSave);
		jm.add(jmiSaveAs);
		jm.add(jmiClose);
		jm2.add(jmiFont);
		jm3.add(jmiMemoInfo);
		
		//메뉴를 메뉴바에 배치
		jmb.add(jm);
		jmb.add(jm2);
		jmb.add(jm3);
		
		//메뉴바를 프레임에 배치
		setJMenuBar(jmb);
		
		//메뉴아이템에 이벤트 등록
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
