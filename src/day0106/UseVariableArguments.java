package day0106;

/**
 * Variable Arguments(가변인수) 사용
 * 
 * @author user
 */
public class UseVariableArguments {

	/**
	 * Variable Arguments를 사용한 method로 JDK1.5+에서부터 사용할 수 있다<br>
	 * V.A는 method내부에서 배열(주소를 가지고 있는 참조형 데이터형)로 사용된다.
	 * 
	 * @param param
	 */
	public void useVA(int... param) {
//		System.out.println(param); 참조형 데이터형은 주소가 출력
		for (int i = 0; i < param.length; i++) {
			System.out.print(param[i] + " ");
		} // end for
	}// useVA
	
//	public void useVA2(int ... paramI, int paramJ ) { //error V.A는 가장 마지막 parameter로만 정의된다.
	public void useVA2(int paramI, int ... paramJ ) { 
		System.out.print(paramI);
		System.out.print(paramJ);
		
	}//endVA2

	public static void main(String[] args) {
		// 객체화 : 인스턴스변수 호출
		UseVariableArguments uva = new UseVariableArguments();
//		uva.useVA();
//		uva.useVA(1);
		uva.useVA(1,2,43,5,100,6000); //동일한 데이터 형으로 여러개의 값을 넣을 수 있다.
		System.out.println();
		System.out.println("--------------------------------------");
		uva.useVA2(1,  1,2,3,4);
//		uva.useVA2(); error : int형은 반드시 값이 입력되어야 한다. V.A는 생략가능
	}// main

}// class
