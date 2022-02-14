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
		super("�޸���");
		
		
		//�޴��� ����
		JMenuBar jmb = new JMenuBar();
		
		//�޴� �����ۻ���
		JMenu jm1 = new JMenu("����");
		jmiNew = new JMenuItem("����");
		jmiSave = new JMenuItem("����");
		jmiSaveAs = new JMenuItem("�ٸ��̸���������");
		jmiClose = new JMenuItem("�ݱ�");
		
		JMenu jm2 = new JMenu("����");
		jmiFont = new JMenuItem("�۲�");
		
		JMenu jm3 = new JMenu("����");
		jmiMemoInfo = new JMenuItem("�޸��� ����");
		
		writeField = new JTextArea();
		//TextArea ��ũ��
		JScrollPane jsp =new JScrollPane(writeField);
		
		//�޴��������� �޴��ٿ� ��ġ
		jm1.add(jmiNew);
		jm1.add(jmiSave);
		jm1.add(jmiSaveAs);
		jm1.add(jmiClose);
		jm2.add(jmiFont);
		jm3.add(jmiMemoInfo);
		
		//�޴��� �޴��ٿ� ��ġ
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		
		setJMenuBar(jmb);//�޴��� ��ġ ����
		add("Center", writeField);
		
		//�޴� �����ۿ� �̺�Ʈ ���(has a)
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
