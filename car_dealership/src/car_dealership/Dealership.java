package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer cust1 = new Customer();
		cust1.setName("Tom Tom");
		cust1.setAddress("123 Main Street");
		cust1.setCashOnHand(15000.2);
		
		Vehicle v1 = new Vehicle("BMW", "X3", 2015, 12000);
		Vehicle car = new Vehicle("BMW", "X3", 2015, 12000);
		
		Employee em1 = new Employee();
		em1.setName("John Gibbs");
		
		boolean value = v1.equals(car);
		
		System.out.println(value);
		cust1.purchaseCar(v1, em1, false);
	}

}
