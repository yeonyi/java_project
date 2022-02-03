package day0119;

/**
 * 오름차순 배열 출력 int[] temp = {89, 77, 75, 100, 96};
 * @author user
 */
public class Work {

	public static void main(String[] args) {
		int[] temp = new int[]  {89, 77, 75, 100, 96};
		for(int i = 0; i< temp.length;i++) {
			for(int j = 0; j<i;j++) {
				if(temp[i]<temp[j]) {
					int temp1 = temp[i];
					temp[i]=temp[j];
					temp[j]=temp1;
				} //end if
			}//end for
		}//end for
		for(int i = 0; i<temp.length;i++) {
			System.out.println(temp[i]+" ");
		}
	}//main

}//class
