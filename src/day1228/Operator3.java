package day1228;
/**
 ����Ʈ ������
 << : left shift -��Ʈ�� �������� �о ��ĭ�� �׻� 0���� ä���.
 >> : right shift -��Ʈ�� ���������� �о ��ĭ�� �ֻ��� ��ȣ ��Ʈ�� ���� ����� 0�� ä��� ������ 1�� ä���.
 >>> : unsigned right shift -��Ʈ�� ���������� �о ��ĭ�� 0���� ä���.
*/
public class Operator3{
	public static void main(String[] args) {

	int i=6;//0000 0110

	System.out.println(i+"<< 3= "+(i<<3));

	i=1;//0000 0000 0000 0000 0000 0000 0000 0001 <<31

	System.out.println(i+"<< 31= "+(i<<31));//int�� ���� �� �ִ� �ְ���, ��Ʈ�� �з� ��ȣ��Ʈ�� �ö󰡸� ��ȣ ����

	i=80;//0101 0000 >>4 -> 0000 0101
	System.out.println(i+">> 4= "+(i>>4));	

	i=37;//0010 0101
	
	/* 
	 �⺻�� ���������� ���� ����� �� ������ wrapper class�� ���� �������� ���(method)�� ����� �� �ִ�. 
	System.out.println(i+"�� 2������ "+ Integer.toBinaryString(i));
	System.out.println(i+"�� 16������ "+ Integer.toHexString(i));
	System.out.println(i+"�� 8������ "+ Integer.toOctalString(i));
	*/

	System.out.println(i+">> 3= "+(i>>3));

	i=-1;//1111 1111

	System.out.println(i+">> 100= "+(i>>100));//-1 :�ֻ�����ȣ��Ʈ�� ���ؼ� �и� ĭ�� 1�� ä������ ������ ��� ��Ʈ�� 1�̹Ƿ�

	i=45;//0010 1101

	System.out.println(i+">>> 2= "+(i>>>2));

	i=-1;//1111 1111 1111 1111 1111 1111 1111 1111
	System.out.println(i+">>> 1= "+(i>>>1));//����� ���� �� �ִ� �ְ����� ��µȴ�.
	}
}
