package day0204;

import java.util.Random;

/**
 * Ȳ���� Ŭ����
 * @author user
 */
public class HwangSungJun {
	
	public String walk() throws TabaccoException {//��������� ����ó��
		String result = ""; //empty
		
		String[] studentGrade = {"�ʵ�", "�ߵ�", "���", "���"};
		int tempFlag=new Random().nextInt(studentGrade.length);
		
		switch (tempFlag) {
		case 0://�ʵ��� ��踦 �ǿ�� ��Ȳ
			throw new TabaccoException("�ʵ��� ���� �ǰ��� �طӽ��ϴ�.");
			
		}//end switch
		
		result = studentGrade[tempFlag]+"�� �� �� ��ô ������.";
		
		return result;
	}//walk

	public static void main(String[] args) {
		HwangSungJun hsj = new HwangSungJun();
		try {
			String result = hsj.walk();
			System.out.println("�������� ���� "+result);
		}catch(TabaccoException e) {
			System.err.println("���������� ���� "+e);
			e.printStackTrace();
		}//end catch

	}//main

}//class
