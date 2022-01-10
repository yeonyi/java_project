package day0105;

/**
 * continue 사용 (반복문의 반복실행을 건너뛰고 증가 또는 감소식으로 이동)
 * @author user
 */
public class UseContinue {

	public static void main(String[] args) {
	 for (int i=1;i<101; i++) {
		 System.out.print("필수반복 ");
		 if(i%2==1) { //홀수이면 continue에 의해서 건너뜀
			 continue; //반복문 안에서만 사용. 특정 조건에 만족할 때에만 실행되도록 조건문 안에서만 사용,출력 안됨
		 }//end if
		 System.out.println(" 상황반복"+i+" ");
	 }//end for
		 
	}//main

}//class
