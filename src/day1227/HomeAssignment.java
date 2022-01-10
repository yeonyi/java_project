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

		System.out.println("하루 용돈: "+DAY_ALLOWANCE+"원");
		System.out.println("편도 차비: "+ONEWAY_TRANSFER+"원");
		System.out.println("왕복 차비: "+roundTransfer+"원");
		System.out.println("남은 돈: "+remainingMoney+"원");
	

		double average=0;
		double leftEyesight=1.5;
		double rightEyesight=1.0;

		average=(leftEyesight+rightEyesight)/2;
		
		System.out.println("나의 왼쪽 눈 시력: "+leftEyesight);
		System.out.println("나의 오른쪽 눈 시력: "+rightEyesight);
		System.out.println("양안 시력: "+average);

		int i=65;
		char c=(char)i;

		int b= i+32;
		char k=(char)b;
		
		System.out.println("대문자 "+c+" 이고, 소문자 "+k+" 이다.");

		//4번문제는 API를 찾아서 byte,short,int(Integer), long, char(Character), float,double에 Wrapper Class를 찾아서 코딩해보세요.
		

		//System.out.println("byte의 최대값: "+byte.MAX_VALUE+"byte의 최소값: "+byte.MIN_VALUE);
		}

}
