package day0105;

/**
 * while�� ��� (���۰� ���� �� �� ����ϴ� �ݺ���)<br>
 * �ּ� 0�� ���࿡ �ִ� ���Ǳ��� ����
 * 
 * @author user
 */
public class UseWhile {

	public static void main(String[] args) {
		// 1~100���� ���
		int i = 1;//�ʱⰪ
		while (i < 101) {//���ǽ�
			System.out.print(i + " ");//�ݺ����๮��
			i++;// ������(�ۼ����� ������ ���ѷ����� ����)
		} //end while
		
		System.out.println();
		//1~100���� ���߿� 3�� ����� ���
		i = 1;
		while(i < 101) {//���ǽ�
			if(i%3==0) {
				System.out.print(i+" ");//�ݺ����๮��
			}//end if
			i++;//������
		}//end while
		
		//while�� ����Ͽ� ������ 9���� ���
		System.out.println();
		i=9;
		int j=0;
		while(i<10) {
			for (j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}//end for
			i++;
		}//end while
		
		//while���ѷ���
		while(true) {
			System.out.println("���ѷ���");
			break;
		}//end while
		
	}//main

}//class
