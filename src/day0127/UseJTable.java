package day0127;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class UseJTable extends JFrame {
	
	public UseJTable() {
		
		super("MVC Pattern을 도입한 클래스");
		
		//컴포넌트의 생성
		String[] columnNames = {"번호", "이름", "나이", "이메일"};
		String[][] rowData = {
				{"1", "정인선", "24", "jung@test.com"},
				{"2", "장정우", "25", "jang@daum.net"},
				{"3", "김진영", "24", "kim@gmail.com"},
				};
		//데이터를 관리하는 Model클래스를 생성한다.
		DefaultTableModel dtm = new DefaultTableModel(rowData, columnNames);
		
		//데이터를 보여줌
		JTable jt = new JTable(dtm);
		
		JScrollPane jsp = new JScrollPane(jt);
		
		//데이터 추가 (Model사용)
		String[] data = {"4", "김현우", "27", "kim@naver.com"};
		dtm.addRow(data);
		
		//디자인을 변경할 때에는 View 클래스 사용
		jt.setRowHeight(25);
		//컬럼의 넓이 변경 (JTable의 컬럼 정보를 가진 객체를 얻어서 변경)
		jt.getColumnModel().getColumn(0).setPreferredWidth(40);
		jt.getColumnModel().getColumn(1).setPreferredWidth(120);
		jt.getColumnModel().getColumn(2).setPreferredWidth(40);
		jt.getColumnModel().getColumn(3).setPreferredWidth(250);
		
		
		
		//Border Layout Center 영역에 컴포넌트 배치
		add("Center", jsp);
		
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseJTable

	public static void main(String[] args) {
		new UseJTable();
	}//main

}//class
