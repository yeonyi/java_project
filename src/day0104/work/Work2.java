package day0104.work;

/**
 * HomeAssignment4 2������. �������
 * @author user
 */
public class Work2 {

	public static void main(String[] args) {
		int score = 0;//���������� �ݵ�� �ʱ�ȭ
		score=Integer.parseInt(args[1]);
		System.out.print(score +"���� ");

		if(score >= 0 && score <= 100) {
			//0~100����
			if(score<40) {
				System.out.println("����");
			}else if(score<60) {
				System.out.println("�ٸ����� ����");
			}else {
				System.out.println("�Է¼���");
			}//end else
		}else{
			System.out.println("��ȿ������ �ƴմϴ�.");
		}//end else

	}//main

}//class
