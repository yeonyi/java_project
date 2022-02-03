package day0117;

/**
 * 자식클래스(상속받을 (기능을 확장할) 클래스를 명시한다.)<br>
 * 오버라이딩의 목적: 부모클래스가 제공하는 기능이 자식클래스에서 맞지 않으면 자식클래스가 필요한 기능을 재정의<br> 
 * 오버라이딩의 규칙: 접근지정자는 달라도 되고 반환형, 메소드명, 매개변수는 반드시 같아야 한다.
 * @author user
 */
public class TestOverrideSub extends TestOverrideSuper  {
	
	//temp method를 Override
	@Override
	public void temp() {//접근지정자 다름(넓게), 반환형과 메소드 같음
		System.out.println("자식클래스가 Override한 temp method");
		super.temp();//부모클래스가 가진 temp()를 호출
	}//temp
	
	public void sub() {
		System.out.println("자식클래스만 가진 method");
	}//sub

}//class
