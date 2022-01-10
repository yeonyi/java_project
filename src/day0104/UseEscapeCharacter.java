package day0104;

/**
 * 특수문자 사용
 * @author user
 */
public class UseEscapeCharacter {

	public static void main(String[] args) {
		//안녕하세요?를 한번 출력하는 코드 작성
		System.out.println("안녕하세요?"); 
		//\문자 <= 특수문자 : 몇가지의 종류만 사용할 수 있다.
		System.out.println("안녕\n하세요?"); //\n : 줄바꿈
		System.out.println("안녕\r하세요?"); //\r : 특수문자를 따로 쓰면 줄변경(window에서만 사용), Text area에서 enter를 누르면
		///r, /n 코드 두개가 생긴다
		System.out.println("안녕\t하세요?");//\t : tab
		System.out.println("오늘은 \"화요일\"입니다.");//\" : 일반문자열로 바뀜
		System.out.println("오늘은 '화요일'입니다.");//\' : 일반문자열로 바뀜(\없이 홀따옴표만 써도 가능)
		System.out.println("내 파일은 e:\temp\\new.txt파일 입니다.");
		System.out.println("내 파일은 e:\\temp\\new.txt파일 입니다.");
		System.out.println("안녕\b");
		
	}//main

}//class
