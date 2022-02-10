package day0106;

/**
 * 과제 <br>
 * 1. 자신의 성을 문자로 반환하는 method 작성<br>
 * 2. 점수를 입력받아서 판정을 반환하는 method작성(0~100사이일때는 true, 그렇지 않으면 false)<br>
 * 3. 점수를 입력받아서 학점('A'~'F')을 구하여 반환하는 method 작성(if로)<br>
 * 4. 수업시간에 작성한 printStar()을 호출하여 별을 아래와 같이 출력<br>
 * ★\n☆☆\n★★★\n☆☆☆☆<br>
 * 5.구구단을 출력하는 method작성, 매개변수 없이 method를 호출하면 2단 출력, 단을 넣어 method를 호출하면 입력한 단의 구구단 출력하는 method 작성
 * @author user
 */
public class HomeAssignment7 {
	
	//1번문제 - 고정값
	public char name() { 
		char i;
		i='C';
		return i;
	}//name
	
	//2번문제 - 고정값
	public int score() { 
		int s;
		s=80;
		return s;
	}//score
	
	//3번문제 - 고정값
	public int anotherScore() {
		int s2;
		s2=80;
		return s2;
	}//anotherScore
	
	//4번문제 - 고정일 다른 클래스의 메소드를 상황에 맞게 호출
	public void printStar1() {
		System.out.println("★");
	}//end printStar1
	
	public void printStar1(int cnt) {
		for(cnt=2; cnt<5;cnt++) {
			if(cnt%2==0) {
				System.out.println('☆' * cnt);
			}else {
				System.out.println('★' * cnt);
			}//end else
		}//end for
	}//end printStar1
	
	//5번문제 - 오버로딩
	public static void multiplicationTable () {
		System.out.println("2단은 ");
	}//end multiplicationTable
	
	public static void multiplicationTable (int i) {
		i=5;
		System.out.println(i+"단은 ");
	}//end multiplicationTable
	
	public static void main(String[] args) {
		HomeAssignment7 ha = new HomeAssignment7();
		
		char name1 = ha.name();
		System.out.println("나의 성: "+name1);
		
		int score1 = ha.score();
		if(score1>-1 && score1<101) {
			System.out.println("Ture");
		}else {
			System.out.println("False");
		}//end else
		
		int score2 = ha.anotherScore();
		if(score2>=90 && score2<=100) {
			System.out.println("학점: A");
		}else if(score2>=80 && score2<=89) {
			System.out.println("학점: B");
		}else if(score2>=70 && score2<=79) {
			System.out.println("학점: C");
		}else if(score2>=60 && score2<=69) {
			System.out.println("학점: D");
		}else if(score2>=50 && score2<=59) {
			System.out.println("학점: E");
		}else {
			System.out.println("학점: F");
		}//end else
		
		ha.printStar1();
		ha.printStar1(5);
		
		int num1 = 0;
		multiplicationTable();
		for (num1=1 ; num1 < 10; num1++) {
			System.out.printf("%d * %d = %d\n", 2, num1, 2*num1);
		}//end for
		
		int i=5;
		int num = 0;
		multiplicationTable(num);
		for (num=1 ; num < 10; num++) {
			System.out.printf("%d * %d = %d\n", i, num, i*num);
		}//end for
		
		
		
		
		
		
		
		


	}//main

}//class
