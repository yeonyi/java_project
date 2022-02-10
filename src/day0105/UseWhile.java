package day0105;

/**
 * while의 사용 (시작과 끝을 모를 때 사용하는 반복문)<br>
 * 최소 0번 수행에 최대 조건까지 수행
 * 
 * @author user
 */
public class UseWhile {

	public static void main(String[] args) {
		// 1~100까지 출력
		int i = 1;//초기값
		while (i < 101) {//조건식
			System.out.print(i + " ");//반복수행문장
			i++;// 증감식(작성하지 않으면 무한루프에 빠짐)
		} //end while
		
		System.out.println();
		//1~100까지 수중에 3의 배수만 출력
		i = 1;
		while(i < 101) {//조건식
			if(i%3==0) {
				System.out.print(i+" ");//반복수행문장
			}//end if
			i++;//증감식
		}//end while
		
		//while을 사용하여 구구단 9단을 출력
		System.out.println();
		i=9;
		int j=0;
		while(i<10) {
			for (j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}//end for
			i++;
		}//end while
		
		//while무한루프
		while(true) {
			System.out.println("무한루프");
			break;
		}//end while
		
	}//main

}//class
