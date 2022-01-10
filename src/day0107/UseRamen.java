package day0107;

/**
 * 1. 라면 클래스를 사용하여 객체를 생성<br>
 * 2. 라면 객체의 만들기 클래스<br>
 * @author user
 */
public class UseRamen {
	
	public static void main(String[] args) {
	//신라면 클래스를 사용하여 신라면 블랙 객체 생성
	Ramen fav = new Ramen();//참조형 데이터형을 생성
	System.out.println(fav);//heap의 주소
	
	//라면 fav객체에 종류 블랙, 면 1개, 스프 2개를 설정해보자.
	fav.setCategory("black");
	fav.setNoodle(1);
	fav.setSoup(2);
	
	System.out.printf("신라면 %s의 면의 갯수는 %d개이고, 스프의 갯수는 %d개이다.\n", fav.getCategory(), fav.getNoodle(), fav.getSoup());
	System.out.println(fav.make());
	System.out.println(fav.make("삼양라면"));
	
	}//main

}//class
