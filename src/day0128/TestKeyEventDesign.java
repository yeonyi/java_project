package day0128;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1.윈도우 컴포넌트 상속
public class TestKeyEventDesign extends JFrame {
	//2.이벤트 처리에 사용되는 컴포넌트 선선
	private JTextField jtfKey;
	private JLabel jlblOutput;
	
	public TestKeyEventDesign() {
		super("키보드 이벤트");
		
		jtfKey = new JTextField();
		jlblOutput = new JLabel("출력: ");
		
		Font font = new Font("맑은 고딕",Font.BOLD, 20);
		jtfKey.setFont(font);
		jlblOutput.setFont(font);
		
		setLayout(new GridLayout(2,1));
		
		add(jtfKey);
		add(jlblOutput);
		
		//이벤트 등록
		TestKeyEvtProcess tkep = new TestKeyEvtProcess(this);
		jtfKey.addKeyListener(tkep);//JTextField를 이벤트에 등록
		addWindowFocusListener(tkep);//JFrame을 이벤트에 등록
		
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
