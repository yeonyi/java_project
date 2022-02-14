package day0211;

import java.util.Calendar;

public class UseLambda {

	public static void main(String[] args) {

		//��ȯ�� ���� �Ű������� ���� �߻�޼��带 ���� �������̽��� ���ٽ����� ���
		Test t = () -> {System.out.println("�̰��� ���ٽ�");};
		//�������̽��� �߻�޼��带 ȣ���ϸ� ���ٽ����� ������ �ڵ尡 ȣ��Ǿ� ����ȴ�.
		t.method();
		
		//��ȯ�� ����, �Ű������� �ִ� �߻�޼��带 ���� �������̽�
		Test2 t2 = (int age, String name) -> {
			System.out.println("���̴� "+age);
			System.out.println("�̸��� "+name);
		};
		
		t2.method(20, "�ֿ���");
		System.out.println("-------------------------------");
		//��ȯ���ְ�, �Ű����� �ִ� �߻�޼��带 ���� �������̽�
		Test3 t3 = (int age) -> {
			Calendar cal = Calendar.getInstance();
			int birth = cal.get(Calendar.YEAR)-age+1;
			return "�¾ �� :" +birth;
		};
		int age = 25;
		String value = t3.method(age);
		System.out.println(age+"���� "+value);
		
		//1~100���� ����ϴ� �ڵ带 ���ٽ��� ����Ͽ� Thread�� ����������.
//		Test t4 = () -> {
//			for(int i = 1;i<101;i++) {
//				System.out.println(i);
//			}
//		};
//		UseLambda ul = new UseLambda();
//		ul.start();
		
		Runnable r = () -> {
			for(int i = 1;i<101;i++) {
				System.out.println(i);
			}
		};
		
		Thread thr = new Thread(r);
		thr.start();
		
	}//main

}//class
