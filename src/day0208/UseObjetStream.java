package day0208;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * 객체를 쓰거나 읽기 위한 Stream
 * @author user
 */
@SuppressWarnings("serial")
public class UseObjetStream {
	

	public void writeObject() throws IOException {
		MyData md = new MyData("김현우", 182.5, 70.2);//직렬화 대상 객체
		//객체(ObjectOutputStream)를 파일(FileOutputStream)에 출력할 수 있는 Stream 생성
		ObjectOutputStream oos = null;
		
		try {
			//1.스트림 생성
			oos = new ObjectOutputStream(new FileOutputStream(new File("e:/dev/temp/writeObj.dat")));
			//2.객체 쓰고
			oos.writeObject(md);
			//3.스트림의 내용을 분출
			oos.flush();
			JOptionPane.showMessageDialog(null, "객체를 스트림에 기록하였습니다.");
			
		}finally {
			//4.연결 끊는다
			if(oos != null) {oos.close();}
		}
		
		
//		System.out.println("객체 쓰기");
	}//writeObject

	public void readObject() throws IOException, ClassNotFoundException {
		
		ObjectInputStream ois = null;
		try {
			//1.스트림연경
			ois = new ObjectInputStream(new FileInputStream(new File("e:/dev/temp/writeObj.dat")));
			//2.객체 읽기
			MyData md = (MyData)ois.readObject();
			//3.읽어들이 객체 사용
			StringBuilder readData = new StringBuilder();
			readData.append("이름: ").append(md.getName()).append("\n");
			readData.append("키: ").append(md.getHeight()).append("\n");
			readData.append("몸무게: ").append(md.getWeight()).append("\n");
			JOptionPane.showMessageDialog(null, readData.toString());
		}finally {
			if( ois != null) {ois.close();}
		}
		System.out.println("객체 읽기");
	}//readObject
	
	public static void main(String[] args) {
		
		UseObjetStream uos = new UseObjetStream();
		
		String inputMenu = "";
		boolean exitFlag = false;
		do {
			inputMenu = JOptionPane.showInputDialog("1.객체쓰기 2.객체읽기 3.종료");
			if(inputMenu != null) {
			switch(inputMenu) {
			case "1" : 
				try {
					uos.writeObject();
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null,"객체를 쓸 수 없습니다.");
					e.printStackTrace();
				}//end catch
				break;
			case "2" : 
				try {
					uos.readObject();
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null,"객체를 읽어들일 수 없습니다.");
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					JOptionPane.showMessageDialog(null,"읽어들인 파일에 객체가 존재하지 않습니다.");
					e.printStackTrace();
				}//end catch
				break;
			case "3" : 
				exitFlag = true;
				break;
			default:
				JOptionPane.showMessageDialog(null, "메뉴 1,2,3번중 하나만 입력해주세요");
			}
			}//end if
		}while(!exitFlag);
		JOptionPane.showMessageDialog(null, "사용해주셔서 감사합니다.");
		}//main

}//class
