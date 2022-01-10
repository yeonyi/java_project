package day0106;

/**
 * method의 4가지 형태와 호출
 * @author user
 */
public class TestMethodType {
	
	/**
	 * 고정일(반환형 없고, 매개변수 없는 형)형태의 method
	 */
	public void typeA() {
		System.out.println("고정일 : 호출을 하더라도 항상 같은 일을 수행한다.");
	}//typeA

	/**
	 * 가변일(반환형 없고, 매개변수 있는 형)형태의 method<br>
	 * 입력되는 값으로 동적인 일을 수행할 수 있다.
	 * @param i 입력값
	 */
	public void typeB(int i) {
		System.out.println("가변일 : 입력값에 따라 다른 일을 수행한다."+i);
	}//typeB
	
	/**
	 * 고정값(반환형 있고, 매개변수 없는 형)형태의 method<br>
	 * 항상 같은 값이 반환된다.
	 * @return 올해
	 */
	public int typeC() {
		int i = 2022;
		return i; 
	}
	
	/**
	 * 가변값(반환형 있고, 매개변수 있는 형)형태의 method<br>
	 * 매개변수에 따라 다른 결과가 반환됨
	 * @param d 실수의 입력값
	 * @return 정수의 반환값
	 */
	public int typeD(double d) {
		return (int)d;
	}//typeD
	
	public static void main(String[] args) {
		//객체화 : 인스턴스 변수나 인스턴스 메소드를 사용하기 위해서 반드시 필요한 작업
		TestMethodType tmt = new TestMethodType();
		
		tmt.typeA();//고정일
//		tmt.typeA();
//		tmt.typeA();
//		tmt.typeA();
		
		tmt.typeB(0);//가변일
//		tmt.typeB(10);
//		tmt.typeB(100);
//		
		int value1=tmt.typeC();//고정값
		System.out.println("고정값:호출하면 항상 같은 값이 반환된다."+value1);
//		int value2=tmt.typeC();
//		System.out.println("고정값:호출하면 항상 같은 값이 반환된다."+value2);
		
		int value3=tmt.typeD(2022.0106);//가변값
		System.out.println("가변값:매개변수의 호출에 따라 다른 값이 반환된다."+value3);
//		int value4=tmt.typeD(2021.0106);//가변값
//		System.out.println("가변값:매개변수의 호출에 따라 다른 값이 반환된다."+value4);
		
	}//main

}//class
