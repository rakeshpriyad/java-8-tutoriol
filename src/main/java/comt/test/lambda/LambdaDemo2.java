package comt.test.lambda;

public class LambdaDemo2 {

	public static void main(String[] args) {
		/**
		 * Valid lambda expression
			() -> true // 0 parameters
			 a -> {return a.startsWith("test");} // 1 parameter
			(String a) -> a.startsWith("test") // 1 parameter
			(int x) -> {} // 1 parameter
			(int y) -> {return;} // 1 parameter
			The first example takes no arguments and always returns true. The second
			
			The first example takes no arguments and always returns true. The second and third
			examples both take a single String value, using different syntax to accomplish the same
			thing. Notice that in the first two examples we mixed and matched syntax between Figure
			2.1 and Figure 2.2 by having the first example use parentheses () but no braces {} and
			reversing this in the second example. The last two examples are equivalent because they
			take an integer value and do not return anything.

		 */
		print(()->true);
		print(()->false);
		
		print("testabc", a -> {return a.startsWith("test");});
		print("pqrtest", b -> {return b.startsWith("test");});
		printInt(1, (int x) -> {});
		printInt(2, (int y) -> {return;});
		
		/**
		 * (a, b) -> a.startsWith("test") // 2 parameters
			(String a, String b) -> a.startsWith("test") // 2 parameters
			These examples both take two parameters and ignore one of them, since there is no rule
			that says the lambda expression must use all of the input parameters.
			Let’s review some additional lambda expressions to see how your grasp of lambda
			syntax is progressing. Do you see what’s wrong with each of these lambda expressions?
			a, b -> a.startsWith("test") // DOES NOT COMPILE as parentheses missing
			Remember that the parentheses are optional only when there is one parameter and it doesn’t have a type
			declared
			c -> return 10; // DOES NOT COMPILE return keyword without using braces {}
			a -> { return a.startsWith("test") } // DOES NOT COMPILE as missing the semicolon after the return statement
		 The following rewritten lambda expressions are each valid:
			(a, b) -> a.startsWith("test")
			c -> { return 10; }
			a -> { return a.startsWith("test"); }
		 */
		
		
		/**
		 * As mentioned, the data types for the input parameters of a lambda expression are optional. When one parameter has a data type listed, though, all parameters must provide
		a data type. The following lambda expressions are each invalid for this reason:
		(int y, z) -> {int x=1; return y+10; } // DOES NOT COMPILE
		(String s, z) -> { return s.length()+z; } // DOES NOT COMPILE
		(a, Animal b, c) -> a.getName() // DOES NOT COMPILE

		If we add or remove all of the data types, then these lambda expressions do compile. For
		example, the following rewritten lambda expressions are each valid:
		(y, z) -> {int x=1; return y+10; }
		(String s, int z) -> { return s.length()+z; }
		(a, b, c) -> a.getName()
		 */
		
		/**
		 * (a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE as Java does not allow to re-declare local variables
		 * 
		 *  if We re-declare like below then it is complete:
		 *  (a, b) -> { int c = 0; return 5;}
		 */
	}
	
	public static void print(CheckVal cv){
		if(cv.isValid()){
			System.out.println("Yes it is valid");
		}else{
			System.out.println("No it is not valid");
		}
	}
	
	public static void print(String s, CheckValString cv){
		if(cv.isValid(s)){
			System.out.println("Yes it is valid " + s);
		}else{
			System.out.println("No it is not valid " + s);
		}
	}
	
	public static void printInt(int i, CheckValInt cv){
		cv.isValid(i);
		System.out.println("cv.isValid(i) "+ i);
	}
}

