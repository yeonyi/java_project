package day0110;

/**
 * PersonŬ������ ��üȭ�Ͽ� ����� �������� ����� Ŭ����
 * @author user
 */
public class UsePerson {

	/**
	 * Java Application
	 * @param args
	 */
	public static void main(String[] args) {	
		//4.��üȭ
		Person hwangSungJun = new Person();
		//methodȣ�� (���� �ϱ� ����)
//		hwangSungJun.setEye(2);
//		hwangSungJun.setNose(1);
//		hwangSungJun.setMouth(1); //�⺻�����ڷ� ���ؼ� �ʿ䰡 ������
		hwangSungJun.setName("Ȳ����");
		
		//5.������ ��ü ���
		System.out.println(hwangSungJun.eat());
		System.out.println(hwangSungJun.eat("�߲��� ����", 9000));
		
		Person jinban = new Person(3, 1, 1);//��üȭ: ����� �¾ �� -> 
									//����� �ƹ��͵� ������ ���� -> �ּ��� ��, ��, ���� ������ �־����
//		jinban.setEye(3);//�¾ ���� ��
//		jinban.setNose(1);//��
//		jinban.setMouth(1);//���� ����
		
		jinban.setName("õ����");
		System.out.println(jinban.getEye()+"/"+jinban.getNose()+"/"+jinban.getMouth()+"/"
				+jinban.getName());
		
		System.out.println(jinban.eat());//������ ��ü ���
		System.out.println(jinban.eat("����", 0));
	}//main
}//class
