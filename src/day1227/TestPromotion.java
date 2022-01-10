package day1227;
/**
 자동 형 변환<br>
 int의 하위 데이터형이 연산이 되면 자동으로 int에 저장되어 결과가 반환된다.
*/

public class TestPromotion{
	public static void main(String[] args) {
		
		byte num1=10;//4byte의 literal이 1byte로 변환되어 할당된다.
		byte num2=20;
		int result=num1+num2;

		System.out.println(num1+"+"+num2+"="+result);

		byte result1=(byte)(num1+num2);
		System.out.println(num1+"+"+num2+"="+result1);

	}
}
