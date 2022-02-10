package day0209;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 * ��Ʈ�� ���� �����ڰ� �����⸦ ��ٸ��� ���α׷� => ����
 * ��ȭ�� ����
 * @author user
 */
public class SimpleServer {

	public SimpleServer() throws IOException {
		//1.�������� ����(port�� ����),port�� �����̾ �� Ŭ������ �ι� �����ϸ� ����
		ServerSocket server = null;
		Socket client = null; //�����ڿ� ����
		DataOutputStream dos = null;//�����ڿ��� �޽����� ������ ���� ��Ʈ��
		DataInputStream dis = null;//0210 �����ڰ� �������� �޽����� �б� ���� ��Ʈ��
		String revMsg="";//0210
		String sendMsg="";
//		try {
			server = new ServerSocket(65500);
			System.out.println("����������..");
			
			//3.�����ڰ� ������ ������ ������ �㰡�Ͽ� �޴´�.
			while(true){
				client = server.accept();
				System.out.println("������ ����"+client.getInetAddress());

				//�����ڿ��� ������ �޽���
				sendMsg = "�ȳ��ϼ���.-�ֿ���";
				//4.�����ڿ��� �޽����� ������ ���� ��Ʈ���� �����Ѵ�.
				dos = new DataOutputStream(client.getOutputStream());
				//5.��Ʈ���� ������ ����
				dos.writeUTF(sendMsg);//�ѱ��� ���ڵ� �ȴ�.
				//6.�������� ����
				dos.flush();//��Ʈ���� ������ �������� ����
				
				dis = new DataInputStream(client.getInputStream());//0210
				//10.�����͸� �д´�.
				revMsg = dis.readUTF();//0210
				JOptionPane.showMessageDialog(null, revMsg);
				
			}//end while
//		}finally {
//			if(dos != null) {dos.close();}
//			if(client != null) {client.close();}
//			if(server != null) {server.close();}
//		}//end finally
		
	}//SimpleServer

	public static void main(String[] args) {
		try {
			new SimpleServer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main

}//class
