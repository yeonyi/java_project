package day1230;
/**
 if-else : 둘중 하나의 코드를 실행해야 할 때
*/
	class TestIfElse {
	public static void main(String[] args) {
		//음수인지 양수인지 판별하는 코드 작성
		int num=12;

		if (num > -1){
			System.out.println(num+"은 양수");
		}

		else {
			System.out.println(num+"은 음수");
		}//end else

		//홀수 짝수 구분
		int num1=12;
		if (num1%2==0) {
			System.out.println(num1+"은 짝수");
		}else {		
			System.out.println(num1+"은 홀수");
		
		}//end else

		//입력받은 점수를 출력하고, 0~100사이이면 "유효점수"를 그렇지 않으면 "무효점수" 출력
		/*int num2=55;
		if(num>=0&&num<=100){
			System.out.println("유효점수");
		}else{
			System.out.println("무효점수");
		}*/

		int score=Integer.parseInt(args[0]);

		System.out.print(score+"점은 ");

		if(score > -1 && score < 101) {
			System.out.println("유효점수");
		}else{
			System.out.println("무효점수");
		}//end else

		//args[1]번으로 입력된 값을 정수로 변환하고 변환된 값이 대문자의 볌위라면 대문자로 출력하고, 그렇지 않다면 숫자를 그대로 출력
		int i=Integer.parseInt(args[1]);

		if(i>64 && i<91){ //대문자의 범위
			System.out.println((char)i);
		}else{ //대문자의 범위가 아닐 때
			System.out.println(i);
		}//end else
	}
}
