package day0107;

/**
 * HomeAssignment8 <br>
 * ���� : �Ŷ���� ��ü �𵨸� �� �� Ŭ���� �ۼ�, ��ü ����, ��� <br>
 * ������� Ư¡ : ����, ��, ���� <br>
 * �������� Ư¡ : ����� <br>
 * @author user
 */
public class Ramen {
	private String category;//�Ŷ���� ����
	private int noodle;//���� ����
	private int soup;//������ ����
	
	/**
	 * ������ �Ŷ�� ��ü�� ������ �����ϴ� ��
	 * @param category ������ �Ŷ�� ����
	 */
	public void setCategory(String category) {
		this.category = category;
	}//setCategory
	
	/**
	 * ������ �Ŷ���� ������ ���ؼ� ��ȯ�ϴ� ��
	 * @return �Ŷ���� ����
	 */
	public String getCategory( ) {
		return category;
	}//getCategory
	
	/**
	 * ������ �Ŷ�� ��ü�� ���� ������ �����ϴ� ��
	 * @param noodle ������ ���� ����
	 */
	public void setNoodle(int noodle) {
		this.noodle = noodle;
	}//setNoodle
	
	/**
	 * ������ �Ŷ�� ��ü�� ���� ������ ��ȯ�ϴ� ��
	 * @return ���� ����
	 */
	public int getNoodle() {
		return noodle;
	}//getNoodle
	
	/**
	 * ������ �Ŷ�� ��ä�� ������ ������ �����ϴ� ��
	 * @param soup ������ ������ ����
	 */
	public void setSoup(int soup) {
		this.soup = soup;
	}//setSoup
	
	/**
	 * ������ �Ŷ�� ��ü�� ������ ������ ������ ��ȯ�ϴ� ��
	 * @return ������ ����
	 */
	public int getSoup() {
		return soup;
	}//getSoup
	
	/**
	 * �Ŷ�� ���� ����Ͽ� ���ٴ� �� ����
	 * @return
	 */
	public String make() {
		return "�Ŷ�� " + category + "�� ����� ���ڽ��ϴ�.";
	}//write
	
	/**
	 * ������ �Ŷ�� ��ü�� ����Ͽ� �ٸ� ���� ���ϴ� ���� ����
	 * @param msg �ٸ� �ٸ��� ����
	 * @return �޽���
	 */
	public String make(String msg) {
		return "�Ŷ�� " + category + "�� "+ msg + "���� ���ֽ��ϴ�.";
	}//write

	public static void main(String[] args) {

	}//main

}//class
