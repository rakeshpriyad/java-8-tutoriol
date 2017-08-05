package comt.test.lambda;

public class LambdaDemo3 {

	public static void main(String[] args) {
		/**
		 * Valid lambda expression
			() -> true // 0 parameters
			 a -> {return a.startsWith("test");} // 1 parameter
			(String a) -> a.startsWith("test") // 1 parameter
			(int x) -> {} // 1 parameter
			(int y) -> {return;} // 1 parameter
The first example takes no arguments and always returns true. The second
		 */
		print(()->true);
		print(()->false);
		
		print("testabc", a -> {return a.startsWith("test");});
		print("pqrtest", b -> {return b.startsWith("test");});
		printInt(1, (int x) -> {});
		printInt(2, (int y) -> {return;});
		
		
		
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

