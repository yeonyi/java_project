package day0211;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test4 extends JFrame {
	
	private JButton jbtn;
	
	public Test4() {
		super("�׽�Ʈ");
		jbtn = new JButton("Ŭ��");
		
		//���ٽ����� ��ư�� ������ �� confirm dialog�� ���� ���θ� ����� 
		//"��"�� Ŭ���Ǹ� ���������츦 �����ϴ� �ڵ� �ۼ�
		jbtn.addActionListener((ActionEvent e) -> {
			switch(JOptionPane.showConfirmDialog(this,"�����Ͻðڽ��ϱ�?")) {
			case JOptionPane.OK_OPTION:
				dispose();
			}
			
		});
		
		add("Center", jbtn);
		setSize(300, 300);
		setVisible(true);
		
	}//Test4

	public static void main(String[] args) {
		new Test4();
	}//main

}//class
