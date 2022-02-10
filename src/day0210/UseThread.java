package day0210;

/**
 * Thread�� ������� ���
 * @author user
 */
//1. Thread�� ��ӹ���
public class UseThread extends Thread {
	
	//2.run method Override
	@Override
	public void run() {
		//3. Thread�� �����ؾ��� �ڵ� ���� (���ÿ� ����Ǿ�� �� �ڵ� ����)
		for(int i = 0 ; i < 500 ; i++) {
			System.out.println("run i========> "+ i);
		}//end for
	}//run
	
	public static void main(String[] args) {
		//4.Ŭ���� ��üȭ
		UseThread ut = new UseThread();
		long st = System.currentTimeMillis();
		//5.start() ȣ��
		ut.start();
//		ut.run(); //Thread�� ���۵��� ����
		for(int i = 0 ; i < 500 ; i++) {
			System.out.println("main i -----------------> " +i);
		}//end for
		long et = System.currentTimeMillis();
		System.out.println("����ð� : "+(et-st)+"ms");
		
	}//main
}//class
