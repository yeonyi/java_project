package day0114;

public class YeonYi extends Person{
	public int myShootLevel;
	
	public YeonYi() {
		super();
		myShootLevel = 7;
	}//YeonYi
	
	public String shoot(int yourShootLevel) {
		String shootMsg = "";
		
		if(myShootLevel < yourShootLevel) {
			return shootMsg = "당신이 나보다 더 잘 쏩니다.";
		}else if(myShootLevel > yourShootLevel){
			return shootMsg = "당신은 나를 이길 수 없습니다.";
		}else {
			return shootMsg = "우리는 같은 레벨입니다.";
		}//end else
		//return shootMsg; //주석 풀면 왜 에러가 나는지 다시 확인
	}//shoot

}//class
