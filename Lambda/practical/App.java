package Lambda.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Car> cars = Arrays.asList(
				new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700),
				new Car("Toyota", "Land Cruiser", "White", 48500),
				new Car("Toyota", "Corolla", "Black", 16200),
				new Car("Toyota", "Camry", "Blue", 24000),
				new Car("Nissan", "Sentra", "White", 17300),
				new Car("Mitsubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wrangler", "Red", 24500)
				);
		
		List<Robot> robots = Arrays.asList(
				new Robot("Metal", 1),
				new Robot("Wood", 2),
				new Robot("Grass", 3),
				new Robot("Water", 4),
				new Robot("Lava", 1),
				new Robot("Beep", 2)
				);
//		printCarsPriceRange(cars, 20000, 40000);
//		printCarsByColor(cars, "Blue");
		//test method
		
		//printing cars between 18000 to 22000
//		System.out.println("Printing cars with price range of 18000 to 22000: ");
//		printCars(cars, new CarCondition() {
//
//			@Override
//			public boolean test(Car c) {
//				// TODO Auto-generated method stub
//				return c.getPrice() >= 18000 && c.getPrice() <= 22000;
//			}
//			
//		});
		//anonymous class function
		//printing cars with the color blue
//		System.out.println("Printing cars with the color blue.");
//		printCars(cars, new CarCondition() {
//
//			@Override
//			public boolean test(Car c) {
//				// TODO Auto-generated method stub
//				return c.getColor().equals("Blue");
//			}
//			
//		});
//		
//		//lambda expressions
//		//takes in 2 argument, first is a list of cars and then 
//		//a condition we specify with CarCondition which takes in 
//		//1 parameter.
//		printCars(cars, (c) -> c.getPrice() >= 18000 && c.getPrice() <= 22000);
//		printCars(cars, (c) -> c.getColor().equals("Blue"));
		
		printCars(cars, (c) -> c.getPrice() >= 18000 && c.getPrice() <= 22000);
	}
	
	
//	public static void printCars(List<Car> cars, CarCondition condition) {
//		for(Car c: cars) {
//			if(condition.test(c)) {
//				c.printCar();
//			}
//		}
		
	//}
	//java library
	public static void printCars(List<Car> cars, Predicate<Car> predicate) {
		for(Car c: cars) {
			if(predicate.test(c)) {
				c.printCar();
			}
		}
	}
	
//	public static void printCarsPriceRange(List<Car> cars, int low, int high) {
//		for(Car c: cars) {
//			if(low <= c.getPrice() && c.getPrice() <= high) {
//				c.printCar();
//			}
//		}
//	}
//	
//	public static void printCarsByColor(List<Car> cars, String color) {
//		for(Car c: cars) {
//			if(c.getColor().equals(color)) {
//				c.printCar();
//			}
//		}
//	}

}

//@FunctionalInterface
//interface CarCondition{
//	public boolean test(Car c);
//}

@FunctionalInterface
//generic functional interface
interface CCondition<T>{
	public boolean test(T t);
}