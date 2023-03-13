package ch12;

public class BeforeThread1 extends Thread{
	public BeforeThread1(String title) {
		super(title);
	}
	public void run() {
		System.out.println(getName() + "실행");
		addCar();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
	}
	private void addCar() {
		JoinTest.carList.add("addCar");
		JoinTest.carList.add("소나타");
		JoinTest.carList.add("제네시스");
		JoinTest.carList.add("아반떼");
		JoinTest.carList.add("스포티지");
		
	}

}
