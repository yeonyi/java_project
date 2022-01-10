package day1228;
/**
 단항 연산자
*/

public class Operator1 {
	public static void main(String[] args) {
		
		int i=12;
		int j=-19;
		System.out.println("~"+i+"="+ ~i);//~양수:부호변경 1증가
		System.out.println("~"+j+"="+ ~j);//~음수:부호변경 1감소

		i=12;
		j=28;
		//!을 관계연산자 앞에 사용
		System.out.println(i+">"+j+"="+!(i>j));
		
		boolean flag1=true, flag2=false;
		//!을 boolean형 앞에 사용
		System.out.println("!"+flag1+"="+!flag1);
		System.out.println("!"+flag2+"="+!flag2);

		i=12;
		j=-37;
		//+연산자는 아무런 일도 하지 않는다.(형식적인 제공)
		System.out.println("+"+i+"="+ +i);//12
		System.out.println("+"+j+"="+ +j);//-37

		//-연산자는 부호만 변경한다.
		System.out.println("-"+i+"="+ -i);//-12
		System.out.println("-"+j+"="+ -j);//37

		//증가연산, 감소연산
		i=10;
		j=12;

		System.out.println("i: "+i+ ",j: "+j);
		++i;
		i++;
		--j;
		j--;
		System.out.println("증가연산 후 i: "+i);
		System.out.println("감소연산 후 j: "+j);

		int result=0;
		//전위연산
		result=++i;//연산 후 대입
		System.out.println("전위연산 후 i :"+i+", result :"+result);//i=13, result=13

		result=0;
		//후위연산
		result=i++;//대입 후 연산
		System.out.println("후위연산 후 i :"+i+", result :"+result);//i=14, result=13

		System.out.println("전위: "+ ++i);//i를 증가한 수 메소드에 할당해준다. i=15
		System.out.println(i);

		System.out.println("후위: "+ i++);//i를 메소드에 할당 한 후 증가한다. i=15
		System.out.println(i);//i=16

		i=10;
		j=20;
		System.out.println(i++ + --j);

	}//main
}//class
