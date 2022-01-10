package day0110;

/**
 * 1.이메일을 method의 arguments로 입력받아 유효성 검증을 수행하여 유효하면 true, <br>
 * 무효하면 false를 반환하는 method를 작성<br>
 * 유효성 : 이메일은 5글자 이상, @와 .이 들어있어야 하고 @은 .보다 먼저 나와야 한다.<br>
 * 2.문자열을 입력받아 문자열에 어쩔, 저쩔, 뇌절 이라는 단어가 포함되어있다면 "MZ세대"를 <br>
 * 그렇지 않으면 "늙은세대"를 반환하는 method를 작성<br>
 * 두 method 모두 instance method로 작성하여 호출하고 결과를 출력
 * @author user
 */
public class HomeAssignment9 {
	public String email(String s) {
		//s = "chldusdl114@naver.com";
		int s1;
		s1 = s.indexOf('@');
		if(s.length()>=5 && s.contains("@") && s.contains(".")
			&& s1<s.indexOf('.')){
			return"Ture";
		}else {
			return"False";
		}//end else
		
	}//email
	
	public String msg (String m) {
		if(m.matches("어쩔") || m.matches("저쩔") || m.matches("뇌쩔")) {
			return "MZ세대";
//		if(m.equalsIgnoreCase("어쩔") || m.equalsIgnoreCase("저쩔") ||m.equalsIgnoreCase("뇌절"){
		}else {
			return "늙은세대";
		}//end else
		
	}//end msg

	public static void main(String[] args) {
		HomeAssignment9 ha = new HomeAssignment9();
		String s = "chldusdl114@naver.com";
		ha.email(s);
		System.out.println("이메일 호출: "+ s);
		System.out.println("유효성 검사: "+ha.email(s));
		
		String m = "어쩔!!";
		ha.msg(m);
		System.out.println("자신이 생각하는 신조어를 말하세요: "+ s);
		System.out.println("세대 검사: "+ha.msg(m));
		
	}

}
