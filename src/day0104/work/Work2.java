package day0104.work;

/**
 * HomeAssignment4 2번문제. 점수계산
 * @author user
 */
public class Work2 {

	public static void main(String[] args) {
		int score = 0;//지역변수는 반드시 초기화
		score=Integer.parseInt(args[1]);
		System.out.print(score +"점은 ");

		if(score >= 0 && score <= 100) {
			//0~100사이
			if(score<40) {
				System.out.println("과락");
			}else if(score<60) {
				System.out.println("다른점수 참조");
			}else {
				System.out.println("입력성공");
			}//end else
		}else{
			System.out.println("유효점수가 아닙니다.");
		}//end else

	}//main

}//class
