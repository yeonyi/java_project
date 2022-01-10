package day0105;

/**
 * instance(member) variable�� ���� ������ ����<br>
 * @author user
 */
public class Modifiers {
	public int instanceA;//public:��Ű���� ������� ���ٰ���
	protected int instanceB;//protected:���� ��Ű���� Ŭ�������� ���� ����, 
	                   //��Ű���� �ٸ��� ��Ӱ����� �ڽ� Ŭ���������� ���� ����
	int instanceC;//default:���� ��Ű���� Ŭ�������� ���� ����
	private int instanceD;//private:Ŭ���� �ȿ����� ���� ����
	
	public static void main(String[] args) {
		//��üȭ:�ν��Ͻ������� ����ϱ� ����
		Modifiers m =new Modifiers();
		
		//������ ���� Ŭ���� �ȿ����� ���������ڿ� ������� ����� �� �ִ�.
		System.out.println("public:"+m.instanceA);
		System.out.println("protected:"+m.instanceB);
		System.out.println("default:"+m.instanceC);
		System.out.println("private:"+m.instanceD);

	}//main

}//class
