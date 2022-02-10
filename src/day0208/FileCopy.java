package day0208;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FileCopy extends JFrame {
	
	private JLabel jlblOutput;
	private FileCopy fc;
	
	public FileCopy() {
		super("���� ����");
		
		jlblOutput = new JLabel("���");
		JButton jbtnFileChoose = new JButton("���ϼ���");
		
		jlblOutput.setFont(new Font("�ü�ü", Font.BOLD, 20));
		fc=this;
		jbtnFileChoose.addActionListener(new BtnEventProcess());
		
		//��ġ
		JPanel jpCenter = new JPanel();
		jpCenter.add(jbtnFileChoose);
		
		add("Center", jpCenter);
		add("South", jlblOutput);
		
		setBounds(100, 100, 400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//FileCopy
	
	//////////////////��ư�� �̺�Ʈ�� ó���ϱ� ���� Innerclass ����//////////////
	public class BtnEventProcess implements ActionListener{
		
		public void copyFile(File originalFile) throws IOException{
			//��Ʈ���� ����
			FileInputStream fis = null;
			FileOutputStream fos = null;
			try {
				System.out.println(originalFile);
				//1. ���� ���Ͽ� ��Ʈ�� ����
				fis=new FileInputStream(originalFile);
				//2. ������ ���ϸ� ���� : �������ϸ�_copy�� �̸����� ����
				//E:\dev\src\day1224\�� �ؽ�Ʈ ����.txt
				//E:\dev\src\day1224\�� �ؽ�Ʈ ����_copy.txt
				//���ϸ��� �������� �� �������ϸ�_copy��� �̸����� ���ϸ��� ���� ���
				StringBuilder copyFileName = new StringBuilder(originalFile.getAbsolutePath());
				copyFileName.insert(copyFileName.lastIndexOf("."),"_copy");
				
				File copyFile = new File(copyFileName.toString());
				
				System.out.println(copyFile);
				
				//3. ��½�Ʈ�� ����
				fos = new FileOutputStream(copyFileName.toString());
				
				//4. HDD���� �ѹ��� �о���� �����͸� ������ �� �迭 ����
				byte[] data = new byte[512];
				
				//5. ������ �б�
				int dataSize = 0;
				int cnt = 0;
				while((dataSize=fis.read(data))!=-1) {
					System.out.println(dataSize);
					cnt++;
					//6. �迭�� ����� �������� ũ������� ��Ʈ���� ���
					fos.write(data, 0, dataSize);
				}//end while
				System.out.println(cnt+"�� ����");
				
//////////////////////HDD�� ������� ���� �ڵ�(��������)////////////////////////////				
//				//4. �������Ͽ��� 1byte�� �о�鿩
//				int readData = 0;
//				while((readData = fis.read()) != -1) { //�����Ͱ� �����Ѵٸ�
//					//5. ������ ���Ͽ� ����(����� ���Ͽ� ����� ��Ʈ���� ����.)
//					fos.write(readData);
//				}//end while
//////////////////////HDD�� ������� ���� �ڵ�(��������)////////////////////////////
				
				//6.��Ʈ���� �����ִ� �����͸� ����
				fos.flush();
				JOptionPane.showMessageDialog(fc, copyFile.getName()+"���� ����Ǿ����ϴ�.");
				jlblOutput.setText(copyFile.getAbsolutePath());
				
			}finally {
				if(fis != null) {fis.close();}
				if(fos != null) {fos.close();}
			}//end finally
			
		}//copyFile
		public void copyFile16(File originalFile) throws IOException{
			//��Ʈ���� ����
			BufferedReader br = null;
			FileWriter fw = null;
			try {
				System.out.println(originalFile);
				//1. ���� ���Ͽ� ��Ʈ�� ����
				br=new BufferedReader(new FileReader(originalFile));
				//2. ������ ���ϸ� ���� : �������ϸ�_copy�� �̸����� ����
				//E:\dev\src\day1224\�� �ؽ�Ʈ ����.txt
				//E:\dev\src\day1224\�� �ؽ�Ʈ ����_copy.txt
				//���ϸ��� �������� �� �������ϸ�_copy��� �̸����� ���ϸ��� ���� ���
				StringBuilder copyFileName = new StringBuilder(originalFile.getAbsolutePath());
				copyFileName.insert(copyFileName.lastIndexOf("."),"_copy");
				
				File copyFile = new File(copyFileName.toString());
				
				System.out.println(copyFile);
				
				//3. ��½�Ʈ�� ����
				fw = new FileWriter(copyFile);

				//4. �������Ͽ��� 1byte�� �о�鿩
				String readData = "";
				while((readData = br.readLine()) != null) { //�����Ͱ� �����Ѵٸ�
					//5. ������ ���Ͽ� ����(����� ���Ͽ� ����� ��Ʈ���� ����.)
					fw.write(readData);
				}//end while

				//6.��Ʈ���� �����ִ� �����͸� ����
				fw.flush();
				JOptionPane.showMessageDialog(fc, copyFile.getName()+"���� ����Ǿ����ϴ�.");
				jlblOutput.setText(copyFile.getAbsolutePath());
				
			}finally {
				if(br != null) {br.close();}
				if(fw != null) {fw.close();}
			}//end finally
			
		}//copyFile
		public void openDialog(){
			FileDialog fdOpen = new FileDialog(fc, "���ϼ���", FileDialog.LOAD);
			fdOpen.setVisible(true);
			
			String path = fdOpen.getDirectory();
			String name = fdOpen.getFile();
			
			File originalFile = new File(path+name); //������ ���Ϸ� ���ϰ�ü�� �����ϰ�
			if(path!=null) { //������ �����Ѵٸ�
				try {
					copyFile(originalFile); //�����۾�����
				}catch(IOException ie) {
					JOptionPane.showMessageDialog(fc, "���Ϻ����� ���� �߻�");
					ie.printStackTrace();
				}//end catch
			}
			
		}
		@Override
		public void actionPerformed(ActionEvent ae) {
			openDialog();
		}//actionPerformed
		
	}//class
	//////////////////��ư�� �̺�Ʈ�� ó���ϱ� ���� Innerclass ��////////////////
	
	public static void main(String[] args) {
		new FileCopy();
	}//main

}//class
