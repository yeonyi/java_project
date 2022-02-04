package day0203;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class UseFileDialogView extends JFrame {
	private JButton jbtnLoad, jbtnSave, jbtnInput, jbtnMsg, jbtnConfirm;
	
	public UseFileDialogView(){
		super("���� ���̾�α� ���");
		
		jbtnLoad = new JButton("���� ���̾�α�");
		jbtnSave = new JButton("���� ���̾�α�");
		
		jbtnInput = new JButton("�Է� ���̾�α�");
		jbtnMsg = new JButton("�޽��� ���̾�α�");
		jbtnConfirm = new JButton("Ȯ�� ���̾�α�");
		
		setLayout(new FlowLayout());
		
		add(jbtnLoad);
		add(jbtnSave);
		add(jbtnInput);
		add(jbtnMsg);
		add(jbtnConfirm);
		
		//������Ʈ���� �߻��� �̺�Ʈ�� JVM�� û���� �� �ֵ��� �̺�Ʈ�� ���
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
