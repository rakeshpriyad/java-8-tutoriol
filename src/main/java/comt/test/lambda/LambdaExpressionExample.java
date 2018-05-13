package comt.test.lambda;

public class LambdaExpressionExample {
	public static void main(String[] args) {

		// Provide implementation of convertStringToInteger using Lambda expression
		// A will be type Integer
		// B will be of type String
		MyInterface<Integer, String> integerVal = (stringVal) -> Integer.valueOf(stringVal);

		// Call convertStringToInteger
		Integer result = integerVal.convertStringToIntegerMethod("12");
		System.out.println("Integer = " + result); // 12
	}

}

/*
 * OUTPUT
 * 
 * Integer = 12
 * 
 */