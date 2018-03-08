package Problem_4;

public class MainTest {

	public static void main(String[] args) {
		Payable em1 = new CommissionEmployee("Hanna", "Smith", "011-526-658", 10000, 2);
		Payable em2 = new HourlyEmployee("Mariya", "John", "011-888-400", 45, 80.5);
		Payable em3 = new SalariedEmployee("Thomas", "Tibebu", "000-321-258", 9000);

		Payable em4 = new BasePlusCommissionEmployee("Mark", "Antoni", "789-001-212", 57000, 0.2, 1);
		Payable em5 = new Invoice("5645", "Laptop", 5, 3000);
		Payable[] Pay = new Payable[5];
		Pay[0] = em1;
		Pay[1] = em2;
		Pay[2] = em3;
		Pay[3] = em4;
		Pay[4] = em5;
		double sum = 0.0;
		for (Payable payable : Pay) {
			System.out.println(payable);
			System.out.println("Payment Amount= " + payable.getPaymentAmount());
			if (payable instanceof Employee) {
				sum = sum + payable.getPaymentAmount();
			}
		}

		System.out.println();
		System.out.println("Sum of all Employee:");
		System.out.println(sum);

	}

}
/*Output
CommissionEmployee [Gross Sales=10000.0, commission Rate=2.0, Payment Amount=20000.0, First Name=Hanna, Last Name=Smith, SSN=011-526-658]
Payment Amount= 20000.0
HourlyEmployee [wage=45.0, hours=80.5, Payment Amount=3622.5, First Name=Mariya, LastName=John, SSN=011-888-400]
Payment Amount= 3622.5
SalariedEmployee [Weekly Salary=9000.0, Payment Amount=9000.0, First Name=Thomas, Last Name=Tibebu, SSN=000-321-258]
Payment Amount= 9000.0
BasePlusCommissionEmployee [Base Salary=1.0, Payment Amount=11401.0, Gross Sales=57000.0, Commission Rate=0.2, First Name=Mark, Last Name=Antoni, SSN=789-001-212]
Payment Amount= 11401.0
Invoice [Part Number=5645, Part Description=Laptop, Quantity=5, Price Per Item=3000.0, Payment Amount=15000.0]
Payment Amount= 15000.0

Sum of all Employee:
44023.5
*/