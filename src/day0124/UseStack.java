package day0124;

import java.util.Stack;

/**
 * LIFO�� �ڷᱸ�� Ư¡�� ������ Ŭ���� -Stack
 * @author user
 */
public class UseStack {
	
	public UseStack() {
		
		//1.Stack����
		Stack<String> stk = new Stack<String>();
		
		//2.�� �ֱ�
		stk.push("�ϼ���?1");
		stk.push("�ȳ�2");
		stk.push("������ ������3");
		
		//3.�� ���, ���ÿ� ���� ������ ������ ���
		while(!stk.empty()) {//����� �� ture, ������� ������ false
			System.out.println(stk.pop());
		}//end while
		
		System.out.println(stk);
	}//UseStack

	public static void main(String[] args) {
		new UseStack();
	}//main

}//class
