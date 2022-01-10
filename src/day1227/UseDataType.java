package day1227;
/**
기본형 데이터형으로 변수 선언.<br>
형 명시의 사용
*/

public class UseDataType{
	
	public static void main(String[] args) {
		//정수를 저장할 수 있는 데이터형 byte, short, int, long
		//signed value(양수, 음수범위) 저장
		byte a=10;
		short b=10;
		int c=10;
		long d=10;//형명시를 생략
		//정수 상수를 저장하는 리터럴의 크기가 4byte이므로,4byte를 초과하는 상수값을 쓸 수 없음.
		long e=2147483648L;//형명시 필수(일시적으로 리터럴의 크기를 늘린다.)

		System.out.println("byte:"+a+",short:"+b+",int:"+c+",long:"+d+",long:"+e);

		//문자를 저장할 수 있는 데이터형:char
		//문자를 할당하면 문자에 해당되는 Unicode값이 할당.
		//char형 기본값은 \u0000
		char f='A';//char f=65;
		char g='0';//char f=48;
		char h='가';
		char temp='\u0000';//char c=' ';(white space)

		//코드값을 가진 char변수를 출력하면 코드값에 대한 문자가 출력됨.
		System.out.println("char:"+f+",char:"+g+",char:"+h+",["+temp+"]"); 

		//실수 : floar, double
		//float i=12.27; error 리터럴의 크기가 8Byte이고, i변수의 크기가 4Byte이므로 할당되지 않는다.
		float i=12.27F;//형명시로 실수 리터럴의 크기를 4Byte로 줄여 실수 상수를 저장하고변수에 할당한다.
		double j=12.27;//형명시 생략
		double k=12.27D;//형명시 정의
		
		System.out.println("float :"+i+" double :"+j+" double :"+k);	

		//boolean
		boolean l=true;
		boolean m=false;
		System.out.println("boolean :"+l+" boolean :"+m);

		
	}//main
}//class
