package day0105;

/**
 * instance(member) variable ���<br>
 * 1.����<br> : ���������� �������� ������; public int i;
 * 2.��ü����<br> : Ŭ������ ��ä�� = new Ŭ������();UseInstanceVariable uiv = new UseInstanceVariable();
 * 3.��ü���� ����Ͽ� ������ �� �Ҵ�<br> ��ü��.������ = ��; uiv.i = 2022;
 * 4.��ü���� ����Ͽ� ������ ���� ��� ��ü��.������ System.out.pirntln(uiv.i)
 * @author user
 */
public class UseInstanceVariable { //class field
	//1.����
	int i;//default ���� �����ڸ� ���� ����

	public static void main(String[] args) { //local
		//System.out.println(i);//instance������ static�������� ��ü�� ���� ���� ����� �� ����.
		//2.��üȭ. Ƚ���� ���� ����
		UseInstanceVariable uiv = new UseInstanceVariable();
		
		//3.���Ҵ�
		uiv.i = 2022;
		
		//4.����� : �ν��Ͻ������� �ڵ��ʱ�ȭ�ȴ�.
		System.out.println(uiv.i);
		
		//Ŭ������ ��ü�� ��� ���� �� �ִ�.
		UseInstanceVariable uiv1 = new UseInstanceVariable();
		UseInstanceVariable uiv2 = new UseInstanceVariable();
		//������ ��ü�� (uiv1 �Ǵ� uiv2)���� ���� �̸��� ���� i�� ���� ������.
		uiv1.i = 1;
		uiv2.i = 5;
		System.out.println(uiv.i+"/"+uiv1.i+"/"+uiv2.i);
		
	}//main

}//class
