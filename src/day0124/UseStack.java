package day0124;

import java.util.Stack;

/**
 * LIFO의 자료구조 특징을 구현한 클래스 -Stack
 * @author user
 */
public class UseStack {
	
	public UseStack() {
		
		//1.Stack생성
		Stack<String> stk = new Stack<String>();
		
		//2.값 넣기
		stk.push("하세요?1");
		stk.push("안녕2");
		stk.push("오늘은 월요일3");
		
		//3.값 얻기, 스택에 값이 존재할 때까지 얻기
		while(!stk.empty()) {//비었을 때 ture, 비어있지 않으면 false
			System.out.println(stk.pop());
		}//end while
		
		System.out.println(stk);
	}//UseStack

	public static void main(String[] args) {
		new UseStack();
	}//main

}//class
