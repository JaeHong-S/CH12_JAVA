package ch12;
class Run2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10 ; i++) {
			System.out.println(Thread.currentThread().getName()+ i + "");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
		
	}
	
}
public class Run2Ex {
	public static void main(String[] args) {
		Run2 run1 = new Run2();
		Run2 run2 = new Run2();
		Run2 run3 = new Run2();
		
		Thread th1 = new Thread(run1, "대박");
		Thread th2 = new Thread(run2, "쪽박");
		Thread th3 = new Thread(run3, "옹박");
		
	   th1.start(); th2.start(); th3.start();
		
		
		
		
	}
	
}
