package day0119;

/**
 * ���а���Ŭ����
 * @author user
 */
public class UseMath {
	public UseMath() {
		//��ü�� �������� �ʰ� ����ϴ� Ŭ����
//		Math m = new Math(); //�����ڰ� ������ �����Ƿ� ��üȭ�� �� �� ����.
		int i = -19;
		System.out.println(i+"�� ���밪 "+Math.abs(i));
		
		double d = 10.5;
		System.out.println(d+"�� �ݿø��� "+Math.round(d));
		d = 10.1;
		System.out.println(d+"�� �ø��� "+Math.ceil(d));
		d = 10.9;
		System.out.println(d+"�� ������ "+Math.floor(d));
		
		double num = Math.random();
		System.out.println("�߻��� ����: "+ num);
		System.out.println("������ ����: "+ num * 10);
		System.out.println("������ �������� ����: "+ (int)(num * 10));
		
		//1~100 ������ ���� ���
		int temp = (int)(Math.random()*100)+1;
		System.out.println(temp);
		
		//�빮�� A(65)~Z(90)�� �ϳ��� ��� ����: 26(���ĺ��� ����)
		temp = (int)(Math.random()*26)+65;
		System.out.println((char)temp);
		//�ҹ���
		temp = (int)(Math.random()*26)+97;
		System.out.println((char)temp);
		
		//���ڿ� ���� ���� 0(48)~9(57)�� �ϳ��� ���
		temp = (int)(Math.random()*10)+48;
		System.out.println((char)temp);
		
	}//UseMath

	public static void main(String[] args) {
		new UseMath();
	}//main

}//class
