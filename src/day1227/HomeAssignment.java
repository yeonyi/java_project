package day1227;
public class HomeAssignment{
	public static final int DAY_ALLOWANCE=16000;
	public static final int ONEWAY_TRANSFER=1250;

	//public static final byte MAX_VALUE;
	//public static final byte MIN_VALUE;

	public static void main(String[] args) {

		int roundTransfer=ONEWAY_TRANSFER*2;
		int lunch=8000;
		int remainingMoney=DAY_ALLOWANCE-(roundTransfer+lunch);

		System.out.println("�Ϸ� �뵷: "+DAY_ALLOWANCE+"��");
		System.out.println("�� ����: "+ONEWAY_TRANSFER+"��");
		System.out.println("�պ� ����: "+roundTransfer+"��");
		System.out.println("���� ��: "+remainingMoney+"��");
	

		double average=0;
		double leftEyesight=1.5;
		double rightEyesight=1.0;

		average=(leftEyesight+rightEyesight)/2;
		
		System.out.println("���� ���� �� �÷�: "+leftEyesight);
		System.out.println("���� ������ �� �÷�: "+rightEyesight);
		System.out.println("��� �÷�: "+average);

		int i=65;
		char c=(char)i;

		int b= i+32;
		char k=(char)b;
		
		System.out.println("�빮�� "+c+" �̰�, �ҹ��� "+k+" �̴�.");

		//4�������� API�� ã�Ƽ� byte,short,int(Integer), long, char(Character), float,double�� Wrapper Class�� ã�Ƽ� �ڵ��غ�����.
		

		//System.out.println("byte�� �ִ밪: "+byte.MAX_VALUE+"byte�� �ּҰ�: "+byte.MIN_VALUE);
		}

}
