package day1229;
/**
 ���� ������
 -�������
 -����Ʈ����
 -��Ʈ������
*/
public class Operator7 {
	public static void main(String[] args) {

		int i=5;
		//��������
		i=7;
		//�������
		i+=5;//i=i+5=12
		i-=4;//i=i-4=8
		i*=3;//i=i*3=24
		i/=5;//i=i/5=4
		i%=3;//i=i%3=0

		//����Ʈ����
		i<<=4;//i=i<<4
		i>>=1;//i=i>>1
		i>>>=1;//i=i>>>1

		//��Ʈ������
		i&=12;//i=i&12
		i|=6;//i=i|6
		i^=12;//i=i^12
		System.out.println(i);
	}
}
