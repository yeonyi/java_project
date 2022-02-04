package day0204;

/**
 * Compile Exception 작성
 * @author user
 */
@SuppressWarnings("serial")
//1.Exception 또는 RuntimeException을 상속받고
public class TabaccoException extends Exception {
//2.생성자 Overload
	/**
	 * 정해진 예외메시지를 출력할 때 
	 */
	public TabaccoException() {
		super("흡연예외발생");
	}//TabaccoException
	
	/**
	 * 개발자가 상황에 맞는 예외메시지를 만들어서 출력할 때
	 * @param msg
	 */
	public TabaccoException(String msg) {
		super(msg);
	}//TabaccoException
	

}//class
