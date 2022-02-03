package day0121;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeAssignment_0121_2 {

	public HomeAssignment_0121_2() {
		String[] names = {"강명준","강산","강현모","권용현","김예진","김의정","김정하","김진영","김현우"};
		int i = (int) ((Math.random()*10)+10);//10~20까지 난수 출력
		System.out.println("발생한 난수: "+ i );
		
		String[] ranName = new String[i];
		Random r = new Random();
		int idx = 0;
		while(idx<i) {
			ranName[idx] = names[r.nextInt(names.length)];  
			idx++;
			
		}//end while
		
		List<String> list = new ArrayList<String>();
		for(String temp:ranName) {//ranName을 개선된 for문으로 출력
			list.add(temp);
		}//end for
		System.out.println("ranName 배열을 리스트로 "+list);

		for(String data : list) {
			
		}//end for
		
		System.out.println("개선된 for문으로 list 값 출력: "+list.toString());
		
	}//HomeAssignment_0121
	
	public static void main(String[] args) {
		new HomeAssignment_0121_2();
		
		
	}//main

}//class
