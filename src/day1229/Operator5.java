package day1229;
/**
 논리 연산자
 -일반논리 : && , ||
 -비트논리 : & , | , ^
*/
public class Operator5{

	public static void main(String[] args) {
		boolean flag1=true, flag2=false, flag3=true, flag4=false;
		//&&:전항과 후항이 모두 ture일때만 true반환
		System.out.println(flag1+"&&"+flag3+"="+(flag1 && flag3));//ture
		System.out.println(flag1+"&&"+flag2+"="+(flag1 && flag2));//false
		System.out.println(flag2+"&&"+flag3+"="+(flag2 && flag3));//false
		System.out.println(flag2+"&&"+flag4+"="+(flag2 && flag4));//false

		//||:전항과 후항이 모두 false일때만 false반환
		System.out.println(flag1+"||"+flag3+"="+(flag1 || flag3));//ture
		System.out.println(flag1+"||"+flag2+"="+(flag1 || flag2));//true
		System.out.println(flag2+"||"+flag3+"="+(flag2 || flag3));//true
		System.out.println(flag2+"||"+flag4+"="+(flag2 || flag4));//false

		flag1=false; 
		flag2=false;
		flag3=true;
		System.out.println("flag1 : "+flag1+", flag2 : "+flag2+"flag3 : "+flag3);
		//&&는 전항이 false이면 후항은 연산하지 않아도 무조건 false출력

		flag3=(flag1=3<2)&&(flag2=2<3);//전항이 false이므로 후항을 계산하지 않아도 false출력
		System.out.println("flag1 : "+flag1+", flag2 : "+flag2+"flag3 : "+flag3);
		
		//int에 i변수에는 아무 숫자나 할당하고, 그 정수가 0에서부터 100사이라면 true를 출력하고
		//0에서부터 100사이가 아니라면 false를 출력
		
		int i=102;
		//비교값(i) 연산자 기준값(0~100)형식, 작은 값에서 큰 값으로 비교해나감

		System.out.println(i+"값은 "+(i >= 0 && i <100));

		System.out.println("--------------비트논리--------------");
		
		i=20;
		int j=15;
		System.out.println(i+"&"+j+"="+(i&j));//&:상위비트와 하위비트 모두 1일 때 1내림

		i=40;
		j=12;
		System.out.println(i+"|"+j+"="+(i|j));//|:상위비트와 하위비트 모두 0일 때 0내림

		i=45;
		j=15;
		System.out.println(i+"^"+j+"="+(i^j));//^:상위비트와 하위비트 둘 중 하나만 1일 때 1내림


	}//main
}//class
