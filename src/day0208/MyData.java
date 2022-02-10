package day0208;

import java.io.Serializable;

/**
 * Stream을 타고 JVM외부로 나갈 수 있는 클래스
 * @author user
 */
public class MyData implements Serializable {
	//transient: 직렬화방지키워드, 기본형 데이터형, 참조형 데이터형이 직렬화되지 못하도록 막을 때 사용

	/**
	 * 이번호는 객체를 식별하기 위한 번호이고 1년후에는 다른 번호로 변경됩니다.
	 */
	private static final long serialVersionUID = 4275521922797821010L;
	
	private String name;
	private /*transient*/ double height;
	private double weight;
	
	public MyData() {
		
	}//MyData

	public MyData(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}//class
