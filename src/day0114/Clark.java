package day0114;

/**
 * ��,��,��,�̸�,�Դ� ���� �θ�Ŭ�������� ���ǵ� �ڵ带 ����ϰ� (���:���뼺) 
 * �ڽŸ��� Ư¡�� ������ Ŭ����<br>
 * ���� ����. �Ϲ� ������ ���� ��� 2
 * ���� 1~10����
 * @author user
 */
public class Clark extends Person {
	public int power;
	
	/**
	 * Ŭ���� ���� 3��
	 */
	public Clark() {//�θ�Ŭ������ �����ε��� ������
		super(3,1,1);
		power=8;
	}//Clark
	
	/**
	 * ���� ���� ���� �޶�����.
	 * @param stone
	 * @return
	 */
	public String power(String stone) {
		String result = "";
		
		if(stone.equals("ũ���䳪��Ʈ")) {//���� ������ ��
			result="���� ������...";
			power=1;
		}else if(stone.equals("���̾Ƹ��")) {//����� ���� ��
			result="�����մϴ�.";
			power=10;
		}else {//��� ���� ��
			result="��г���";
			power=12;
		}//end else
		
		return result;
	}
	
}//class
