package day0114;

/**
 *  TestSuperClass�� �ڽ�Ŭ����
 * @author user
 */
public class TestSubClass extends TestSuperClass{
	
	int c;//�θ�Ŭ������ �����ϴ� ������� ������ ������ ����
	
	public TestSubClass() {
		System.out.println("�ڽ�Ŭ������ ������");
	}//TestSubClass
	
	public void parentResource() {
		//����� Ư¡: �θ�Ŭ������ �ڿ��� �ڽ�Ŭ�������� �ڽ��� ��ó�� ����� �� �ִ�. 
		this.a = 10;//public
		this.b = 20;//protected
		this.c = 30;//default
//		d = 40; private ���Ұ�
		super.c=40;//���� �̸��� ������ �����ϸ� �θ��� ������ super�� �ڽ��� ������ this�� �����Ѵ�.
//		System.out.println(super); ��¾ȵ�
		System.out.println("�ڽ� method" + this.a + "," +this. b + ","+ c+","+super.c);
		
	}//parentResource

}//TestSubClass
