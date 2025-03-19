package Day08.Ex06_UserException;

public class Account {
	
	
	private long balance; 		// 예금 잔액
	
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	
	// 입금
	public void deposit(int money) {
		balance += money;
	}
	// 출금
	public void withdraw(int money) {
		// (잔고) < (출금액) 		: 출금할 수 없음 --> 예외로 간주
		if(balance < money) {
			// 에외 강제 발생
			// - throw new XXXException();
			throw new BalanceException("잔고가 부족합니다." + (money-balance));
		}
		balance -= money;
	}
	
	
}
