package day0121;

import java.util.Random;

/**
 * 난수의 사용
 * 
 * @author user
 */
public class UseRandom {

	public UseRandom() {
		// 1.생성
		Random ran = new Random(new Random().nextLong()); //seed random
		// 2.method사용
		int r1 = ran.nextInt();
		System.out.println("발생한 정수 난수 : " + r1);
		System.out.println("발생한 범위의 정수 난수 : " + r1 % 2);//범위구하는연산자 : %
		System.out.println("발생한 범위의 양수 정수 난수 : " +Math.abs(r1 % 2));//절댓값을 사용해 양수만 얻기
		System.out.println("발생한 범위의 양수 정수 난수 : " +Math.abs(r1 % 2));//절댓값을 사용해 양수만 얻기
		
		int r2 = ran.nextInt(10); //%연산자나 절댓값 메소드 없이 간단히 사용할 수 있다
		System.out.println("발생한 범위의 양수 정수 난수 : " +r2);
		
		//불린의 난수
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		
		//실수의 난수
		float rf = ran.nextFloat();
		double rd = ran.nextDouble();
		System.out.println(rf);
		System.out.println("발생한 난수 : "+rd);
		System.out.println("발생한 난수 : "+rd*10);//난수*범위
		System.out.println("발생한 난수 정수 범위: "+(int)(rd*10));//casting으로 정수만 얻기
		
	}// UseRandom

	public static void main(String[] args) {
		new UseRandom();// 객체화
	}// main

}// class
