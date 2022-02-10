package day0209;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

/**
 * ������ ip�ּҿ� ��Ʈ�� ������ ������ ã�� �����ϴ� �� => client
 * @author user
 */
public class SimpleClient {

	public SimpleClient() throws UnknownHostException, IOException {
		Socket client = null; //��ǻ�ͳ��� ����
		DataInputStream dis = null;//������ �б����� ��Ʈ��
		DataOutputStream dos = null;//0210 ������ ������ ���� ��Ʈ��
		
		try {
			String ip = JOptionPane.showInputDialog("ip�� �־��ּ���");
			//2.������ �����Ͽ� ������ ������ �õ��Ѵ�.
		client = new Socket("211.63.89."+ip, 65500);
		System.out.println("������ ���� �õ��Ͽ� ���Ӽ���");
		//4.�������� �������� �޽����� �б� ���� ��Ʈ���� ����
		dis = new DataInputStream(client.getInputStream());
		//5.�޽����� decode �Ͽ� �о���δ�.
		String revMsg = dis.readUTF();
		System.out.println("�������� �� �޽���: "+revMsg);
		
		dos = new DataOutputStream(client.getOutputStream());//0210
		
		String msg = JOptionPane.showInputDialog("������ ���� �޽��� �Է�", "�ֿ���: ");//0210
		//8. �Է¹��� �޽����� ��Ʈ���� �⏋
		dos.writeUTF(msg);//0210
		//9. ��Ʈ���� ���� ����
		dos.flush();//2010
		
		}finally {
			if(dis != null) {dis.close();}
			if(client != null) {client.close();}
		}//end finally
		
	}//SimpleClient
	
	public static void main(String[] args) {
		try {
			new SimpleClient();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
