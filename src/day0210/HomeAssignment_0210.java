package day0210;

public class HomeAssignment_0210 implements Runnable {

	@Override
	public void run() {
		try {
			for(int i = 0; i<20 ; i++) {
				System.out.print("." + " ");
				Thread.sleep(500);
			}//end for
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//end catch
		System.out.print("finish");
	}//run
		
	public static void main(String[] args) {
		System.out.print("loading ");
		HomeAssignment_0210 ha = new HomeAssignment_0210();
		Thread t = new Thread(ha);
		t.start();
	}//main


}//class
