package day1229;
public class HomeAssignment3 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);	
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		//1번문제
		System.out.println(a);
		if(a>=65&&a<=90){
			System.out.println((char)a);
		}
		
		//2번문제
		System.out.println(args[1]);
		if(b%3==0){
			System.out.println("쫙");
		}

		//3번문제
		System.out.println(c);
		if((c>=65&&c<=90)||(c>=97&&c<=122)||(c>=48&&c<=57)){
			System.out.println((char)c);
		}
		
		//4번문제
		System.out.println(args[3]);

		if(args[3].equals("버스")){
			System.out.println("대중교통");
		}
		if(args[3].equals("지하철")){
			System.out.println("대중교통");
		}
		if(args[3].equals("마을버스")){
			System.out.println("대중교통");
		}
		if(args[3].equals("택시")){
			System.out.println("대중교통");
		}
	
	}//main
}//class
