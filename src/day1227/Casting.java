package day1227;
/**
 ���� �� ��ȯ<br>
 �����ڰ� �ʿ��� ������������ ��ȯ�ϴ� ��<br>
 ����)
 (��ȯ�� ������ ��)������ �Ǵ� ���;
*/

public class Casting{

	public static void main(String[] args) {

		char c='A';
		//���� �� ���� �� ��ȯ
		int i=(int)c;
		System.out.println(c+"�� Unicode �� "+i);

		//��� �� ���� �� ��ȯ
		float f=(float)12.27;//���ͷ��� 8Byte�̰�, ���� �� ��ȯ���� ���� 4Byte�� �Ҵ� �ȴ�.
		System.out.println("float: "+f);

		//i=f; error 4Byte�� ũ��� ������ ���� ������ �ٸ��Ƿ� �Ҵ���� �ʴ´�.
		i=(int)f;//�� �ս� �߻�
		System.out.println("�� �ս� �߻� : ���� ��: "+f+", ��ȯ�� �� : "+i);

		//boolean�� ���� �����θ� ��ȯ�ȴ�.
		boolean b=true;
		boolean b1=false;
		//i=(int)b; error boolean�� �ٸ� ������ ��ȯ���� �ʴ´�.
		b1=(boolean)b;
		System.out.println(b1+"/"+b);

		//�⺻�� ������ ���� ���������� ���� �� ��ȯ
		//i=12;
		//String s=i; error �⺻�� i�� ������ String���� Casting �� �� ����. (�� �ݴ뵵 �ȵ�)
		String s="2021";
		System.out.println(s);

		//i=(int)s; error ������ s�� �⺻�� int�� Casting �� �� ����.
	}//main
}//class
