package day0125;

import javax.swing.JFrame;

/**
 * JFrame을 상속받으면 Window부터 생성되어 짧은 코드로 사용자에게 Application을 제공할 수 있다.
 * @author user
 */
@SuppressWarnings("serial")
public class UseJFrame extends JFrame{
	
	public UseJFrame() {
		setSize(800, 200); //크기 설정 (넓이, 높이)
		setVisible(true); //눈에 보이게
	}//UseJFrame

	public static void main(String[] args) {
		new UseJFrame();
	}//main

}//class
