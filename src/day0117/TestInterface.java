package day0117;

public interface TestInterface {
//int i; instance variable�� ���� �� ����.
  public static final int i=100;
  
//  public TestInterface() { //�����ڸ� ���� �� ����. => ��ü���� �Ұ���
//  }
  
//  public void test() { //�Ϲ� method�� ���� �� ����. => ���� �� �� ����.
//  }
  
  public void test(); //abstract�� ���� abstract method
  public abstract String test(int i);//abstract�� �ִ� abstract method
  
  public default String temp() {
	  return "JDK1.8�������� �߰��� default method";  
  }//end
  
}//class
