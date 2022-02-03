package day0119;

import java.util.StringTokenizer;

public class HomeAssignment_0119 {
	//1번
	private static StringBuilder RandomPwd(){
	char[] randomPwd = new char[] {'0','1','2','3','4','5','6','7','8','9','a','b','c'
		,'d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v'
		,'w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'
		,'P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	StringBuilder sb = new StringBuilder();
	
	int singlePwd =0;
	for(int i = 0;i<8;i++) {
		
		singlePwd = (int) (Math.random()*randomPwd.length);//반복문 안에서 변수가 선언되면 속도가 느려집니다.
		sb.append(randomPwd[singlePwd]);
		
	}//end for
	return sb;
	
	}//RandoPwd
	
	//2번
	private static StringBuffer LottoNum() {
		
		int[] arr = new int[6];
		StringBuffer sb2 = new StringBuffer();
		
		System.out.print("당첨 로또 번호 : ");
		for(int i = 0; i<arr.length ; i++) {
			int winNum = (int) ((Math.random()*45)+1);
			arr[i] = winNum;
			for(int j = 0; j<i;j++) {
				if(arr[i]==arr[j]) {//현재발생한 방의 값과 이전 방의 값이 같다면
					System.out.println("같은 번호: "+arr[i]);
					i--;//같은 번호가발생한 방의 값을 다시 생성하기위해 인덱스를 감소하고
					break;//발생한 이후 방을 비교하는건 의미가 없으므로 안쪽 for를 빠져나가 줄어든 i번째 방에 난수를 다시 발생시키는 코드를 수행하고 비교한다.
				}//end if
			}//end for
			System.out.print(+arr[i]+" ");
		}//end for
		return sb2;
		
	}//LottoNum
	
	//3번
	public String[] Token() {
		String csvData= "우짤래미,저짤래미.뇌절티비~쿠쿠루삥뽕,포항항";
		StringTokenizer stk = new StringTokenizer(csvData, ",.~");
		
		String[] arr = new String[stk.countTokens()];
		int i = 0;//반복문안에서 변수선언 안되요. 
		while(stk.hasMoreTokens()) {
			arr[i] = stk.nextToken();
			System.out.println(arr[i]);// 순서를 바꿔서 값을 출력하고
			//값을 출력함. 마지막에 증가된 인덱스에 해당하는 방이 배열에 없어서 에러나는 거에요.
			//그러니까 방이 우짤래미 | 저짤래미 | 뇌절티비 | 쿠쿠루삥뽕 |포항항 5개인데
			//i가 먼저 증가하고 나중에 값을 출력하니 5번째 방이 존재하지 않아 에러가납니다.
			i++;//값을 출력하기전에 인덱스를 증가시킴.  증가시키면 존재하는 방만 값을 얻기때문에 에러가 안나게 됩니다. 
		}//end while
		return arr;
	}//Token
	
	//4번
	public int LastName(String lastname) {
		String data="김의정,강명준, 권용현,정인선,김예진,강산,김진영,김현우,박설진,서지숙,"
	 		+ "신유철,이내혁,강현모,장정우,김정하,장형근,전민정,정시헌,최연이,황성준,서희수";
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
		return cnt; //cnt를 while문 안에 넣으면 어떤 값을 return 할 지
	 
	}//LastName

	
	public static void main(String[] args) {
		HomeAssignment_0119 ha = new HomeAssignment_0119();
		System.out.println("임시비밀번호: "+ RandomPwd());
		
		System.out.println("------------------");
		System.out.println(LottoNum());
		
		System.out.println("------------------");
		String[] token1=ha.Token();
		System.out.println(token1);
//		for(int i=0;i<token1.length;i++) {
//			System.out.println(i+"번째 : "+token1[i]+" ");
//		}//end for
		
		System.out.println("------------------");
		String lm = "최";
		System.out.println("성이 "+lm+"씨 인 사람은 "+ha.LastName(lm)+"명");
		
	

	}//main

}//class
