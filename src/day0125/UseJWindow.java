package day0125;

import javax.swing.JFrame;
import javax.swing.JWindow;

/**
 * JWindow�� ��ӹ����� ������Ʈ�� �����̳� ������Ʈ�� ��ġ�Ͽ� �����ֱ� ����
 * JFrame�� �ʿ�
 * @author user
 */
@SuppressWarnings("serial")
public class UseJWindow extends JWindow{
	
	public UseJWindow( JFrame jf) {
		super(jf);
		jf.setSize(400,400);
		jf.setVisible(true);
	}//UseWindow

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		new UseJWindow(jf);
	}//main

}//class
