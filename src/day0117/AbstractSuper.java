package day0117;

/**
 * ��üȭ ���� �ʴ� Ŭ����
 * 
 * @author user
 */
public abstract class AbstractSuper {
	
	int i;
	
	public AbstractSuper() { //�ڽ�Ŭ������ ���ؼ��� ȣ��
		System.out.println("�߻�Ŭ������ ������");
	}//Abstract
	
	public void methodA() {
		System.out.println("�θ��� �Ϲ� method");
	}//methodA
	
	public abstract void methodB();//�߻� method: body�� ����
	public abstract int methodC(String name);//�߻� method

//	public static void main(String[] args) {
//		new AbstractSuper();
//
//	}//main

}//class
