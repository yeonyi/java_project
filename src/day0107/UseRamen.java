package day0107;

/**
 * 1. ��� Ŭ������ ����Ͽ� ��ü�� ����<br>
 * 2. ��� ��ü�� ����� Ŭ����<br>
 * @author user
 */
public class UseRamen {
	
	public static void main(String[] args) {
	//�Ŷ�� Ŭ������ ����Ͽ� �Ŷ�� �� ��ü ����
	Ramen fav = new Ramen();//������ ���������� ����
	System.out.println(fav);//heap�� �ּ�
	
	//��� fav��ü�� ���� ��, �� 1��, ���� 2���� �����غ���.
	fav.setCategory("black");
	fav.setNoodle(1);
	fav.setSoup(2);
	
	System.out.printf("�Ŷ�� %s�� ���� ������ %d���̰�, ������ ������ %d���̴�.\n", fav.getCategory(), fav.getNoodle(), fav.getSoup());
	System.out.println(fav.make());
	System.out.println(fav.make("�����"));
	
	}//main

}//class
