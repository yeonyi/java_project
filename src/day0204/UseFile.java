package day0204;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * FileŬ���� ���
 * @author user
 */
public class UseFile {

	public UseFile() {
		//1.���� ����
		File file = new File("e:/dev/temp/java_read.txt");
		
		System.out.println(file.exists()?"����":"���Ȯ��");//������ ���� ����
		System.out.println(file.length()+"byte");//������ ũ��
		System.out.println(file.isFile()?"����":"���丮");
		System.out.println(file.isDirectory()?"���丮":"����");
		System.out.println(file.isHidden()?"��������":"�Ϲ�����");
		System.out.println(file.canRead()?"�бⰡ��":"�б�Ұ���");
		System.out.println(file.canWrite()?"���Ⱑ��":"����Ұ���");
		System.out.println(file.canExecute()?"���డ��":"����Ұ���");
		long lm = file.lastModified();
		System.out.println("���������� ������ ��¥ "+lm);
		
		Date date = new Date(lm);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("���������� ������ ��¥ "+sdf.format(date));
		
		System.out.println("���� ��� : "+file.getPath());
		System.out.println("���� ������ : "+file.getAbsolutePath());
		try {
			System.out.println("���� �Թ���� : "+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
		System.out.println("������ ���� ������ : "+file.getParent());
		System.out.println("���ϸ� : "+file.getName());
		
		//���� reName(���ϸ� ����)
		//1.������ �̸��� ���� File ����
//		File rename = new File(file.getParent()+"/java_read_1.txt");
//		System.out.println(file.renameTo(rename));
		
		//���� ����
//		System.out.println(file.delete());
		
		//���丮 ����
		//1.������ ���丮���� ���� ������ ����
		File mk = new File("e:/dev1/temp/test");
		System.out.println(mk.mkdir());//false: ���������� ��� ���������� ������ ����
		
		File mk1 = new File("e:/dev1/temp/test");
		System.out.println(mk.mkdirs());//true: ���������� ��� ���������� ���� �� �������� ����
		
		
		
		
	}//UseFile

	public static void main(String[] args) {
		new UseFile();

	}//main

}//class
