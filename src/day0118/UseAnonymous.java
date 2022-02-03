package day0118;

public class UseAnonymous {
	/**
	 * 클래스(인터페이스)를 매개변수로 받는 method
	 * @param ta
	 */
	public void useTestA(TestA ta) {
		ta.testA();
	}//useTeatA

	public static void main(String[] args) {
		//1.클래스를 객체화
		UseAnonymous ua = new UseAnonymous();
		//3.인터페이스를 구현한 클래스를 객체화
//		ua.useTestA(new TestA());
		TestAImpl tai = new TestAImpl();//TestAImpl은 TestA이다 (is a 관계)
		//4.3번에서 생성된 객체를 arguments로 입력하여 method호출
		ua.useTestA(tai);
		ua.useTestA(tai);//한번이상 호출하더라고 객체만 생성해서 호출하면 된다 => 중복코드가 줄어든다.
		
		System.out.println("-----------anonymous inner class---------");
		//1.클래스 객체화
		UseAnonymous ua2 = new UseAnonymous();
		//2.anonymous inner class로 객체를 생성하여 arguments로 입력한다.
		ua2.useTestA(new TestA() {
			@Override
			public void testA() {
				//한번 이상 호출되면 중복코드의 양이 증가하므로 그럴 경우에는 위의 방법처럼 구현 클래스를 새로 생성해서 출력한다.
				System.out.println("anonymous inner class로 생성된 객체");
			}
		});
		
		ua2.useTestA(new TestA() {
			@Override
			public void testA() {
				//한번 이상 호출되면 중복코드의 양이 증가하므로 그럴 경우에는 위의 방법처럼 구현 클래스를 새로 생성해서 출력한다.
				System.out.println("중복코드의 양이 증가함");
			}
		});
		
	}//main

}//class
