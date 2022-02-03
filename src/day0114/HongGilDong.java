package day0114;

/**
 * ����� ���� Ư¡(��,��,��,�̸�,�Դ���)�� PersonŬ�������� ������ ����ϰ�, �ڽ��� Ư¡�� �����ϴ� �ڽ�Ŭ����<br>
 * ȫ�浿�� �ο��� ���ϴ� Ư¡�� ������.
 * �ο� ������ 1~10���� ����<br> ������ ��� �ο� ����� 3���� ����
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
		
		if(myLevel < yourLevel) {//���� ���
			resultMsg = "�ο򿡼� ����";
			myLevel--;
			if(myLevel < 1) {
				myLevel = 1;
			}//end if
		}else if(myLevel > yourLevel) {//�̱�� ���
			resultMsg = "�ο򿡼� �̰���";
			myLevel++;
			if(myLevel > 10) {
				myLevel = 10;
			}//end if
		}else {//���� ���
			resultMsg = "�ο򿡼� �����";
		}//end else
			
		return resultMsg;
	}//fight

}//class
