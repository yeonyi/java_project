package day0114;

/**
 * 사람의 공통 특징(눈,코,입,이름,먹는일)은 Person클래스에서 가져다 사용하고, 자신의 특징만 정의하는 자식클래스<br>
 * 홍길동은 싸움을 잘하는 특징을 가진다.
 * 싸움 레벨은 1~10까지 존재<br> 성인의 평균 싸움 등급은 3으로 본다
 * @author user
 */
public class HongGilDong extends Person{
	private int myLevel;
	
	public HongGilDong() {
		super();
		myLevel = 5;
	}//HongGilDong
	
	public String fight(int yourLevel) {
		String resultMsg = "";
		
		if(myLevel < yourLevel) {//지는 경우
			resultMsg = "싸움에서 졌음";
			myLevel--;
			if(myLevel < 1) {
				myLevel = 1;
			}//end if
		}else if(myLevel > yourLevel) {//이기는 경우
			resultMsg = "싸움에서 이겼음";
			myLevel++;
			if(myLevel > 10) {
				myLevel = 10;
			}//end if
		}else {//비기는 경우
			resultMsg = "싸움에서 비겼음";
		}//end else
			
		return resultMsg;
	}//fight

}//class
