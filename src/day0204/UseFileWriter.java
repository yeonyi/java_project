package day0204;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * ���ڿ� �����͸� ������ ���Ϸ� ���
 * @author user
 */
public class UseFileWriter extends JDialog {
	
	
	public void writeData() throws IOException {
		String msg = "������ ��ſ� �ݿ����Դϴ�.";
		
		File file = new File("e:/dev/temp/write_data.txt");
		FileWriter fw = null;
		try {
			//1.��Ʈ�� ����
			fw = new FileWriter(file);//��Ʈ���� �����Ǹ� ������ ���� ����.
			//2. ��Ʈ���� �����͸� ���
			fw.write(msg);
			//3. ��Ʈ���� ��ϵ� �����͸� �������� ����
			fw.flush();
			
			System.out.println("���Ϸ� �����͸� ����Ͽ����ϴ�.");
		}finally {
			//4. ��Ʈ���� ���´�.(�޸� ���� ����)
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
