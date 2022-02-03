package day0119;

import java.util.StringTokenizer;

/**
 * 문자열을 짧은 한 마디(토큰)로 구분할때 사용하는 클래스
 * @author user
 */
public class UseStringTokenizer {
	
	public  UseStringTokenizer() {
		String msg = "자바,오라클.JDBC,HTML,CSS";
		//CSV(Comma Seperated Value) Data:특정문자열로 구분된 데이터
		
		//1.String Tokenizer 생성
//		StringTokenizer stk = new StringTokenizer(msg); 공백으로 토큰 생성
//		StringTokenizer stk = new StringTokenizer(msg, ",");//특정문자열로 구분하는 토큰 생성
		
		//구분문자열에는 or기능 - 구분문자열에 해당하는 모든 문자열을 토큰으로 생성
//		StringTokenizer stk = new StringTokenizer(msg, ",.B");//특정문자열로 구분하는 토큰 생성

		StringTokenizer stk = new StringTokenizer(msg, ",", true);//특정문자열로 구분하는 토큰 생성
		//구분문자열도 토큰으로 생성
		
		//2.토큰의 수 (토큰이 얻어질떄마다 감소한다.)
		System.out.println(stk.countTokens());
		
		//3.토큰이 존재하는지?
		String token="";
		while(stk.hasMoreTokens()) {
		//4.토큰을 얻고 포인터를 다음 토큰 앞으로 이동
//			stk.nextToken();
			token = stk.nextToken();
			System.out.println(token);
		}//end while
		
	}//UseStringTokenizer
	
	public static void main(String[] args) {
		new UseStringTokenizer();
	}//main
}//class
