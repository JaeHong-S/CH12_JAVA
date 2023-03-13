package ch12;

import java.util.ArrayList;

public class JoinTest {

	public static ArrayList<String> carList = new ArrayList<>();
	public static void main(String[] args) throws InterruptedException {
		BeforeThread1 bt = new BeforeThread1("before");
		AfterThread1 at = new AfterThread1("after");
		bt.start();
		bt.join(); //bt의 작업이 종료한 후에 at를 작업
		at.start();
	}
		

}
