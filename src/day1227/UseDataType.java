package day1227;
/**
�⺻�� ������������ ���� ����.<br>
�� ����� ���
*/

public class UseDataType{
	
	public static void main(String[] args) {
		//������ ������ �� �ִ� �������� byte, short, int, long
		//signed value(���, ��������) ����
		byte a=10;
		short b=10;
		int c=10;
		long d=10;//����ø� ����
		//���� ����� �����ϴ� ���ͷ��� ũ�Ⱑ 4byte�̹Ƿ�,4byte�� �ʰ��ϴ� ������� �� �� ����.
		long e=2147483648L;//����� �ʼ�(�Ͻ������� ���ͷ��� ũ�⸦ �ø���.)

		System.out.println("byte:"+a+",short:"+b+",int:"+c+",long:"+d+",long:"+e);

		//���ڸ� ������ �� �ִ� ��������:char
		//���ڸ� �Ҵ��ϸ� ���ڿ� �ش�Ǵ� Unicode���� �Ҵ�.
		//char�� �⺻���� \u0000
		char f='A';//char f=65;
		char g='0';//char f=48;
		char h='��';
		char temp='\u0000';//char c=' ';(white space)

		//�ڵ尪�� ���� char������ ����ϸ� �ڵ尪�� ���� ���ڰ� ��µ�.
		System.out.println("char:"+f+",char:"+g+",char:"+h+",["+temp+"]"); 

		//�Ǽ� : floar, double
		//float i=12.27; error ���ͷ��� ũ�Ⱑ 8Byte�̰�, i������ ũ�Ⱑ 4Byte�̹Ƿ� �Ҵ���� �ʴ´�.
		float i=12.27F;//����÷� �Ǽ� ���ͷ��� ũ�⸦ 4Byte�� �ٿ� �Ǽ� ����� �����ϰ����� �Ҵ��Ѵ�.
		double j=12.27;//����� ����
		double k=12.27D;//����� ����
		
		System.out.println("float :"+i+" double :"+j+" double :"+k);	

		//boolean
		boolean l=true;
		boolean m=false;
		System.out.println("boolean :"+l+" boolean :"+m);

		
	}//main
}//class
