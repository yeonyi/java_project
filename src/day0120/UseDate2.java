package day0120;

import java.util.Date;
/**
 * DateŬ������ ���
 * @author user
 */
public class UseDate2 {

	public static void main(String[] args) {
		//CMOS�� ��¥�� ���
		long ctm = System.currentTimeMillis(); //1970-01-01 00:00:00�������� ��������� �ð��� ms�� 
		System.out.println(ctm);
		//1.��üȭ
		Date date = new Date();
		Date date2 = new Date(ctm);
		
		System.out.println(date);//�ּҰ� �ƴ� ���� ���: java.lang.ObjectŬ������ toString()�� Override��
		System.out.println(date2);
		
		
	}//main

}//class
