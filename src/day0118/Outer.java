package day0118;

/**
 * Inner class
 * @author user
 */
public class Outer {

	private int outI;
	
	public Outer() {
		System.out.println("바깥클래스의 생성자");
	}//Outer
	
	public void outMethod() {
		System.out.println("바깥클래스의 method");
//		intI = 10; 바깥클래스에서는 안쪽클래스의 변수를 직접 사용할 수 없다.
//		inMethod(); 바깥클래스에서는 안쪽클래스의 메소드를 직접 사용할 수 없다.
		System.out.println("-------------------------------");
		
		//instacne method에서 inner class를 객체화
//		Inner in = this.new Inner();
		Inner in = new Inner();//instance영역 안에서는 this를 생략하여 사용할 수 있다.
		System.out.println(in);
		
	}//outMethod
	/////////////안쪽 클래스 시작/////////////
	public class Inner{
		int intI;
		
		public Inner() {
			System.out.println("안쪽클래스의 생성자");
		}//Inner
		
		public void inMethod() {
			System.out.println("안쪽클래스의 method");
			//바깥 클래스의 자원을 직접 사용할 수 있다.
			outI = 100;
			outMethod();
		}//inMethod
	}//class
	/////////////안쪽 클래스 끝//////////////
		
	public static void main(String[] args) {
		//1.바깥클래스의 객체화
		Outer out = new Outer();
		//2.안쪽클래스의 객체화: 바깥클래스명.안쪽클래스명 객체명 = 바깥클래스객체명.new 안쪽클래스생성자();
		//바깥클래스명은 생략가능
		Outer.Inner in = out.new Inner(); 
		//3.안쪽클래스의 자원사용
		in.intI=200;//변수사용
		in.inMethod();//method 사용
	}//main
}//class
