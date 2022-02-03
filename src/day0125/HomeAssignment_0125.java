package day0125;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class HomeAssignment_0125 extends JFrame {
	public HomeAssignment_0125() {
		super("전화번호 키패드 만들기");
		
		//컴포넌트 생성
//		JButton jbtn1 = new JButton("1");
//		JButton jbtn2 = new JButton("2");
//		JButton jbtn3 = new JButton("3");
//		JButton jbtn4 = new JButton("4");
//		JButton jbtn5 = new JButton("5");
//		JButton jbtn6 = new JButton("6");
//		JButton jbtn7 = new JButton("7");
//		JButton jbtn8 = new JButton("8");
//		JButton jbtn9 = new JButton("9");
//		JButton jbtn11 = new JButton("*");
//		JButton jbtn0 = new JButton("0");
//		JButton jbtn12 = new JButton("#");
		
		String[] btnLabel="1,2,3,4,5,6,7,8,9,*,0,#".split(",");
		
		
		//컴포넌트 배치
		setLayout(new GridLayout(4, 3));
//		add(jbtn1);
//		add(jbtn2);
//		add(jbtn3);
//		add(jbtn4);
//		add(jbtn5);
//		add(jbtn6);
//		add(jbtn7);
//		add(jbtn8);
//		add(jbtn9);
//		add(jbtn11);
//		add(jbtn0);
//		add(jbtn12);
		
		JButton[] jbtn = new JButton[btnLabel.length];//빈 버튼 배열 생성,모든값의 방이 null
		for(int i = 0; i< btnLabel.length;i++) {
			jbtn[i] = new JButton(btnLabel[i]);//배열번째 방에 JButton 객체 생성
			add(jbtn[i]);//생성된 버튼 객체를 배치
		}//end for
		
		//윈도우 크기 설정
		setSize(300, 500);
		
		//가시화
		setVisible(true);
		
		//윈도우 종료 이벤트 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}//HomeAssignment_0125

	public static void main(String[] args) {
		new HomeAssignment_0125();
	}//main

}//class
