package day0110;

/**
 * 1.�̸����� method�� arguments�� �Է¹޾� ��ȿ�� ������ �����Ͽ� ��ȿ�ϸ� true, <br>
 * ��ȿ�ϸ� false�� ��ȯ�ϴ� method�� �ۼ�<br>
 * ��ȿ�� : �̸����� 5���� �̻�, @�� .�� ����־�� �ϰ� @�� .���� ���� ���;� �Ѵ�.<br>
 * 2.���ڿ��� �Է¹޾� ���ڿ��� ��¿, ��¿, ���� �̶�� �ܾ ���ԵǾ��ִٸ� "MZ����"�� <br>
 * �׷��� ������ "��������"�� ��ȯ�ϴ� method�� �ۼ�<br>
 * �� method ��� instance method�� �ۼ��Ͽ� ȣ���ϰ� ����� ���
 * @author user
 */
public class HomeAssignment9 {
	public String email(String s) {
		//s = "chldusdl114@naver.com";
		int s1;
		s1 = s.indexOf('@');
		if(s.length()>=5 && s.contains("@") && s.contains(".")
			&& s1<s.indexOf('.')){
			return"Ture";
		}else {
			return"False";
		}//end else
		
	}//email
	
	public String msg (String m) {
		if(m.matches("��¿") || m.matches("��¿") || m.matches("��¿")) {
			return "MZ����";
//		if(m.equalsIgnoreCase("��¿") || m.equalsIgnoreCase("��¿") ||m.equalsIgnoreCase("����"){
		}else {
			return "��������";
		}//end else
		
	}//end msg

	public static void main(String[] args) {
		HomeAssignment9 ha = new HomeAssignment9();
		String s = "chldusdl114@naver.com";
		ha.email(s);
		System.out.println("�̸��� ȣ��: "+ s);
		System.out.println("��ȿ�� �˻�: "+ha.email(s));
		
		String m = "��¿!!";
		ha.msg(m);
		System.out.println("�ڽ��� �����ϴ� ����� ���ϼ���: "+ s);
		System.out.println("���� �˻�: "+ha.msg(m));
		
	}

}