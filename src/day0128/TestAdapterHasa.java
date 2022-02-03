package day0128;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ������ Ŭ������ �޾�(has a) ������ Ŭ������ �̺�Ʈ�� ó���ϴ� Ŭ����
 * @author user
 */
public class TestAdapterHasa extends WindowAdapter {
	private TestDesign td;// ���� ��ü�� �� Ŭ������ ��� instance area���� �� �� �ְ�

	public TestAdapterHasa(TestDesign td) {//has a
		this.td = td; //���ÿ� ���� td�� ���� �ø���.
		
	}//TestAdapterHasa
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("�ܺ�Ŭ�������� ������ ���� �̺�Ʈ ó��");
//		dispose(); //TestAdapterHasaŬ������ ����߿��� �� ����� �������� ����
		td.dispose();
	}//WindowClosing

}
