package day1230;

public class HomeAssignment4 {
	public static final int FEE_TOWNBUS=800;//���߱��� �⺻���
	public static final int FEE_BUS=1250;
	public static final int FEE_SUBWAY=1300;
	
	public static void main(String[] args) {
	
	//1������
	int birth = Integer.parseInt(args[0]);
	int zodiac = birth % 12;
	System.out.print(birth+"����� ");
	
	if (zodiac == 0){
		System.out.println("�����̶�");
	}else if(zodiac == 1){
		System.out.println("�߶�");
	}else if(zodiac == 2){
		System.out.println("����");
	}else if(zodiac == 3){
		System.out.println("������");
	}else if(zodiac == 4){
		System.out.println("���");
	}else if(zodiac == 5){
		System.out.println("�Ҷ�");
	}else if(zodiac == 6){
		System.out.println("ȣ���̶�");
	}else if(zodiac == 7){
		System.out.println("�䳢��");
	}else if(zodiac == 8){
		System.out.println("���");
	}else if(zodiac == 9){
		System.out.println("���");
	}else if(zodiac == 10){
		System.out.println("����");
	}else {
		System.out.println("���");
	}//end else

	//2������
	int score = 0;//���������� �ݵ�� �ʱ�ȭ
	score=Integer.parseInt(args[1]);
	System.out.print(score +"���� ");

	if(score >= 0 && score <= 100) {
		//0~100����
		if(score<40) {
			System.out.println("����");
		}else if(score<60) {
			System.out.println("�ٸ����� ����");
		}else {
			System.out.println("�Է¼���");
		}//end else
	}else{
		System.out.println("��ȿ������ �ƴմϴ�.");
	}//end else

	//3������ 
	int distance= Integer.parseInt(args[3]); //�Ÿ� �Է�

	int fee1=(((distance-10)+1)/5)*100; //�Ÿ��� ���� �߰���� �Ÿ��� 10km�� �ʰ��� ��쿡�� ����
	//int month=(fee+fee1)*2*20; //20�ϱ��� �պ� ����� 

	if(args[2].equals("��������")){
		System.out.println("�������: "+ args[2]+", �̵��Ÿ�: "+distance+"km"+", �⺻���: "+FEE_TOWNBUS+
				", �߰����: "+fee1);
	}else if(args[2].equals("����")){
		System.out.println("�������: "+ args[2]+", �̵��Ÿ�: "+distance+"km"+", �⺻���: "+FEE_BUS+
				", �߰����: "+fee1);
	}else if(args[2].equals("����ö")){
		System.out.println("�������: "+ args[2]+", �̵��Ÿ�: "+distance+"km"+", �⺻���: "+FEE_SUBWAY+
				", �߰����: "+fee1);
	}else {
	System.out.println("���߱����� �ƴմϴ�.");
	}//end else
	
	}//main
	
}//class