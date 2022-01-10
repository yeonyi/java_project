package day1229;
/**
 대입 연산자
 -산술대입
 -쉬프트대입
 -비트논리대입
*/
public class Operator7 {
	public static void main(String[] args) {

		int i=5;
		//순수대입
		i=7;
		//산술대입
		i+=5;//i=i+5=12
		i-=4;//i=i-4=8
		i*=3;//i=i*3=24
		i/=5;//i=i/5=4
		i%=3;//i=i%3=0

		//쉬프트대입
		i<<=4;//i=i<<4
		i>>=1;//i=i>>1
		i>>>=1;//i=i>>>1

		//비트논리대입
		i&=12;//i=i&12
		i|=6;//i=i|6
		i^=12;//i=i^12
		System.out.println(i);
	}
}
