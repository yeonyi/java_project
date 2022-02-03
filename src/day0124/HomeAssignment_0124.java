package day0124;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HomeAssignment_0124 {

	int feeTownBus = 800;
	int feeBus = 1250;
	int feeSubway = 1300;
	
	public String transport(String t, int d) {// t:교통수단, d: 거리
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("마을버스", feeTownBus);
		map.put("버스", feeBus);
		map.put("지하철", feeSubway);

		int fee = map.get(t);
		int overFee = 0; //초과요금
		int d1 = 0; //초과요금을 계산하기 위한 거리
		if (t.equals("마을버스")||t.equals("버스") || t.equals("지하철")) { //문자열을 비교할 때에는 ==보다는 equals를 사용합니다.
			if (d > 10) {
				d1 = d - 10;
				overFee = (d1 / 5) * 100;
			} // end if
		} else {
		System.out.println("대중교통이 아닙니다.");
		}//end else
		
		System.out.println(t + " 이동거리: " + d + "km, 기본요금: " + fee +
				"원, 추가요금: " + overFee + "원, 20일 기준 교통비: "+ (fee+overFee)*20+"원");
		
		return t;

	}// Transport

	public void transList() { //method명은 소문자로
		List<String> list = new LinkedList<String>();
		list.add(transport("마을버스", 20));
		for(int i=1;i<list.size();i++) { //list의 size가 아닌 20~22 사이의 임의의 수를 얻고 반복시켜보세요.
			System.out.println("list의 값 출력: "+list.get(i));
		}//end for
	}//TransList
	
	public static void main(String[] args) {
		HomeAssignment_0124 ha = new HomeAssignment_0124();
		ha.transport("마을버스", 15);
		ha.transList();
		
	}// main

}// class
