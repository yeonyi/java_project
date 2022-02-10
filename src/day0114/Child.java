package day0114;

/**
 * Parent의 자식 클래스
 * @author user
 */
public class Child extends Parent {

	public Child() {
//		super(20); //1번
//		this(30);//2번
		super(); //3번
		System.out.println("자식의 기본 생성자");
	}//Child
	
	public Child(int i) {
//		this(); //1번
//		super();//2번
		this(); //3번
		System.out.println("자식의 오버로딩된 생성자 " + i);
	}//Child

}//class
