package day0112;

public class UseArray2_1 {
	
	String[] names = {"강명준", "강산", "김정하", "김현우", "김진영"};
	int[][]score = {
			{90, 94, 91}, {86, 84, 71}, {96, 99, 100}, {75, 76, 73}, {63, 69, 69}
	};
	int totalScore=0;//학생의 총점
	int totalScoreAll=0;
	int totalAverage=0;
	
	public void scorePreocess() {
		System.out.println("------------------------------------------");
		System.out.println("번호\t이름\t자바\t오라클\tHTML\t총점\t평균");
		System.out.println("------------------------------------------");
		
		for (int i=0;i<score.length;i++) {//행
			System.out.printf("%d\t%s\t", i+1, names[i]);
			for(int j=0;j<score[i].length;j++) {//열
				System.out.printf("%d\t", score[i][j]);
				totalScore += score[i][j];//한 학생의 점수를 누적합
			}//end for
			System.out.printf("%d\t%.2f\n", totalScore, (double)totalScore/3);
			totalScoreAll += totalScore;
			totalAverage += totalScore/score[i].length;
			totalScore = 0;//다음학생의 점수를 위해서 초기화
		}//end for
		
		System.out.println("------------------------------------------------------");
		System.out.printf("응시인원 [%d]명\n", score.length);
		//숙제. 코드 직접 기술해서 처리
		System.out.printf("전체 총점 [%d]점, 전체 평균 [%.2f]\n",totalScoreAll, (double)totalAverage/names.length );
		//숙제. 아래의 작업을 instance variable과 method를 작성하여 처리결과를 출력
		//System.out.printf("자바 총점 [%d], 오라클 총점 [%d], HTML 총점[%d]\n", JavaTotal, OracleTotal, HtmlTotal);
		//System.out.printf("자바 최고점수 [%d]점\n", 0);
		//System.out.printf("1등학생의 번호[%d], 이름[%s]\n", i, names[i]);
	}//UseArray2
	
	public void sujectTotal() {
		
		int JavaTotal = 0 ;
		int OracleTotal = 0;
		int HtmlTotal = 0;
		
		for(int j = 0; j< score[0].length ; j++) {
			JavaTotal += score[0][j];
		}//end for
		
		for(int j = 0; j< score[1].length ; j++) {
			OracleTotal += score[1][j];
		}//end for
		
		for(int j = 0; j< score[2].length ; j++) {
			HtmlTotal += score[2][j];
		}//end for
		
		System.out.printf("자바 총점 [%d], 오라클 총점 [%d], HTML 총점[%d]\n", JavaTotal, OracleTotal, HtmlTotal);
		
	}//subjectTotal
	
	public void JavaTop() {
		int JavaTop = 0;
		for(int i= 0 ; i<score[i].length; i++) {
			if(score[i][0]>JavaTop) {
				JavaTop = score[i][0];
			}//end if
		}//end for
		
		System.out.printf("자바 최고점수 [%d]점\n", JavaTop);
	}//JavaTop
	
	public void FirstGrade() {
		int FirstGrade = 0;
		int i,j = 1;
		
		for (i=0;i<score.length;i++) {//행
			for(j=0;j<score[i].length;j++) {//열
				totalScore += score[i][j];//한 학생의 점수를 누적합
					if(totalScore>FirstGrade) {
						FirstGrade = totalScore;
					}//end if
			}//end for
			totalScore = 0;
		}//end for
		System.out.println("최고점수 총 함 : "+ FirstGrade);
		//i는 계속증가하기 때문에 names[i]번째 배열방은 존재하지 않아요. 그래서 에러가 난거에요.
		System.out.println(" i is ----"+i);//names[5]방은존재하지 않습니다. 최고번호는 얻는 방법을 고민해보세요.//3번 김정하 출력
		System.out.printf("1등학생의 번호[%d], 이름[%s]\n", i, names[i-1]);
	}//FirstGrade

	public static void main(String[] args) {
		new UseArray2_1().scorePreocess();
		new UseArray2_1().sujectTotal();
		new UseArray2_1().JavaTop(); //method명은 소문자로 시작합니다.
		new UseArray2_1().FirstGrade();

	}//main

}//class
