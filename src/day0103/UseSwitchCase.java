package day0103;
/**
 *switch~case의 사용
 * @author user
 */
public class UseSwitchCase {

	public static void main(String[] args) {
		//1.변수선언
		int i=30;
		
		switch(i) {//switch를 타서 => 찾고 => 흘러내림
		case 0: System.out.println("0인 경우");
		case 1: System.out.println("1인 경우");
		case 2: System.out.println("2인 경우");
		case 3: System.out.println("3인 경우");
		default: System.out.println("상수가 없는 경우");
		}//end switch
		
		//switch의 상수에는 입력되는 변수의 범위까지만 사용될 수 있다.
		char j='A';//byte, short, int, char (long은 범위가 너무 커서 사용할 수 없음)
		
		switch(j) {
		case 65: System.out.println("실행");//unicode값 사용
		//case 'A': System.out.println("실행"); //char인 경우 문자를 case에 사용할 수 있음
		case 1:
		}//end switch
		
		//JDK 1.7부터는 문자열을 비교할 수 있다.
		String str="가나다";
		switch(str) {
		
		}//end switch
		
		/////////////////////////////break 사용///////////////////////////////
		i=7;
		switch(i) {
		case 0: System.out.println("A");
		case 1: System.out.println("B"); break;//switch 빠져나감
		case 2: System.out.println("C");
		case 3: System.out.println("D"); break;
		default: System.out.println("E");
		}

	}//main

}//class
