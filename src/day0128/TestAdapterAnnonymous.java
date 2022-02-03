package day0128;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestAdapterAnnonymous extends JFrame {
	
	public TestAdapterAnnonymous() {
		super("Annonymous Inner class를 사용한 Adapter");
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Annoymous Inner class에서 처리한 윈도우 종료");
				dispose();
			}//windowClosing			
		});
		
		setSize(400, 400);
		setVisible(true);
		
	}//TestAdapterAnnonymous

	public static void main(String[] args) {
		new TestAdapterAnnonymous();
	}//main

}//class
