package day0113;

public class UseHomeAssignment12 {

	public static void main(String[] args) {

		HomeAssignment12[] student = new HomeAssignment12[4];

		student[0] = new HomeAssignment12("±èÁø¿µ", 89, 88, 91, 0, 0);

		student[1] = new HomeAssignment12("Á¤½ÃÇå", 90, 76, 82, 0, 0);

		student[2] = new HomeAssignment12("±èÇö¿ì", 77, 77, 76, 0, 0);

		student[3] = new HomeAssignment12("È²¼ºÁØ", 100, 94, 97, 0, 0);

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
		System.out.printf("ÃÑÇÕÁ¡¼ö: %d, Æò±ÕÁ¡¼ö: %d\n", temp.getTotalScore(), temp.getTotalAverage());

		System.out.println("---------------------------");

		for (HomeAssignment12 Value : student) {
			System.out.println(Value.getName() + " " + Value.getJavaScore() + " " + Value.getOracleScore() + " "
					+ Value.getHtmlScore() + " " + Value.getTotalScore() + " " + Value.getTotalAverage());
		} // end for

		System.out.println("---------------------------------------");

		if (temp.getName().startsWith("±è")) {
			System.out.println("¼ºÀÌ ±è¾¾ÀÎ ÇÐ»ýµéÀÇ ÀÚ¹ÙÁ¡¼öÀÇ ÇÕ: " + temp.getJavaScore() + ", Æò±Õ: " + temp.getJavaScore() / 4);

		} // end if

	}// main

}// class