package day1228;
public class HomeAssignment2 {
	public static void main(String[] args) {
		int i=12;//����� ���� ����:��ȣ���� 1�����̹Ƿ� -13
		System.out.println(~i+1);

		i=10;
		int j=-10;
		System.out.println(i++ - --j);//i�� ���������̹Ƿ� 10, j�� ���� �����̹Ƿ� -11 => 10 - (-11)

		i=2147483647;//int�� ���� �� �ִ� �ִ밪 0111 1111 1111 1111 1111 1111 1111 1111
		System.out.println(i+" >> 27= "+(i>>27));

		//���ϼ̽��ϴ�. 
	}
}
