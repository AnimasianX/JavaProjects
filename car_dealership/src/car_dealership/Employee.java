package car_dealership;

public class Employee {

	private String name;
	
	
	public void handleCustomer(Customer cust, boolean finance, Vehicle v) {
		if(finance == true) {
			double loanAmount = v.getPrice() - cust.getCashOnHand();
			runFinanceHistory(cust, loanAmount);
		}
		else if(v.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust, v);
		}
		else {
			System.out.println("Customer " + cust.getName() + " will need more money to purchase " + v.getBrand() + " " + v.getModel());
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		name += " : Employee";
		this.name = name;
	}

	public void runFinanceHistory(Customer cust, double loanAmount) {
		System.out.println("Ran credit history for customer.");
		System.out.println("Customer has been approved for financing.");
	}
	
	public void processTransaction(Customer cust, Vehicle v) {
		System.out.println("Customer " + cust.getName() + " purchased " + v +  " in cash for: " + v.getPrice());
	}

}
