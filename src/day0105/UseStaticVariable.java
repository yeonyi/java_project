package day0105;

/**
 * static(class) variable : 공용변수 사용<br>
 * 객체화를 하지 않고 클래스명으로 사용하는 변수
 * @author user
 */
public class UseStaticVariable {
	static int i;//class field에 선언되지만 객체를 생성하지 않고 클래스명으로 직접 접근
	public static int j;
	int insI;//instance variable

	public static void main(String[] args) {
		
		System.out.println(i);
		System.out.println(UseStaticVariable.j);
		//static변수는 객체에 속해있지 않은 공용변수로 객체명.변수명으로 사용하면 사용은 되나 올바른 사용방법이 아니므로 경고메세지를 보여준다.
		
		UseStaticVariable usv = new UseStaticVariable(); //객체생성
		UseStaticVariable usv2 = new UseStaticVariable(); //객체생성
		usv.insI = 100;//instance variable : 객체마다 값이 따로 설정됨
		usv2.insI = 500;
		//static변수는 객체명으로 사용하더라도 하나의 변수를 사용하는 것이기 때문에 변경된 값이 공유됨
		
		///////////////////////////////////////잘못된 방법//////////////////////////////////
//		usv.i=1000;
//		System.out.println("static 객체명으로 사용: "+usv.i+", instance variable: "+usv.insI);
//		System.out.println("static 객체명으로 사용: "+usv2.i+", instance variable: "+usv2.insI);
		
		////////////////////////////올바른 방법 : static 문법으로 사용///////////////////////////
		UseStaticVariable.i=1000; //객체명을 사용하지 않음
		System.out.println("static 객체명으로 사용: "+UseStaticVariable.i+", instance variable: "+usv.insI);
		System.out.println("static 객체명으로 사용: "+UseStaticVariable.i+", instance variable: "+usv2.insI);
		
	}//main

}//class
