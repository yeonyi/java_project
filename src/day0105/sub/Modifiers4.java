package day0105.sub;

import day0105.Modifiers;

/**
 * �ٸ� ��Ű���� ��Ӱ����� �ڽ� Ŭ����<br>
 * @author user
 */
public class Modifiers4 extends Modifiers {

	
	public static void main(String[] args) {
		System.out.println("�ٸ� ��Ű���� �����ϴ� �ڽ� Ŭ����");
		//��üȭ:�ν��Ͻ������� ����ϱ� ����
		//��Ӱ��迡���� �ڽ�Ŭ������ ��üȭ�� �Ѵ�.
		Modifiers4 m =new Modifiers4();
		
		//������ ���������ڿ� ���� ���� ���Ұ��� �����ȴ�.
		System.out.println("public:"+m.instanceA);
		System.out.println("protected:"+m.instanceB); 
//		System.out.println("default:"+m.instanceC); ���Ұ�
//		System.out.println("private:"+m.instanceD); ���Ұ�

	}//main

}//class
