package day1229;
public class HomeAssignment3 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);	
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		//1������
		System.out.println(a);
		if(a>=65&&a<=90){
			System.out.println((char)a);
		}
		
		//2������
		System.out.println(args[1]);
		if(b%3==0){
			System.out.println("��");
		}

		//3������
		System.out.println(c);
		if((c>=65&&c<=90)||(c>=97&&c<=122)||(c>=48&&c<=57)){
			System.out.println((char)c);
		}
		
		//4������
		System.out.println(args[3]);

		if(args[3].equals("����")){
			System.out.println("���߱���");
		}
		if(args[3].equals("����ö")){
			System.out.println("���߱���");
		}
		if(args[3].equals("��������")){
			System.out.println("���߱���");
		}
		if(args[3].equals("�ý�")){
			System.out.println("���߱���");
		}
	
	}//main
}//class
