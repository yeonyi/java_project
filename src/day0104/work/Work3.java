package day0104.work;

/**
 * HomeAssignment4 3������. ���߱���
 * @author user
 */
public class Work3 {
	//���߱��� ����� �� ������ �ʴ� ���ذ��� �����Ƿ� ����� ���.
	public static final int TOWN_BUS=800;
	public static final int BUS=1250;
	public static final int SUBWAY=1300;

	public static void main(String[] args) {
		
		if(args[0].equals("��������")||args[0].equals("����")||args[0].equals("����ö")) {
			int distance=0;
			int fare=0;//�⺻���

			distance= Integer.parseInt(args[1]);//�Էµ� �̵� �Ÿ�
			
			//�Էµ� ��������� �⺻����� �ĺ��Ͽ� ����
			if(args[0].equals("��������")) {
				fare=Work3.TOWN_BUS;
			}else if(args[0].equals("����")) {
				fare=Work3.BUS;
			}else {
				fare=Work3.SUBWAY;
			}//end else
			
			int overFare=0;//�ʰ����
			//�ʰ����
			if(distance>10) {
				overFare=(((distance-10)+1)/5)*100;
			}//end if
			
			System.out.println("�������: "+ args[0]+", �̵��Ÿ�: "+distance+"km"+", �⺻���: "+fare+"��, �߰����: "+(fare+overFare)+
					"��, 20�� ���� �����: "+((fare+overFare)*20)+"��");
		}else {
			System.out.println("���߱����� �ƴմϴ�.");	
		}//end else
		
	}//main

}//class
