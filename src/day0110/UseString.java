package day0110;

/**
 * ���ڿ�(String)�� ������ �� �ִ� Ŭ����(java.lang.String)�� ����
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
		//�⺻�� ������ ���. str��ü�� ���ڿ� ������� �ּҸ� ��������
		String str="ABCDE";
		//������ ���� ���. str2��ü�� heap�� �ּҸ� �����߰�, heap�ȿ��� ���ڿ� ������� �ּҸ� ����
		String str2 = new String("ABCDE");
		
		System.out.println("str: "+str);
		System.out.println("str2: "+str2);
		
		System.out.println("�⺻�� ���� == ��: "+(str == "ABCDE"));
		System.out.println("������ ���� == ��: "+(str2 == "ABCDE"));
		System.out.println("�⺻�� ���� equals: "+(str.equals("ABCDE")));
		System.out.println("������ ���� equals: "+(str2.equals("ABCDE")));

	}//main
}//class
