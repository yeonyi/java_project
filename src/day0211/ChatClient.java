package day0211;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class ChatClient extends JFrame implements ActionListener, Runnable {

	private JTextArea jtaTalkDisplay;
	private JTextField jtfServerIp, jtfNickName, jtfTalkInput;
	private JButton jbtnConnectServer, jbtnCapture;
	
	private JScrollPane jspJtaTalkDisplay;
	
	private Socket someClient;
	private DataInputStream disReadStream;
	private DataOutputStream dosWriteStream;
	
	private Thread threadClient;
	
	public ChatClient() {
		super("::::::::::::: 채팅 클라이언트 :::::::::::::::::::");
		jtfServerIp=new JTextField("211.63.89.",8);
		jtfNickName=new JTextField(10);
		jtfTalkInput=new JTextField();
		
		jbtnConnectServer=new JButton("서버접속");
		jbtnCapture=new JButton("대화저장");
		
		jtaTalkDisplay=new JTextArea();
		jspJtaTalkDisplay=new JScrollPane( jtaTalkDisplay );
		
		jtaTalkDisplay.setEditable(false);
		
		JPanel jpNorth=new JPanel();
		jpNorth.add(new JLabel("서버주소"));
		jpNorth.add( jtfServerIp);
		jpNorth.add(new JLabel("대화명"));
		jpNorth.add( jtfNickName);
		jpNorth.add( jbtnConnectServer);
		jpNorth.add( jbtnCapture);
		
		jpNorth.setBorder(new TitledBorder("접속정보"));
		jspJtaTalkDisplay.setBorder(new TitledBorder("대화내용"));
		jtfTalkInput.setBorder(new TitledBorder("대화"));
		
		add("North", jpNorth );
		add("Center", jspJtaTalkDisplay );
		add("South",jtfTalkInput);

		jbtnCapture.addActionListener(this);
		jbtnConnectServer.addActionListener(this);
		jtfTalkInput.addActionListener(this);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing

			@Override
			public void windowClosed(WindowEvent we) {
				
				try {
					if(disReadStream != null) {disReadStream.close();}
					if(dosWriteStream != null) {dosWriteStream.close();}
					if(someClient != null) {someClient.close();}
					
				}catch(IOException ie){
					ie.printStackTrace();
					
				}finally {
					System.exit(JFrame.ABORT);
				}
				
			}//windowClosed
			
		});
		
		setBounds(100, 100, 700, 500);
		setVisible(true);
		
	}//ChatClient
	
	@Override
	public void run() {
		//메시지를 무한 루프로 읽어들인다.(connectToServer()에서 start()로 호출)
		try {
			while(true) {
				jtaTalkDisplay.append(disReadStream.readUTF());
				jtaTalkDisplay.append("\n");
				//대화의 내용에 따라 스크롤바를 가장 아래로 내린다.
				jspJtaTalkDisplay.getVerticalScrollBar().setValue(
						jspJtaTalkDisplay.getVerticalScrollBar().getMaximum());
			}//end while
		}catch(IOException ie) {
			JOptionPane.showConfirmDialog(this,"서버가 종료되었습니다.");
			ie.printStackTrace();
		}
		
	}//run

	private void talkCapture() throws IOException{
		File directory = new File("e:/javachat/capture/");
		if(!directory.exists()) {//!이 있어야 폴더가 없는 상황에서 폴더를 생성하게됩니다.
			directory.mkdirs();
		}//end if
		File file = new File(directory.getAbsolutePath()+"/cap_"+System.currentTimeMillis()+".dat");

		BufferedWriter bw = null;
		try{
			//캡쳐파일을 저장하기 위해 스트림을 연결
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(jtaTalkDisplay.getText());
			bw.flush();
			JOptionPane.showMessageDialog(this, file.getName()+"로 대화 내용이 저장되었습니다.");
		}finally {
			if(bw != null) {bw.close();}//end if
			}//end finally
	
	}//talkCapture
	
	private void connectToServer() throws UnknownHostException, IOException {
		if(someClient != null && someClient.isConnected()) {
			JOptionPane.showMessageDialog(this, "서버에 접속되어있습니다.");
			return;
		}//end if
		//소켓을 생성하여 서버에 접속하고
		String serverIpAddress = jtfServerIp.getText().replaceAll(" ","");
		someClient = new Socket(serverIpAddress, 25000);
		//스트림을 연결하여 데이터를 읽거나 보낼 수 있도록 만들고
		disReadStream = new DataInputStream(someClient.getInputStream());
		dosWriteStream = new DataOutputStream(someClient.getOutputStream());
		
		//스트림이 연결되었으니 데이터를 보내고 읽을 수 있는 상태가 되었다.
		//닉네임을 보내면 된다.
		String nick = jtfNickName.getText();
		dosWriteStream.writeUTF(nick);
		
		//데이터를 읽어들일 수 있는 상태(스레드)
		threadClient = new Thread(this);
		threadClient.start();//-->run()
		
		jtaTalkDisplay.setText("서버에 접속하였습니다.\n즐거운 채팅\n");
		//커서를 대화입력창에 넣는다.
		jtfTalkInput.requestFocus();
	}//connectToServer
	
	private void sendMsg()throws IOException {
		String talk = jtfTalkInput.getText();
		dosWriteStream.writeUTF(talk);
		jtfTalkInput.setText("");
	}//sendMsg
	
//	public JTextField getJtfNickName() {
//		return jtfNickName;
//	}
//
//	public void setJtfNickName(JTextField jtfNickName) {
//		this.jtfNickName = jtfNickName;
//	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			if(ae.getSource() == jbtnCapture) {//대화내용 저장
				talkCapture();
			}
			}catch(IOException e) {
				e.printStackTrace();
		}//end catch
		
		if(ae.getSource() == jbtnConnectServer) {//서버접속
			try {
				connectToServer();
			} catch (UnknownHostException e) {
				JOptionPane.showMessageDialog(this,"서버가 존재하지 않습니다.");
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//end if
		if(ae.getSource() == jtfTalkInput) {//대화입력
			try {
				sendMsg();
			}catch(IOException e) {
				JOptionPane.showMessageDialog(this, "서버가 존재하지 않습니다.");
				e.printStackTrace();
			}
			
			
		}//end if
		
	}//actionPerformed
	
	public static void main(String[] args) {
		new ChatClient();
	}//main

}//class
