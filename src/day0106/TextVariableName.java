package day0106;

/**
 * ���� �̸��� ������ ���
 * @author user
 */
public class TextVariableName {
	//class field : instance variable, static variable
	//class field���� ����Ǵ� ������ �����ϴ�
	int i;
	static int j;
//	static int i; error �����̸��� ������ �ߺ��� �� ����.
	
	public static void main(String[] args) {
		//local : local variable
		//local�� class field�� ������ �ٸ��� ������ class field�� ����� ���� �̸��� ������ ������ �� �ִ�.
		int i=0;
		System.out.println(i);//��µǴ� i�� �������� (���� ������ �ִ� ���� �Ҵ�)
		//instance variable ��� : ��üȭ -> ��ü������ ���� ��� �� ������
		TextVariableName tvn = new TextVariableName();
		System.out.println("�ν��Ͻ� ����: "+ tvn.i);
//		int i; �������������� ���� �̸��� ������ ������ �� ����.
		
		
	}//main

}//class
