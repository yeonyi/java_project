package day0112;

/**
 * �� ���� : method�� �Ű������� �⺻�� ���������� ����ϸ� ���� ����Ǿ� �Ѿ��.
 * �޼ҵ� �ȿ��� �ƹ��� �ٸ� ������ �ϴ��� ���� ��ȭ�� ����.
 * @author user
 */


public class CallByValue {
	
	/**
	 * �Ű������� ����� i�� j�� ���� ���� �ٲٴ� ��
	 * @param i
	 * @param j
	 */
	public void swap(int i , int j) {
		int temp = 0;
		temp = i;
		i=j;
		j = temp;
		System.out.printf("swap method �� : i= %d, j = %d\n", i, j);//300, 100
	}//swap

	public static void main(String[] args) {
		
		CallByValue cbv = new CallByValue();
		int i = 100, j = 300;
		System.out.printf("swap ȣ�� �� : i= %d, j = %d\n", i, j);//100, 300
		cbv.swap(i, j);//���� ����Ǿ� ����.
		System.out.printf("swap ȣ�� �� : i= %d, j = %d\n", i, j);//100, 300

	}//main

}//class
