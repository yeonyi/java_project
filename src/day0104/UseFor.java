package day0104;

/**
 * 반복문(loop statement)
 * 시작과 끝을 알 떄 사용하는 반복문 for문.<br>
 * 단일 for문
 * @author user
 */
public class UseFor {

	public static void main(String[] args) {
		//0~9까지 10번 반복되는 for문
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}//end for
		
		//1~10까지 1씩 증가하는 값을 행으로 출력, 이전 값과 다음 값은 tab으로 구분하여 출력
		for (int i=1; i<11; i++) {
			System.out.print(i+"\t");
		}//end for
		
		System.out.println();//줄변경
		//1~100까지 수 중에 짝수만 행으로 출력, 값 사이는 공백으로 구분
		for (int i=1; i<101; i++) {
			if(i%2==0) {
				System.out.print(i+" ");				
			}//end if
		}//end for
		
		System.out.println();
		//1~100까지 수 중에 홀수만 행으로 출력, 값 사이는 공백으로 구분
		for (int i=1; i<101; i+=2) {
			
				System.out.print(i+" ");				
		}//end for
		
		System.out.println();
		//2단을 출력하는 코드 작성, 열로 출력
		for(int i =1; i<10; i++) {
			System.out.println("2*"+i+"="+2*i);
		}//end for
		
		//1~100까지의 합을 출력
		int sum=0;
		for(int i=1; i<101; i++) {
			sum += i;//break point : 실행이 멈춤(디버그에서 확인가능)
			//System.out.println(sum+" "+i);//중간 값 확인
		}//end for
		System.out.println("1에서부터 100까지의 합은 "+sum);
		
		//10에서부터 0까지 1씩 감소하는 반복문을 작성, 값은 행으로 출력
		//주의:looping문은 조건이나 증감을 잘못 설정하면 무한루프에 빠진다. -> terminate를 사용해 빠져나옴
		for(int i=10; i>-1; i--) {
			System.out.println(i+" ");
		}//end for
		
		
	}//main

}//class
