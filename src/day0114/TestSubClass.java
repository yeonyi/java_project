package day0114;

/**
 *  TestSuperClass의 자식클래스
 * @author user
 */
public class TestSubClass extends TestSuperClass{
	
	int c;//부모클래스에 존재하는 변수명과 동일한 변수가 선언
	
	public TestSubClass() {
		System.out.println("자식클래스의 생성자");
	}//TestSubClass
	
	public void parentResource() {
		//상속의 특징: 부모클래스의 자원을 자식클래스에서 자신의 것처럼 사용할 수 있다. 
		this.a = 10;//public
		this.b = 20;//protected
		this.c = 30;//default
//		d = 40; private 사용불가
		super.c=40;//같은 이름의 변수가 존재하면 부모의 변수는 super로 자식의 변수는 this로 접근한다.
//		System.out.println(super); 출력안됨
		System.out.println("자식 method" + this.a + "," +this. b + ","+ c+","+super.c);
		
	}//parentResource

}//TestSubClass
