package day0125;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Swing Component�� ����� Window Application �ۼ����
 * @author user
 */
@SuppressWarnings("serial")
//1.������ ������Ʈ�� ��ӹ޴´� : ���� ���� Ŭ�������� ������ ������Ʈ�� ��� ����� ���
public class HelloSwing extends JFrame {
	
	public HelloSwing() {
		super("�ȳ� ����");//Ÿ��Ʋ �ٿ� �޼��� �ֱ�
		//2.����ڿ��� ������ ������Ʈ�� ����(Swing�� AWT�� ������Ʈ�� ȥ���Ͽ� ����� �� �ִ�)
		JButton jbtn = new JButton("Swing ��ư");
		Button btn = new Button("AWT ��ư");
		
		//3.������ ������Ʈ�� ������ ������Ʈ�� ��ġ
		//���� ������Ʈ�� �ѹ��� �����ַ��� Container Component�� ���ǰų�
		//������ ������Ʈ�� ��ġ ������(LayoutManager)�� �����Ͽ� �����ش�.
		setLayout(new GridLayout(1, 2)); //��ġ�����ں���

		add(jbtn); //����� ��ġ�����ڿ� �°� ������Ʈ�� ��ġ
		add(btn);
		
		//4.�������� ũ�� ����
		setSize(500, 250);
		
		//5.����ڿ��� �����ֱ�
		setVisible(true);
		
//		//6.Window ���� �̺�Ʈ ó��
//		addWindowListener(new WindowAdapter() {
//
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dispose();
//			}//windowClosing
//			
//		});
		//6���� ���ٷ� �ذ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//HelloSwing

	public static void main(String[] args) {
		new HelloSwing();
	}//main

}//class
