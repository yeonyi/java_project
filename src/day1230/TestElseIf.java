package day1230;
/**
 ���� if (else if)
 ������ ���� ������ ���� �� ���
*/
class TestElseIf{

	public static void main(String[] args) {

		//������ �Է� �޾� 0������ �۾��� ���� ���� �޼����� 100������ ���� �� ���� �޼����� �������� �� �޼����� �ٸ��� ���
		int score=Integer.parseInt(args[0]);
		
		//int score=50;�Է°� ������ �ȵ�
		System.out.print(score+"���� ");
		
		if(score<0){//0���� ���� ���
			System.out.println("0������ ���� �� �����ϴ�.");
		}else if(score>100){//100���� ū ���
			System.out.println("0������ Ŭ �� �����ϴ�.");
		}else {//�׷��� ���� ���
			System.out.println("�Է¼���!");
		}//end else

		//���� �Է� �޾� 0�������� 39������ ����, 40���� 59������ �ٸ� ���� ����, 60���� 100������ �հ� (else�� �����ϴ� �ڵ� �ۼ�)
		int score1=Integer.parseInt(args[1]);
		System.out.print(score1+"���� ");

		if(score1 >-1 && score1 < 40){
			System.out.println("����");
		}else if(score1 > 39 && score1 < 60){
			System.out.println("�ٸ� ���� ����");
		}else if(score1 > 59 && score1 < 101){
			System.out.println("�հ�!");
		}//end else if

	}//main
}//class
