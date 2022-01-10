package day0105;

/**
 * instance(member) variable 사용<br>
 * 1.선언<br> : 접근지정자 데이터형 변수명; public int i;
 * 2.객체생성<br> : 클래스명 객채명 = new 클래스명();UseInstanceVariable uiv = new UseInstanceVariable();
 * 3.객체명을 사용하여 변수에 값 할당<br> 갹체명.변수명 = 값; uiv.i = 2022;
 * 4.객체명을 사용하여 변수에 대한 사용 객체명.변수명 System.out.pirntln(uiv.i)
 * @author user
 */
public class UseInstanceVariable { //class field
	//1.선언
	int i;//default 접근 지정자를 가진 변수

	public static void main(String[] args) { //local
		//System.out.println(i);//instance변수는 static영역에서 객체명 없이 직접 사용할 수 없다.
		//2.객체화. 횟수에 제한 없음
		UseInstanceVariable uiv = new UseInstanceVariable();
		
		//3.값할당
		uiv.i = 2022;
		
		//4.값사용 : 인스턴스변수는 자동초기화된다.
		System.out.println(uiv.i);
		
		//클래스로 객체를 몇개든 만들 수 있다.
		UseInstanceVariable uiv1 = new UseInstanceVariable();
		UseInstanceVariable uiv2 = new UseInstanceVariable();
		//생성된 객체는 (uiv1 또는 uiv2)에는 같은 이름의 변수 i를 각각 가진다.
		uiv1.i = 1;
		uiv2.i = 5;
		System.out.println(uiv.i+"/"+uiv1.i+"/"+uiv2.i);
		
	}//main

}//class
