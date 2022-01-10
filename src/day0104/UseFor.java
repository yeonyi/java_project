package day0104;

/**
 * �ݺ���(loop statement)
 * ���۰� ���� �� �� ����ϴ� �ݺ��� for��.<br>
 * ���� for��
 * @author user
 */
public class UseFor {

	public static void main(String[] args) {
		//0~9���� 10�� �ݺ��Ǵ� for��
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}//end for
		
		//1~10���� 1�� �����ϴ� ���� ������ ���, ���� ���� ���� ���� tab���� �����Ͽ� ���
		for (int i=1; i<11; i++) {
			System.out.print(i+"\t");
		}//end for
		
		System.out.println();//�ٺ���
		//1~100���� �� �߿� ¦���� ������ ���, �� ���̴� �������� ����
		for (int i=1; i<101; i++) {
			if(i%2==0) {
				System.out.print(i+" ");				
			}//end if
		}//end for
		
		System.out.println();
		//1~100���� �� �߿� Ȧ���� ������ ���, �� ���̴� �������� ����
		for (int i=1; i<101; i+=2) {
			
				System.out.print(i+" ");				
		}//end for
		
		System.out.println();
		//2���� ����ϴ� �ڵ� �ۼ�, ���� ���
		for(int i =1; i<10; i++) {
			System.out.println("2*"+i+"="+2*i);
		}//end for
		
		//1~100������ ���� ���
		int sum=0;
		for(int i=1; i<101; i++) {
			sum += i;//break point : ������ ����(����׿��� Ȯ�ΰ���)
			//System.out.println(sum+" "+i);//�߰� �� Ȯ��
		}//end for
		System.out.println("1�������� 100������ ���� "+sum);
		
		//10�������� 0���� 1�� �����ϴ� �ݺ����� �ۼ�, ���� ������ ���
		//����:looping���� �����̳� ������ �߸� �����ϸ� ���ѷ����� ������. -> terminate�� ����� ��������
		for(int i=10; i>-1; i--) {
			System.out.println(i+" ");
		}//end for
		
		
	}//main

}//class
