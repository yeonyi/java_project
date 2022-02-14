package day0126;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
//1.������ ������Ʈ ���
public class UseManualLayout extends JFrame {

	public UseManualLayout() {
		super("������ġ ����");
		//2.������Ʈ ����
		JLabel jlbl = new JLabel("��");
		
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("�ڹ�");
		jcb.addItem("����Ŭ");
		jcb.addItem("�޺��ڽ�");
		
		String[] data = "������,���μ�,������,������,������".split(",");
		JList<String> jl = new JList<String>(data);
		
		//������
		//�ٴڻ�
		jlbl.setOpaque(true);//���� ��������
//		jlbl.setBackground(Color.CYAN);//�ٴڻ� ����
		jlbl.setBackground(new Color(0x47C83E));//�ٴڻ� ����
		//�����
		jlbl.setForeground(Color.RED);
		
		//3.��ġ
		//������ ������ ��ġ������ ����
		setLayout(null);
		
		//������Ʈ�� ��ǥ ����
		jlbl.setLocation(10, 40);
		jcb.setLocation(130, 100);
		
		//������Ʈ�� ũ�� ����
		jlbl.setSize(80, 30);
		jcb.setSize(120, 40);
		
		//��ǥ������ ũ�⸦ ���ÿ� ����
		jl.setBounds(290, 40, 120, 100);
		
		add(jlbl);
		add(jcb);
		add(jl);
		//4.������ ũ�� ����
		setSize(500, 400);
		
		//5.����ȭ
		setVisible(true);
		
		//������ ũ�� ���� ����
		setResizable(false);
		
		//6.�����̺�Ʈ ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}//UseManualLayout
	
	public static void main(String[] args) {
		new UseManualLayout();

	}//main

}//class
