package day0112;

public class UseArray2_1 {
	
	String[] names = {"������", "����", "������", "������", "������"};
	int[][]score = {
			{90, 94, 91}, {86, 84, 71}, {96, 99, 100}, {75, 76, 73}, {63, 69, 69}
	};
	int totalScore=0;//�л��� ����
	int totalScoreAll=0;
	int totalAverage=0;
	
	public void scorePreocess() {
		System.out.println("------------------------------------------");
		System.out.println("��ȣ\t�̸�\t�ڹ�\t����Ŭ\tHTML\t����\t���");
		System.out.println("------------------------------------------");
		
		for (int i=0;i<score.length;i++) {//��
			System.out.printf("%d\t%s\t", i+1, names[i]);
			for(int j=0;j<score[i].length;j++) {//��
				System.out.printf("%d\t", score[i][j]);
				totalScore += score[i][j];//�� �л��� ������ ������
			}//end for
			System.out.printf("%d\t%.2f\n", totalScore, (double)totalScore/3);
			totalScoreAll += totalScore;
			totalAverage += totalScore/score[i].length;
			totalScore = 0;//�����л��� ������ ���ؼ� �ʱ�ȭ
		}//end for
		
		System.out.println("------------------------------------------------------");
		System.out.printf("�����ο� [%d]��\n", score.length);
		//����. �ڵ� ���� ����ؼ� ó��
		System.out.printf("��ü ���� [%d]��, ��ü ��� [%.2f]\n",totalScoreAll, (double)totalAverage/names.length );
		//����. �Ʒ��� �۾��� instance variable�� method�� �ۼ��Ͽ� ó������� ���
		//System.out.printf("�ڹ� ���� [%d], ����Ŭ ���� [%d], HTML ����[%d]\n", JavaTotal, OracleTotal, HtmlTotal);
		//System.out.printf("�ڹ� �ְ����� [%d]��\n", 0);
		//System.out.printf("1���л��� ��ȣ[%d], �̸�[%s]\n", i, names[i]);
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
		
		System.out.printf("�ڹ� ���� [%d], ����Ŭ ���� [%d], HTML ����[%d]\n", JavaTotal, OracleTotal, HtmlTotal);
		
	}//subjectTotal
	
	public void JavaTop() {
		int JavaTop = 0;
		for(int i= 0 ; i<score[i].length; i++) {
			if(score[i][0]>JavaTop) {
				JavaTop = score[i][0];
			}//end if
		}//end for
		
		System.out.printf("�ڹ� �ְ����� [%d]��\n", JavaTop);
	}//JavaTop
	
	public void FirstGrade() {
		int FirstGrade = 0;
		int i,j = 1;
		
		for (i=0;i<score.length;i++) {//��
			for(j=0;j<score[i].length;j++) {//��
				totalScore += score[i][j];//�� �л��� ������ ������
					if(totalScore>FirstGrade) {
						FirstGrade = totalScore;
					}//end if
			}//end for
			totalScore = 0;
		}//end for
		System.out.println("�ְ����� �� �� : "+ FirstGrade);
		//i�� ��������ϱ� ������ names[i]��° �迭���� �������� �ʾƿ�. �׷��� ������ ���ſ���.
		System.out.println(" i is ----"+i);//names[5]������������ �ʽ��ϴ�. �ְ��ȣ�� ��� ����� ����غ�����.//3�� ������ ���
		System.out.printf("1���л��� ��ȣ[%d], �̸�[%s]\n", i, names[i-1]);
	}//FirstGrade

	public static void main(String[] args) {
		new UseArray2_1().scorePreocess();
		new UseArray2_1().sujectTotal();
		new UseArray2_1().JavaTop(); //method���� �ҹ��ڷ� �����մϴ�.
		new UseArray2_1().FirstGrade();

	}//main

}//class
