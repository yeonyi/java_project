package day0105;

/**
 * do~while���<br>
 * �ּ� 1�� ���࿡ �ִ� ���Ǳ��� ����
 * @author user
 */
public class UseDoWhile {
	public static void main(String[] args) {
			int i =1;//�ʱⰪ
			do {
				System.out.println(i);//�ݺ����๮��
				i++;//������(���ٸ� ���ѷ����� ����)
			}while(i<10);//���ǽ�
			
			//���� main method arguments�� �Է¹޾� �Է¹��� ������ ������ ���
			System.out.println();
	
			i=Integer.parseInt(args[0]);
			int j=1;
			do {
				System.out.println(i+"*"+j+"="+i*j);
				j++;
			}while(j<10); 
	}//main

}//class
