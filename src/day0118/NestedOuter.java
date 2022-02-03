package day0118;

/**
 * 안쪽 클래스를 static변수처럼 사용 (객체를 생성하지 않고 사용)
 * @author user
 */
public class NestedOuter {

	int outI;
	static int outJ;
	
	public void outInstanceMethod() {
		System.out.println("바깥클래스의 인스턴스 method");
	}//outInstanceMethod
	
	public static void outStaticMethod() {
		System.out.println("바깥클래스의 static method");
	}//outStaticMethod

	/////////////////Nested Class 시작/////////////////
	static class NestedInner{
//		int inI; 중첩클래스에서는 instance변수를 만들지 않는다.
		static int inJ;
		
//		public void inInstanceNethod() {//중첩클래스에서는 instance method를 만들지 않는다.
//		}
		
		public static void inStaticMethod() {
			System.out.println("중첩 클래스의 static method");
			System.out.println("----------------------------------");
			//바깥 클래스의 자원 사용
			//인스턴스영역의 변수나 method는 사용불가
			//outI = 100;
			//outInstanceMethod();
			
			//동일영역의 변수나 method만 사용가능
			outJ=200;
			outStaticMethod();
			
		}//inStaticMethod
	}//class
	/////////////////Nested Class 끝/////////////////
	
	public static void main(String[] args) {
		//중첩클래스는 static을 주로 사용하여 만들기 때문에 객체를 생성하지 않고,
		//static 방식(클래스명.method명, 클래스명.변수명) 으로 사용한다.	
		NestedInner.inJ = 100;
		NestedInner.inStaticMethod();
		
	}//main

}//class
