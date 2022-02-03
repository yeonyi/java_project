package day0120;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * �������� ��¥ ������ ���� �� ����ϴ� Ŭ����
 * @author user
 */
public class UseCalendar {
	
	public UseCalendar() {
//		Calendar cal = new Calendar(); �߻�Ŭ�����̹Ƿ� ��üȭ �ȵ�
		//is a ������ ��üȭ
		Calendar cal = new GregorianCalendar();
		
		//�ڽ�Ŭ������ ����� ��üȭ
		GregorianCalendar gc = new GregorianCalendar();
		
		//static method�� ����ϴ� ���
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println("cal: "+cal);
		System.out.println("gc: "+gc);
		System.out.println("cal2: "+cal2);
		
		System.out.println(cal2.get(Calendar.YEAR)+"/"+Calendar.YEAR);//Constant�� ����Ͽ� ������ ���
		
		System.out.println("------------------------------");
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;//0������ 11���̹Ƿ� +1�� �ؾ���
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int amPm = cal.get(Calendar.AM_PM);//0-����, 1-����
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//������ ���ڰ� �ƴ� ���ڿ��� ���
//		String weekText = ""; 
//		switch(week) {
//		case 0 : weekText = "�Ͽ���"; break; 
//		case 1 : weekText = "������"; break;
//		case 2 : weekText = "ȭ����"; break;
//		case 3 : weekText = "������"; break;
//		case 4 : weekText = "�����"; break;
//		case 5 : weekText = "�ݿ���"; break;
//		case 6 : weekText = "�����"; break;
//		}//end switch
		
		String[] weekText = "��,��,ȭ,��,��,��,��".split(",");//���� switch case���� �� ������ ���
		
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);//�̹��⵵�� ���° ��
		
		int hour = cal.get(Calendar.HOUR);//12�ð���
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);//24�ð���
		
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int maximum = cal.getActualMaximum(Calendar.DATE);
		
		System.out.println(year+"-"+month+"-"+day+" "+
		(amPm==Calendar.AM?"����":"����")+" "+weekText[week-1]+"����"+" "+
				dayOfYear+" "+hour+"("+hourOfDay+")"+":"+min+
				":"+second);
		System.out.println("��������: "+maximum);
		
		System.out.println("------------------------------");
		Calendar cal4 = Calendar.getInstance();
		//�� ����
		cal4.set(Calendar.YEAR,2021);
		//�� ����(����� �����ϴ� ������ 1 ����)
		cal4.set(Calendar.MONTH,2);
		//�� ����
		cal4.set(Calendar.DAY_OF_MONTH, 1);
//		cal4.set(Calendar.DAY_OF_MONTH, 32); ������� ���� ��¥-> ������ 1�Ϸ� ����
		
		System.out.println(cal4.get(Calendar.YEAR)+"-"+(cal4.get(Calendar.MONTH)+1)+"-"+
		cal4.get(Calendar.DAY_OF_MONTH)+" "+
				weekText[cal4.get(Calendar.DAY_OF_WEEK)-1]);
	}//UseCalendar
	
	

	public static void main(String[] args) {
		new UseCalendar();

	}//main

}//class
