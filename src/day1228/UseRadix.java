package day1228;
/**
 코딩창에서 다양한 진수를 사용해본다.
*/
public class  UseRadix{
	public static void main(String[] args) {

		int decimal=10;//10진수->2진수로 저장
		int octal=012;//8진수->2진수로 저장
		int hex=0xa;//16진수 (=0xA)대소문자 모두 사용 가능->2진수로 저장
		
		//다양한 진수를 사용하더라도 출력은 10진수로 된다.
		System.out.println("10진수: "+decimal);
		System.out.println("8진수: "+octal);
		System.out.println("16진수: "+hex);

		//서로 다른 진수를 사용하더라도 연산을 수행한다.
		System.out.println(decimal + octal + hex);//2진수끼리 연산해서 10진수로 출력된다.
	}//main
}//class
