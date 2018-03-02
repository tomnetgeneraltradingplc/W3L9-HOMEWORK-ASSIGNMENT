package employeeinfo;


class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}
	

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		// implement
		balance = balance + deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		double balanceBeforeWithdraw = balance;
		if(amount <= balance){
			balance = balance-amount;
		System.out.println("Balance before withdraw: " + balanceBeforeWithdraw + " your withdraw amount: " + amount + " your withdrawal completed successfully,New balance: " + balance);
			return true;
		}
		System.out.println("Balance before withdraw: " + balanceBeforeWithdraw + " your withdraw amount: " + amount + " your balance is low!, unsuccessful withdrawal,New balance: " + balance);
		return false;
		
	}
}
