package day0121;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeAssignment_0121_2 {

	public HomeAssignment_0121_2() {
		String[] names = {"������","����","������","�ǿ���","�迹��","������","������","������","������"};
		int i = (int) ((Math.random()*10)+10);//10~20���� ���� ���
		System.out.println("�߻��� ����: "+ i );
		
		String[] ranName = new String[i];
		Random r = new Random();
		int idx = 0;
		while(idx<i) {
			ranName[idx] = names[r.nextInt(names.length)];  
			idx++;
			
		}//end while
		
		List<String> list = new ArrayList<String>();
		for(String temp:ranName) {//ranName�� ������ for������ ���
			list.add(temp);
		}//end for
		System.out.println("ranName �迭�� ����Ʈ�� "+list);

		for(String data : list) {
			
		}//end for
		
		System.out.println("������ for������ list �� ���: "+list.toString());
		
	}//HomeAssignment_0121
	
	public static void main(String[] args) {
		new HomeAssignment_0121_2();
		
		
	}//main

}//class
