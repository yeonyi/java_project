package day1224;
/**
	���� ������ ���.
*/

public class UseLocalVariable {
	//Java Applicaion
	public static void main(String[] args) {
		//1.���� ����:�������� �ٸ��ٸ� ��� ���� �� �ִ�.
		int i;//�ʱ�ȭ�� ���� ���� ����
		int age=0;//�ʱ�ȭ�� ����
		
		//2.�� �Ҵ�
		i=2021;
		age=25;
		System.out.println(age);//25
		age=24;
		System.out.println(age);//24
		age=27;
		//���Ҵ��� ������ �� �� �ִ�.(������ ���� �������� �Ҵ�� ��)
		
		//double age; ���������� �޶� �������� ���Ƹ� ���� �߻�.
		
		//3.���
		System.out.println(i);
		System.out.println(age+"��");

		//�������� �ѱ۷� �ο�
		int ����=25;
		int ����=2021;
		int �¾��=0;

		�¾��=����-����+1;

		System.out.println("�� ����"+age+"��");
		System.out.println(�¾��);
	}//main
}//class
