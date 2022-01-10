package day0104;

public class HomeAssignment5 {

	public static void main(String[] args) {
		// 1번문제
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				System.out.print("짝 ");
			}else {
				System.out.print(i + " ");
			} // end else
		} // end for

		// 2번문제
		System.out.println();
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + (i * j)+" ");
			}//end for
			System.out.println();
		}//end for
		
		// 3번문제
		System.out.println();
		int i=0;
		i=Integer.parseInt(args[0]);
		
			if(i>1 && i<82){
				int j=0;
				for (int a = 2; a < 10; a++) {
					for (int b = 1; b < 10; b++) {
						j=a*b;
						if(i%j==0) {
						}//end if
					}//end for
				}//end for
				System.out.println(i+"는"+i/9+"단이다.");
					
			}else {
				System.out.println("구구단은 2-9단까지만 가능합니다.");
			}//end else
	}// main
}// class
