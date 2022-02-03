package day0126;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class UseJButton extends JFrame {

	public UseJButton() {
		super("��ư ����");
		
		//�̹����� ������ ������Ʈ ����
		ImageIcon ii = new ImageIcon("E:/dev/workspace/javase_prj/src/day0126/images/img1.PNG");
		ImageIcon ii2 = new ImageIcon("E:/dev/workspace/javase_prj/src/day0126/images/img2.PNG");
		ImageIcon ii3 = new ImageIcon("E:/dev/workspace/javase_prj/src/day0126/images/img3.PNG");
		ImageIcon ii4 = new ImageIcon("E:/dev/workspace/javase_prj/src/day0126/images/img4.PNG");
		//��ư ����
		JButton jbtn = new JButton("���ε�", ii);
		JButton jbtn2 = new JButton("������", ii2);
		JButton jbtn3 = new JButton("����ġ", ii3);
		
		//��ư��ü ���� : ���콺 Ŀ���� �÷��� �� ������ �ؽ�Ʈ
		jbtn.setToolTipText("�������� ����ȭ");
		jbtn2.setToolTipText("����̸� ����ȭ");
		jbtn3.setToolTipText("�����Ƹ� ����ȭ");
		
		//��ư �ؽ�Ʈ �̵�
		//�����̵�
		jbtn.setVerticalTextPosition(JButton.BOTTOM);//TOP,CENTER,BOTTOM
		//�����̵�
		jbtn2.setHorizontalTextPosition(JButton.LEFT);//LEFT,CENTER,RIGHT
		
		jbtn3.setVerticalTextPosition(JButton.TOP);//TOP,CENTER,BOTTOM
		jbtn3.setHorizontalTextPosition(JButton.CENTER);//LEFT,CENTER,RIGHT

		//���콺 �����Ͱ� �ö��� �� �̹����� ����. rollOver
		jbtn.setRolloverIcon(ii4);
		
		//��ġ
		//��ġ�����ڸ� BorderLayout -> GridLayout���� ����
		setLayout(new GridLayout());
		
		add(jbtn);
		add(jbtn2);
		add(jbtn3);
		
		//������ ũ�� ����
		setBounds(100, 150, 650, 250);
		
		//����ȭ
		setVisible(true);
		
		//����ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseJButton
	
	public static void main(String[] args) {
		new UseJButton();
	}

}
