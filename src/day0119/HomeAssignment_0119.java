package day0119;

import java.util.StringTokenizer;

public class HomeAssignment_0119 {
	//1��
	private static StringBuilder RandomPwd(){
	char[] randomPwd = new char[] {'0','1','2','3','4','5','6','7','8','9','a','b','c'
		,'d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v'
		,'w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'
		,'P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	StringBuilder sb = new StringBuilder();
	
	int singlePwd =0;
	for(int i = 0;i<8;i++) {
		
		singlePwd = (int) (Math.random()*randomPwd.length);//�ݺ��� �ȿ��� ������ ����Ǹ� �ӵ��� �������ϴ�.
		sb.append(randomPwd[singlePwd]);
		
	}//end for
	return sb;
	
	}//RandoPwd
	
	//2��
	private static StringBuffer LottoNum() {
		
		int[] arr = new int[6];
		StringBuffer sb2 = new StringBuffer();
		
		System.out.print("��÷ �ζ� ��ȣ : ");
		for(int i = 0; i<arr.length ; i++) {
			int winNum = (int) ((Math.random()*45)+1);
			arr[i] = winNum;
			for(int j = 0; j<i;j++) {
				if(arr[i]==arr[j]) {//����߻��� ���� ���� ���� ���� ���� ���ٸ�
					System.out.println("���� ��ȣ: "+arr[i]);
					i--;//���� ��ȣ���߻��� ���� ���� �ٽ� �����ϱ����� �ε����� �����ϰ�
					break;//�߻��� ���� ���� ���ϴ°� �ǹ̰� �����Ƿ� ���� for�� �������� �پ�� i��° �濡 ������ �ٽ� �߻���Ű�� �ڵ带 �����ϰ� ���Ѵ�.
				}//end if
			}//end for
			System.out.print(+arr[i]+" ");
		}//end for
		return sb2;
		
	}//LottoNum
	
	//3��
	public String[] Token() {
		String csvData= "��©����,��©����.����Ƽ��~�������,������";
		StringTokenizer stk = new StringTokenizer(csvData, ",.~");
		
		String[] arr = new String[stk.countTokens()];
		int i = 0;//�ݺ����ȿ��� �������� �ȵǿ�. 
		while(stk.hasMoreTokens()) {
			arr[i] = stk.nextToken();
			System.out.println(arr[i]);// ������ �ٲ㼭 ���� ����ϰ�
			//���� �����. �������� ������ �ε����� �ش��ϴ� ���� �迭�� ��� �������� �ſ���.
			//�׷��ϱ� ���� ��©���� | ��©���� | ����Ƽ�� | ������� |������ 5���ε�
			//i�� ���� �����ϰ� ���߿� ���� ����ϴ� 5��° ���� �������� �ʾ� ���������ϴ�.
			i++;//���� ����ϱ����� �ε����� ������Ŵ.  ������Ű�� �����ϴ� �游 ���� ��⶧���� ������ �ȳ��� �˴ϴ�. 
		}//end while
		return arr;
	}//Token
	
	//4��
	public int LastName(String lastname) {
		String data="������,������, �ǿ���,���μ�,�迹��,����,������,������,�ڼ���,������,"
	 		+ "����ö,�̳���,������,������,������,������,������,������,�ֿ���,Ȳ����,�����";
		StringTokenizer stk=new StringTokenizer(data,",");
		String[] namedata=new String[stk.countTokens()];
		int i = 0;
		while (stk.hasMoreTokens()){
			namedata[i] = stk.nextToken();
			i++;
			}//end while
		int cnt = 0;
		for(int j = 0; j<namedata.length;j++) {
			if(namedata[j].startsWith(lastname)){
				cnt++;
			}//end if
//		System.out.println(cnt);
		}//end for
		return cnt; //cnt�� while�� �ȿ� ������ � ���� return �� ��
	 
	}//LastName

	
	public static void main(String[] args) {
		HomeAssignment_0119 ha = new HomeAssignment_0119();
		System.out.println("�ӽú�й�ȣ: "+ RandomPwd());
		
		System.out.println("------------------");
		System.out.println(LottoNum());
		
		System.out.println("------------------");
		String[] token1=ha.Token();
		System.out.println(token1);
//		for(int i=0;i<token1.length;i++) {
//			System.out.println(i+"��° : "+token1[i]+" ");
//		}//end for
		
		System.out.println("------------------");
		String lm = "��";
		System.out.println("���� "+lm+"�� �� ����� "+ha.LastName(lm)+"��");
		
	

	}//main

}//class
