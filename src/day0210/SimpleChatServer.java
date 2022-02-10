package day0210;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class SimpleChatServer extends JFrame implements ActionListener {
	
	private JTextArea jtaTalkDisplay;
	private JTextField jtfTalk;
	private JScrollPane jspJtaTalkDisplay;
	
	private ServerSocket server;//port����, ������ ������ �ް� ����
	private Socket client;//�����ڰ� ������ ����
	private DataInputStream disReadStream;//�������� �޽����� �б� ���� ��Ʈ��
	private DataOutputStream dosWriteStream;//�����ڿ��� �������� ������ ���� ��Ʈ��
	
	public SimpleChatServer() {
		super(":::::::::ä�ü���::::::::::");
		
		jtaTalkDisplay=new JTextArea();
		jspJtaTalkDisplay=new JScrollPane( jtaTalkDisplay );
		jtfTalk=new JTextField();
		
		jtaTalkDisplay.setEditable(false);

		jspJtaTalkDisplay.setBorder(new TitledBorder("��ȭ����"));
		jtfTalk.setBorder(new TitledBorder("��ȭ"));
		
		add("Center",jspJtaTalkDisplay);
		add("South",jtfTalk);
		
		setBounds(100, 100, 400, 600);
		setVisible(true);

		try {
			openServer();
		}catch(IOException e) {
			e.printStackTrace();
		}//end catch
		
		jtfTalk.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				
				dispose();
			}//windowClosing

			@Override
			public void windowClosed(WindowEvent e) {
				try {
				if(disReadStream != null) {disReadStream.close();}
				if(dosWriteStream != null) {dosWriteStream.close();}
				if(client != null) {client.close();}
				if(server != null) {server.close();}
				}catch(IOException ie) {
					ie.printStackTrace();
				}finally {
					System.exit(JFrame.ABORT);
				}
			}
		});
		
	}//SimpleChatServer

	private void openServer() throws IOException {
		if(server == null) {
			server = new ServerSocket(50000);
			jtaTalkDisplay.setText("����������..\n������ �����⸦ ��ٸ�..\n");
			
			client = server.accept();//�����ڰ� ������ �����ڸ� �޴´�
			jtaTalkDisplay.append("������ ������\n");
			//��ȭ�� �����ų� ���� �� �ֵ��� ���Ͽ��� ��Ʈ�� ����
			disReadStream = new DataInputStream(client.getInputStream());
			dosWriteStream = new DataOutputStream(client.getOutputStream());
			jtaTalkDisplay.append("��ſ� ä�õǼ���.\n");
			readMsg();//�޽����� �о���̴� method�� ȣ������ �ʾƾ��
		}//end if
	}//openServer
	
	private void setScrollbar() {
		jspJtaTalkDisplay.getVerticalScrollBar().setValue(
				jspJtaTalkDisplay.getVerticalScrollBar().getMaximum());
	}
	
	/**
	 * �����ڰ� �������� �޽����� ���ѷ����� �о�鿩 jta�� ���
	 */
	public void readMsg() {
		try {
			while(true) {
				jtaTalkDisplay.append(disReadStream.readUTF()+"\n");
				setScrollbar();
			}//end while
		}catch(IOException ie) {
			jtaTalkDisplay.append("��ȭ��밡 ä�� ����");
			ie.printStackTrace();
		}//end catch
	}//readMsg
	
	public void sendMsg() throws IOException {
		String msg = jtfTalk.getText();
		dosWriteStream.writeUTF("�ɷη� : "+msg); //�����ڿ��� �޽����� ������
		dosWriteStream.flush();
		
		jtaTalkDisplay.append("�ɷη� : " +msg+"\n");//�� ��ȭâ���� �޽����� �ø���
		jtfTalk.setText("");//��ȭ�Է�â�� �ʱ�ȭ �Ѵ�.
		setScrollbar();
	}//sendMsg
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			sendMsg();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
	}//actionPerformed

	public static void main(String[] args) {
		new  SimpleChatServer();
	}//main

}//class
