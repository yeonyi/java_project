package day0203;

import javax.security.auth.login.FailedLoginException;

/**
 * Ư�� ��Ȳ���� ���ܸ� ������ �߻����� ó��
 * @author user
 */
public class UseThrow {
	
	public void login(String id, String pass)throws Exception {//2.�߻��� ���ܸ� ������
		if(!(id.equals("admin")&&pass.equals("1234"))) {
			//1.���ܸ� ������ �߻�
//			try {
//			throw new Exception("�α��� ����, ���̵� ��й�ȣ�� Ȯ�����ּ���.");//���� �޼ҵ��� �ϰ� �߻��Ǵ� ���ܰ� ������ ����.
			throw new FailedLoginException("�α��� ����, ���̵� ��й�ȣ�� Ȯ�����ּ���.");
//			}catch(Exception e) {}//�� �������� �ʴ´�.
			}//end if
		System.out.println(id+"�� �α��� �ϼ̽��ϴ�.");
	}//login

	public static void main(String[] args) throws Exception {
		UseThrow ut = new UseThrow();
		
		String id = "admi";
		String pass = "1234";
		
		try {
			ut.login(id, pass);//3.ȣ���� ������ throws ���ܸ� ó���Ѵ�.
//		}catch(Exception e) {//����(method)�� ���� ���� �̸��� ���ܰ� ó���Ǿ���.
		}catch(FailedLoginException e) {
			System.err.println("������ �޽���: "+e.getMessage());
			System.err.println("����ó�� ��ü��� �޽���: "+e);
			System.err.println("--------------�ڼ��� ����------------");
			e.printStackTrace();
		}//end catch
		
		
	}//main

}//class
