
public class CustomersManager {
	public void add(Customers customer) {
		System.out.println(customer.customerNumber + " Saved");
	}
	
	public void addMultiple(Customers[] customers) {
		for (Customers customer : customers) {
			add(customer);
		}
	}
}