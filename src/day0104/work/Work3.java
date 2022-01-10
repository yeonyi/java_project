package day0104.work;

/**
 * HomeAssignment4 3번문제. 대중교통
 * @author user
 */
public class Work3 {
	//대중교통 요금은 잘 변하지 않는 기준값을 가지므로 상수를 사용.
	public static final int TOWN_BUS=800;
	public static final int BUS=1250;
	public static final int SUBWAY=1300;

	public static void main(String[] args) {
		
		if(args[0].equals("마을버스")||args[0].equals("버스")||args[0].equals("지하철")) {
			int distance=0;
			int fare=0;//기본요금

			distance= Integer.parseInt(args[1]);//입력된 이동 거리
			
			//입력된 교통수단의 기본요금을 식별하여 저장
			if(args[0].equals("마을버스")) {
				fare=Work3.TOWN_BUS;
			}else if(args[0].equals("버스")) {
				fare=Work3.BUS;
			}else {
				fare=Work3.SUBWAY;
			}//end else
			
			int overFare=0;//초과요금
			//초과요금
			if(distance>10) {
				overFare=(((distance-10)+1)/5)*100;
			}//end if
			
			System.out.println("교통수단: "+ args[0]+", 이동거리: "+distance+"km"+", 기본요금: "+fare+"원, 추가요금: "+(fare+overFare)+
					"원, 20일 기준 교통비: "+((fare+overFare)*20)+"원");
		}else {
			System.out.println("대중교통이 아닙니다.");	
		}//end else
		
	}//main

}//class
