package day0209;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 * 포트를 열고 접속자가 들어오기를 기다리는 프로그램 => 서버
 * 방화벽 열기
 * @author user
 */
public class SimpleServer {

	public SimpleServer() throws IOException {
		//1.서버소켓 생성(port가 열림),port는 선점이어서 이 클래스를 두번 실행하면 에러
		ServerSocket server = null;
		Socket client = null; //접속자와 연결
		DataOutputStream dos = null;//접속자에게 메시지를 보내기 위한 스트림
		DataInputStream dis = null;//0210 접속자가 보내오는 메시지를 읽기 위한 스트림
		String revMsg="";//0210
		String sendMsg="";
//		try {
			server = new ServerSocket(65500);
			System.out.println("서버가동중..");
			
			//3.접속자가 들어오면 접속자 소켓을 허가하여 받는다.
			while(true){
				client = server.accept();
				System.out.println("접속자 있음"+client.getInetAddress());

				//접속자에게 보내줄 메시지
				sendMsg = "안녕하세요.-최연이";
				//4.접속자에게 메시지를 보내기 위한 스트림을 연결한다.
				dos = new DataOutputStream(client.getOutputStream());
				//5.스트림에 데이터 쓰기
				dos.writeUTF(sendMsg);//한글이 인코딩 된다.
				//6.목적지로 분출
				dos.flush();//스트림의 내용을 목적지로 분출
				
				dis = new DataInputStream(client.getInputStream());//0210
				//10.데이터를 읽는다.
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
