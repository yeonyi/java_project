package day0114;

/**
 * Parent�� �ڽ� Ŭ����
 * @author user
 */
public class Child extends Parent {

	public Child() {
//		super(20); //1��
//		this(30);//2��
		super(); //3��
		System.out.println("�ڽ��� �⺻ ������");
	}//Child
	
	public Child(int i) {
//		this(); //1��
//		super();//2��
		this(); //3��
		System.out.println("�ڽ��� �����ε��� ������ " + i);
	}//Child

}//class
