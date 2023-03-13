package ch12;
class Daemon1 extends Thread{
	public void run() {
		while(true) {
		System.out.println("데몬");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {}
		}
	}
}
public class DaeMon1Ex {
	public static void main(String[] args) {
		Daemon1 dm = new Daemon1();
//		메인 작업이 끝나면 모든 쓰레드를 종료해라, 위에 있어야함 메인 작업(i 찍기) 끝나면 daemon 끝내라
		dm.setDaemon(true);
		dm.start();
		for(int i = 0 ; i < 20 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {}
			
		}
	
		
	}

}
