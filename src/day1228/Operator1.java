package day1228;
/**
 ���� ������
*/

public class Operator1 {
	public static void main(String[] args) {
		
		int i=12;
		int j=-19;
		System.out.println("~"+i+"="+ ~i);//~���:��ȣ���� 1����
		System.out.println("~"+j+"="+ ~j);//~����:��ȣ���� 1����

		i=12;
		j=28;
		//!�� ���迬���� �տ� ���
		System.out.println(i+">"+j+"="+!(i>j));
		
		boolean flag1=true, flag2=false;
		//!�� boolean�� �տ� ���
		System.out.println("!"+flag1+"="+!flag1);
		System.out.println("!"+flag2+"="+!flag2);

		i=12;
		j=-37;
		//+�����ڴ� �ƹ��� �ϵ� ���� �ʴ´�.(�������� ����)
		System.out.println("+"+i+"="+ +i);//12
		System.out.println("+"+j+"="+ +j);//-37

		//-�����ڴ� ��ȣ�� �����Ѵ�.
		System.out.println("-"+i+"="+ -i);//-12
		System.out.println("-"+j+"="+ -j);//37

		//��������, ���ҿ���
		i=10;
		j=12;

		System.out.println("i: "+i+ ",j: "+j);
		++i;
		i++;
		--j;
		j--;
		System.out.println("�������� �� i: "+i);
		System.out.println("���ҿ��� �� j: "+j);

		int result=0;
		//��������
		result=++i;//���� �� ����
		System.out.println("�������� �� i :"+i+", result :"+result);//i=13, result=13

		result=0;
		//��������
		result=i++;//���� �� ����
		System.out.println("�������� �� i :"+i+", result :"+result);//i=14, result=13

		System.out.println("����: "+ ++i);//i�� ������ �� �޼ҵ忡 �Ҵ����ش�. i=15
		System.out.println(i);

		System.out.println("����: "+ i++);//i�� �޼ҵ忡 �Ҵ� �� �� �����Ѵ�. i=15
		System.out.println(i);//i=16

		i=10;
		j=20;
		System.out.println(i++ + --j);

	}//main
}//class
