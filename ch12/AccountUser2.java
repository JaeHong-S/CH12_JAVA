package ch12;

public class AccountUser2 extends Thread{
	boolean flag;
	Account2 act; //포함 관계 변수, 참조변수
	String name;
	public AccountUser2(Account2 act, String name) {
		this.act = act; this.name = name;
	}
	public void run() {
//		false/true를 번갈아가며 사용하여 출금과 입금을 발생
		for(int i = 0; i < 5; i++) {
//		계좌를 동시에 두명이나 사용하는 것을 방지
			synchronized (act) {
				int amt = (int)(Math.random()*10000) + 1;
				if(flag) act.deposit(amt, name);//입금
				else act.withdraw(amt, name);
			}
			flag = !flag;//true면 false로, false면 true로
			act.print();
		}
	}

}
