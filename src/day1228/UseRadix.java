package day1228;
/**
 �ڵ�â���� �پ��� ������ ����غ���.
*/
public class  UseRadix{
	public static void main(String[] args) {

		int decimal=10;//10����->2������ ����
		int octal=012;//8����->2������ ����
		int hex=0xa;//16���� (=0xA)��ҹ��� ��� ��� ����->2������ ����
		
		//�پ��� ������ ����ϴ��� ����� 10������ �ȴ�.
		System.out.println("10����: "+decimal);
		System.out.println("8����: "+octal);
		System.out.println("16����: "+hex);

		//���� �ٸ� ������ ����ϴ��� ������ �����Ѵ�.
		System.out.println(decimal + octal + hex);//2�������� �����ؼ� 10������ ��µȴ�.
	}//main
}//class
