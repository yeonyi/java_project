package day0117;

public class UsePolymorphism {

	/**
	 * ��ü�������� ����ϱ� ���� method
	 * @param tp
	 */
	public void usePoly(TestPoly tp) {
		//tp��� ��ü�� ����ϴµ� �ٸ� ����� ��� ��
		System.out.println("�Է°�ü���");
		tp.polymorphism();
	}//usePoly
	
	public static void main(String[] args) {
		UsePolymorphism up = new UsePolymorphism();
		up.usePoly(new Poly2());
		up.usePoly(new Poly3());
		up.usePoly(new TestPoly());

	}//main

}//class
