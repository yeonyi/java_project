package day0125;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1.������ ������Ʈ ���
public class UseFlowLayout extends JFrame {
	
	
	public UseFlowLayout() {
		super("�帧���̾ƿ� ����");
		//2.������Ʈ ����
		JLabel jlblName = new JLabel("�̸�");
		JTextField jtfName = new JTextField(10); //ũ�⸦ 10���� ����
		JCheckBox jcbSaveFlag = new JCheckBox("����", false);
		JButton jbtnAdd = new JButton("�Է�");
		
		//3.������Ʈ ��ġ
		//Frame�� Layout�� BorderLayout => FlowLayout���� ����
		setLayout( new FlowLayout());
		
		add(jlblName); //�󺧹�ġ
		add(jtfName); //�ؽ�Ʈ�ʵ��ġ
		add(jcbSaveFlag); //üũ�ڽ���ġ
		add(jbtnAdd); //��ư��ġ
		
		//4.������ ũ�� ����
		setSize(600, 300);
		
		//5. ����ȭ
		setVisible(true);
		
		//6. ������ ���� �̺�Ʈ ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseFlowLayout

	public static void main(String[] args) {
		new UseFlowLayout();
	}//main

}//class
