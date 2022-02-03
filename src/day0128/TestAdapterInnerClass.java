package day0128;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestAdapterInnerClass extends JFrame {
	public TestAdapterInnerClass() {
		super("Inner class를 사용한 이벤트 처리방법");
		
//		//inner class객체화
//		TestAdapterInnerClass.InnerEvt ie = this.new InnerEvt();
//		//이벤트 등록
//		addWindowListener(ie);
		
		addWindowListener(new InnerEvt());
		
		setSize(400, 300);
		setVisible(true);
		
	}//TestAdapterInnerClass
	
	/////////////////inner class 시작/////////////////////////////
	public class InnerEvt extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("Inner class에서 처리한 윈도우 종료 이벤트");
			dispose();//Window class의 종료 method <=안쪽클래에서는 바깥클래스의 자원을 자유롭게 사용 가능
		}//windowClosing
		
	}//class
	
	/////////////////inner class 끝//////////////////////////////

	public static void main(String[] args) {
		new TestAdapterInnerClass();
	}//main

}//class
