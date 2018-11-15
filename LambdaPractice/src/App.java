
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Lambdas are blocks of code used to implement a method defined by a functional interface
		
		Human tom = new Human();
		Robot wally = new Robot();
		//tom.walk();
		//walker(tom);
		//wally.walk();
		//walker(wally);
		
		//lambda expression
		walker( () -> 
		{
			System.out.println("Custom object walking...");
		    System.out.println("Hello");
		});
		
		
		//functional interface - interface with only one abstract method in it
		ALambdaInterface aBlockOfCode = () -> 
		{
			System.out.println("Custom object walking...");
		    System.out.println("Hello");
		};
		
		
		Walkable a2BlockOfCode = () -> 
		{
			System.out.println("Custom object walking...");
		    System.out.println("Hello");
		};
		
		walker(a2BlockOfCode);
		
		
		
		
		//more practice
		ALambdaInterface helloVar = () -> System.out.println("Hello World");
		System.out.print("Hello Var executed : ");
		//dont need return since lambda already knows
		helloVar.someMethod();
		
		//dont need return since lambda expression already knows.
		Addable sumVar = (a, b) -> a+b;
		System.out.print("Sumvar executing : ");
		System.out.println(sumVar.compute(1, 3));
		
		
		//original
		//Div divVar = (a,b) -> a/b;
		
		
		//if we have more than one statement, we have to use semicolon and returns
		System.out.print("DivVar executed: ");
		Div nonZeroDivider = (a,b) -> {
			if(a == 0) {
				return 0;
			}
			return a/b;
		};
		
		System.out.println(nonZeroDivider.div(6, 2));
		
		
		//String lambda
		Manip revString = (s) -> {
			String result = "";
			for(int i = s.length()-1; i >=0; i--) {
				result += s.charAt(i);
			}
			return result;
		};
		System.out.print("RevString.manipulate: ");
		System.out.println(revString.manipulate("Hello"));
		
		
		//factorial
		Calc factorial = (a) -> {
			int result = 1;
			for(int i = 1; i <= a ; i++) {
				result *= i;
			}
			return result;
		};
		System.out.print("Factorial lambda: ");
		System.out.println(factorial.compute(10));
		
		
		//generic functional interface
		myGenericInterface<Integer> cNum = (a) -> {
			int result = 1;
			for(int i = 1; i <= a ; i++) {
				result *= i;
			}
			return result;
		};
		System.out.print("Generic Interface Factorial Function: ");
		System.out.println(cNum.calc(6));
		
		myGenericInterface<String> cStr = (str) -> {
			String result = "";
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'c') {
					result += 'c';
				}
			}
			return result;
		};
		
		System.out.print("Generic Interface of c Strings: ");
		System.out.println(cStr.calc("ccccdcc"));
	}

	public static void walker(Walkable walkable) {
		walkable.walk();
	}
	
	public void sayHello() {
		System.out.println("Hello there");
	}
	
	public int sum(int arg1, int arg2) {
		return arg1+arg2;
	}
	
	public int nonZeroDivide(int arg1, int arg2) {
		if(arg1 == 0) {
			return 0;
		}
		return arg1/arg2;
	}
	
	
	public String reverse(String rev) {
		String result = "";
		for(int i = rev.length()-1; i >=0; i--) {
			result += rev.charAt(i);
		}
		return result;
	}
	
	public int factorial(int num) {
		return factorial(num) * factorial(num-1);
	}
}





///////
//Functional Interfaces for Lambda Expressions
@FunctionalInterface
interface Div{
	public int div(int a, int b);
}

@FunctionalInterface
interface Calculate{
	//calculates numbers
	public int compute(int a, int b);
}

@FunctionalInterface
interface Calc{
	public int compute(int a);
}

@FunctionalInterface
interface Manip{
	//Manipulating String
	public String manipulate(String a);
}


@FunctionalInterface
//Generic
//now we can pass anything with one argument into this function.
interface myGenericInterface<T>{
	public T calc(T t);
}
