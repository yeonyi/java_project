package day1229;
/**
 ���� if
*/
public class TestIf {
	public static void main(String[] args) {
		
		int i=Integer.parseInt(args[0]);
		int num=Integer.parseInt(args[1]);
		

		System.out.println("i: "+i);
		System.out.println("num: "+num);

		//�Է��� ���� 5�� ���ٸ�-> ���� 
		//"��"�� ��� -> ������ ����
		if(i==5){

			System.out.println("��");
		}//end if

		if(num<0) {
			num=-num;//��ȣ ����
			}//end if

		System.out.println("args[1]�� ���밪�� "+num+"�̴�.");

		//�Էµ� ����° ���� ����ϰ� "����"�̶�� "2021�� 12�� 29��"�� ����Ѵ�.
		System.out.println(args[2]);

		if(args[2].equals("����")){//���ڿ� ��
			System.out.println("2021�� 12�� 29��");
		}//end if
	}//main
}//class
