package day0119;

public class UseString {

	public static void main(String[] args) {
		
		String str = "안녕";
		str+="하세요?";
		System.out.println(str+"눈오는 수요일"+"오전 입니다.");
		
		
		String csvData="java,Oracle,JDBC,HTML";
		String[] arr = csvData.split(",");
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}//end for
	}//main

}//class
