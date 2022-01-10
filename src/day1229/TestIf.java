package day1229;
/**
 단일 if
*/
public class TestIf {
	public static void main(String[] args) {
		
		int i=Integer.parseInt(args[0]);
		int num=Integer.parseInt(args[1]);
		

		System.out.println("i: "+i);
		System.out.println("num: "+num);

		//입력한 수가 5와 같다면-> 조건 
		//"오"를 출력 -> 실행할 문장
		if(i==5){

			System.out.println("오");
		}//end if

		if(num<0) {
			num=-num;//부호 변경
			}//end if

		System.out.println("args[1]의 절대값은 "+num+"이다.");

		//입력된 세번째 값을 출력하고 "오늘"이라면 "2021년 12월 29일"을 출력한다.
		System.out.println(args[2]);

		if(args[2].equals("오늘")){//문자열 비교
			System.out.println("2021년 12월 29일");
		}//end if
	}//main
}//class
