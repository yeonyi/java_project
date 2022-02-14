package day0127;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1.������ ������Ʈ ���

//E-1 �̺�Ʈ�� ó���� �������̽� ����
public class UseActionEvent extends JFrame implements ActionListener{
	//�̺�Ʈ ó���� �����ִ� ������Ʈ�� class field�� ����
	private JTextField jtfName; //�ν��Ͻ� ����
	private JTextArea jtaNameDisp;
	private JButton jbtnAdd;
	
	public UseActionEvent() {
		super("��ư������ �߻��ϴ� �̺�Ʈ");
		//2.������Ʈ ����
		//�Ϲ�������Ʈ - �������
		JLabel jlblName = new JLabel("�̸�"); //�������� ����
		jtfName = new JTextField(10); //�ν��Ͻ� ����
		jbtnAdd = new JButton("�߰�");
		System.out.println(jtfName);
		System.out.println(jbtnAdd);
		
		jtaNameDisp = new JTextArea(); 
		
		//�����̳� ������Ʈ - �Ϲ� ������Ʈ ��ġ
		JPanel jpNorth = new JPanel();
		
		//E-4 ������Ʈ�� �̺�Ʈ�� �߻���ų �� �ֵ��� �̺�Ʈ�� ���
		jbtnAdd.addActionListener(this);//��ư Ŭ�� => �Էµ� ��ü�� Override�� �޼��� ȣ��: actionPerfomed method�� ȣ��
		jtfName.addActionListener(this);//TextField���� ����
		
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
	
	//E-2 Abstract Method Override
	@Override
	public void actionPerformed(ActionEvent ae) {//������Ʈ.addXxxListener(��ü);�� �޼ҵ忡�� ȣ���
		//E-3 �̺�Ʈ�� �߻����� �� ����ڿ��� ������ �ڵ�(����)
		//��ư�� ������ JTextField�� ���� ���ͼ� JTextArea�� �ִ´�.
		String source = "";
		if(ae.getSource()==jbtnAdd);{
			source = "��ư";
			System.out.println("��ư�� ������");
		}
		if(ae.getSource()==jtfName);{
			source = "�ؽ�Ʈ �ʵ�";
//			System.out.println("�ؽ�Ʈ�ʵ���");
		}
		
		
		
		String txt = jtfName.getText(); //�ν��Ͻ� ����
		//JTextArea�� �ִ´� 
//		jtaName.Disp.setText(txt);//���� ���� ����� ���� ����
		jtaNameDisp.append(source+":"+txt);//���� �� �ڿ� �߰�
		jtaNameDisp.append("\n");//�ٹٲ�

		//JTextField�� �� ����
		jtfName.setText("");
		
	}//actionPerformed

	public static void main(String[] args) {
		new UseActionEvent();
	}//main

}//class
