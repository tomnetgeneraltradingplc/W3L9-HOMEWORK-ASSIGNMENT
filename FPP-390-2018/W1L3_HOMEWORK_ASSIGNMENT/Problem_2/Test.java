package Problem_2;

public class Test {
	public static void main(String[] args) {

		Employee e1 = new Employee("Thomas", "Tom", 165000, 2016, 7, 17);
		Account checkingAccount = new Account(e1, AccountType.CHECKING, 300);
		Account savingsAccount = new Account(e1, AccountType.SAVINGS, 300);
		Account retirementAccount = new Account(e1, AccountType.RETIREMENT, 300);
		System.out.println("Try to withdrawal of less money than balance.");
		System.out.println("----------------------------------------------");
		checkingAccount.makeDeposit(700);
		checkingAccount.makeWithdrawal(500);
		savingsAccount.makeDeposit(1000);
		savingsAccount.makeWithdrawal(500);
		retirementAccount.makeDeposit(200);
		retirementAccount.makeWithdrawal(300);
		System.out.println("\nTry to withdrawal of more money than balance.");
		System.out.println("----------------------------------------------");
		checkingAccount.makeWithdrawal(500000);
		savingsAccount.makeWithdrawal(500000);
		retirementAccount.makeWithdrawal(500000);
		System.out.println("\nAccount data information");
		System.out.println("=========================");
		Account[] accList = new Account[3];
		accList[0] = checkingAccount;
		accList[1] = savingsAccount;
		accList[2] = retirementAccount;
		for (Account a : accList) {
			System.out.println(a);
		}

	}
}
/*Output
 * Try to withdrawal of less money than balance.
----------------------------------------------
Balance before withdraw: 1000.0 your withdraw amount: 500.0 your withdrawal completed successfully,New balance: 500.0
Balance before withdraw: 1300.0 your withdraw amount: 500.0 your withdrawal completed successfully,New balance: 800.0
Balance before withdraw: 500.0 your withdraw amount: 300.0 your withdrawal completed successfully,New balance: 200.0

Try to withdrawal of more money than balance.
----------------------------------------------
Balance before withdraw: 500.0 your withdraw amount: 500000.0 your balance is low!, unsuccessful withdrawal,New balance: 500.0
Balance before withdraw: 800.0 your withdraw amount: 500000.0 your balance is low!, unsuccessful withdrawal,New balance: 800.0
Balance before withdraw: 200.0 your withdraw amount: 500000.0 your balance is low!, unsuccessful withdrawal,New balance: 200.0

Account data information
=========================
type = CHECKING, balance = 500.0
type = SAVINGS, balance = 800.0
type = RETIREMENT, balance = 200.0

 */
