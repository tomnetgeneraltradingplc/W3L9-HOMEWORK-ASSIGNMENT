package employeeinfo;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		// update, using LocalDate
		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);

	}

	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public String getFormattedAcctInfo() {
		// implement
		return null;
	}
	

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void deposit(String acctType, double amt) {
		// implement
		switch (acctType) {
		case "CHECKING":
checkingAcct.makeDeposit(amt);
			break;
		case "SAVINGS":
savingsAcct.makeDeposit(amt);
			break;
		case "RETIREMENT":
retirementAcct.makeDeposit(amt);
			break;
		default:
			System.out.println("Wrong account tupe!");
			break;
		}
	}

	public boolean withdraw(String acctType, double amt) {
		// implement
		switch (acctType) {
		case "CHECKING":
checkingAcct.makeWithdrawal(amt);

			break;
		case "SAVINGS":
savingsAcct.makeWithdrawal(amt);
			break;
		case "RETIREMENT":
retirementAcct.makeWithdrawal(amt);
			break;
		default:
			System.out.println("Wrong account tupe!");
			break;
		}
		return false;
	}

}
