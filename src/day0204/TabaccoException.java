package day0204;

/**
 * Compile Exception �ۼ�
 * @author user
 */
@SuppressWarnings("serial")
//1.Exception �Ǵ� RuntimeException�� ��ӹް�
public class TabaccoException extends Exception {
//2.������ Overload
	/**
	 * ������ ���ܸ޽����� ����� �� 
	 */
	public TabaccoException() {
		super("�����ܹ߻�");
	}//TabaccoException
	
	/**
	 * �����ڰ� ��Ȳ�� �´� ���ܸ޽����� ���� ����� ��
	 * @param msg
	 */
	public TabaccoException(String msg) {
		super(msg);
	}//TabaccoException
	

}//class
