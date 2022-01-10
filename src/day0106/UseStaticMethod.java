package day0106;

/**
 * static method 사용 : 인스턴스변수를 사용하지 않고, 입력된 값으로만 업무를 처리
 * @author user
 */
public class UseStaticMethod {
	//1.method 정의
	public static void test() {
		System.out.println("static method 호출");
	}//test
	public static void main(String[] args) {
		//2.method 호출
		UseStaticMethod.test();
	}//main

}//class
