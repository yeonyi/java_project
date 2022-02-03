package day0124;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Ű�� ���� ������ �� �ڷᱸ�� - Map
 * @author user
 */
public class UseMap {

	/**
	 * HashTable: �⺻�����ڸ� ����ؼ� �����ϸ� 11���� �� ����
	 * ����ȭó��
	 */
	public void useHashTable() {
		//1. ����
		Map<String, String> map = new Hashtable<String, String>(); 
		map.put("A","�����ϴ�, ģ���ϴ�");
		map.put("B","���� �巴��");
		map.put("AB","������");
		map.put("O","�����δ��ϴ�");
		
		//�ߺ� ���� ���� ����. Ű�� �ߺ��� �� ����, ���� �ߺ��ȴ�.
		map.put("A", "�ҽ��ϴ�"); //Ű�� �ߺ����� ����
		map.put("a", "�ҽ��ϴ�");// ���� �ߺ� ����

		System.out.println(map);

		//Ű�� �����ϴ� ��
		System.out.println(map.containsKey("A"));
		
		//�� ���: Ű�������ϸ� ���� ��ȯ, �������� ������ null ��ȯ
		System.out.println(map.get("A")+"/"+map.get("ab"));
		
		//��� Ű ���
		Set<String> keys = map.keySet();
		//��� Ű ���
		Iterator<String> ita = keys.iterator();
		String key = "";
		
		while(ita.hasNext()) {
			key = ita.next();
			System.out.println(key+" "+map.get(key));
		}//end while
			
		System.out.println("���� ��: "+map.size() );
		System.out.println("map�� ���� ����? "+map.isEmpty());
		map.remove("O");
		map.clear();
		
		System.out.println("map�� ���� ����? "+map.isEmpty());
		System.out.println("���� ��: "+map.size() );

		System.out.println(map);
		
	}//useHashTable
	/**
	 * HashMap: �⺻�����ڸ� ����ؼ� �����ϸ� 16���� �� ����
	 * ����ȭó�� x
	 */
	public void useHashMap() {
		
		//1. ����
		Map<String, String> map = new HashMap<String, String>(); 
		map.put("A","�����ϴ�, ģ���ϴ�");
		map.put("B","���� �巴��");
		map.put("AB","������");
		map.put("O","�����δ��ϴ�");
		
		//�ߺ� ���� ���� ����. Ű�� �ߺ��� �� ����, ���� �ߺ��ȴ�.
		map.put("A", "�ҽ��ϴ�"); //Ű�� �ߺ����� ����
		map.put("a", "�ҽ��ϴ�");// ���� �ߺ� ����

		System.out.println(map);

		//Ű�� �����ϴ� ��
		System.out.println(map.containsKey("A"));
		
		//�� ���: Ű�������ϸ� ���� ��ȯ, �������� ������ null ��ȯ
		System.out.println(map.get("A")+"/"+map.get("ab"));
		
		//��� Ű ���
		Set<String> keys = map.keySet();
		//��� Ű ���
		Iterator<String> ita = keys.iterator();
		String key = "";
		
		while(ita.hasNext()) {
			key = ita.next();
			System.out.println(key+" "+map.get(key));
		}//end while
			
		System.out.println("���� ��: "+map.size() );
		System.out.println("map�� ���� ����? "+map.isEmpty());
		map.remove("O");
		map.clear();
		
		System.out.println("map�� ���� ����? "+map.isEmpty());
		System.out.println("���� ��: "+map.size() );

		System.out.println(map);
		
	}//useHashMap
	
	public static void main(String[] args) {
		UseMap um = new UseMap();
		System.out.println("--------Hash Table--------------");
		um.useHashTable();
		System.out.println("--------Hash Map--------------");
		um.useHashMap();
	}//main

}//class
