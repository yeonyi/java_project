package day0106;

/**
 * ���� <br>
 * 1. �ڽ��� ���� ���ڷ� ��ȯ�ϴ� method �ۼ�<br>
 * 2. ������ �Է¹޾Ƽ� ������ ��ȯ�ϴ� method�ۼ�(0~100�����϶��� true, �׷��� ������ false)<br>
 * 3. ������ �Է¹޾Ƽ� ����('A'~'F')�� ���Ͽ� ��ȯ�ϴ� method �ۼ�(if��)<br>
 * 4. �����ð��� �ۼ��� printStar()�� ȣ���Ͽ� ���� �Ʒ��� ���� ���<br>
 * ��\n�١�\n�ڡڡ�\n�١١١�<br>
 * 5.�������� ����ϴ� method�ۼ�, �Ű����� ���� method�� ȣ���ϸ� 2�� ���, ���� �־� method�� ȣ���ϸ� �Է��� ���� ������ ����ϴ� method �ۼ�
 * @author user
 */
public class HomeAssignment7 {
	
	//1������ - ������
	public char name() { 
		char i;
		i='C';
		return i;
	}//name
	
	//2������ - ������
	public int score() { 
		int s;
		s=80;
		return s;
	}//score
	
	//3������ - ������
	public int anotherScore() {
		int s2;
		s2=80;
		return s2;
	}//anotherScore
	
	//4������ - ������ �ٸ� Ŭ������ �޼ҵ带 ��Ȳ�� �°� ȣ��
	public void printStar1() {
		System.out.println("��");
	}//end printStar1
	
	public void printStar1(int cnt) {
		for(cnt=2; cnt<5;cnt++) {
			if(cnt%2==0) {
				System.out.println('��' * cnt);
			}else {
				System.out.println('��' * cnt);
			}//end else
		}//end for
	}//end printStar1
	
	//5������ - �����ε�
	public static void multiplicationTable () {
		System.out.println("2���� ");
	}//end multiplicationTable
	
	public static void multiplicationTable (int i) {
		i=5;
		System.out.println(i+"���� ");
	}//end multiplicationTable
	
	public static void main(String[] args) {
		HomeAssignment7 ha = new HomeAssignment7();
		
		char name1 = ha.name();
		System.out.println("���� ��: "+name1);
		
		int score1 = ha.score();
		if(score1>-1 && score1<101) {
			System.out.println("Ture");
		}else {
			System.out.println("False");
		}//end else
		
		int score2 = ha.anotherScore();
		if(score2>=90 && score2<=100) {
			System.out.println("����: A");
		}else if(score2>=80 && score2<=89) {
			System.out.println("����: B");
		}else if(score2>=70 && score2<=79) {
			System.out.println("����: C");
		}else if(score2>=60 && score2<=69) {
			System.out.println("����: D");
		}else if(score2>=50 && score2<=59) {
			System.out.println("����: E");
		}else {
			System.out.println("����: F");
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
