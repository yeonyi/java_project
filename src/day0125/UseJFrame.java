package day0125;

import javax.swing.JFrame;

/**
 * JFrame�� ��ӹ����� Window���� �����Ǿ� ª�� �ڵ�� ����ڿ��� Application�� ������ �� �ִ�.
 * @author user
 */
@SuppressWarnings("serial")
public class UseJFrame extends JFrame{
	
	public UseJFrame() {
		setSize(800, 200); //ũ�� ���� (����, ����)
		setVisible(true); //���� ���̰�
	}//UseJFrame

	public static void main(String[] args) {
		new UseJFrame();
	}//main

}//class
