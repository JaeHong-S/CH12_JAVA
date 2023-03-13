package ch12;

public class Ex01 {
	public static void main(String args[]) {
		
		Thread3 run1 = new Thread3();
		Thread th1 = new Thread(run1);
		th1.start();
	}
}

class Thread3 implements Runnable {
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.print('-');
		}
	}

}
