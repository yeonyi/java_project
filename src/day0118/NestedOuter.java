package day0118;

/**
 * ���� Ŭ������ static����ó�� ��� (��ü�� �������� �ʰ� ���)
 * @author user
 */
public class NestedOuter {

	int outI;
	static int outJ;
	
	public void outInstanceMethod() {
		System.out.println("�ٱ�Ŭ������ �ν��Ͻ� method");
	}//outInstanceMethod
	
	public static void outStaticMethod() {
		System.out.println("�ٱ�Ŭ������ static method");
	}//outStaticMethod

	/////////////////Nested Class ����/////////////////
	static class NestedInner{
//		int inI; ��øŬ���������� instance������ ������ �ʴ´�.
		static int inJ;
		
//		public void inInstanceNethod() {//��øŬ���������� instance method�� ������ �ʴ´�.
//		}
		
		public static void inStaticMethod() {
			System.out.println("��ø Ŭ������ static method");
			System.out.println("----------------------------------");
			//�ٱ� Ŭ������ �ڿ� ���
			//�ν��Ͻ������� ������ method�� ���Ұ�
			//outI = 100;
			//outInstanceMethod();
			
			//���Ͽ����� ������ method�� ��밡��
			outJ=200;
			outStaticMethod();
			
		}//inStaticMethod
	}//class
	/////////////////Nested Class ��/////////////////
	
	public static void main(String[] args) {
		//��øŬ������ static�� �ַ� ����Ͽ� ����� ������ ��ü�� �������� �ʰ�,
		//static ���(Ŭ������.method��, Ŭ������.������) ���� ����Ѵ�.	
		NestedInner.inJ = 100;
		NestedInner.inStaticMethod();
		
	}//main

}//class
