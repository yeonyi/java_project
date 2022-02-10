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

		for (HomeAssignment12 value : student) {
			value.setTotalScore(value.getJavaScore() + value.getOracleScore()+ value.getHtmlScore());
			value.setTotalAverage(value.getTotalScore()/3);

			System.out.printf("ÃÑÇÕÁ¡¼ö: %d, Æò±ÕÁ¡¼ö: %d\n", value.getTotalScore(), value.getTotalAverage());
		} // end for

		System.out.println("---------------------------");

		for (HomeAssignment12 Value : student) {
			System.out.println(Value.getName() + " " + Value.getJavaScore() + " " + Value.getOracleScore() + " "
					+ Value.getHtmlScore() + " " + Value.getTotalScore() + " " + Value.getTotalAverage());
		} // end for

		System.out.println("---------------------------------------");

		int javaSumKim = 0;
		int cnt = 0;
		for(HomeAssignment12 value : student) {
			
			if (value.getName().startsWith("±è")) {
				javaSumKim += value.getJavaScore();
				cnt++;
			} // end if
		}//end for
		System.out.println("¼ºÀÌ ±è¾¾ÀÎ ÇÐ»ýµéÀÇ ÀÚ¹ÙÁ¡¼öÀÇ ÇÕ: " + javaSumKim + ", Æò±Õ: " + javaSumKim/cnt);

	}// main

}// class