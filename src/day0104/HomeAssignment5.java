package day0104;

public class HomeAssignment5 {

	public static void main(String[] args) {
		// 1������
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				System.out.print("¦ ");
			}else {
				System.out.print(i + " ");
			} // end else
		} // end for

		// 2������
		System.out.println();
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + (i * j)+" ");
			}//end for
			System.out.println();
		}//end for
		
		// 3������
		//�ԷµǴ� ���� 2~9�� ������ ���� �ԷµǴ� ������ �������� ����ϼ���.
		//2~9�� �ƴ϶�� ���������� 2~9������ ���� �մϴ�.�� �� ���

		System.out.println();
		int num =Integer.parseInt(args[0]);
		
			if(num>1 && num<82){
				int i=0;
				for (int a = 2; a < 10; a++) {//a�� 2~9����
					for (int b = 1; b < 10; b++) {//b�� 1~9����
						i=a*b;//i=2*1, 2*2, 2*3... 
						}//end for
					if(num%i==0) {
					}//end if
				}//end for
				System.out.println(num+"��"+num/i+"���̴�.");
					
			}else {
				System.out.println("�������� 2-9�ܱ����� �����մϴ�.");
			}//end else
	}// main
}// class
