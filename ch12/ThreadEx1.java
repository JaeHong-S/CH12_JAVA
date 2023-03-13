package ch12;
class Thread1 extends Thread{
	public Thread1(String title) {
		super(title);
	}
	public void run() {//쓰레드를 실행하는 메서드
		for(int i = 0; i < 100; i++) {
			System.out.print(getName() + i + "\t");
			if(i % 9 == 0) System.out.println();
			try {
				Thread.sleep(100); //0.1초 쉬어
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadEx1 {
	public static void main(String[] args) {
		Thread1 th1 = new Thread1("th1");
		Thread1 th2 = new Thread1("th2");
		//th1.run();(쓰레드 쓰지 않을 경우)
		th1.start(); //(쓰레드 사용), 비 순차적
		//th2.start();
//		for(int i = 0; i < 100; i++) {
//			System.out.print("메인" + i + "\t");
//			if(i % 9 == 0) System.out.println();
//			try {
//				Thread.sleep(100); //0.1초 쉬어
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

		System.out.println("프로그램 종료");
	}
}
