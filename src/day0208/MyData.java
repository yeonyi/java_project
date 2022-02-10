package day0208;

import java.io.Serializable;

/**
 * Stream�� Ÿ�� JVM�ܺη� ���� �� �ִ� Ŭ����
 * @author user
 */
public class MyData implements Serializable {
	//transient: ����ȭ����Ű����, �⺻�� ��������, ������ ���������� ����ȭ���� ���ϵ��� ���� �� ���

	/**
	 * �̹�ȣ�� ��ü�� �ĺ��ϱ� ���� ��ȣ�̰� 1���Ŀ��� �ٸ� ��ȣ�� ����˴ϴ�.
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
