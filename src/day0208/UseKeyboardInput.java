package day0208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ����ڰ� �Է��� Ű�� �� ��� (���Ͱ� �������� �׶� ���� �Էµȴ�.)
 * @author user
 */
public class UseKeyboardInput {
	
	public UseKeyboardInput() throws IOException {
		
		System.out.println("�ƹ�Ű�� ������ ����");
//		int value = System.in.read();//���Ͱ� �������� ������ ���(�Ʒ����� �ڵ带 �������� �ʴ´�.)
//		System.out.println("�Է°�: "+(char)value);//���� ó���� �Է��� �� ���
//		//���� ���� Ư�����ڴ� ��������, �ѱ��� ������.
//		int value=0;
//		while((value=System.in.read()) != 13) {
//			System.out.print((char)value);
//		}//end while
		
		//�ٴ���(enter-13)�� �о� ���̱�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String value = br.readLine();
		
		System.out.println("�Է°�: "+value);
	}//UseKeyboardInput

	public static void main(String[] args) {
		try {
			new UseKeyboardInput();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
	}//main

}//class
