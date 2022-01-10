package day0106;

/**
 * HomwAssignment7 ���� Ǯ��
 * 
 * @author user
 */
public class Work {
	/**
	 * ���� ��ȯ�ϴ� ��. ������
	 * 
	 * @return ��
	 */
	public char lastName() {
		return 'C';
	}// lastName

	/**
	 * �ԷµǴ� ������ ����. ������ �������� : 0~100 ���̸� true, �׷��� ������ false
	 * 
	 * @param score ������ ����
	 * @return �������
	 */
	public boolean scoreJudge(int score) {
		boolean flag = score > -1 && score < 101;

//		if(score > -1 && score < 101) { ���� if�� ������ �ʾƵ� �ǰ� boolean flag = false;���� false�ڸ��� ���ǽ��� ������ ��.
//			flag = true;
//		}
//		else { //flag�� �⺻���� false�̹Ƿ� else�� �ʿ���� �ڵ��̴�.
//			flag=false;
//		}//end else

		return flag;
	}// scoreJudge

	/**
	 * ������ �Է¹޾� ������ �´� ���ڸ� ���ؼ� ��ȯ. ������
	 * 
	 * @param sxore ����
	 * @return ������ ������ ����
	 */
	public char gradeText(int score) { // return�� ���� ����ϴ� ���� ���� �ڵ尡 �ƴϴ�.
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
	 * ���� ���. ������ �ٸ� Ŭ������ �����ϴ� �޼ҵ带 ��Ȳ�� �°� ȣ��
	 */
	public void printStar() {
		// printStar method�� ������ Ŭ������ ��üȭ
		TestOverload to = new TestOverload();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (i % 2 == 0) {
					to.printStar();// ���� ��
				} else {
					to.printStar(1);// �� ��
				} // end else
			} // end for
			System.out.println();
		} // end for
	}// printStar

	/**
	 * ������ 2�� ���
	 */
	public void multiplicationTable() {
		System.out.println("2��");
		for (int i = 1; i < 10; i++) {
			System.out.println("2 x " + i + "= " + 2 * i);
		} // end for
	}// multiplicationTable

	/**
	 * method overload
	 */
	public void multiplicationTable(int level) {
		System.out.println(level + "��");
		for (int i = 1; i < 10; i++) {
			System.out.println(level + " x " + i + "= " + level * i);
		} // end for
	}// multiplicationTable

	public static void main(String[] args) {
		// ��üȭ:instance method ȣ��
		Work w = new Work();

		char familyName = w.lastName();
		System.out.println("�� ���� " + familyName);

		int score = 90;
		boolean flag = w.scoreJudge(score);
		System.out.println(score + "�� " + flag);

		if (flag) {
			char gradeText = w.gradeText(score);
			System.out.println("�Է�����: " + score + "��, ����: " + gradeText);
		} // end if

		w.printStar();

		w.multiplicationTable();
		w.multiplicationTable(5);
	}// main

}// class
