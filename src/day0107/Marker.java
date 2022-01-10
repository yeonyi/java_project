package day0107;

/**
 * 마카펜을 객체모델링(추상화)하여 생성한 클래스<br>
 * 명사적인 특징 : 뚜껑, 몸체, 색<br>
 * 동사적인 특징 : 쓴다.<br>
 * @author user
 */
public class Marker {
	private int cap;//뚜껑의 갯수
	private int body;//몸체의 갯수
	private String color;//색
	
	/**
	 * 생성된 마카펜 객체에 뚜껑의 개수를 설정하는 일
	 * @param cap 설정할 뚜껑의 갯수
	 */
	public void setCap(int cap) {
		this.cap=cap;
	}//setCap
	
	/**
	 * 설정된 마카펜 객체에 설정된 뚜껑 갯수를 반환하는 일
	 * @return 뚜껑의 갯수
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	/**
	 * 생성된 마카펜 객체의 몸체 갯수를 설정하는 일
	 * @param body 설정할 몸체의 갯수
	 */
	public void setBody(int body) {
		this.body=body;
	}//setBody
	
	/**
	 * 생성된 마카펜 객체에 설정된 몸체의 갯수
	 * @return 몸페의 갯수
	 */
	public int getBody() {
		return body;
	}//getBody
	
	/**
	 * 생성된 마카펜 객체에 색을 설정하는 일
	 * @param color 설정할 색
	 */
	public void setColor(String color) {
		this.color = color;
	}//setColor
	
	/**
	 * 생성된 마카펜 객체가 가진 색을 얻는 일
	 * @return 색
	 */
	public String getColor() {
		return color;
	}//getColor
	
	/**
	 * 칠판에 생성된 마카펜 객체를 사용하여 "안녕하세요?"를 쓰는 일 구현
	 * @return
	 */
	public String write() {
		
		return color+"색인 마카펜으로 \"안녕하세요?\"를 칠판에 쓴다";
	}//write
	
	/**
	 * 칠판에 생성된 마카펜 객체를 사용하여 "안녕하세요?"를 쓰는 일 구현
	 * @param msg 칠판에 기록할 메시지
	 * @return 메시지
	 */
	public String write(String msg) {
		
		return color+"색인 마카펜으로 \"" + msg + "를 칠판에 쓴다";
	}//write
	
	public static void main(String[] args) {

	}//main

}//class
