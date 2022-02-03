package day0126;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1.������ ������Ʈ ���
public class UseLayoutManager extends JFrame {
	
	public UseLayoutManager() {
		super("���������� ����ϴ� ���̾ƿ� �Ŵ���");
		//2.������Ʈ ����
		//�Ϲ�������Ʈ - �������
		JLabel jlblName = new JLabel("�̸�");
		JTextField jtfName = new JTextField(10);
		JButton jbtnAdd = new JButton("�߰�");
		JTextArea jtaNameDisp = new JTextArea();
		
		//�����̳� ������Ʈ - �Ϲ� ������Ʈ ��ġ
		JPanel jpNorth = new JPanel();
		
		//3.��ġ
		//�����̳� ������Ʈ(FlowLayout)�� �Ϲ� ������Ʈ ��ġ
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jbtnAdd);
		
		//������ ������Ʈ(Border Layout)�� ��ġ
		add("North", jpNorth);
		add("Center", jtaNameDisp);
		
		//4.������ ũ�� ����
		setSize(400, 300);
		
		//5.����ȭ
		setVisible(true);
		
		//6.���� �̺�Ʈ ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} //UseLayoutManager

	public static void main(String[] args) {
		new UseLayoutManager();
	}//main

}//class
