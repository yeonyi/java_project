package HomeAssignment_0128;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MemoPad extends JFrame {
	
	private JMenuItem jmiNew, jmiOpen, jmiSave, jmiSaveAs, jmiClose, jmiFont, jmiMemoInfo;
	
	private JTextArea writeField;
	
	public MemoPad() {
		super("메모장");
		
		
		//메뉴바 생성
		JMenuBar jmb = new JMenuBar();
		
		//메뉴 아이템생성
		JMenu jm1 = new JMenu("파일");
		jmiNew = new JMenuItem("새글");
		jmiSave = new JMenuItem("저장");
		jmiSaveAs = new JMenuItem("다른이름으로저장");
		jmiClose = new JMenuItem("닫기");
		
		JMenu jm2 = new JMenu("서식");
		jmiFont = new JMenuItem("글꼴");
		
		JMenu jm3 = new JMenu("도움말");
		jmiMemoInfo = new JMenuItem("메모장 정보");
		
		writeField = new JTextArea();
		//TextArea 스크롤
		JScrollPane jsp =new JScrollPane(writeField);
		
		//메뉴아이템을 메뉴바에 배치
		jm1.add(jmiNew);
		jm1.add(jmiSave);
		jm1.add(jmiSaveAs);
		jm1.add(jmiClose);
		jm2.add(jmiFont);
		jm3.add(jmiMemoInfo);
		
		//메뉴를 메뉴바에 배치
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		
		setJMenuBar(jmb);//메뉴바 위치 고정
		add("Center", writeField);
		
		//메뉴 아이템에 이벤트 등록(has a)
		MemoPadEvt mpe = new MemoPadEvt(this);
		jmiNew.addActionListener(mpe);
		jmiClose.addActionListener(mpe);
		jmiFont.addActionListener(mpe);
		
		setBounds(10, 40, 600, 400);
		setVisible(true);
		
	}//MemoPad

	public JMenuItem getJmiNew() {
		return jmiNew;
	}

	public JMenuItem getJmiOpen() {
		return jmiOpen;
	}

	public JMenuItem getJmiSave() {
		return jmiSave;
	}

	public JMenuItem getJmiSaveAs() {
		return jmiSaveAs;
	}

	public JMenuItem getJmiClose() {
		return jmiClose;
	}

	public JMenuItem getJmiFont() {
		return jmiFont;
	}

	public JMenuItem getJmiMemoInfo() {
		return jmiMemoInfo;
	}

	public JTextArea getWriteField() {
		return writeField;
	}

	public static void main(String[] args) {
		new MemoPad();
	}

}
