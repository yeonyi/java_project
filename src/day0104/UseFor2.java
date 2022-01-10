package day0104;

/**
 * 다중 for<br>
 * 형식은 <br>
 * 바깥 for가 한번 돌 때 안쪽 for가 몇번 반복하는지를 잘 파악해야함 for(초기값;조건식;증감식){<br>
 * for(초기값;조건식;증감식){<br>
 * 반복수행문장<br>
 * }<br>
 * }
 * 
 * @author user
 */
public class UseFor2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {// 안쪽 for의 초기화는 바깥 for의 조건만큼 수행한다.
				System.out.println("i= " + i + ", j= " + j);
			} // end for
			System.out.println("-------------");
		} // end for

		System.out.println();
		// 구구단은 2단에서부터 9단까지 존재, 각 단에서 1~9까지 반복
		for (int i = 2; i < 10; i++) {// 단
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {// 곱해지는 수
				System.out.println(i + "*" + j + "=" + i * j);
			} // end for
		} // end for

		System.out.println("-----------------------");
		// 0 1 0 2 0 3 0 4
		// 1 2 1 3 1 4
		// 2 3 2 4
		// 3 4
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 5; j++) {
				System.out.print(i + " " + j + " ");
			} // end for
			System.out.println();
		} // end for

		System.out.println();
		// 0 0
		// 1 0 1 1
		// 2 0 2 1 2 2
		// 3 0 3 1 3 2 3 3
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(i + " " + j + " ");
			} // end for
			System.out.println();
		} // end for

	}// main

}// class
