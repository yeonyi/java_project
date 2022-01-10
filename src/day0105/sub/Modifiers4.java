package day0105.sub;

import day0105.Modifiers;

/**
 * 다른 패키지의 상속관계의 자식 클래스<br>
 * @author user
 */
public class Modifiers4 extends Modifiers {

	
	public static void main(String[] args) {
		System.out.println("다른 패키지에 존재하는 자식 클래스");
		//객체화:인스턴스변수를 사용하기 위해
		//상속관계에서는 자식클래스로 객체화를 한다.
		Modifiers4 m =new Modifiers4();
		
		//변수의 접근지정자에 따라 사용과 사용불가가 결정된다.
		System.out.println("public:"+m.instanceA);
		System.out.println("protected:"+m.instanceB); 
//		System.out.println("default:"+m.instanceC); 사용불가
//		System.out.println("private:"+m.instanceD); 사용불가

	}//main

}//class
