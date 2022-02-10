package day0210;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.nio.charset.MalformedInputException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class SimpleChatClient extends JFrame implements ActionListener {
	
	private JTextArea jtaTalkDisplay;
	private JTextField jtfTalk;
	private JScrollPane jspJtaTalkDisplay;
	
	private Socket client;//������ ����
	private DataInputStream disReadStream;//�������б�
	private DataOutputStream dosWriteStream;//�����;���
	
	public SimpleChatClient(String ip) {
		super(":::::::::ä��Ŭ���̾�Ʈ::::::::::");
		
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
			connectToServer(ip);
			readMsg();
		}catch(MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jtfTalk.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				
				dispose();
			}//windowClosing
		});
		
	}//SimpleChatServer
	
	private void connectToServer(String ip) throws IOException,MalformedURLException {
		client = new Socket("211.63.89."+ip, 50000);//������ ����
		disReadStream = new DataInputStream(client.getInputStream());
		dosWriteStream = new DataOutputStream(client.getOutputStream());
		jtaTalkDisplay.setText("������ �����Ͽ����ϴ�.");
	}//connectToServer

	/**
	 * ���ѷ����� �޽��� �б�
	 * @throws IOException
	 */
	private void readMsg() throws IOException {
		while(true) {
			jtaTalkDisplay.append(disReadStream.readUTF()+"\n");
			setScrollbar();
		}//end while
	}//readMsg
	
	private void setScrollbar() {
		jspJtaTalkDisplay.getVerticalScrollBar().setValue(
				jspJtaTalkDisplay.getVerticalScrollBar().getMaximum());
	}
	
	private void sendMsg() throws IOException{
		String msg = jtfTalk.getText();
		StringBuilder sbMsg = new StringBuilder();
		sbMsg.append("Ÿ����: ").append(msg);
		System.out.println(sbMsg);
		//�� ��ȭâ�� �޽����� �ø���
		jtaTalkDisplay.append(sbMsg.toString()+"\n");
		//�����ڿ��� �޽����� ������
		dosWriteStream.writeUTF(sbMsg.toString());
		dosWriteStream.flush();
		
		//�� ��ȭâ �ʱ�ȭ
		jtfTalk.setText("");
		setScrollbar();
	}//sendMsg
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			sendMsg();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}//actionPerformed

	public static void main(String[] args) {
		String ip=JOptionPane.showInputDialog("������ IP�� �Է��� �ּ���.\n131,133,134,135,153,140,141,142,143,144,157,147,155,149,150,151,152,148");
		if( ip != null && !ip.isEmpty()) {
		new  SimpleChatClient(ip);
		}
	}//main

}//class
