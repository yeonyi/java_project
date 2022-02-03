package HomeAssignment_0128;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * has a 관계로 메뉴 이벤트 처리
 * @author yon
 */
public class MemoPadEvt implements ActionListener {
	
	private MemoPad mp;
	
	
	public MemoPadEvt(MemoPad mp) {
		this.mp = mp;
	}//MemoPadEvt

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		//새글 -> JTextArea 초기화
		if(ae.getSource() == mp.getJmiNew()) {
			mp.getWriteField().setText("");
		}//end if
		
		//닫기 -> 윈도우 종료
		if(ae.getSource() == mp.getJmiClose()) {
			mp.dispose();
		}//end if
		
		//서식 -> 글꼴 열기
		if(ae.getSource() == mp.getJmiFont()) {
			new FontDialog(mp);
		}//end if
		
	
	}//actionPerformed

}//class
