package day0119;

import java.util.StringTokenizer;

/**
 * ���ڿ��� ª�� �� ����(��ū)�� �����Ҷ� ����ϴ� Ŭ����
 * @author user
 */
public class UseStringTokenizer {
	
	public  UseStringTokenizer() {
		String msg = "�ڹ�,����Ŭ.JDBC,HTML,CSS";
		//CSV(Comma Seperated Value) Data:Ư�����ڿ��� ���е� ������
		
		//1.String Tokenizer ����
//		StringTokenizer stk = new StringTokenizer(msg); �������� ��ū ����
//		StringTokenizer stk = new StringTokenizer(msg, ",");//Ư�����ڿ��� �����ϴ� ��ū ����
		
		//���й��ڿ����� or��� - ���й��ڿ��� �ش��ϴ� ��� ���ڿ��� ��ū���� ����
//		StringTokenizer stk = new StringTokenizer(msg, ",.B");//Ư�����ڿ��� �����ϴ� ��ū ����

		StringTokenizer stk = new StringTokenizer(msg, ",", true);//Ư�����ڿ��� �����ϴ� ��ū ����
		//���й��ڿ��� ��ū���� ����
		
		//2.��ū�� �� (��ū�� ����������� �����Ѵ�.)
		System.out.println(stk.countTokens());
		
		//3.��ū�� �����ϴ���?
		String token="";
		while(stk.hasMoreTokens()) {
		//4.��ū�� ��� �����͸� ���� ��ū ������ �̵�
//			stk.nextToken();
			token = stk.nextToken();
			System.out.println(token);
		}//end while
		
	}//UseStringTokenizer
	
	public static void main(String[] args) {
		new UseStringTokenizer();
	}//main
}//class
