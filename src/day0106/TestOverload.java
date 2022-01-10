package day0106;

/**
 * method Overload. 같은 이름의 메소드를 여러 개 작성하는 것 매개변수를 다르게 설정한다.
 * 
 * @author user
 */
public class TestOverload {

	/**
	 * 별을 하나 출력하는 일
	 */
	public void printStar() {
		System.out.print("★");
	}// printStar

	/**
	 * 입력된 수 대로 별을 출력하는 일  
	 * 
	 * @param cnt 출력할 별의 갯수
	 */
	public void printStar(int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.print("☆");
		} // end for

	}// printStar

	public static void main(String[] args) {
		TestOverload to = new TestOverload();
		//별 하나 출력
		to.printStar();
		//별 여러개 출력
		to.printStar(5);
		
	}// main

}// class
