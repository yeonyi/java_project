package day0127;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseJList extends JFrame {
	
	public UseJList() {
		super("MVC Pattern�� ���Ե� Ŭ����");
		
		//������Ʈ ����
		//MVC Pattern�� ���Ե� ������Ʈ�� Model���� ����
		DefaultListModel<String> dlmFriend = new DefaultListModel<String>();
		DefaultListModel<String> dlmBlockFriend = new DefaultListModel<String>();
		
		JList<String> listFriend = new JList<String>(dlmFriend);
		JList<String> listBlockFriend = new JList<String>(dlmBlockFriend);
		
		//JList�� ��ũ�ѹٰ� ��� �����̳� ������Ʈ�� ����� ��ũ�ѹ� ����
		JScrollPane jspListFriend = new JScrollPane(listFriend);
		JScrollPane jspListBlockFriend = new JScrollPane(listBlockFriend);

		jspListFriend.setBorder(new TitledBorder("ģ�����"));
		jspListBlockFriend.setBorder(new TitledBorder("���ܵ� ģ�����"));
		
		JButton jbtnBlock = new JButton(">>");
		JButton jbtnNonBlock = new JButton("<<");
		
		//Model�� ���ؼ� �����͸� �߰�
		dlmFriend.addElement("������");
		dlmFriend.addElement("���μ�");
		dlmFriend.addElement("������");
		dlmFriend.addElement("������");
		dlmFriend.addElement("������");
		dlmFriend.addElement("������");
		dlmFriend.addElement("�ڼ���");
		
		//��ġ
		setLayout(null);//�ڵ���ġ�����ڸ� ����
		
		//��ġ, ũ�� ����
		jspListFriend.setBounds(20, 40, 200, 350);
		jspListBlockFriend.setBounds(330, 40, 200, 350);
		jbtnBlock.setBounds(250, 150, 50, 40);
		jbtnNonBlock.setBounds(250, 210, 50, 40);

		add(jspListFriend);
		add(jspListBlockFriend);
		add(jbtnBlock);
		add(jbtnNonBlock);
		
		setBounds(100, 150, 600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseJList
	
	public static void main(String[] args) {
		new UseJList();
	}//main

}//class
