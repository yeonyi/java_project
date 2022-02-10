package day0106;

/**
 * Variable Arguments(�����μ�) ���
 * 
 * @author user
 */
public class UseVariableArguments {

	/**
	 * Variable Arguments�� ����� method�� JDK1.5+�������� ����� �� �ִ�<br>
	 * V.A�� method���ο��� �迭(�ּҸ� ������ �ִ� ������ ��������)�� ���ȴ�.
	 * 
	 * @param param
	 */
	public void useVA(int... param) {
//		System.out.println(param); ������ ���������� �ּҰ� ���
		for (int i = 0; i < param.length; i++) {
			System.out.print(param[i] + " ");
		} // end for
	}// useVA
	
//	public void useVA2(int ... paramI, int paramJ ) { //error V.A�� ���� ������ parameter�θ� ���ǵȴ�.
	public void useVA2(int paramI, int ... paramJ ) { 
		System.out.print(paramI);
		System.out.print(paramJ);
		
	}//endVA2

	public static void main(String[] args) {
		// ��üȭ : �ν��Ͻ����� ȣ��
		UseVariableArguments uva = new UseVariableArguments();
//		uva.useVA();
//		uva.useVA(1);
		uva.useVA(1,2,43,5,100,6000); //������ ������ ������ �������� ���� ���� �� �ִ�.
		System.out.println();
		System.out.println("--------------------------------------");
		uva.useVA2(1,  1,2,3,4);
//		uva.useVA2(); error : int���� �ݵ�� ���� �ԷµǾ�� �Ѵ�. V.A�� ��������
	}// main

}// class
