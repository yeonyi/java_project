package HomeAssignment_0128;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * has a ����� �޴� �̺�Ʈ ó��
 * @author yon
 */
public class MemoPadEvt implements ActionListener {
	
	private MemoPad mp;
	
	
	public MemoPadEvt(MemoPad mp) {
		this.mp = mp;
	}//MemoPadEvt

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		//���� -> JTextArea �ʱ�ȭ
		if(ae.getSource() == mp.getJmiNew()) {
			mp.getWriteField().setText("");
		}//end if
		
		//�ݱ� -> ������ ����
		if(ae.getSource() == mp.getJmiClose()) {
			mp.dispose();
		}//end if
		
		//���� -> �۲� ����
		if(ae.getSource() == mp.getJmiFont()) {
			new FontDialog(mp);
		}//end if
		
	
	}//actionPerformed

}//class
