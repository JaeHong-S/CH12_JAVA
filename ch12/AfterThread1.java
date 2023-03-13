package ch12;

import java.util.ArrayList;

public class AfterThread1 extends Thread{
	public AfterThread1(String title) {
		super(title);
		
	}
	public void run() {
		System.out.println(getName() + "실행");
		ArrayList<String>carList = JoinTest.carList;
		for(String car : carList) {
			System.out.println(car);
		}
	}
}
