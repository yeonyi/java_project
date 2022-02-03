package day0124;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HomeAssignment_0124 {

	int feeTownBus = 800;
	int feeBus = 1250;
	int feeSubway = 1300;
	
	public String transport(String t, int d) {// t:�������, d: �Ÿ�
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("��������", feeTownBus);
		map.put("����", feeBus);
		map.put("����ö", feeSubway);

		int fee = map.get(t);
		int overFee = 0; //�ʰ����
		int d1 = 0; //�ʰ������ ����ϱ� ���� �Ÿ�
		if (t.equals("��������")||t.equals("����") || t.equals("����ö")) { //���ڿ��� ���� ������ ==���ٴ� equals�� ����մϴ�.
			if (d > 10) {
				d1 = d - 10;
				overFee = (d1 / 5) * 100;
			} // end if
		} else {
		System.out.println("���߱����� �ƴմϴ�.");
		}//end else
		
		System.out.println(t + " �̵��Ÿ�: " + d + "km, �⺻���: " + fee +
				"��, �߰����: " + overFee + "��, 20�� ���� �����: "+ (fee+overFee)*20+"��");
		
		return t;

	}// Transport

	public void transList() { //method���� �ҹ��ڷ�
		List<String> list = new LinkedList<String>();
		list.add(transport("��������", 20));
		for(int i=1;i<list.size();i++) { //list�� size�� �ƴ� 20~22 ������ ������ ���� ��� �ݺ����Ѻ�����.
			System.out.println("list�� �� ���: "+list.get(i));
		}//end for
	}//TransList
	
	public static void main(String[] args) {
		HomeAssignment_0124 ha = new HomeAssignment_0124();
		ha.transport("��������", 15);
		ha.transList();
		
	}// main

}// class
