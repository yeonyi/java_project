package day0118;

import java.util.ArrayList; //ctrl+shotf+o: 필요한 import가 다 입력됨
import java.util.List;
//import java.awt.List; 패키지는 다르고 이름이 같다면 둘 중 하나만 import 받을 수 있다.

import day0105.Modifiers;

//import day0105.*; 모든 파일을 확인하므로 속도가 느려짐 권장하지 않음

/**
 * 다른 패키지의 클래스를 참조하여 사용할 때
 * @author user
 */
public class TestImport {

	public static void main(String[] args) {
		//day0105에 존재하는 Modifiers라는 클래스 사용
		Modifiers m = new Modifiers();
		//java에서 제작 배포하는 패키지 사용
		List list = new ArrayList();
		java.awt.List test = null; //full path

	}//main

}//class
