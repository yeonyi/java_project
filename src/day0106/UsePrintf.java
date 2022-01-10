package day0106;

/**
 * V.A를 도입하여 작성된 method 사용
 * @author user
 */
public class UsePrintf {

	public static void main(String[] args) {
		
		int i = 2022;
		System.out.printf("정수: %d\n", i);
		System.out.printf("정수 출력 자릿수: [%8d]\n", i);
		System.out.printf("정수 출력 자릿수: [%-8d]\n", i);
		
		char c = 'A';
		System.out.printf("문자: %c\n", c);
		System.out.printf("문자 출력 자릿수: [%5c]\n", c);
		System.out.printf("문자 출력 자릿수: [%-5c]\n", c);
		
		double d = 3.1415;
		System.out.printf("실수: %f,%.2f\n", d, d);
		System.out.printf("실수: [%8.2f],[%-8.2f]\n", d, d);
		
		String str = "안녕하세요?";
		System.out.printf("문자열: %s\n", str);
		System.out.printf("문자열: [%10s]\n", str);
		System.out.printf("문자열: [%-10s]\n", str);
		
		//값을 여러개 출력할 수 있다.
		System.out.printf("%d%-4c %.2f\t%9s\n", 3, 'B', 12.345, "오늘은 목요일");
		
		int year = 2022;
		int month = 1;
		int day = 6;
		char week = 'T';
		String msg = "오늘은 목요일입니다.";
		
		//위의 변수를 사용하여 printf로 아래와 같이 출력
		//오늘은 xxxx년 x월 x일 x요일 오늘의 메세지는 xxxx입니다.
		//출력메세지와 출력 값을 분리할 수 있다.
		System.out.printf("오늘은 %d년 %d월 %d일 %c요일 %s\n", year, month, day, week, msg);
		System.out.format("오늘은 %d년 %d월 %d일 %c요일 %s\n", year, month, day, week, msg);
		
		//println으로 출력
		//출력메세지와 출력 값이 섞여있다.
		System.out.println("오늘은 "+year+"년 "+month+"월 "+day+"일 "+week+"요일 "+msg);

	}//main

}//class
