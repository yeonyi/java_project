package day1227;
/**
���α׷����� ���� ���� ������ �ְ� ����� �� ���
*/
public class Constant{
	//���ذ����� ����ϴ� Constant�� class field������ ������ �� �ִ�.
		public static final int MAX_SCORE=100;
		public static final int MIN_SCORE=0;

	public static void main(String[] args){
		
		int myScore=85;
		//MAX_SCORE=99; error Constant�� �����ϴ� �࿡���� ���� �Ҵ��� �� �ִ�.
		System.out.println(MAX_SCORE+"/"+MIN_SCORE);//Ŭ������ ����
		
		System.out.println(Constant.MAX_SCORE+"/"+Constant.MIN_SCORE);
		System.out.println("�� ������ �ְ� ������ ����: "+(MAX_SCORE-myScore));
	}//main
}//class
