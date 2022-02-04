package day0203;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

/**
 * ������ Ŭ������ �̺�Ʈ�� �и��Ͽ� ó���ϴ� Ŭ����(has a)
 * @author user
 */
public class UseFileDialogEvt extends WindowAdapter implements ActionListener {

	private UseFileDialogView ufdv;
	
	public UseFileDialogEvt(UseFileDialogView ufdv) {
		this.ufdv = ufdv; //has a ���� ����
	}//UseFileDialogEvt
	
	@Override
	public void windowClosing(WindowEvent we) {
		ufdv.dispose();
	}//windowClosing

	/**
	 * ���ϴ��̾�α׸� ���� ����
	 */
	private void loadFileDialog() {
		FileDialog fdOpen = new FileDialog(ufdv, "���Ͽ���", FileDialog.LOAD);
		fdOpen.setVisible(true);
		
		//������ ��ο� ���ϸ� ���
		String path = fdOpen.getDirectory();
		String name = fdOpen.getFile();
		
		//�� ��ο� ���ϸ��� Ÿ��Ʋ �ٿ� ����. setTitle("������ ����");
		//������ ������ ������ ������ Ÿ��Ʋ �ٸ� ����
		if(path != null) {
			ufdv.setTitle("����"+path+name);
		}//end if
	}//loadFileDialog
	
	/**
	 * ���ϴ��̾�α׸� ���� ����
	 */
	private void saveFileDialog() {
		FileDialog fdSave = new FileDialog(ufdv, "��������", FileDialog.SAVE);
		fdSave.setVisible(true);
		
		//������ ��ο� ���ϸ� ���
		String path = fdSave.getDirectory();
		String name = fdSave.getFile();
		
		//�� ��ο� ���ϸ��� Ÿ��Ʋ �ٿ� ����. setTitle("������ ����");
		//������ ������ ������ ������ Ÿ��Ʋ �ٸ� ����
		if(path != null) {
			ufdv.setTitle("����"+path+name);
		}//end if
	}//saveFileDialog
	
	private void useInputDialog() {
//		String inputMsg = JOptionPane.showInputDialog("�̸� �Է����ּ���");
		String inputMsg = JOptionPane.showInputDialog(ufdv,"�̸� �Է����ּ���",
				"���̸��� ����?",JOptionPane.QUESTION_MESSAGE);
		ufdv.setTitle("�̸� : "+inputMsg);
	}//useInputDialog
	
	private void useMsgDialog() {
//		JOptionPane.showMessageDialog(ufdv, "������ ���� ����");
		//�������� �ٲ㼭 ����ڿ��� �ð������� ���� ����
		JOptionPane.showMessageDialog(ufdv, "������ ���� ����",
				 "�⺻�޽���", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "������ ���� ����",
				"���޽���", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "������ ���� ����",
				"�����޽���", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "������ ���� ����",
				"�����޽���", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "������ ���� ����",
				"�����޽���", JOptionPane.ERROR_MESSAGE);
		
	}//useMsgDialog
	
	private void useConfirmDialog() {
		
		int flag = JOptionPane.showConfirmDialog(ufdv, "�����Ͻðڽ��ϱ�?");
		System.out.println("������ ��"+flag);
		switch(flag) {
		case JOptionPane.OK_OPTION:
			ufdv.setTitle("�� ����");
			break;
		case JOptionPane.NO_OPTION:
			ufdv.setTitle("�ƴϿ� ����");
			break;
		case JOptionPane.CANCEL_OPTION:
			ufdv.setTitle("��� ����");
		}//end switch case
		
	}//useConfirmDialog
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==ufdv.getJbtnLoad()) {
			loadFileDialog();
		}//end if
		
		if(ae.getSource()==ufdv.getJbtnSave()) {
			saveFileDialog();
		}//end if
		if(ae.getSource()==ufdv.getJbtnInput()) {
			useInputDialog();
		}//end if
		if(ae.getSource()==ufdv.getJbtnMsg()) {
			useMsgDialog();
		}//end if
		if(ae.getSource()==ufdv.getJbtnConfirm()) {
			useConfirmDialog();
		}//end if

	}//actionPerformed

}//class
