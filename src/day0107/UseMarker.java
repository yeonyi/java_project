package day0107;

/**
 * 1.마카펜 클래스를 사용하여 객체를 생성하고<br>
 * 2.마카펜 객체가 제공하는 기능을 사용하는 클래스<br>
 * @author user
 */
public class UseMarker {

	public static void main(String[] args) {
		//검은색 마카펜 클래스를 사용하여 검은 색 마카펜 생성
		Marker black = new Marker(); //참조형데이터형을 생성(heap)
		System.out.println(black); //heap의 주소
		
		//black 객체에 뚜껑 1개, 몸체 1개, 검은색을 설정해보자.
//		black.cap=1; instance 변수에 private 접근지정자가 설정되어있으므로 외부에서 선언할 수 없다.
		
		//생성된 마카펜 객체에 값을 설정
		black.setCap(1);
		black.setBody(1);
		black.setColor("검은");
		
		System.out.println(black.getColor()+"색인 마카펜의 뚜껑"+black.getCap()+"개, 몸체"+black.getBody()+"개");
		//마카펜 클래스가 제공하는 기능 사용
		System.out.println(black.write()); 
		
		////빨간색 마카펜을 생성하여 값을 넣고 사용해보세요.
		Marker red = new Marker();
		System.out.println(red);
		
		red.setCap(1);
		red.setBody(1);
		red.setColor("빨간");
		
		System.out.println(red.write());
		System.out.println(red.write("즐거운 주말")+" "+red.write("2022 첫 주말"));
		
		
	}//main

}//class
