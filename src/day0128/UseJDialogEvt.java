package day0128;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

/**
 * ���̾�α��� �̺�Ʈ�� ó���ϱ� ���� Ŭ����
 * @author user
 */
public class UseJDialogEvt extends WindowAdapter implements ActionListener {

	private UseJDialog ujd;
	
	public UseJDialogEvt(UseJDialog ujd) {
		this.ujd = ujd;
	}
	



	@Override
	public void windowClosing(WindowEvent we) {
//		//�����۾��� ���� �� �� �� �ִ�.
//		switch(JOptionPane.showConfirmDialog(ujd,"���� ����?")) {
//		case JOptionPane.OK_OPTION:
			ujd.dispose(); 
//		}
	}//windowClosing
	
	

	@Override
	public void actionPerformed(ActionEvent e) {

	}//actionPerformed

}//class
