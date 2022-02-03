package day0114;

public class TestThisKeyword {

	private int value;
	
	/**
	 * this�� ������� �ʾ��� �� �Ű������� �ν��Ͻ� �������� ���ٸ� heap�� �ּҸ� ���� �� �ִ�
	 * �Ű������� �����ϰ�, �ּҸ� �޾� �Ű�����(stack)�� �ν��Ͻ� ����(heap)�� �ĺ��Ͽ� ����ؾ��Ѵ�.
	 * @param value
	 * @param ttk
	 */
	public void nonThis(int value, TestThisKeyword ttk) {//callByReference: �ּҸ� �޴� ��ü
		System.out.println("non This--->"+ttk);
		ttk.value = value;
	}//nonThis
	
	public void useThis(int value) {
		System.out.println(" useThis---->"+this);//this�� ����ϸ� method�� ȣ���ϴ� ��ü�� �ּҷ� ����ȴ�.
		this.value = value;
	}//useThis
	
	public int getValue() {
		return value;
	}//getValue
	
	public static void main(String[] args) {

//		value = 10;//static������ memory�� ó�� �ε�Ǳ� ������ ����� �� ����.
		TestThisKeyword ttk = new TestThisKeyword();
		System.out.println(ttk); //8�� ���ΰ� ���� �ּ� ��µ�
		//ttk.nonThis(100, ttk);
		ttk.useThis(200);
		System.out.println(ttk.getValue());
	}//main

}//class
