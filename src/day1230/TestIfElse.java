package day1230;
/**
 if-else : ���� �ϳ��� �ڵ带 �����ؾ� �� ��
*/
	class TestIfElse {
	public static void main(String[] args) {
		//�������� ������� �Ǻ��ϴ� �ڵ� �ۼ�
		int num=12;

		if (num > -1){
			System.out.println(num+"�� ���");
		}

		else {
			System.out.println(num+"�� ����");
		}//end else

		//Ȧ�� ¦�� ����
		int num1=12;
		if (num1%2==0) {
			System.out.println(num1+"�� ¦��");
		}else {		
			System.out.println(num1+"�� Ȧ��");
		
		}//end else

		//�Է¹��� ������ ����ϰ�, 0~100�����̸� "��ȿ����"�� �׷��� ������ "��ȿ����" ���
		/*int num2=55;
		if(num>=0&&num<=100){
			System.out.println("��ȿ����");
		}else{
			System.out.println("��ȿ����");
		}*/

		int score=Integer.parseInt(args[0]);

		System.out.print(score+"���� ");

		if(score > -1 && score < 101) {
			System.out.println("��ȿ����");
		}else{
			System.out.println("��ȿ����");
		}//end else

		//args[1]������ �Էµ� ���� ������ ��ȯ�ϰ� ��ȯ�� ���� �빮���� ������� �빮�ڷ� ����ϰ�, �׷��� �ʴٸ� ���ڸ� �״�� ���
		int i=Integer.parseInt(args[1]);

		if(i>64 && i<91){ //�빮���� ����
			System.out.println((char)i);
		}else{ //�빮���� ������ �ƴ� ��
			System.out.println(i);
		}//end else
	}
}
