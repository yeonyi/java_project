package day0117;

import java.util.Date;
import java.util.List;

public class TestAnnotation {
	@Deprecated
	public void test() {
		System.out.println("��....");
	}//test
	
	@SuppressWarnings({"rawtypes", "unused"})//���� �� ����
	public void temp() {
//		@SuppressWarnings("unused")
		int i;
//		@SuppressWarnings("unused")
//		@SuppressWarnings({"rawtypes", "unused"})
		List l = null;
		
	}

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date.getYear()+1900);
		
		TestAnnotation ta = new TestAnnotation();
		ta.test();
		
	}//main

}//class
