package day1229;
/**
 �� ������
 -�Ϲݳ� : && , ||
 -��Ʈ�� : & , | , ^
*/
public class Operator5{

	public static void main(String[] args) {
		boolean flag1=true, flag2=false, flag3=true, flag4=false;
		//&&:���װ� ������ ��� ture�϶��� true��ȯ
		System.out.println(flag1+"&&"+flag3+"="+(flag1 && flag3));//ture
		System.out.println(flag1+"&&"+flag2+"="+(flag1 && flag2));//false
		System.out.println(flag2+"&&"+flag3+"="+(flag2 && flag3));//false
		System.out.println(flag2+"&&"+flag4+"="+(flag2 && flag4));//false

		//||:���װ� ������ ��� false�϶��� false��ȯ
		System.out.println(flag1+"||"+flag3+"="+(flag1 || flag3));//ture
		System.out.println(flag1+"||"+flag2+"="+(flag1 || flag2));//true
		System.out.println(flag2+"||"+flag3+"="+(flag2 || flag3));//true
		System.out.println(flag2+"||"+flag4+"="+(flag2 || flag4));//false

		flag1=false; 
		flag2=false;
		flag3=true;
		System.out.println("flag1 : "+flag1+", flag2 : "+flag2+"flag3 : "+flag3);
		//&&�� ������ false�̸� ������ �������� �ʾƵ� ������ false���

		flag3=(flag1=3<2)&&(flag2=2<3);//������ false�̹Ƿ� ������ ������� �ʾƵ� false���
		System.out.println("flag1 : "+flag1+", flag2 : "+flag2+"flag3 : "+flag3);
		
		//int�� i�������� �ƹ� ���ڳ� �Ҵ��ϰ�, �� ������ 0�������� 100���̶�� true�� ����ϰ�
		//0�������� 100���̰� �ƴ϶�� false�� ���
		
		int i=102;
		//�񱳰�(i) ������ ���ذ�(0~100)����, ���� ������ ū ������ ���س���

		System.out.println(i+"���� "+(i >= 0 && i <100));

		System.out.println("--------------��Ʈ��--------------");
		
		i=20;
		int j=15;
		System.out.println(i+"&"+j+"="+(i&j));//&:������Ʈ�� ������Ʈ ��� 1�� �� 1����

		i=40;
		j=12;
		System.out.println(i+"|"+j+"="+(i|j));//|:������Ʈ�� ������Ʈ ��� 0�� �� 0����

		i=45;
		j=15;
		System.out.println(i+"^"+j+"="+(i^j));//^:������Ʈ�� ������Ʈ �� �� �ϳ��� 1�� �� 1����


	}//main
}//class
