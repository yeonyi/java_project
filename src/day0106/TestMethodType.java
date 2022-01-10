package day0106;

/**
 * method�� 4���� ���¿� ȣ��
 * @author user
 */
public class TestMethodType {
	
	/**
	 * ������(��ȯ�� ����, �Ű����� ���� ��)������ method
	 */
	public void typeA() {
		System.out.println("������ : ȣ���� �ϴ��� �׻� ���� ���� �����Ѵ�.");
	}//typeA

	/**
	 * ������(��ȯ�� ����, �Ű����� �ִ� ��)������ method<br>
	 * �ԷµǴ� ������ ������ ���� ������ �� �ִ�.
	 * @param i �Է°�
	 */
	public void typeB(int i) {
		System.out.println("������ : �Է°��� ���� �ٸ� ���� �����Ѵ�."+i);
	}//typeB
	
	/**
	 * ������(��ȯ�� �ְ�, �Ű����� ���� ��)������ method<br>
	 * �׻� ���� ���� ��ȯ�ȴ�.
	 * @return ����
	 */
	public int typeC() {
		int i = 2022;
		return i; 
	}
	
	/**
	 * ������(��ȯ�� �ְ�, �Ű����� �ִ� ��)������ method<br>
	 * �Ű������� ���� �ٸ� ����� ��ȯ��
	 * @param d �Ǽ��� �Է°�
	 * @return ������ ��ȯ��
	 */
	public int typeD(double d) {
		return (int)d;
	}//typeD
	
	public static void main(String[] args) {
		//��üȭ : �ν��Ͻ� ������ �ν��Ͻ� �޼ҵ带 ����ϱ� ���ؼ� �ݵ�� �ʿ��� �۾�
		TestMethodType tmt = new TestMethodType();
		
		tmt.typeA();//������
//		tmt.typeA();
//		tmt.typeA();
//		tmt.typeA();
		
		tmt.typeB(0);//������
//		tmt.typeB(10);
//		tmt.typeB(100);
//		
		int value1=tmt.typeC();//������
		System.out.println("������:ȣ���ϸ� �׻� ���� ���� ��ȯ�ȴ�."+value1);
//		int value2=tmt.typeC();
//		System.out.println("������:ȣ���ϸ� �׻� ���� ���� ��ȯ�ȴ�."+value2);
		
		int value3=tmt.typeD(2022.0106);//������
		System.out.println("������:�Ű������� ȣ�⿡ ���� �ٸ� ���� ��ȯ�ȴ�."+value3);
//		int value4=tmt.typeD(2021.0106);//������
//		System.out.println("������:�Ű������� ȣ�⿡ ���� �ٸ� ���� ��ȯ�ȴ�."+value4);
		
	}//main

}//class
