package day0203;

import javax.security.auth.login.FailedLoginException;

/**
 * 특정 상황에서 예외를 강제로 발생시켜 처리
 * @author user
 */
public class UseThrow {
	
	public void login(String id, String pass)throws Exception {//2.발생된 예외를 던지고
		if(!(id.equals("admin")&&pass.equals("1234"))) {
			//1.예외를 강제로 발생
//			try {
//			throw new Exception("로그인 실패, 아이디나 비밀번호를 확인해주세요.");//현재 메소드의 일과 발생되는 예외가 관련이 없다.
			throw new FailedLoginException("로그인 실패, 아이디나 비밀번호를 확인해주세요.");
//			}catch(Exception e) {}//를 권장하지 않는다.
			}//end if
		System.out.println(id+"님 로그인 하셨습니다.");
	}//login

	public static void main(String[] args) throws Exception {
		UseThrow ut = new UseThrow();
		
		String id = "admi";
		String pass = "1234";
		
		try {
			ut.login(id, pass);//3.호출한 곳에서 throws 예외를 처리한다.
//		}catch(Exception e) {//업무(method)와 관련 없는 이름의 예외가 처리되었다.
		}catch(FailedLoginException e) {
			System.err.println("간단한 메시지: "+e.getMessage());
			System.err.println("예외처리 객체명과 메시지: "+e);
			System.err.println("--------------자세한 예외------------");
			e.printStackTrace();
		}//end catch
		
		
	}//main

}//class
