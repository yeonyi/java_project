package day0128;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * has a ����� TestKeyEvtDesign Ŭ������ �̺�Ʈ�� ó���� Ŭ����
 * @author user
 */
public class TestKeyEvtProcess extends WindowAdapter implements KeyListener {
	private TestKeyEventDesign tked;
	
	public TestKeyEvtProcess(TestKeyEventDesign tked) {
		this.tked = tked;
	}//TestKeyEvtProcess

	
	@Override
	public void windowClosing(WindowEvent e) {
		tked.dispose();
	}//windoWClosing


	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed");
	}

	@Override
	public void keyReleased(KeyEvent ke) {
//		System.out.println("keyReleased");
		//����Ű�� Ű ��, Ű �ڵ� ���
		//���� Ű�� Ű�ڵ� ���� ������ Ŭ������ JLabel�� ���
		tked.getJlblOutput().setText(String.valueOf(ke.getKeyCode())+"/"+ke.getKeyChar());
		
		//�ֿܼ� JTextField�� �Էµ� ��� ���ڿ� ���
		System.out.println(tked.getJtfKey().getText());
		
		//ESCŰ�� �������� ���α׷��� ����
//		if(ke.getKeyCode()==27) {
		switch(ke.getKeyCode()) {
		case KeyEvent.VK_ESCAPE :
			tked.dispose();
		}//end switch
		
	}//keyReleased

}//class
