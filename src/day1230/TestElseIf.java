package day1230;
/**
 다중 if (else if)
 연관된 여러 조건을 비교할 떄 사용
*/
class TestElseIf{

	public static void main(String[] args) {

		//점수를 입력 받아 0점보다 작았을 때의 실페 메세지와 100점보다 컸을 떄 실패 메세지와 성공했을 떄 메세지를 다르게 출력
		int score=Integer.parseInt(args[0]);
		
		//int score=50;입력값 수정이 안됨
		System.out.print(score+"점은 ");
		
		if(score<0){//0보다 작은 경우
			System.out.println("0점보다 작을 수 없습니다.");
		}else if(score>100){//100보다 큰 경우
			System.out.println("0점보다 클 수 없습니다.");
		}else {//그렇지 않은 경우
			System.out.println("입력성공!");
		}//end else

		//수를 입력 받아 0에서부터 39까지는 과락, 40에서 59까지는 다른 점수 참조, 60에서 100까지는 합격 (else를 생략하는 코드 작성)
		int score1=Integer.parseInt(args[1]);
		System.out.print(score1+"점은 ");

		if(score1 >-1 && score1 < 40){
			System.out.println("과락");
		}else if(score1 > 39 && score1 < 60){
			System.out.println("다른 점수 참조");
		}else if(score1 > 59 && score1 < 101){
			System.out.println("합격!");
		}//end else if

	}//main
}//class
