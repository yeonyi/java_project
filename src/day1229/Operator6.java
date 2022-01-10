package day1229;
/**
 삼항 연산자(조건 연산자)
 연산식 ? 항1 : 항2
*/
public class Operator6 {
	public static void main(String[] args) {

		int i=30;
		
		System.out.println(i+"은(는) "+(i>-1?"양수":"음수"));

		i=12;
		//i가 홀수인지 짝수인지를 출력하는 코드 작성
		System.out.println(i+"은(는) "+(i%2==0?"양수":"음수"));

	}//main
}//class
