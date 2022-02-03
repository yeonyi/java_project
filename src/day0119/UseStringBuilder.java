package day0119;

/**
 * 긴 문자열을 다루는 클래스
 * @author user
 */
public class UseStringBuilder {
	
	public void useStringBuffer() {
		StringBuffer sb = new StringBuffer();
		//값 추가 .append()
		sb.append(2022);//정수
		sb.append('A');//문자
		sb.append(1.19);//실수
		sb.append(false);//boolean
		
		System.out.println(sb+" "+sb.length());
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("오늘은 수요일 입니다.");//붙임
		sb2.insert(4, "2022년 1월 19일 ");//삽입
		sb2.delete(4, 10);
		
		System.out.println(sb2);
	}//useStringBuffer
	
	public void useStringBuilder() {
		StringBuilder sb = new StringBuilder();
		//값 추가 .append()
		sb.append(2022);//정수
		sb.append('A');//문자
		sb.append(1.19);//실수
		sb.append(false);//boolean
		
		System.out.println(sb+" "+sb.length());
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("오늘은 수요일 입니다.");//붙임
		sb2.insert(4, "2022년 1월 19일 ");//삽입
		sb2.delete(4, 10);
		
		System.out.println(sb2);
		
		String fileName = "e:/dev/workspace/javase_prj/day/UseStringBuilder.java";
		//위의 경로/파일명을 "e:/dev/workspace/javase_prj/day/UseStringBuilder_bak/java"로 출력
		StringBuilder sb3 = new StringBuilder(fileName);
		sb3.insert(sb3.lastIndexOf("."),"_bak");
		
		System.out.println(sb3);
		String temp = sb3.toString();
		System.out.println(temp.toUpperCase());
		System.out.println(sb3.toString().toUpperCase());
	}//useStringBuilder

	public static void main(String[] args) {
		UseStringBuilder usb = new UseStringBuilder();
		System.out.println("-------StringBuffer-------------");
		usb.useStringBuffer();
		System.out.println("-------StringBuilder-------------");
		usb.useStringBuilder();
		
	}//main

}//class
