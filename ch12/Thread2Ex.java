package ch12;
class Thread2 extends Thread{
	public Thread2(String title) {
		super(title);
	}
	
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.print(getName() + i + "\t");
			if( i % 9 == 0)System.out.println();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Thread2Ex {
	public static void main(String[] args) {
		Thread2 th1 = new Thread2("대박");
		Thread2 th2 = new Thread2("쪽박");
		th1.start();
		th2.start();
		
		for(int i = 0; i< 50; i++) {
			System.out.println("main" + i + "\t");
			if(i % 9 == 0)System.out.println();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}

}
