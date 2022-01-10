package day0107;

/**
 * HomeAssignment8 <br>
 * 과제 : 신라면을 객체 모델링 한 후 클래스 작성, 객체 생성, 사용 <br>
 * 명사적인 특징 : 종류, 면, 스프 <br>
 * 동사적인 특징 : 만든다 <br>
 * @author user
 */
public class Ramen {
	private String category;//신라면의 종류
	private int noodle;//면의 갯수
	private int soup;//스프의 갯수
	
	/**
	 * 생성된 신라면 객체의 종류를 설정하는 일
	 * @param category 설정할 신라면 종류
	 */
	public void setCategory(String category) {
		this.category = category;
	}//setCategory
	
	/**
	 * 설정된 신라면의 종류에 대해서 반환하는 일
	 * @return 신라면의 종류
	 */
	public String getCategory( ) {
		return category;
	}//getCategory
	
	/**
	 * 생성된 신라면 객체의 면의 개수를 설정하는 일
	 * @param noodle 설정한 면의 갯수
	 */
	public void setNoodle(int noodle) {
		this.noodle = noodle;
	}//setNoodle
	
	/**
	 * 설정된 신라면 객체의 면의 갯수를 반환하는 일
	 * @return 면의 갯수
	 */
	public int getNoodle() {
		return noodle;
	}//getNoodle
	
	/**
	 * 생성된 신라면 객채의 스프의 갯수를 설정하는 일
	 * @param soup 설정한 스프의 갯수
	 */
	public void setSoup(int soup) {
		this.soup = soup;
	}//setSoup
	
	/**
	 * 설정된 신라면 객체에 설정된 스프의 갯수를 반환하는 일
	 * @return 스프의 갯수
	 */
	public int getSoup() {
		return soup;
	}//getSoup
	
	/**
	 * 신라면 블랙을 사용하여 만다는 일 구현
	 * @return
	 */
	public String make() {
		return "신라면 " + category + "을 만들어 보겠습니다.";
	}//write
	
	/**
	 * 생성된 신라면 객체를 사용하여 다른 라면과 비교하는 것을 구현
	 * @param msg 다른 다면의 종류
	 * @return 메시지
	 */
	public String make(String msg) {
		return "신라면 " + category + "은 "+ msg + "보다 맛있습니다.";
	}//write

	public static void main(String[] args) {

	}//main

}//class
