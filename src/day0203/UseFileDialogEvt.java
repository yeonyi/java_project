package day0203;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

/**
 * 디자인 클래스의 이벤트를 분리하여 처리하는 클래스(has a)
 * @author user
 */
public class UseFileDialogEvt extends WindowAdapter implements ActionListener {

	private UseFileDialogView ufdv;
	
	public UseFileDialogEvt(UseFileDialogView ufdv) {
		this.ufdv = ufdv; //has a 관계 생성
	}//UseFileDialogEvt
	
	@Override
	public void windowClosing(WindowEvent we) {
		ufdv.dispose();
	}//windowClosing

	/**
	 * 파일다이얼로그를 열기 모드로
	 */
	private void loadFileDialog() {
		FileDialog fdOpen = new FileDialog(ufdv, "파일열기", FileDialog.LOAD);
		fdOpen.setVisible(true);
		
		//파일의 경로와 파일명 얻기
		String path = fdOpen.getDirectory();
		String name = fdOpen.getFile();
		
		//얻어낸 경로와 파일명을 타이틀 바에 설정. setTitle("변경할 내용");
		//선택한 파일이 존재할 때에만 타이틀 바를 설정
		if(path != null) {
			ufdv.setTitle("열기"+path+name);
		}//end if
	}//loadFileDialog
	
	/**
	 * 파일다이얼로그를 저장 모드로
	 */
	private void saveFileDialog() {
		FileDialog fdSave = new FileDialog(ufdv, "파일저장", FileDialog.SAVE);
		fdSave.setVisible(true);
		
		//파일의 경로와 파일명 얻기
		String path = fdSave.getDirectory();
		String name = fdSave.getFile();
		
		//얻어낸 경로와 파일명을 타이틀 바에 설정. setTitle("변경할 내용");
		//선택한 파일이 존재할 때에만 타이틀 바를 설정
		if(path != null) {
			ufdv.setTitle("저장"+path+name);
		}//end if
	}//saveFileDialog
	
	private void useInputDialog() {
//		String inputMsg = JOptionPane.showInputDialog("이름 입력해주세요");
		String inputMsg = JOptionPane.showInputDialog(ufdv,"이름 입력해주세요",
				"너이름이 뭐니?",JOptionPane.QUESTION_MESSAGE);
		ufdv.setTitle("이름 : "+inputMsg);
	}//useInputDialog
	
	private void useMsgDialog() {
//		JOptionPane.showMessageDialog(ufdv, "간단한 정보 전달");
		//아이콘을 바꿔서 사용자에게 시각적으로 정보 제공
		JOptionPane.showMessageDialog(ufdv, "간단한 정보 전달",
				 "기본메시지", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "간단한 정보 전달",
				"경고메시지", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "간단한 정보 전달",
				"정보메시지", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "간단한 정보 전달",
				"질문메시지", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "간단한 정보 전달",
				"에러메시지", JOptionPane.ERROR_MESSAGE);
		
	}//useMsgDialog
	
	private void useConfirmDialog() {
		
		int flag = JOptionPane.showConfirmDialog(ufdv, "종료하시겠습니까?");
		System.out.println("선택한 값"+flag);
		switch(flag) {
		case JOptionPane.OK_OPTION:
			ufdv.setTitle("예 선택");
			break;
		case JOptionPane.NO_OPTION:
			ufdv.setTitle("아니요 선택");
			break;
		case JOptionPane.CANCEL_OPTION:
			ufdv.setTitle("취소 선택");
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
