package day0121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * java.util.List�� ���
 * @author user
 */
public class UseList {

	public void useArrayList() {
		//1.����
		List<String> list = new ArrayList<String>();
		
		//2.���Ҵ�:���� ���������� �Ҵ�,���� �Ҵ��� ������ ���� ������ �����Ѵ�.
		//�ߺ��� ���
		list.add("Java"); //0
		list.add("Oracle"); //1
		list.add("JDBC"); //2
		list.add("Java"); //3
		list.add("HTML"); //4
		
		String key = "Java";
		System.out.println(key+" "+(list.contains(key)?"����":"����"));
		
//		list.add(2,"������"); //������ 2���ڸ��� ���� ���� �и�,LinkedList ��õ
		if(list.isEmpty()) {
			System.out.println("����Ʈ�� �������");
		}else {
			System.out.println("����Ʈ�� �� ����");
			
			//�����
			String val = list.get(0);
			System.out.println("ó����° ���� ��: "+val);
			//������ �� ���
			for(int i = 0; i<list.size();i++) {
				System.out.printf("list.get(%d)= %s\n", i, list.get(i));
			}//end for
			
		}//end else
		
		//�迭�� ���� : Generic�� �����Ǿ�� ��
		//1.������ �迭 ����
		String[] copy = new String[list.size()];
		//2.����
		list.toArray(copy);
		//�ε����� ����
		list.remove(1);
		//���� �������� ����(�ߺ����� �����Ѵٸ� ���� ó�� ���� ����)
		list.remove("Java");
		//��� ���� �� ����
		list.clear();
		
		System.out.println(list+"/"+list.size());
		
		System.out.println(Arrays.toString(copy));
		
	}//useArrayList
	
	public void useVector() {
		
		//1.����
		List<String> list = new Vector<String>();
		
		//2.���Ҵ�:���� ���������� �Ҵ�,���� �Ҵ��� ������ ���� ������ �����Ѵ�.
		//�ߺ��� ���
		list.add("Java"); //0
		list.add("Oracle"); //1
		list.add("JDBC"); //2
		list.add("Java"); //3
		list.add("HTML"); //4
		
//		list.add(2,"������"); //������ 2���ڸ��� ���� ���� �и�,LinkedList ��õ
		if(list.isEmpty()) {
			System.out.println("����Ʈ�� �������");
		}else {
			System.out.println("����Ʈ�� �� ����");
			
			//�����
			String val = list.get(0);
			System.out.println("ó����° ���� ��: "+val);
			//������ �� ���
			for(int i = 0; i<list.size();i++) {
				System.out.printf("list.get(%d)= %s\n", i, list.get(i));
			}//end for
			
		}//end else
		
		//�迭�� ���� : Generic�� �����Ǿ�� ��
		//1.������ �迭 ����
		String[] copy = new String[list.size()];
		//2.����
		list.toArray(copy);
		//�ε����� ����
		list.remove(1);
		//���� �������� ����(�ߺ����� �����Ѵٸ� ���� ó�� ���� ����)
		list.remove("Java");
		//��� ���� �� ����
		list.clear();
		
		System.out.println(list+"/"+list.size());
		
		System.out.println(Arrays.toString(copy));
		
	}//useVector
	
	public void useLinkedList() {
		
		//1.����
		List<String> list = new LinkedList<String>();
		
		//2.���Ҵ�:���� ���������� �Ҵ�,���� �Ҵ��� ������ ���� ������ �����Ѵ�.
		//�ߺ��� ���
		list.add("Java"); //0
		list.add("Oracle"); //1
		list.add("JDBC"); //2
		list.add("Java"); //3
		list.add("HTML"); //4
		
//		list.add(2,"������"); //������ 2���ڸ��� ���� ���� �и�,LinkedList ��õ
		if(list.isEmpty()) {
			System.out.println("����Ʈ�� �������");
		}else {
			System.out.println("����Ʈ�� �� ����");
			
			//�����
			String val = list.get(0);
			System.out.println("ó����° ���� ��: "+val);
			//������ �� ���
			for(int i = 0; i<list.size();i++) {
				System.out.printf("list.get(%d)= %s\n", i, list.get(i));
			}//end for
			
		}//end else
		
		//�迭�� ���� : Generic�� �����Ǿ�� ��
		//1.������ �迭 ����
		String[] copy = new String[list.size()];
		//2.����
		list.toArray(copy);
		//�ε����� ����
		list.remove(1);
		//���� �������� ����(�ߺ����� �����Ѵٸ� ���� ó�� ���� ����)
		list.remove("Java");
		//��� ���� �� ����
		list.clear();
		
		System.out.println(list+"/"+list.size());
		
		System.out.println(Arrays.toString(copy));
		
	}//useLinkedList

	public static void main(String[] args) {
		UseList ul = new UseList();
		System.out.println("--------ArrayList-------------");
		ul.useArrayList();
		System.out.println("-----------Vector----------");
		ul.useVector();
		System.out.println("-----------LinkedList----------");
		ul.useLinkedList();
		
	}//main

}//class
