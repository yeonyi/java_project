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
			return shootMsg = "����� ������ �� �� ���ϴ�.";
		}else if(myShootLevel > yourShootLevel){
			return shootMsg = "����� ���� �̱� �� �����ϴ�.";
		}else {
			return shootMsg = "�츮�� ���� �����Դϴ�.";
		}//end else
		//return shootMsg; //�ּ� Ǯ�� �� ������ ������ �ٽ� Ȯ��
	}//shoot

}//class
