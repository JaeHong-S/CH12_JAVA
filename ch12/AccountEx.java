package ch12;

public class AccountEx {
	public static void main(String[] args) {
		Account act = new Account(10000); //ㅈ잔액이 10000원인 통장 개설
		AccountUser[] au = new AccountUser[5];
		au[0] = new AccountUser(act, "보검");
		au[1] = new AccountUser(act, "제니");
		au[2] = new AccountUser(act, "로제");
		au[3] = new AccountUser(act, "미연");
		au[4] = new AccountUser(act, "은비");
		
		for(AccountUser a : au) {
			a.start();
		}
		
	}

}
