package day1227;
/**
프로그램에서 기준 값을 가독성 있게 사용할 때 사용
*/
public class Constant{
	//기준값으로 사용하는 Constant는 class field에서만 선언할 수 있다.
		public static final int MAX_SCORE=100;
		public static final int MIN_SCORE=0;

	public static void main(String[] args){
		
		int myScore=85;
		//MAX_SCORE=99; error Constant는 선언하는 행에서만 값을 할당할 수 있다.
		System.out.println(MAX_SCORE+"/"+MIN_SCORE);//클래스명 생략
		
		System.out.println(Constant.MAX_SCORE+"/"+Constant.MIN_SCORE);
		System.out.println("내 점수와 최고 점수의 차이: "+(MAX_SCORE-myScore));
	}//main
}//class
