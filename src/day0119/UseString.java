package day0119;

public class UseString {

	public static void main(String[] args) {
		
		String str = "�ȳ�";
		str+="�ϼ���?";
		System.out.println(str+"������ ������"+"���� �Դϴ�.");
		
		
		String csvData="java,Oracle,JDBC,HTML";
		String[] arr = csvData.split(",");
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}//end for
		
		System.out.println("-----������ for������ �迭 ���-----");
		for(String us: arr) {
			System.out.println(us);
		}
	}//main

}//class
