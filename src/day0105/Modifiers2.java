package day0105;

/**
 * ���� ��Ű���� �ٸ� Ŭ����<br>
 * @author user
 */
public class Modifiers2 {

	
	public static void main(String[] args) {
		System.out.println("���� ��Ű���� �ٸ� Ŭ����");
		//��üȭ:�ν��Ͻ������� ����ϱ� ����
		Modifiers m =new Modifiers();
		
		//������ ���������ڿ� ���� ���� ���Ұ��� �����ȴ�.
		System.out.println("public:"+m.instanceA);
		System.out.println("protected:"+m.instanceB);
		System.out.println("default:"+m.instanceC);
//		System.out.println("private:"+m.instanceD); ��� �Ұ�

	}//main

}//class
