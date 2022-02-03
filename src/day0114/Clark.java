package day0114;

/**
 * 논,코,입,이름,먹는 일은 부모클래스에서 정의된 코드를 사용하고 (상속:재사용성) 
 * 자신만의 특징을 정의한 클래스<br>
 * 힘이 세다. 일반 성인의 힘은 평균 2
 * 힘은 1~10까지
 * @author user
 */
public class Clark extends Person {
	public int power;
	
	/**
	 * 클락은 눈이 3개
	 */
	public Clark() {//부모클래스의 오버로딩된 생성자
		super(3,1,1);
		power=8;
	}//Clark
	
	/**
	 * 돌에 따라서 힘이 달라진다.
	 * @param stone
	 * @return
	 */
	public String power(String stone) {
		String result = "";
		
		if(stone.equals("크립토나이트")) {//힘이 빠지는 돌
			result="힘이 빠진다...";
			power=1;
		}else if(stone.equals("다이아몬드")) {//기분이 좋은 돌
			result="감사합니다.";
			power=10;
		}else {//기분 나쁜 돌
			result="기분나쁨";
			power=12;
		}//end else
		
		return result;
	}
	
}//class
