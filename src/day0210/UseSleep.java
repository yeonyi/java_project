package day0210;

//1. Runnable ����
public class UseSleep implements Runnable {
	//2.run method�� Override
	@Override
	public void run() {
		//3.Thread�� �����ؾ��� �ڵ� ����
			try {
				for(int i = 0; i<10 ; i++) {
					System.out.println(i);
					//������ �ð����� block ���·� ����
					Thread.sleep(60*1000);//1�� �Ŀ� ���� 1000mills=1sec
				}//end for
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//end catch
	}//run
	
	public static void main(String[] args) {
		//4.��üȭ
		UseSleep us = new UseSleep();
		//5.ThreadŬ������ has a ����
		Thread t = new Thread(us);
		//6.start() �M ��
		t.start();
	}//main


}//class
