package day0125;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
//1.������ ������Ʈ ���
public class UseGridLayout extends JFrame {
	
	public UseGridLayout(){
		super("�׸��巹�̾ƿ� ����");
		
		//2.������Ʈ ����
		JLabel jlblHobby = new JLabel("���");
		JLabel jlblGender = new JLabel("����");
		
		JCheckBox jcbHobby1 = new JCheckBox("���");
		JCheckBox jcbHobby2 = new JCheckBox("����");
		
		JRadioButton jrbM = new JRadioButton("����");
		JRadioButton jrbF = new JRadioButton("����");
		//ButtonGroup�� �����ؾ� RadioButton�� �ϳ��� ���õȴ�.
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbM);//ButtonGroup�� JRadioButton�� has a ����
		bg.add(jrbF);
		
		//3.������Ʈ ��ġ
		//��ġ������ ����
		setLayout(new GridLayout(2, 3));
		add(jlblHobby);
		add(jcbHobby1);
		add(jcbHobby2);//������� �� ��
		
		add(jlblGender);
		add(jrbM);
		add(jrbF);
		
		//4.������ ũ�� ����
		setSize(300, 200);
		
		//5.����ȭ
		setVisible(true);
		
		//6.������ ���� �̺�Ʈ ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseGridLayout
	
	public static void main(String[] args) {
		new UseGridLayout();
	}//main

}//class
