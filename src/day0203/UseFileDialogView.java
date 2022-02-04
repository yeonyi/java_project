package day0203;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class UseFileDialogView extends JFrame {
	private JButton jbtnLoad, jbtnSave, jbtnInput, jbtnMsg, jbtnConfirm;
	
	public UseFileDialogView(){
		super("파일 다이얼로그 사용");
		
		jbtnLoad = new JButton("열기 다이얼로그");
		jbtnSave = new JButton("저장 다이얼로그");
		
		jbtnInput = new JButton("입력 다이얼로그");
		jbtnMsg = new JButton("메시지 다이얼로그");
		jbtnConfirm = new JButton("확인 다이얼로그");
		
		setLayout(new FlowLayout());
		
		add(jbtnLoad);
		add(jbtnSave);
		add(jbtnInput);
		add(jbtnMsg);
		add(jbtnConfirm);
		
		//컴포넌트에서 발생한 이벤트를 JVM이 청취할 수 있도록 이벤트에 등록
		UseFileDialogEvt ufde = new UseFileDialogEvt(this);
		
		addWindowListener(ufde);
		jbtnLoad.addActionListener(ufde);
		jbtnSave.addActionListener(ufde);
		jbtnInput.addActionListener(ufde);
		jbtnMsg.addActionListener(ufde);
		jbtnConfirm.addActionListener(ufde);
		
		setBounds(100, 100, 700, 200);
		setVisible(true);
		
	}//UseFileDialogView
	
	public JButton getJbtnLoad() {
		return jbtnLoad;
	}//getJbtnLoad

	public JButton getJbtnSave() {
		return jbtnSave;
	}//getJbtnSave

	public JButton getJbtnInput() {
		return jbtnInput;
	}//getJbtnInput

	public JButton getJbtnMsg() {
		return jbtnMsg;
	}//getJbtnMsg

	public JButton getJbtnConfirm() {
		return jbtnConfirm;
	}//getJbtnConfirm

	public static void main(String[] args) {
		new UseFileDialogView();
	}//main

}//class
