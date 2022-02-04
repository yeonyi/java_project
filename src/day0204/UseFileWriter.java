package day0204;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * 문자열 데이터를 목적지 파일로 기록
 * @author user
 */
public class UseFileWriter extends JDialog {
	
	
	public void writeData() throws IOException {
		String msg = "오늘은 즐거운 금요일입니다.";
		
		File file = new File("e:/dev/temp/write_data.txt");
		FileWriter fw = null;
		try {
			//1.스트림 연결
			fw = new FileWriter(file);//스트림이 생성되면 파일을 덮어 쓴다.
			//2. 스트림에 데이터를 기록
			fw.write(msg);
			//3. 스트림에 기록된 데이터를 목적지로 분출
			fw.flush();
			
			System.out.println("파일로 데이터를 기록하였습니다.");
		}finally {
			//4. 스트림을 끊는다.(메모리 누수 방지)
			if(fw != null) {fw.close();}//end if
		}//end finally
		
	}//writeData
	

	public static void main(String[] args) {
		UseFileWriter ufw = new UseFileWriter();
		try {
			ufw.writeData();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//main

}//class
