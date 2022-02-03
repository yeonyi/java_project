package day0125;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author user �ָ��� �ش��ϴ� ���� �̱�------------����Ǯ�� ���� 01/25
 */
public class Work1 {

	public Map<Integer, List<Integer>> weekend(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year); // �Է¹��� year�� ����
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>(); // Map

//		int day = Calendar.DAY_OF_MONTH; ����� ���� �������� �ʰ� �ٷ� ����ϴ°� �������� ����.
//		int dayOfWeek=Calendar.DAY_OF_WEEK;

		List<Integer> list = null;
		int lastDay = 0;// ���� ���������� ������ ����

		for (int i = 0; i < 12; i++) {
			list = new ArrayList<Integer>(); // ������ ������ List ����
			cal.set(Calendar.MONTH, i);// 0~11�� ����
			lastDay = cal.getActualMaximum(Calendar.DATE) + 1;// ������ ���� ������ �� ���

			for (int j = 1; j < lastDay; j++) {
				cal.set(Calendar.DAY_OF_MONTH, j);//���� ����
				
				switch (cal.get(Calendar.DAY_OF_WEEK)) {//������ ������ ���� ��
				case Calendar.SUNDAY: 
				case Calendar.SATURDAY:
					list.add(j);
					break; // 1, 7�̶�� ��������, constant�� ����..
				}// end switch
				map.put(i + 1, list);
			} // end for
			//���� �����ϱ� ���� ��� ���� �����ϴ� �Ϸ� �ʱ�ȭ
			cal.set(Calendar.DAY_OF_MONTH, i);
			
		} // end for
//		System.out.println(map.get(12));
		return map;
	}// weekend

	public void printWeekend( Map<Integer, List<Integer>> map, int year) {
		System.out.println(year+"�� ���� ����");
		for(int i=1;i<13;i++)
		System.out.println(i + "�� �ָ� " + map.get(i));
	}
	public static void main(String[] args) {
		Work1 w1 = new Work1();
		int year = 2022;
		w1.printWeekend(w1.weekend(year), year);

	}// main

}// class
