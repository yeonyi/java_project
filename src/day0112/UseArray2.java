package day0112;

/**
 * 2���� �迭 : ��� ���� ������ �迭<br>
 * ���� �� : �迭��.length<br>
 * ���� �� : �迭��[���ǹ�ȣ].length
 * 
 * @author user
 */
public class UseArray2 {
	public UseArray2() { // �⺻������
		// �������迭 ���
		// 1. ����) ��������[][]�迭��=null;
		int[][] arr = null;

		// 2. ����) �迭�� = new ��������[��][��]; ��� ���� ���� �ʱ�ȭ�ȴ�.
		arr = new int[4][3];
		System.out.printf("���� ��:%d��, ���� ��:%d��\n", arr.length, arr[0].length);

		// 3. �� �Ҵ�) �迭��[���ǹ�ȣ][���ǹ�ȣ]=��;
		arr[0][0] = 2022;
		arr[3][2] = 12;

		// 4. �� ���) �迭��[���ǹ�ȣ][���Ǻ�ȣ]
		System.out.println(arr[0][0] + "/" + arr[0][1]);

		/*
		 * 0 0 0 1 0 2 
		 * 1 0 1 1 1 2 
		 * 2 0 2 1 2 2 
		 * 3 0 3 1 3 2
		 */
		
		for (int i = 0; i < arr.length ; i++) {//��
			for (int j = 0; j < arr[i].length; j++) {//��
				System.out.printf("arr[%d][%d] = %d\t", i, j, arr[i][j]);
			} // end for
			System.out.println();
		} // end for
		System.out.println("------------�⺻�� ������ ���-------------");
		
		//�౸�� ��ȣ�� ����Ͽ� ��� ���� �����.
		int[][]arr2 = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
		System.out.printf("%d�� %d��\n", arr2.length, arr2[0].length);
		arr2[0][2] = 3000;
		
		//�ϰ�ó��
		for(int i = 0; i < arr2.length ; i++) {//��
			System.out.printf("arr[%d]�� ����\n", i);
			for(int j = 0; j<arr2[i].length;j++) {//��
				System.out.printf("arr2[%d][%d]=%d\t", i, j, arr2[i][j]);
			}//end for
			System.out.printf("\narr[%d]�� ��\n", i);
		}//end for
		
		System.out.println("----------------------------------------");
		for(int[] arr1 : arr2) {//������ �迭�� �� ���� ������ �迭
			for(int value : arr1) {//������ �迭�� �� ���� ������
				System.out.printf("%-6d", value);
			}//end for
			System.out.println();
		}//end for
		
	}// UseArray2

	public static void main(String[] args) {
		new UseArray2();

	}// main

}// class
