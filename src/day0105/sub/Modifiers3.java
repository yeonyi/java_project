package day0105.sub;

import day0105.Modifiers;

/**
 * 다른 패키지의 다른 클래스<br>
 * @author user
 */
public class Modifiers3 {

	
	public static void main(String[] args) {
		System.out.println("다른 패키지의 다른 클래스");
		//객체화:인스턴스변수를 사용하기 위해
		Modifiers m =new Modifiers();
		
		//변수의 접근지정자에 따라 사용과 사용불가가 결정된다.
		System.out.println("public:"+m.instanceA);
//		System.out.println("protected:"+m.instanceB); 사용 불가
//		System.out.println("default:"+m.instanceC); 사용 불가
//		System.out.println("private:"+m.instanceD); 사용 불가

	}//main

}//class
