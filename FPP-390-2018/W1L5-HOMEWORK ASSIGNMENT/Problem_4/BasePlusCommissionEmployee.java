package Problem_4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public double getPaymentAmount() {
		return baseSalary + (super.getGrossSales() * super.getCommissionRate());
	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [Base Salary=" + baseSalary + ", Payment Amount=" + getPaymentAmount()
				+ ", Gross Sales=" + getGrossSales() + ", Commission Rate=" + getCommissionRate() + ", First Name="
				+ getFirstName() + ", Last Name=" + getLastName() + ", SSN=" + getSocialSecurityNumber() + "]";
	}

}
