package day0119;

/**
 * 수학관련클래스
 * @author user
 */
public class UseMath {
	public UseMath() {
		//객체를 생성하지 않고 사용하는 클래스
//		Math m = new Math(); //생성자가 보이지 않으므로 객체화를 할 수 없다.
		int i = -19;
		System.out.println(i+"의 절대값 "+Math.abs(i));
		
		double d = 10.5;
		System.out.println(d+"의 반올림값 "+Math.round(d));
		d = 10.1;
		System.out.println(d+"의 올림값 "+Math.ceil(d));
		d = 10.9;
		System.out.println(d+"의 내림값 "+Math.floor(d));
		
		double num = Math.random();
		System.out.println("발생한 난수: "+ num);
		System.out.println("범위의 난수: "+ num * 10);
		System.out.println("범위의 난수에서 정수: "+ (int)(num * 10));
		
		//1~100 사이의 난수 얻기
		int temp = (int)(Math.random()*100)+1;
		System.out.println(temp);
		
		//대문자 A(65)~Z(90)중 하나를 얻기 범위: 26(알파벳의 갯수)
		temp = (int)(Math.random()*26)+65;
		System.out.println((char)temp);
		//소문자
		temp = (int)(Math.random()*26)+97;
		System.out.println((char)temp);
		
		//숫자에 대한 문자 0(48)~9(57)중 하나를 얻기
		temp = (int)(Math.random()*10)+48;
		System.out.println((char)temp);
		
	}//UseMath

	public static void main(String[] args) {
		new UseMath();
	}//main

}//class
