package day0208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class UseScanner {

	public UseScanner() throws IOException {
		
		System.out.println("����� ���̸� �Է����ּ���.");
		//���̸� �Է��ϸ� �¾ �ط� ���Ͽ� ���
		//stream�� ���
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String value = br.readLine();
//		try {
//			int age = Integer.parseInt(value);
//			Calendar cal = Calendar.getInstance();
//			System.out.println("�¾ �ش�: "+(cal.get(Calendar.YEAR)-age+1));
//		}catch(NumberFormatException nfe) {
//			System.err.println("���̴� �����Դϴ�");
//		}//end catch
		
		//scanner ���
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();//���ϴ� ������ ������ �Է¹��� �� �ִ�.
		Calendar cal = Calendar.getInstance();
		System.out.println("�¾ �ش�: "+(cal.get(Calendar.YEAR)-age+1));
		
	}//UseScanner
	public static void main(String[] args) {
		try {
			new UseScanner();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main

}//class
