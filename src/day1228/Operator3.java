package day1228;
/**
 쉬프트 연산자
 << : left shift -비트를 왼쪽으로 밀어서 빈칸을 항상 0으로 채운다.
 >> : right shift -비트를 오른쪽으로 밀어서 빈칸을 최상위 부호 비트에 따라 양수면 0을 채우고 음수면 1을 채운다.
 >>> : unsigned right shift -비트를 오른쪽으로 밀어서 빈칸을 0으로 채운다.
*/
public class Operator3{
	public static void main(String[] args) {

	int i=6;//0000 0110

	System.out.println(i+"<< 3= "+(i<<3));

	i=1;//0000 0000 0000 0000 0000 0000 0000 0001 <<31

	System.out.println(i+"<< 31= "+(i<<31));//int가 가질 수 있는 최곳값, 비트가 밀려 부호비트로 올라가면 부호 변경

	i=80;//0101 0000 >>4 -> 0000 0101
	System.out.println(i+">> 4= "+(i>>4));	

	i=37;//0010 0101
	
	/* 
	 기본형 데이터형은 값만 사용할 수 있지만 wrapper class는 값과 여러가지 기능(method)을 사용할 수 있다. 
	System.out.println(i+"를 2진수로 "+ Integer.toBinaryString(i));
	System.out.println(i+"를 16진수로 "+ Integer.toHexString(i));
	System.out.println(i+"를 8진수로 "+ Integer.toOctalString(i));
	*/

	System.out.println(i+">> 3= "+(i>>3));

	i=-1;//1111 1111

	System.out.println(i+">> 100= "+(i>>100));//-1 :최상위부호비트에 의해서 밀린 칸이 1로 채워지기 때문에 모든 비트가 1이므로

	i=45;//0010 1101

	System.out.println(i+">>> 2= "+(i>>>2));

	i=-1;//1111 1111 1111 1111 1111 1111 1111 1111
	System.out.println(i+">>> 1= "+(i>>>1));//양수로 가질 수 있는 최곳값이 출력된다.
	}
}
