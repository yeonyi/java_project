package day0211;

import java.util.Calendar;

public class UseLambda {

	public static void main(String[] args) {

		//반환형 없고 매개변수가 없는 추상메서드를 가진 인터페이스를 람다식으로 사용
		Test t = () -> {System.out.println("이것이 람다식");};
		//인터페이스의 추상메서드를 호출하면 람다식으로 구현된 코드가 호출되어 실행된다.
		t.method();
		
		//반환형 없고, 매개변수가 있는 추상메서드를 가진 인터페이스
		Test2 t2 = (int age, String name) -> {
			System.out.println("나이는 "+age);
			System.out.println("이름은 "+name);
		};
		
		t2.method(20, "최연이");
		System.out.println("-------------------------------");
		//반환형있고, 매개변수 있는 추상메서드를 가진 인터페이스
		Test3 t3 = (int age) -> {
			Calendar cal = Calendar.getInstance();
			int birth = cal.get(Calendar.YEAR)-age+1;
			return "태어난 해 :" +birth;
		};
		int age = 25;
		String value = t3.method(age);
		System.out.println(age+"살의 "+value);
		
		//1~100까지 출력하는 코드를 람다식을 사용하여 Thread로 돌려보세요.
//		Test t4 = () -> {
//			for(int i = 1;i<101;i++) {
//				System.out.println(i);
//			}
//		};
//		UseLambda ul = new UseLambda();
//		ul.start();
		
		Runnable r = () -> {
			for(int i = 1;i<101;i++) {
				System.out.println(i);
			}
		};
		
		Thread thr = new Thread(r);
		thr.start();
		
	}//main

}//class
