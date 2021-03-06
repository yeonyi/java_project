package day0128;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 디자인 클래스를 받아(has a) 디자인 클래스의 이벤트를 처리하는 클래스
 * @author user
 */
public class TestAdapterHasa extends WindowAdapter {
	private TestDesign td;// 받은 객체를 이 클래스의 모든 instance area에서 쓸 수 있게

	public TestAdapterHasa(TestDesign td) {//has a
		this.td = td; //스택에 들어온 td를 힙에 올린다.
		
	}//TestAdapterHasa
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("외부클래스에서 윈도우 종료 이벤트 처리");
//		dispose(); //TestAdapterHasa클래스의 상속중에는 이 기능이 존재하지 않음
		td.dispose();
	}//WindowClosing

}
