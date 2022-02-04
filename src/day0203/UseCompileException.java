package day0203;

/**
 * Compile Exception
 * 코딩시에 예외가 발생하는 예외(bytecode가 제대로 만들어지지 않음)
 * @author user
 */
public class UseCompileException {
	
	public UseCompileException() {
		//new를 사용하지 않고 외부 클래스를 객체로 생성할 때
		try {
//			Class obj = Class.forName("java.lang.String");
			Class obj = Class.forName("day0203.UseRuntimeException1");
			System.out.println(obj);
		}catch(ClassNotFoundException cnfe) {
			System.err.println("클래스의 이름을 확인하세요.");
			String msg = cnfe.getMessage();
			System.err.println("간단한 메시지: "+ msg);
			String msg1 = cnfe.toString();
			System.err.println("예외처리객체와 간단한 메시지 "+msg1);
			
			cnfe.printStackTrace();//console출력도 함께 수행
//		}catch(FileNotFoundException n) {// try안쪽의 코드가 예외를 throws하지 않으면 throws한 것만 catch가능
			
		}
	}//UseCompileException

	public static void main(String[] args) {
		new UseCompileException();
	}//main

}//class
