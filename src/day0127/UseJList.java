package day0127;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseJList extends JFrame {
	
	public UseJList() {
		super("MVC Pattern이 도입된 클래스");
		
		//컴포넌트 생성
		//MVC Pattern이 도입된 컴포넌트는 Model부터 생성
		DefaultListModel<String> dlmFriend = new DefaultListModel<String>();
		DefaultListModel<String> dlmBlockFriend = new DefaultListModel<String>();
		
		JList<String> listFriend = new JList<String>(dlmFriend);
		JList<String> listBlockFriend = new JList<String>(dlmBlockFriend);
		
		//JList는 스크롤바가 없어서 컨테이너 컴포넌트를 사용해 스크롤바 설정
		JScrollPane jspListFriend = new JScrollPane(listFriend);
		JScrollPane jspListBlockFriend = new JScrollPane(listBlockFriend);

		jspListFriend.setBorder(new TitledBorder("친구목록"));
		jspListBlockFriend.setBorder(new TitledBorder("차단된 친구목록"));
		
		JButton jbtnBlock = new JButton(">>");
		JButton jbtnNonBlock = new JButton("<<");
		
		//Model을 통해서 데이터를 추가
		dlmFriend.addElement("전민정");
		dlmFriend.addElement("정인선");
		dlmFriend.addElement("정시헌");
		dlmFriend.addElement("김진영");
		dlmFriend.addElement("서지숙");
		dlmFriend.addElement("김현우");
		dlmFriend.addElement("박설진");
		
		//배치
		setLayout(null);//자동배치관리자를 해제
		
		//위치, 크기 설정
		jspListFriend.setBounds(20, 40, 200, 350);
		jspListBlockFriend.setBounds(330, 40, 200, 350);
		jbtnBlock.setBounds(250, 150, 50, 40);
		jbtnNonBlock.setBounds(250, 210, 50, 40);

		add(jspListFriend);
		add(jspListBlockFriend);
		add(jbtnBlock);
		add(jbtnNonBlock);
		
		setBounds(100, 150, 600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseJList
	
	public static void main(String[] args) {
		new UseJList();
	}//main

}//class
