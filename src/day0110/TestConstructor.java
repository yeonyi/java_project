package day0110;

/**
 * �������� ���ǿ� ȣ��
 * 
 * @author user
 */
public class TestConstructor {
//���� �������� ������ �ڵ����� TestConstructor�� constructor�� �����Ǿ��ִ�.
	private int i;//�ν��Ͻ� ����, ��üȭ�� �� heap�޸𸮿� �ڵ��ʱ�ȭ�Ǿ� �ö󰣴�.
	
	public TestConstructor() {
		i = 2022;
		System.out.println("�⺻ ������");
	}//TestConstructor
	
	public void test() {
		System.out.println("test method!!");
	}//test
	
	/**
	 * ������ Overload ��Ģ : ����������, ��ȯ��, �޼ҵ�� ���� �Ű������� �ٸ���!!
	 * @param i ��ü�� ������ �� �� �ʱⰪ
	 */
	public TestConstructor(int i) {
		this.i = i;
		System.out.println("�μ� �ִ� ������");
		//test(); �Ϲ� method�� ȣ��
//		TestConstructor(); error : �����ڴ� �Ϲ� methodȣ�⹮������ ȣ���� �� ����.
	}//TestConstructor
	
	public static void main(String[] args) {
		//��ü�� ������ �� �ν��Ͻ� ������ ���� 2022�� �ʱ�ȭ => �����ڿ��� �ʱ�ȭ�� �Ҵ�
		TestConstructor tc = new TestConstructor(); //�⺻�����ڸ� ����Ͽ� ��üȭ
		System.out.println(tc.i);
		
		TestConstructor tc1 = new TestConstructor(110);//�Ű����� �ִ� �����ڸ� ����� ��üȭ
		System.out.println(tc1.i);
	}// main

}// class
