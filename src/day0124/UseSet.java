package day0124;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * �˻��� ����� ����, �ߺ����� �������� �ʴ� �ڷᱸ��
 * @author user
 */
public class UseSet {
	
	public UseSet() {
		//1.����
		Set<String> set = new HashSet<String>();
		
		//2.���Ҵ�
		set.add("Java");
		set.add("Oracle");
		set.add("JDBC");
		set.add("HTML");
		set.add("CSS");
		set.add("JavaScript");
		//�ߺ��� - �ԷµǴ� ���� ������ ���� ���� ������ �Էµ��� �ʴ´�.
		set.add("HTML");
		
		//3.ũ��
		System.out.println(set.size());
		
		//4.�迭�� ����
		//�� �迭 ����
		String[] copyArr = new String[set.size()];
		//����
		set.toArray(copyArr);
		
		//�˻�
//		set.get(0); ����� �� ����
		//������ for����ϸ� Iterator���̵� ��µ�
//		for( String subject : set) {
//			System.out.println(subject);
//		}//end for
		//�˻�����: Iterator
		//1.Set��ü�� ������� �޴´�.
		Iterator<String> ita = set.iterator();
		//2.Iterator�� ���ؼ� Set�� ��Ұ� �����ϴ� �� �˻��� �� ��
		String value = ""; //null�� �ʱ�ȭ�ϸ� �޼���ȣ��� ����
		while( ita.hasNext()) {
		//3. ��Ұ� �����Ѵٸ� ���� ���, �����͸� �������� �̵���Ų��.
			value = ita.next();
			System.out.println(value);
		}//end while
		
		//����
		set.remove("JDBC"); //Ư�� ���� �� ����
		set.clear(); //��� ���� �� ����
		System.out.println(set.isEmpty());
		
		System.out.println(set);
		System.out.println("-----------����� ��-----------");
		for(int i = 0 ; i < copyArr.length ; i++) {
			System.out.println(copyArr[i]);
		}//end for
		
	}//UseSet
	
	/**
	 * Set�� �ߺ��� ���� ����
	 */
	public void dupVal() {
		//1.����
		Set<TestVO> set = new HashSet<TestVO>();
		//2.�� �Ҵ� -> set�� 1�������� ������ ���� �ߺ��� ���� �������� �ʴ´�.
		set.add(new TestVO("������", 25));//new�� ������ ��ü�� �ּҰ� �ٸ��Ƿ�
		set.add(new TestVO("���μ�", 24));
		set.add(new TestVO("������", 24));
		set.add(new TestVO("������", 25));//������ ���� ���� �������� �Էµ�
		
		TestVO tv = new TestVO("������", 26);
		set.add(tv);//�ϳ��� �ּҰ�
		set.add(tv);//������ ���Ǹ� �߰����� �ʴ´�.
		
		System.out.println(set);
	}//dupVal

	public static void main(String[] args) {
		UseSet us = new UseSet();
		System.out.println("-------�ߺ����� ó��-------");
		us.dupVal();
	}//main

}//class
