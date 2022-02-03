package day0114;

/**
 * 객체화는 뒤에서 부터 읽으면 코딩이 쉬워진다.
 * @author user
 */
public class Parent {
	public Parent() {
//		super();
//		this(10);//2번
		this(10); //3번
		System.out.println("부모의 기본 생성자");
	}//Parent
	

	public Parent(int i) {
//		this(); 1번
		//super();//2번
		System.out.println("부모의 오버로딩된 생성자 " +i);
	}//Parent
	
	
}//class
