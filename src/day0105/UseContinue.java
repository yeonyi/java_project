package day0105;

/**
 * continue ��� (�ݺ����� �ݺ������� �ǳʶٰ� ���� �Ǵ� ���ҽ����� �̵�)
 * @author user
 */
public class UseContinue {

	public static void main(String[] args) {
	 for (int i=1;i<101; i++) {
		 System.out.print("�ʼ��ݺ� ");
		 if(i%2==1) { //Ȧ���̸� continue�� ���ؼ� �ǳʶ�
			 continue; //�ݺ��� �ȿ����� ���. Ư�� ���ǿ� ������ ������ ����ǵ��� ���ǹ� �ȿ����� ���,��� �ȵ�
		 }//end if
		 System.out.println(" ��Ȳ�ݺ�"+i+" ");
	 }//end for
		 
	}//main

}//class
