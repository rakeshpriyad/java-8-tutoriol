package comt.test.lambda;

import java.util.Arrays;

public class SortStringArrayLambdaExpressionExample2 {
	public static void main(String... args) {

		String[] stringArray = { "ab", "ef", "cd" };

		System.out.println("In Java 8 - Sort StringArray using > Lambda expression");

		Arrays.sort(stringArray, (String a, String b) -> {
			return a.compareTo(b);
		});

		//Arrays.sort(stringArray, (a, b) -> a.compareTo(b));

		// Display StringArray
		for (String str : stringArray) {
			System.out.print(str + " ");
		}

	}
}