package day0121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ������ ���� 6~13���� �߶󳻼� List�� �����Ͽ� ��ȯ
 * @author user
 */
public class HomeAssignmnet_0121 {
	public HomeAssignmnet_0121(){
		
	String txt = "`1234567890-=qwertyuiop[]asdfghjkl;��zxcvbnm,./QWERTYUIOASDFGHJKLZXCVBNM";
	
	//�ڸ� ���ڿ��� �迭�� �ֱ� //6~13 ������ ������ �߻����Ѽ� �߻��� ���� ��ŭ txt data set�� ������ ���ڿ��� �̴� �ſ���.
	String txt1 = txt.substring(6, 16);
	String[] arr = txt1.split("");
	for(String s:arr) {
		
	}//end for
	
	System.out.println("�ڸ� ���ڿ��� �迭�� "+Arrays.toString(arr));
	//�迭�� List�� ��ȯ�ϱ�
	List<String> list = new ArrayList<String>();
	for(String temp:arr) {
		list.add(temp);
	}//end for
	System.out.println("�迭�� ����Ʈ��"+list);

	
	}//HomeAssignmnet_0121
	
	public static void main(String[] args) {
		new HomeAssignmnet_0121();
	}//main

}//class
