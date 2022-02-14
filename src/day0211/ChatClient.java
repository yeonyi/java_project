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
		super("::::::::::::: ä�� Ŭ���̾�Ʈ :::::::::::::::::::");
		jtfServerIp=new JTextField("211.63.89.",8);
		jtfNickName=new JTextField(10);
		jtfTalkInput=new JTextField();
		
		jbtnConnectServer=new JButton("��������");
		jbtnCapture=new JButton("��ȭ����");
		
		jtaTalkDisplay=new JTextArea();
		jspJtaTalkDisplay=new JScrollPane( jtaTalkDisplay );
		
		jtaTalkDisplay.setEditable(false);
		
		JPanel jpNorth=new JPanel();
		jpNorth.add(new JLabel("�����ּ�"));
		jpNorth.add( jtfServerIp);
		jpNorth.add(new JLabel("��ȭ��"));
		jpNorth.add( jtfNickName);
		jpNorth.add( jbtnConnectServer);
		jpNorth.add( jbtnCapture);
		
		jpNorth.setBorder(new TitledBorder("��������"));
		jspJtaTalkDisplay.setBorder(new TitledBorder("��ȭ����"));
		jtfTalkInput.setBorder(new TitledBorder("��ȭ"));
		
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
		//�޽����� ���� ������ �о���δ�.(connectToServer()���� start()�� ȣ��)
		try {
			while(true) {
				jtaTalkDisplay.append(disReadStream.readUTF());
				jtaTalkDisplay.append("\n");
				//��ȭ�� ���뿡 ���� ��ũ�ѹٸ� ���� �Ʒ��� ������.
				jspJtaTalkDisplay.getVerticalScrollBar().setValue(
						jspJtaTalkDisplay.getVerticalScrollBar().getMaximum());
			}//end while
		}catch(IOException ie) {
			JOptionPane.showConfirmDialog(this,"������ ����Ǿ����ϴ�.");
			ie.printStackTrace();
		}
		
	}//run

	private void talkCapture() throws IOException{
		File directory = new File("e:/javachat/capture/");
		if(!directory.exists()) {//!�� �־�� ������ ���� ��Ȳ���� ������ �����ϰԵ˴ϴ�.
			directory.mkdirs();
		}//end if
		File file = new File(directory.getAbsolutePath()+"/cap_"+System.currentTimeMillis()+".dat");

		BufferedWriter bw = null;
		try{
			//ĸ�������� �����ϱ� ���� ��Ʈ���� ����
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(jtaTalkDisplay.getText());
			bw.flush();
			JOptionPane.showMessageDialog(this, file.getName()+"�� ��ȭ ������ ����Ǿ����ϴ�.");
		}finally {
			if(bw != null) {bw.close();}//end if
			}//end finally
	
	}//talkCapture
	
	private void connectToServer() throws UnknownHostException, IOException {
		if(someClient != null && someClient.isConnected()) {
			JOptionPane.showMessageDialog(this, "������ ���ӵǾ��ֽ��ϴ�.");
			return;
		}//end if
		//������ �����Ͽ� ������ �����ϰ�
		String serverIpAddress = jtfServerIp.getText().replaceAll(" ","");
		someClient = new Socket(serverIpAddress, 25000);
		//��Ʈ���� �����Ͽ� �����͸� �аų� ���� �� �ֵ��� �����
		disReadStream = new DataInputStream(someClient.getInputStream());
		dosWriteStream = new DataOutputStream(someClient.getOutputStream());
		
		//��Ʈ���� ����Ǿ����� �����͸� ������ ���� �� �ִ� ���°� �Ǿ���.
		//�г����� ������ �ȴ�.
		String nick = jtfNickName.getText();
		dosWriteStream.writeUTF(nick);
		
		//�����͸� �о���� �� �ִ� ����(������)
		threadClient = new Thread(this);
		threadClient.start();//-->run()
		
		jtaTalkDisplay.setText("������ �����Ͽ����ϴ�.\n��ſ� ä��\n");
		//Ŀ���� ��ȭ�Է�â�� �ִ´�.
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
			if(ae.getSource() == jbtnCapture) {//��ȭ���� ����
				talkCapture();
			}
			}catch(IOException e) {
				e.printStackTrace();
		}//end catch
		
		if(ae.getSource() == jbtnConnectServer) {//��������
			try {
				connectToServer();
			} catch (UnknownHostException e) {
				JOptionPane.showMessageDialog(this,"������ �������� �ʽ��ϴ�.");
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//end if
		if(ae.getSource() == jtfTalkInput) {//��ȭ�Է�
			try {
				sendMsg();
			}catch(IOException e) {
				JOptionPane.showMessageDialog(this, "������ �������� �ʽ��ϴ�.");
				e.printStackTrace();
			}
			
			
		}//end if
		
	}//actionPerformed
	
	public static void main(String[] args) {
		new ChatClient();
	}//main

}//class
