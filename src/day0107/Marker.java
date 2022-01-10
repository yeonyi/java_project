package day0107;

/**
 * ��ī���� ��ü�𵨸�(�߻�ȭ)�Ͽ� ������ Ŭ����<br>
 * ������� Ư¡ : �Ѳ�, ��ü, ��<br>
 * �������� Ư¡ : ����.<br>
 * @author user
 */
public class Marker {
	private int cap;//�Ѳ��� ����
	private int body;//��ü�� ����
	private String color;//��
	
	/**
	 * ������ ��ī�� ��ü�� �Ѳ��� ������ �����ϴ� ��
	 * @param cap ������ �Ѳ��� ����
	 */
	public void setCap(int cap) {
		this.cap=cap;
	}//setCap
	
	/**
	 * ������ ��ī�� ��ü�� ������ �Ѳ� ������ ��ȯ�ϴ� ��
	 * @return �Ѳ��� ����
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	/**
	 * ������ ��ī�� ��ü�� ��ü ������ �����ϴ� ��
	 * @param body ������ ��ü�� ����
	 */
	public void setBody(int body) {
		this.body=body;
	}//setBody
	
	/**
	 * ������ ��ī�� ��ü�� ������ ��ü�� ����
	 * @return ������ ����
	 */
	public int getBody() {
		return body;
	}//getBody
	
	/**
	 * ������ ��ī�� ��ü�� ���� �����ϴ� ��
	 * @param color ������ ��
	 */
	public void setColor(String color) {
		this.color = color;
	}//setColor
	
	/**
	 * ������ ��ī�� ��ü�� ���� ���� ��� ��
	 * @return ��
	 */
	public String getColor() {
		return color;
	}//getColor
	
	/**
	 * ĥ�ǿ� ������ ��ī�� ��ü�� ����Ͽ� "�ȳ��ϼ���?"�� ���� �� ����
	 * @return
	 */
	public String write() {
		
		return color+"���� ��ī������ \"�ȳ��ϼ���?\"�� ĥ�ǿ� ����";
	}//write
	
	/**
	 * ĥ�ǿ� ������ ��ī�� ��ü�� ����Ͽ� "�ȳ��ϼ���?"�� ���� �� ����
	 * @param msg ĥ�ǿ� ����� �޽���
	 * @return �޽���
	 */
	public String write(String msg) {
		
		return color+"���� ��ī������ \"" + msg + "�� ĥ�ǿ� ����";
	}//write
	
	public static void main(String[] args) {

	}//main

}//class
