package day0121;

import java.util.Calendar;

public class CalendarPrint{

	public static void main(String[] args) {
		 
		Calendar cal = Calendar.getInstance();

		int y = 2022;
		int m = 0 ; //���ϰ� ���� ��-1
		int w = cal.get(Calendar.DAY_OF_WEEK);//����
		int i;   

		cal.set(y,m,1); //��, ��, ��

		w = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println(); 
		System.out.println("  ��  ��  ȭ  ��  ��  ��   ��");
		
		for (i=1; i<w; i++)
			System.out.print("    ");
		
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++){//1���� ������ ��¥
			System.out.printf("%4d",i); 
			w++;   //��¥�� ������ ������ ���� ����

			if(w%7==1) {  //�Ͽ��� = 1
				System.out.println(); //������ ������ �Ͽ����� �� ��
			}//end if
			
		}//end for

		if(w%7!=1) {
			System.out.println();
		}//end if

	}//main
}//end class