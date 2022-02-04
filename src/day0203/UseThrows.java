package day0203;

/**
 * throws�� ����� ���� ����
 * ������, �Ϲ� method, main method�� ���� �� �ִ�.
 * 
 * �����ڿ� throws�� ���̸� ��üȭ�� �� ���ܸ� ó���Ѵ�.
 * �Ϲ� method�� throws�� ���̸� ȣ���ϴ� ������ ���ܸ� ó���Ѵ�.
 * main method�� throws�� ���̸� JVM�� ���ܸ� ó���Ѵ�.
 * 
 * @author user
 */
public class UseThrows {
	
	/**
	 * ȣ���� ������ method�� �߻��� ���ܸ� ó���ϵ��� throws ����
	 * @throws ClassNotFoundException
	 */
	public void work()throws ClassNotFoundException {
		Class.forName("java.lang.Integer1");//���ܰ� �ٻ��ϸ� throws�� ȣ���� ���� catch�� ���ư���.
		System.out.println("Ŭ���� �ε� ����");
	}//work

	public static void main(String[] args) {
		UseThrows ut = new UseThrows();
		try {
		ut.work();
		}catch(ClassNotFoundException cnfe) {
			System.err.println("Ŭ������ �������� �ʽ��ϴ�.");
			cnfe.printStackTrace();
		}//end catch
	}//main

}//class
