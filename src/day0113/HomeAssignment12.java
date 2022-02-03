package day0113;

 

public class HomeAssignment12 {

 

	private String name;

	private int javaScore;

	private int oracleScore;

	private int htmlScore;

	private int totalScore = javaScore + oracleScore+ htmlScore;
	
	private int totalAverage = totalScore/3 ;

	

	public HomeAssignment12(String name, int javaScore, int oracleScore, int htmlScore, int totalScore, int totalAverage) {

		this.name = name;

		this.javaScore = javaScore;

		this.oracleScore = oracleScore;

		this.htmlScore = htmlScore;

		this.totalScore = totalScore;
		
		this.totalAverage = totalAverage;

		

	}//HomeAssignmnet12



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getJavaScore() {
		return javaScore;
	}



	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}



	public int getOracleScore() {
		return oracleScore;
	}



	public void setOracleScore(int oracleScore) {
		this.oracleScore = oracleScore;
	}



	public int getHtmlScore() {
		return htmlScore;
	}



	public void setHtmlScore(int htmlScore) {
		this.htmlScore = htmlScore;
	}



	public int getTotalScore() {
		return totalScore;
	}



	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}



	public int getTotalAverage() {
		return totalAverage;
	}



	public void setTotalAverage(int totalAverage) {
		this.totalAverage = totalAverage;
	}

 

 

}