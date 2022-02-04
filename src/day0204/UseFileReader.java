package day0204;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 16bit ��Ʈ���� ����� ������ �� ���� �б�
 * @author user
 */
@SuppressWarnings("serial")
public class UseFileReader  extends JFrame{
	
	public void readFile() throws IOException {
		//1.������ ���Ͽ� ������ ��� ��ü ����
		FileDialog fd = new FileDialog(this, "���ϼ���", FileDialog.LOAD);
		fd.setVisible(true);
		String path = fd.getDirectory();
		String name = fd.getFile();
		
		File file = new File(path+name);
		if(file.exists()) {
			BufferedReader br = null;//�ٴ����� �д� ���
			
			try {
				//���Ͽ� �����ϴ� ����� ���� ��Ʈ���� ����
				br = new BufferedReader(new FileReader(file));
//				System.out.println(br.readLine());//\n���� ���� �б�
//				String data = "";
//				while((data = br.readLine()) != null) {
//					System.out.println(data);
//				}//end while
				
				String data = "";
				StringBuilder outputData = new StringBuilder();
				while((data = br.readLine()) != null) {
					outputData.append(data).append("\n");
				}//end while
				JTextArea jta = new JTextArea(outputData.toString(),10,50);
				JScrollPane jsp = new JScrollPane(jta);
				
				JOptionPane.showMessageDialog(this, jsp);
				
			}finally {
				if(br != null) {br.close();}//end if �޸� ���� ����
				
			}//end finally
			
		}else {
			JOptionPane.showMessageDialog(this, file+"�� �������� �ʽ��ϴ�.");
			
		}//end else
		
		
	}//readFile

	public static void main(String[] args) {
		UseFileReader ufr = new UseFileReader();
		try {
			ufr.readFile();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		ufr.dispose();
	}//main

}//class
