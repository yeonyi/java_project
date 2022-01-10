package day1228;
public class HomeAssignment2 {
	public static void main(String[] args) {
		int i=12;//양수의 보수 연산:부호변경 1증가이므로 -13
		System.out.println(~i+1);

		i=10;
		int j=-10;
		System.out.println(i++ - --j);//i는 후위연산이므로 10, j는 전위 연산이므로 -11 => 10 - (-11)

		i=2147483647;//int가 가질 수 있는 최대값 0111 1111 1111 1111 1111 1111 1111 1111
		System.out.println(i+" >> 27= "+(i>>27));

		//잘하셨습니다. 
	}
}
