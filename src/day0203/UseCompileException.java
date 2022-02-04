package day0203;

/**
 * Compile Exception
 * �ڵ��ÿ� ���ܰ� �߻��ϴ� ����(bytecode�� ����� ��������� ����)
 * @author user
 */
public class UseCompileException {
	
	public UseCompileException() {
		//new�� ������� �ʰ� �ܺ� Ŭ������ ��ü�� ������ ��
		try {
//			Class obj = Class.forName("java.lang.String");
			Class obj = Class.forName("day0203.UseRuntimeException1");
			System.out.println(obj);
		}catch(ClassNotFoundException cnfe) {
			System.err.println("Ŭ������ �̸��� Ȯ���ϼ���.");
			String msg = cnfe.getMessage();
			System.err.println("������ �޽���: "+ msg);
			String msg1 = cnfe.toString();
			System.err.println("����ó����ü�� ������ �޽��� "+msg1);
			
			cnfe.printStackTrace();//console��µ� �Բ� ����
//		}catch(FileNotFoundException n) {// try������ �ڵ尡 ���ܸ� throws���� ������ throws�� �͸� catch����
			
		}
	}//UseCompileException

	public static void main(String[] args) {
		new UseCompileException();
	}//main

}//class
