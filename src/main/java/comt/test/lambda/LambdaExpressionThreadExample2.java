package comt.test.lambda;

public class LambdaExpressionThreadExample2 {
	public static void main(String[] args) {

		System.out.println("1 - Implement Runnable interface using > Lambda expression");
		// Implement Runnable interface using > Lambda expression

		/*new Thread(() -> {
			System.out.println("Thread-1");
		}).start();*/

		new Thread(() -> System.out.println("Thread-1")).start();

	}

}

/*
 * OUTPUT
 * 
 * 1 - Implement Runnable interface using > Lambda expression Thread-1
 * 
 */
