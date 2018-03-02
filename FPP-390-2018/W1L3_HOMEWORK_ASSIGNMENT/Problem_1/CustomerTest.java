package Problem_1;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer("Thomas", "Tibebu", "000-000-001");
		Customer c2 = new Customer("Gohn", "Smith", "000-000-001");
		Customer c3 = new Customer("Hanna", "Bill", "000-000-001");
		Address add1 = new Address("1000 N 4th Street", "Fairfield", "Iowa", "52557");
		Address add2 = new Address("500 N 4th Street", "Chicago", "Chicago", "99257");
		Address add3 = new Address("204 West Street", "Tampa", "Floida", "87895");
		c1.setBillingAddress(add1);
		c2.setBillingAddress(add2);
		c3.setBillingAddress(add3);
		c1.setShippingAddress(add1);
		c2.setShippingAddress(add2);
		c3.setShippingAddress(add3);
		
		Customer[] customerList = new Customer[3];
		customerList[0] = c1;
		customerList[1] = c2;
		customerList[2] = c3;
		for (Customer c : customerList) {
			if (c.getBillingAddress().getCity().equals("Chicago")) {
				System.out.println(c);
			}

	}
	}

}
/*Output
 * [Gohn, Smith, ssn: 000-000-001]
 */
