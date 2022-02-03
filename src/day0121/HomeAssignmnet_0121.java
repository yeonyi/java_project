package day0121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 임의의 문자 6~13개를 잘라내서 List에 저장하여 반환
 * @author user
 */
public class HomeAssignmnet_0121 {
	public HomeAssignmnet_0121(){
		
	String txt = "`1234567890-=qwertyuiop[]asdfghjkl;’zxcvbnm,./QWERTYUIOASDFGHJKLZXCVBNM";
	
	//자른 문자열을 배열에 넣기 //6~13 사이의 난수를 발생시켜서 발생한 난수 만큼 txt data set의 임의의 문자열을 뽑는 거에요.
	String txt1 = txt.substring(6, 16);
	String[] arr = txt1.split("");
	for(String s:arr) {
		
	}//end for
	
	System.out.println("자른 문자열의 배열은 "+Arrays.toString(arr));
	//배열을 List로 변환하기
	List<String> list = new ArrayList<String>();
	for(String temp:arr) {
		list.add(temp);
	}//end for
	System.out.println("배열을 리스트로"+list);

	
	}//HomeAssignmnet_0121
	
	public static void main(String[] args) {
		new HomeAssignmnet_0121();
	}//main

}//class
