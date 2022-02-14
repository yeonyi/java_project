package day0211;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class ChatServer extends JFrame implements ActionListener, Runnable {

	private JButton jbtnOpenServer, jbtnClose;

	private JScrollPane jspServerMonitor;
	private JList<String> jlServerMonitor;
	private DefaultListModel<String> dlmServerMonitor;

	private Thread serverThread;// 접속자 소켓을 윈도우 디자인과 동시에 받기 위한 쓰레드
	public static List<ChatHelper> connectList;// 접속자를 받기 위한 리스트

	private ServerSocket server;// 접속자가 소켓을 받기 위한 서버 소켓

	public ChatServer() {
		super(":::::::채팅방 관리자::::::::::");
		
		connectList = new ArrayList<ChatHelper>();

		jbtnOpenServer = new JButton("서버가동");
		jbtnClose = new JButton("서버 종료");

		dlmServerMonitor = new DefaultListModel<String>();

		jlServerMonitor = new JList<String>(dlmServerMonitor);
		jspServerMonitor = new JScrollPane(jlServerMonitor);

		jspServerMonitor.setBorder(new TitledBorder("접속자 정보"));

		JPanel jpSouth = new JPanel();

		jpSouth.add(jbtnOpenServer);
		jpSouth.add(jbtnClose);

		add("Center", jspServerMonitor);
		add("South", jpSouth);

		jbtnClose.addActionListener(this);
		jbtnOpenServer.addActionListener(this);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}// windowClosing

			@Override
			public void windowClosed(WindowEvent we) {
				try {
					if(server != null) {server.close();}//end
					System.exit(JFrame.ABORT);
				}catch(IOException ie) {
					ie.printStackTrace();
				}
			}// windowClosed

		});

		setBounds(100, 100, 500, 800);
		setVisible(true);

	}// ChatServer

	/**
	 * 접속자 소켓을 받고, 헬퍼에 넣고 접속자가 보내오는 메시지를 읽을 수 있는 상태로 만든다
	 */
	@Override
	public void run() {
		try {
			server = new ServerSocket(25000);// PORT를 열기
			dlmServerMonitor.addElement("서버 가동중"); 
			
			ChatHelper helper = null;
//			for(int cnt = 0;;cnt++) {//접속자 무한대로 받기
			for (int cnt = 0; connectList.size() < 20; cnt++) {// 리스트에 있는 접속자 만큼 받기
				helper = new ChatHelper(server.accept(), dlmServerMonitor, cnt,jspServerMonitor);
				connectList.add(helper);
				//생성된 helper를 대화를 읽어들여 보내줄 수 있는 상태로 만든다=>스레드를 돌린다		
				helper.start();
			}//end for

		} catch (IOException e) {
			e.printStackTrace();
		} // end catch

	}// run

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == jbtnClose) {
			dispose();
		} // end if
		if (ae.getSource() == jbtnOpenServer) {

			if (serverThread != null) {
				JOptionPane.showMessageDialog(this, "서버가 이미 가동중입니다.");
				return;// 아래줄의 코드를 실행하지 말고 호출한 곳으로 돌아가:early return
			} // end if
				// else를 작성하지 않고 else역할을 하는 코드를 작성하면 된다.(early return :가독성 향상)
			serverThread = new Thread(this);
			serverThread.start();// start => run

		} // end if

	}// actionPerformed

	public static void main(String[] args) {
		new ChatServer();
	}// main

}// class
