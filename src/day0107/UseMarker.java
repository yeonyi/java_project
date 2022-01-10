package day0107;

/**
 * 1.��ī�� Ŭ������ ����Ͽ� ��ü�� �����ϰ�<br>
 * 2.��ī�� ��ü�� �����ϴ� ����� ����ϴ� Ŭ����<br>
 * @author user
 */
public class UseMarker {

	public static void main(String[] args) {
		//������ ��ī�� Ŭ������ ����Ͽ� ���� �� ��ī�� ����
		Marker black = new Marker(); //���������������� ����(heap)
		System.out.println(black); //heap�� �ּ�
		
		//black ��ü�� �Ѳ� 1��, ��ü 1��, �������� �����غ���.
//		black.cap=1; instance ������ private ���������ڰ� �����Ǿ������Ƿ� �ܺο��� ������ �� ����.
		
		//������ ��ī�� ��ü�� ���� ����
		black.setCap(1);
		black.setBody(1);
		black.setColor("����");
		
		System.out.println(black.getColor()+"���� ��ī���� �Ѳ�"+black.getCap()+"��, ��ü"+black.getBody()+"��");
		//��ī�� Ŭ������ �����ϴ� ��� ���
		System.out.println(black.write()); 
		
		////������ ��ī���� �����Ͽ� ���� �ְ� ����غ�����.
		Marker red = new Marker();
		System.out.println(red);
		
		red.setCap(1);
		red.setBody(1);
		red.setColor("����");
		
		System.out.println(red.write());
		System.out.println(red.write("��ſ� �ָ�")+" "+red.write("2022 ù �ָ�"));
		
		
	}//main

}//class
