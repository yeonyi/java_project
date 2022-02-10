package day0119;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.String.valueOf;
import static java.lang.Integer.parseInt;

//import static java.lang.Byte.MAX_VALUE; 사용하는 코드에서 에러 발생

public class UseStaticImport {

	public static void main(String[] args) {
		System.out.println("int의 최고값"+Integer.MAX_VALUE);
		System.out.println("int의 최고값"+MAX_VALUE);
		System.out.println("int의 최고값"+MAX_VALUE);
		System.out.println("int의 최고값"+MAX_VALUE);
		
		byte b = 10;
		int i = 20;
		double d = 2022.01;
		
//		String bs = String.valueOf(b);
//		String is = String.valueOf(i);
//		String ds = String.valueOf(d);
		String bs = valueOf(b);//int를 String으로 변환
		String is = valueOf(i);
		String ds = valueOf(d);
		System.out.println(bs+"/"+is+"/"+ds);
		
		int sb = parseInt(bs);
		int si = parseInt(is);
		double sd = Double.parseDouble(ds);
		System.out.println(sb+"/"+si+"/"+sd);
		
	}//main

}//class
