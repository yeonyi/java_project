package day0125;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeAssignment_0125_2 {
	
	public HomeAssignment_0125_2() {
		Calendar cal = Calendar.getInstance();
		List<Integer> list = new ArrayList<Integer>();
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();

		int day = 0;// ���� ����
		int lastDay = 0;
		for (int i = 0; i < 12; i++) {// 1~12������ ������ ��,���̸� ��¥ ���
			cal.set(Calendar.MONTH, i);
			
			lastDay = cal.getActualMaximum(Calendar.DATE) + 1;
			for (int j = 1; j < lastDay; j++) { 
				cal.set(Calendar.DAY_OF_MONTH, j);
				day = cal.get(Calendar.DAY_OF_WEEK);
				
				if (day == Calendar.SUNDAY || day == Calendar.SATURDAY) {// ����� �Ǵ� �Ͽ����� ���
					list.add(cal.get(Calendar.DAY_OF_MONTH));// list�� ��¥ �߰�
				} // end if
			} // end for
			map.put(String.valueOf(i+1), list);//�ش� ���� ���� list
			System.out.println(String.valueOf(i+1)+"�� �ָ�: "+map);
			list.clear();//���� ���� �Ѿ�� ���� �� ����
		} // end for

	}// PrintWeekend

	public static void main(String[] args) {
		new HomeAssignment_0125_2();
	}// main

}// class
