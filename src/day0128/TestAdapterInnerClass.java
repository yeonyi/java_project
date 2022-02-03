package day0128;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestAdapterInnerClass extends JFrame {
	public TestAdapterInnerClass() {
		super("Inner class�� ����� �̺�Ʈ ó�����");
		
//		//inner class��üȭ
//		TestAdapterInnerClass.InnerEvt ie = this.new InnerEvt();
//		//�̺�Ʈ ���
//		addWindowListener(ie);
		
		addWindowListener(new InnerEvt());
		
		setSize(400, 300);
		setVisible(true);
		
	}//TestAdapterInnerClass
	
	/////////////////inner class ����/////////////////////////////
	public class InnerEvt extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("Inner class���� ó���� ������ ���� �̺�Ʈ");
			dispose();//Window class�� ���� method <=����Ŭ�������� �ٱ�Ŭ������ �ڿ��� �����Ӱ� ��� ����
		}//windowClosing
		
	}//class
	
	/////////////////inner class ��//////////////////////////////

	public static void main(String[] args) {
		new TestAdapterInnerClass();
	}//main

}//class
