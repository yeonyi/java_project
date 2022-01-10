package day0106;

/**
 * HomwAssignment7 숙제 풀이
 * 
 * @author user
 */
public class Work {
	/**
	 * 성을 반환하는 일. 고정값
	 * 
	 * @return 성
	 */
	public char lastName() {
		return 'C';
	}// lastName

	/**
	 * 입력되는 점수의 판정. 가변값 판정기준 : 0~100 사이면 true, 그렇지 않으면 false
	 * 
	 * @param score 판정할 점수
	 * @return 판정결과
	 */
	public boolean scoreJudge(int score) {
		boolean flag = score > -1 && score < 101;

//		if(score > -1 && score < 101) { 굳이 if를 만들지 않아도 되고 boolean flag = false;에서 false자리에 조건식을 넣으면 됨.
//			flag = true;
//		}
//		else { //flag의 기본값이 false이므로 else는 필요없는 코드이다.
//			flag=false;
//		}//end else

		return flag;
	}// scoreJudge

	/**
	 * 학점을 입력받아 학점에 맞는 문자를 구해서 반환. 가변값
	 * 
	 * @param sxore 점수
	 * @return 구해진 학점의 문자
	 */
	public char gradeText(int score) { // return을 많이 사용하는 것은 좋은 코드가 아니다.
		char temp = '\u0000';
		if (score > 89 && score < 101) {
			temp = 'A';
			// return 'A';
		} else if (score > 79 && score < 90) {
			temp = 'B';
			// return 'B';
		} else if (score > 69 && score < 80) {
			temp = 'C';
			// return 'C';
		} else if (score > 59 && score < 70) {
			temp = 'D';
			// return 'D';
		} else {
			temp = 'F';
			// return 'F';
		} // end else
		return temp;
	}// gradeText

	/**
	 * 별을 출력. 고정일 다른 클래스에 존재하는 메소드를 상황에 맞게 호출
	 */
	public void printStar() {
		// printStar method를 구현한 클래스를 객체화
		TestOverload to = new TestOverload();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (i % 2 == 0) {
					to.printStar();// 검은 별
				} else {
					to.printStar(1);// 흰 별
				} // end else
			} // end for
			System.out.println();
		} // end for
	}// printStar

	/**
	 * 구구단 2단 출력
	 */
	public void multiplicationTable() {
		System.out.println("2단");
		for (int i = 1; i < 10; i++) {
			System.out.println("2 x " + i + "= " + 2 * i);
		} // end for
	}// multiplicationTable

	/**
	 * method overload
	 */
	public void multiplicationTable(int level) {
		System.out.println(level + "단");
		for (int i = 1; i < 10; i++) {
			System.out.println(level + " x " + i + "= " + level * i);
		} // end for
	}// multiplicationTable

	public static void main(String[] args) {
		// 객체화:instance method 호출
		Work w = new Work();

		char familyName = w.lastName();
		System.out.println("내 성은 " + familyName);

		int score = 90;
		boolean flag = w.scoreJudge(score);
		System.out.println(score + "점 " + flag);

		if (flag) {
			char gradeText = w.gradeText(score);
			System.out.println("입력점수: " + score + "점, 학점: " + gradeText);
		} // end if

		w.printStar();

		w.multiplicationTable();
		w.multiplicationTable(5);
	}// main

}// class
