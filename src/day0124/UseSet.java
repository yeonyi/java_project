package day0124;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 검색의 기능이 없고, 중복값을 저장하지 않는 자료구조
 * @author user
 */
public class UseSet {
	
	public UseSet() {
		//1.생성
		Set<String> set = new HashSet<String>();
		
		//2.값할당
		set.add("Java");
		set.add("Oracle");
		set.add("JDBC");
		set.add("HTML");
		set.add("CSS");
		set.add("JavaScript");
		//중복값 - 입력되는 값과 동일한 값이 있을 때에는 입력되지 않는다.
		set.add("HTML");
		
		//3.크기
		System.out.println(set.size());
		
		//4.배열로 복사
		//빈 배열 생성
		String[] copyArr = new String[set.size()];
		//복사
		set.toArray(copyArr);
		
		//검색
//		set.get(0); 사용할 수 없음
		//개선된 for사용하면 Iterator없이도 출력됨
//		for( String subject : set) {
//			System.out.println(subject);
//		}//end for
		//검색대행: Iterator
		//1.Set객체의 제어권을 받는다.
		Iterator<String> ita = set.iterator();
		//2.Iterator를 통해서 Set의 요소가 존재하는 지 검색을 한 후
		String value = ""; //null로 초기화하면 메서드호출시 에러
		while( ita.hasNext()) {
		//3. 요소가 존재한다면 값을 얻고, 포인터를 다음으로 이동시킨다.
			value = ita.next();
			System.out.println(value);
		}//end while
		
		//삭제
		set.remove("JDBC"); //특정 방의 값 삭제
		set.clear(); //모든 방의 값 삭제
		System.out.println(set.isEmpty());
		
		System.out.println(set);
		System.out.println("-----------복사된 값-----------");
		for(int i = 0 ; i < copyArr.length ; i++) {
			System.out.println(copyArr[i]);
		}//end for
		
	}//UseSet
	
	/**
	 * Set의 중복값 저장 여부
	 */
	public void dupVal() {
		//1.생성
		Set<TestVO> set = new HashSet<TestVO>();
		//2.값 할당 -> set이 1차적으로 저장한 값은 중복된 값은 저장하지 않는다.
		set.add(new TestVO("정시헌", 25));//new로 생성된 객체의 주소가 다르므로
		set.add(new TestVO("정인선", 24));
		set.add(new TestVO("장정우", 24));
		set.add(new TestVO("정시헌", 25));//이전의 같은 값을 가지더라도 입력됨
		
		TestVO tv = new TestVO("전민정", 26);
		set.add(tv);//하나의 주소가
		set.add(tv);//여러번 사용되면 추가되지 않는다.
		
		System.out.println(set);
	}//dupVal

	public static void main(String[] args) {
		UseSet us = new UseSet();
		System.out.println("-------중복값의 처리-------");
		us.dupVal();
	}//main

}//class
