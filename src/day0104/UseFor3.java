package day0104;

/**
 * for���� �پ��� ����
 * 
 * @author user
 */
public class UseFor3 {

	public static void main(String[] args) {
		// ���ѷ���
//		for (;;) {
//			System.out.println("���ѷ���");
//			break;//���� ����� �ݺ����� ������ ���� -> ���ѷ����� �� �� ���� ��
//		} // end for
//		System.out.println("�ȳ�"); //���ѷ��� �Ʒ��ٿ� ������ ������ �� ����

		// �����ϴ� ���� ���� ���� ����
		for (int i = 0;; i++) {
			System.out.println("���ѷ���" + i);
			break;// �ѹ� ���� �� ����
		} // end for

		// �������� �ʱⰪ�� ����ϴ� for
		for (int i = 0, j = 10, k = 100; i < 10; i++, j--, k += k) {// ���ǽ��� �ϳ��� �ۼ��� �� �ִ�.
			System.out.println("i= " + i + ", j= " + j + ", k= " + k);
		} // end for
		
		int[] temp={1, 2, 3, 4, 5, 6, 7};
//		for(int i=0;i<temp.length;i++) {
//			System.out.println(temp[i]);
//		}//end for
		
		for (int i:temp) {
			System.out.println(i);
		}//end for
	}// main

}// class
