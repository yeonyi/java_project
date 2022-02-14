package day0126;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


@SuppressWarnings("serial")
public class HomeAssignment_0126 extends JFrame {
	public HomeAssignment_0126() {

		super("사원관리");
		
		//JLabel 
		JLabel jlblNum = new JLabel("번호");
		JLabel jlblName = new JLabel("이름");
		JLabel jlblGender = new JLabel("성별");
		JLabel jlblEmail = new JLabel("이메일");
		
		jlblNum.setBounds(20, 30, 50, 50);
		jlblName.setBounds(20, 80, 50, 50);
		jlblGender.setBounds(20, 130, 50, 50);
		jlblEmail.setBounds(20, 180, 50, 50);
		
		add(jlblNum);
		add(jlblName);
		add(jlblGender);
		add(jlblEmail);
		
		//JButton
		JButton jbtnAdd = new JButton("추가");
		JButton jbtnDelete = new JButton("삭제");
		JButton jbtnChange = new JButton("변경");
		JButton jbtnClose = new JButton("닫기");
		
		Font font = new Font("고딕", Font.PLAIN, 10);
		
		jbtnAdd.setFont(font);
		jbtnDelete.setFont(font);
		jbtnChange.setFont(font);
		jbtnClose.setFont(font);
		
		jbtnAdd.setBounds(70, 250, 70, 70);
		jbtnDelete.setBounds(160, 250, 70, 70);
		jbtnChange.setBounds(250, 250, 70, 70);
		jbtnClose.setBounds(340, 250, 70, 70);
		
		add(jbtnAdd);
		add(jbtnDelete);
		add(jbtnChange);
		add(jbtnClose);
		
		//JTextField
		JTextField jft = new JTextField(10);
		JTextField jft1 = new JTextField(10);
		JTextField jft2 = new JTextField(10);
		
		jft.setBounds(70, 30, 150, 40);
		jft1.setBounds(70, 80, 150, 40);
		jft2.setBounds(70, 180, 150, 40);
		
		add(jft);
		add(jft1);
		add(jft2);
		
		//JTextArea
		JTextArea jta = new JTextArea();
		
		jta.setBounds(250, 30, 200, 200);
		
		add(jta);
		
		//JRadioButton
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JRadioButton jrbnM = new JRadioButton("남");
		JRadioButton jrbnF = new JRadioButton("여");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbnM);
		bg.add(jrbnF);
		//컴포넌트를 컨테이너에 올리기
		jp1.add(jrbnM);
		jp2.add(jrbnF);
		add(jp1);
		add(jp2);
		jp1.setBounds(70, 130, 50, 50);
		jp2.setBounds(130, 130, 50, 50);
		
		jta.setLineWrap(true);//자동줄바꿈
		
		//Border설정
		jta.setBorder(new TitledBorder("데이터"));
		
		setLayout(null);
		
		setBounds(200, 200, 500, 400);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//HomeAssignment_0126

	public static void main(String[] args) {
		new HomeAssignment_0126();
	}//main

}//class
