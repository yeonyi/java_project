package day0105;

/**
 * do~while사용<br>
 * 최소 1번 수행에 최대 조건까지 수행
 * @author user
 */
public class UseDoWhile {
	public static void main(String[] args) {
			int i =1;//초기값
			do {
				System.out.println(i);//반복수행문장
				i++;//증감식(없다면 무한루프에 빠짐)
			}while(i<10);//조건식
			
			//단을 main method arguments로 입력받아 입력받은 단으로 구구단 출력
			System.out.println();
	
			i=Integer.parseInt(args[0]);
			int j=1;
			do {
				System.out.println(i+"*"+j+"="+i*j);
				j++;
			}while(j<10); 
	}//main

}//class
