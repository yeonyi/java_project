package day0113;

public class UseHomeAssignment12 {

	public static void main(String[] args) {

		HomeAssignment12[] student = new HomeAssignment12[4];

		student[0] = new HomeAssignment12("������", 89, 88, 91, 0, 0);

		student[1] = new HomeAssignment12("������", 90, 76, 82, 0, 0);

		student[2] = new HomeAssignment12("������", 77, 77, 76, 0, 0);

		student[3] = new HomeAssignment12("Ȳ����", 100, 94, 97, 0, 0);

		for (HomeAssignment12 Value : student) {
			System.out.println(Value.getName() + " " + Value.getJavaScore() + " " + Value.getOracleScore() + " "
					+ Value.getHtmlScore());
		} // end for

		System.out.println("---------------------------");

		HomeAssignment12 temp = null;
		temp = student[0];

		for (int i = 1; i < student.length - 2; i++) {

			//temp.getTotalScore += student[i];

		} // end for
		System.out.printf("��������: %d, �������: %d\n", temp.getTotalScore(), temp.getTotalAverage());

		System.out.println("---------------------------");

		for (HomeAssignment12 Value : student) {
			System.out.println(Value.getName() + " " + Value.getJavaScore() + " " + Value.getOracleScore() + " "
					+ Value.getHtmlScore() + " " + Value.getTotalScore() + " " + Value.getTotalAverage());
		} // end for

		System.out.println("---------------------------------------");

		if (temp.getName().startsWith("��")) {
			System.out.println("���� �达�� �л����� �ڹ������� ��: " + temp.getJavaScore() + ", ���: " + temp.getJavaScore() / 4);

		} // end if

	}// main

}// class