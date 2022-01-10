package day1230;

public class HomeAssignment4 {
	public static final int FEE_TOWNBUS=800;//대중교통 기본요금
	public static final int FEE_BUS=1250;
	public static final int FEE_SUBWAY=1300;
	
	public static void main(String[] args) {
	
	//1번문제
	int birth = Integer.parseInt(args[0]);
	int zodiac = birth % 12;
	System.out.print(birth+"년생은 ");
	
	if (zodiac == 0){
		System.out.println("원숭이띠");
	}else if(zodiac == 1){
		System.out.println("닭띠");
	}else if(zodiac == 2){
		System.out.println("개띠");
	}else if(zodiac == 3){
		System.out.println("돼지띠");
	}else if(zodiac == 4){
		System.out.println("쥐띠");
	}else if(zodiac == 5){
		System.out.println("소띠");
	}else if(zodiac == 6){
		System.out.println("호랑이띠");
	}else if(zodiac == 7){
		System.out.println("토끼띠");
	}else if(zodiac == 8){
		System.out.println("용띠");
	}else if(zodiac == 9){
		System.out.println("뱀띠");
	}else if(zodiac == 10){
		System.out.println("말띠");
	}else {
		System.out.println("양띠");
	}//end else

	//2번문제
	int score = 0;//지역변수는 반드시 초기화
	score=Integer.parseInt(args[1]);
	System.out.print(score +"점은 ");

	if(score >= 0 && score <= 100) {
		//0~100사이
		if(score<40) {
			System.out.println("과락");
		}else if(score<60) {
			System.out.println("다른점수 참조");
		}else {
			System.out.println("입력성공");
		}//end else
	}else{
		System.out.println("유효점수가 아닙니다.");
	}//end else

	//3번문제 
	int distance= Integer.parseInt(args[3]); //거리 입력

	int fee1=(((distance-10)+1)/5)*100; //거리에 따른 추가요금 거리가 10km를 초과한 경우에만 연산
	//int month=(fee+fee1)*2*20; //20일기준 왕복 교통비 

	if(args[2].equals("마을버스")){
		System.out.println("교통수단: "+ args[2]+", 이동거리: "+distance+"km"+", 기본요금: "+FEE_TOWNBUS+
				", 추가요금: "+fee1);
	}else if(args[2].equals("버스")){
		System.out.println("교통수단: "+ args[2]+", 이동거리: "+distance+"km"+", 기본요금: "+FEE_BUS+
				", 추가요금: "+fee1);
	}else if(args[2].equals("지하철")){
		System.out.println("교통수단: "+ args[2]+", 이동거리: "+distance+"km"+", 기본요금: "+FEE_SUBWAY+
				", 추가요금: "+fee1);
	}else {
	System.out.println("대중교통이 아닙니다.");
	}//end else
	
	}//main
	
}//class