package day0204;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream�� ����� ������ ���� �б�
 * @author user
 */
public class UseFileInputStream {
	
	public UseFileInputStream() throws IOException{
		
		//1.���Ͽ� ��Ʈ�� ����
		File file = new File("e:/dev/temp/java_read.txt");
		if(file.exists()) {
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(file);//���Ͽ� ��Ʈ���� ����Ͽ� �����ϰ�
				//����� ���Ͽ��� ���� 1byte�� �о���δ�.
//				int data = fis.read();//����� ��Ʈ������ 1byte�� �����´�.
//				System.out.println("�о���� ������: "+ (char)data); //������ ���� ó�� ����(��� �о����)
				
				//����� ���Ͽ��� ��� �����͸� 1byte�� �о���δ�.
				int data = 0;
				while((data = fis.read()) != -1) {//EOF
					System.out.print((char)data);
				}//end while
				
			}finally {
				if(fis != null) {//null pointer exception�� ���� ó������ �ʾƵ� �ȴ�.
				fis.close();//��Ʈ���� �� ���� �ݵ�� ������ ����� �Ѵ�.(�޸� ������ ���� ����): close()
				}//end if
			}//end finally
				
		}//end if

		
		
	}//UseFileInputStream

	public static void main(String[] args) {
		try {
			new UseFileInputStream();
		} catch (IOException e) {
			//�����ڿ��� �����࿡�� �߻��� IOException�� �ѹ��� ��Ƽ� ó���� �� �ִ�.
			e.printStackTrace();
		}//end catch
	}//main

}//class
