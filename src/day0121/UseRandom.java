package day0121;

import java.util.Random;

/**
 * ������ ���
 * 
 * @author user
 */
public class UseRandom {

	public UseRandom() {
		// 1.����
		Random ran = new Random(new Random().nextLong()); //seed random
		// 2.method���
		int r1 = ran.nextInt();
		System.out.println("�߻��� ���� ���� : " + r1);
		System.out.println("�߻��� ������ ���� ���� : " + r1 % 2);//�������ϴ¿����� : %
		System.out.println("�߻��� ������ ��� ���� ���� : " +Math.abs(r1 % 2));//������ ����� ����� ���
		System.out.println("�߻��� ������ ��� ���� ���� : " +Math.abs(r1 % 2));//������ ����� ����� ���
		
		int r2 = ran.nextInt(10); //%�����ڳ� ���� �޼ҵ� ���� ������ ����� �� �ִ�
		System.out.println("�߻��� ������ ��� ���� ���� : " +r2);
		
		//�Ҹ��� ����
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		
		//�Ǽ��� ����
		float rf = ran.nextFloat();
		double rd = ran.nextDouble();
		System.out.println(rf);
		System.out.println("�߻��� ���� : "+rd);
		System.out.println("�߻��� ���� : "+rd*10);//����*����
		System.out.println("�߻��� ���� ���� ����: "+(int)(rd*10));//casting���� ������ ���
		
	}// UseRandom

	public static void main(String[] args) {
		new UseRandom();// ��üȭ
	}// main

}// class
