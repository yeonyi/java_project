package day0105;

/**
 * ����<br>
 * 1. ��𿡼��� ȣ���� �� �ְ�, �¾�ظ� �Է¹޾� ���̸� �����Ͽ� ����ϴ� �޼ҵ� �ۼ� <br>
 * 2. ��𿡼��� ȣ���� �� �ְ�, ������ �Է¹޾� �빮��, �ҹ���, ���ڿ� �ش��ϴ� �������, �ش繮�ڷ� ����ϰ� �׷��� �ʴٸ� �Էµ�
 * ���ڸ� ����ϴ� method�ۼ�
 * @author user
 */

public class HomeAssignment6 {

	// 1������
	public void age(int birth) { //��������
		System.out.println("����� ���̴� " + (2022 - birth + 1) + "�Դϴ�."); //������ ���
	}// age

	// 2������
	public void num(int i) {
		System.out.print("i�� ���� " + i);
	}// num

	public static void main(String[] args) {
		HomeAssignment6 birth = new HomeAssignment6(); //��üȭ
		birth.age(1997); //�� �Ҵ�

		HomeAssignment6 ha = new HomeAssignment6();// ? :���� i�� ������ ���迬���� �ȵǼ� if�� ���ǹ��� error�� ����
		ha.num(65);
		char j = 0;
		int i = 65;
		if ((i > 64 && i < 91) || (i > 96 && i < 123) || (i > 47 && i < 58)) {// �빮��:65~90, �ҹ���:97~122, ����:48~57
			j = (char)i;
			System.out.println(" "+j);
		} else {
			System.out.println(i);	
		} // end else

	}// main

//	private void i(int i) {
//		// TODO Auto-generated method stub
//		
//	}

}// class
