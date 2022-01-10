package day0110;

/**
 * Person클래스를 객체화하여 사용할 목적으로 만드는 클래스
 * @author user
 */
public class UsePerson {

	/**
	 * Java Application
	 * @param args
	 */
	public static void main(String[] args) {	
		//4.객체화
		Person hwangSungJun = new Person();
		//method호출 (일을 하기 위해)
//		hwangSungJun.setEye(2);
//		hwangSungJun.setNose(1);
//		hwangSungJun.setMouth(1); //기본생성자로 인해서 필요가 없어짐
		hwangSungJun.setName("황성준");
		
		//5.생성된 객체 사용
		System.out.println(hwangSungJun.eat());
		System.out.println(hwangSungJun.eat("뜨끈한 국밥", 9000));
		
		Person jinban = new Person(3, 1, 1);//객체화: 사람이 태어난 것 -> 
									//사람이 아무것도 가지지 않음 -> 최소한 눈, 코, 입을 가지고 있어야함
//		jinban.setEye(3);//태어난 이후 눈
//		jinban.setNose(1);//코
//		jinban.setMouth(1);//입을 설정
		
		jinban.setName("천진반");
		System.out.println(jinban.getEye()+"/"+jinban.getNose()+"/"+jinban.getMouth()+"/"
				+jinban.getName());
		
		System.out.println(jinban.eat());//생성된 객체 사용
		System.out.println(jinban.eat("선두", 0));
	}//main
}//class
