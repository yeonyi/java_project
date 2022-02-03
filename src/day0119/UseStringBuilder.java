package day0119;

/**
 * �� ���ڿ��� �ٷ�� Ŭ����
 * @author user
 */
public class UseStringBuilder {
	
	public void useStringBuffer() {
		StringBuffer sb = new StringBuffer();
		//�� �߰� .append()
		sb.append(2022);//����
		sb.append('A');//����
		sb.append(1.19);//�Ǽ�
		sb.append(false);//boolean
		
		System.out.println(sb+" "+sb.length());
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("������ ������ �Դϴ�.");//����
		sb2.insert(4, "2022�� 1�� 19�� ");//����
		sb2.delete(4, 10);
		
		System.out.println(sb2);
	}//useStringBuffer
	
	public void useStringBuilder() {
		StringBuilder sb = new StringBuilder();
		//�� �߰� .append()
		sb.append(2022);//����
		sb.append('A');//����
		sb.append(1.19);//�Ǽ�
		sb.append(false);//boolean
		
		System.out.println(sb+" "+sb.length());
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("������ ������ �Դϴ�.");//����
		sb2.insert(4, "2022�� 1�� 19�� ");//����
		sb2.delete(4, 10);
		
		System.out.println(sb2);
		
		String fileName = "e:/dev/workspace/javase_prj/day/UseStringBuilder.java";
		//���� ���/���ϸ��� "e:/dev/workspace/javase_prj/day/UseStringBuilder_bak/java"�� ���
		StringBuilder sb3 = new StringBuilder(fileName);
		sb3.insert(sb3.lastIndexOf("."),"_bak");
		
		System.out.println(sb3);
		String temp = sb3.toString();
		System.out.println(temp.toUpperCase());
		System.out.println(sb3.toString().toUpperCase());
	}//useStringBuilder

	public static void main(String[] args) {
		UseStringBuilder usb = new UseStringBuilder();
		System.out.println("-------StringBuffer-------------");
		usb.useStringBuffer();
		System.out.println("-------StringBuilder-------------");
		usb.useStringBuilder();
		
	}//main

}//class
