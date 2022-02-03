package day0128;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1.������ ������Ʈ ���
public class TestKeyEventDesign extends JFrame {
	//2.�̺�Ʈ ó���� ���Ǵ� ������Ʈ ����
	private JTextField jtfKey;
	private JLabel jlblOutput;
	
	public TestKeyEventDesign() {
		super("Ű���� �̺�Ʈ");
		
		jtfKey = new JTextField();
		jlblOutput = new JLabel("���: ");
		
		Font font = new Font("���� ���",Font.BOLD, 20);
		jtfKey.setFont(font);
		jlblOutput.setFont(font);
		
		setLayout(new GridLayout(2,1));
		
		add(jtfKey);
		add(jlblOutput);
		
		//�̺�Ʈ ���
		TestKeyEvtProcess tkep = new TestKeyEvtProcess(this);
		jtfKey.addKeyListener(tkep);//JTextField�� �̺�Ʈ�� ���
		addWindowFocusListener(tkep);//JFrame�� �̺�Ʈ�� ���
		
		setBounds(100, 100, 300, 150);
		setVisible(true);
	}//TestKeyEvtDesign
	
	public JLabel getJlblOutput() {
		return jlblOutput;
	}//getJlblOutput
	
	

	public JTextField getJtfKey() {
		return jtfKey;
	}

	public static void main(String[] args) {
		new TestKeyEventDesign();
	}//main

}//class
