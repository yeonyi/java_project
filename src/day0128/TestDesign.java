package day0128;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestDesign extends JFrame {
	public TestDesign() {
		super("�ܺ�Ŭ�������� �̺�Ʈ ó��");
		
		//has a����� �̺�Ʈ ����
		TestAdapterHasa taha = new TestAdapterHasa(this);
		//������ Ŭ�������� �߻��� �̺�Ʈ�� has a������ Ŭ������ ó���ϵ��� ���
		addWindowListener(taha);
		
		setSize(400, 400);
		setVisible(true);
	}//TestDesign

	public static void main(String[] args) {
		new TestDesign();
	}//main

}//class
