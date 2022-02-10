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
		//입력되는 값이 2~9단 사이일 때에 입력되는 값으로 구구단을 출력하세요.
		//2~9단 아니라면 “구구단은 2~9까지만 가능 합니다.” 를 출력

		System.out.println();
		int num =Integer.parseInt(args[0]);
		
			if(num>1 && num<82){
				int i=0;
				for (int a = 2; a < 10; a++) {//a는 2~9까지
					for (int b = 1; b < 10; b++) {//b는 1~9까지
						i=a*b;//i=2*1, 2*2, 2*3... 
						}//end for
					if(num%i==0) {
					}//end if
				}//end for
				System.out.println(num+"는"+num/i+"단이다.");
					
			}else {
				System.out.println("구구단은 2-9단까지만 가능합니다.");
			}//end else
	}// main
}// class
