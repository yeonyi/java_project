package day0114;

/**
 * �θ�Ŭ���� : �ڽ��� ����� �����ڵ����� => �ڵ��� ���뼺
 * @author user
 */
public class TestSuperClass {
	public int a;
	protected int b;
	int c;//default: ��Ű���� �ٸ��� �ڽ�Ŭ������ ������� ����
	private int d; //�ڽ�Ŭ������ ������� ����

	public TestSuperClass() {
		System.out.println("�θ�Ŭ������ �⺻������");
	}//TestSuperClass
	
	public void parentMethod() {
		System.out.println("�θ��� method");
	}//parentMethod
	
	
}//class

