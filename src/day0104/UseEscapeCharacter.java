package day0104;

/**
 * Ư������ ���
 * @author user
 */
public class UseEscapeCharacter {

	public static void main(String[] args) {
		//�ȳ��ϼ���?�� �ѹ� ����ϴ� �ڵ� �ۼ�
		System.out.println("�ȳ��ϼ���?"); 
		//\���� <= Ư������ : ����� ������ ����� �� �ִ�.
		System.out.println("�ȳ�\n�ϼ���?"); //\n : �ٹٲ�
		System.out.println("�ȳ�\r�ϼ���?"); //\r : Ư�����ڸ� ���� ���� �ٺ���(window������ ���), Text area���� enter�� ������
		///r, /n �ڵ� �ΰ��� �����
		System.out.println("�ȳ�\t�ϼ���?");//\t : tab
		System.out.println("������ \"ȭ����\"�Դϴ�.");//\" : �Ϲݹ��ڿ��� �ٲ�
		System.out.println("������ 'ȭ����'�Դϴ�.");//\' : �Ϲݹ��ڿ��� �ٲ�(\���� Ȧ����ǥ�� �ᵵ ����)
		System.out.println("�� ������ e:\temp\\new.txt���� �Դϴ�.");
		System.out.println("�� ������ e:\\temp\\new.txt���� �Դϴ�.");
		System.out.println("�ȳ�\b");
		
	}//main

}//class
