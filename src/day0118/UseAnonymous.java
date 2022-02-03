package day0118;

public class UseAnonymous {
	/**
	 * Ŭ����(�������̽�)�� �Ű������� �޴� method
	 * @param ta
	 */
	public void useTestA(TestA ta) {
		ta.testA();
	}//useTeatA

	public static void main(String[] args) {
		//1.Ŭ������ ��üȭ
		UseAnonymous ua = new UseAnonymous();
		//3.�������̽��� ������ Ŭ������ ��üȭ
//		ua.useTestA(new TestA());
		TestAImpl tai = new TestAImpl();//TestAImpl�� TestA�̴� (is a ����)
		//4.3������ ������ ��ü�� arguments�� �Է��Ͽ� methodȣ��
		ua.useTestA(tai);
		ua.useTestA(tai);//�ѹ��̻� ȣ���ϴ���� ��ü�� �����ؼ� ȣ���ϸ� �ȴ� => �ߺ��ڵ尡 �پ���.
		
		System.out.println("-----------anonymous inner class---------");
		//1.Ŭ���� ��üȭ
		UseAnonymous ua2 = new UseAnonymous();
		//2.anonymous inner class�� ��ü�� �����Ͽ� arguments�� �Է��Ѵ�.
		ua2.useTestA(new TestA() {
			@Override
			public void testA() {
				//�ѹ� �̻� ȣ��Ǹ� �ߺ��ڵ��� ���� �����ϹǷ� �׷� ��쿡�� ���� ���ó�� ���� Ŭ������ ���� �����ؼ� ����Ѵ�.
				System.out.println("anonymous inner class�� ������ ��ü");
			}
		});
		
		ua2.useTestA(new TestA() {
			@Override
			public void testA() {
				//�ѹ� �̻� ȣ��Ǹ� �ߺ��ڵ��� ���� �����ϹǷ� �׷� ��쿡�� ���� ���ó�� ���� Ŭ������ ���� �����ؼ� ����Ѵ�.
				System.out.println("�ߺ��ڵ��� ���� ������");
			}
		});
		
	}//main

}//class
