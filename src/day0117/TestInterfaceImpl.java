package day0117;

/**
 * interface�� ����(implements)�� Ŭ����
 * @author user
 */
public class TestInterfaceImpl implements TestInterface{
	
	@Override
	public void test() {
		System.out.println("Override�� test method");
	}//test
	
	@Override
	public String test(int i) {
		return String.valueOf(i);	
	}//test
	
	public static void main(String[] args) {
		//�������̽��� ��üȭ�� ���� �ʴ´�.
//		TestInterface ti = new TestInterface();
		
		//default method�� static method�� �ƴϹǷ� ����ȣ���� �� ����.
//		TestInterface.temp();
		
		//�ڽ�Ŭ������ ��üȭ(interface�� default method�� Override�� method ��� ��밡��)
		TestInterfaceImpl tii = new TestInterfaceImpl();
		System.out.println(tii.temp());//default method
		tii.test();//Override
		System.out.println(tii.test(2022));//Override
		
		System.out.println("-----------------------------------");
		//is a ������ ��üȭ
		TestInterface ti = new TestInterfaceImpl();
		System.out.println(ti.temp());//default method
		ti.test();//Override
		System.out.println(ti.test(17));//Override	
			
	}//main

}//class
