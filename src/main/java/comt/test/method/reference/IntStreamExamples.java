package comt.test.method.reference;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamExamples {

	public static void main(String[] args) {

		// Before Java 8 - Find all numbers between 1 to 5
		for (int n = 1; n <= 5; n++) {
			if (n % 2 == 0) { // Filter - all even numbers
				System.out.println(n);
			}
		}

		IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
		// Or
		IntStream intStream2 = IntStream.of(new int[] { 1, 2, 3, 4, 5 });
		// Or, All are equivalent
		IntStream intStream3 = IntStream.range(1, 6);
		System.out.println("Range print 1-6");
		intStream3.forEach(System.out::println); // display
		
		System.out.println("intStream print");
		intStream.forEach(System.out::println); // display

		// In Java 8 - Find all even numbers between 1 to 5
		// Use streams
		System.out.println("--");
		IntStream.range(1, 6) // Numbers between 1 to 5
				.filter(n -> n % 2 == 0) // Filter - all even numbers
				.forEach(System.out::println); // display
		// or
		System.out.println("--");
		IntStream.of(1, 2, 3, 4, 5) // Numbers between 1 to 5
				.filter(n -> n % 2 == 0) // Filter - all even numbers
				.forEach(System.out::println); // display

		System.out.println("--g1");
		// In Java 8 - Find all numbers greater than 2
		// Use streams
		IntStream.of(1, 2, 3, 4, 5) // Numbers between 1 to 5
				.filter(n -> n > 2) // Find all numbers greater than 2
				.forEach(System.out::println); // display

		System.out.println("--g2");
		// In Java 8 - Find all even numbers greater than 2
		// Use streams
		IntStream.of(1, 2, 3, 4, 5) // Numbers between 1 to 5
				.filter(n -> n > 2) // Find all numbers greater than 2
				.filter(n -> n % 2 == 0) // Filter - all even numbers
				.forEach(System.out::println); // display

		// In Java 8 - Find all even numbers between 1 to 5
		// Use streams
		System.out.println("--");
		IntStream.of(1, 2, 3, 4, 5) // Numbers between 1 to 5
				.filter(n -> n % 2 == 1) // Filter - all even numbers
				.forEach(System.out::println); // display

		System.out.println("--x1");
		// In Java 8 - Find sum of all between 1 to 5
		// Use streams
		int sum = IntStream.of(1, 2, 3, 4, 5).sum(); // n.e. 1 + 2 + 3 + 4 + 5
		System.out.println(sum);

		System.out.println("--x13-");
		// In Java 8 - Find sum of all even numbers between 1 to 5
		int sum1 = IntStream.of(1, 2, 3, 4, 5).filter(n -> n % 2 == 0).sum(); // n.e. 2 + 4
		System.out.println(sum1);

		System.out.println("--x13-");
		// In Java 8 - Find maximum of all numbers in IntStream
		OptionalInt max = IntStream.of(9, 5, 3, 12, 4).max();
		System.out.println("max = " + max.getAsInt());

		// In Java 8 - Find minimum of all numbers in IntStream
		OptionalInt min = IntStream.of(9, 5, 3, 12, 4).min();
		System.out.println("min = " + min.getAsInt());

		// In Java 8 - count number of elements in IntStream
		long count = IntStream.of(9, 5, 3, 12, 4).count();
		System.out.println("count = " + count);

		//
		// In Java 8 - Find average of all between 1 to 5
		// Use streams
		OptionalDouble average = IntStream.of(1, 2, 3).average(); // n.e. 1 + 2 + 3 + 4 + 5
		System.out.println("average = " + average.getAsDouble());

		System.out.println("--x1");
		// In Java 8 - Find sum of all between 1 to 5
		// Use streams
		Stream<Integer> i1 = Stream.of(1, 2, 3, 4);

		// short-circuiting stateful intermediate operation

		// findFirst() method - returns first element in the stream
		OptionalInt optionalInt = IntStream.of(1, 2, 3, 4, 5).findFirst();
		System.out.println("optionalInt.getAsInt() = " + optionalInt.getAsInt());

		// findAny() method - returns any element in the stream
		OptionalInt optionalInt1 = IntStream.of(1, 2, 3, 4, 5).findAny();
		System.out.println("optionalInt2.getAsInt() = " + optionalInt1.getAsInt());

		// Find whether any record greater than 2
		boolean anyRecordGreaterThan = IntStream.of(1, 2, 3, 4, 5).anyMatch((n) -> n > 2);
		System.out.println("Any Record greater than 2  = " + anyRecordGreaterThan); // true

		// Find whether ALL records greater than 2
		boolean allRecordGreaterThan = IntStream.of(1, 2, 3, 4, 5).allMatch((n) -> n > 2);
		System.out.println("All Record greater than 2  = " + allRecordGreaterThan); // false

		// Find whether NONE of the record greater than 6
		boolean noneRecordGreaterThan = IntStream.of(1, 2, 3, 4, 5).noneMatch((n) -> n > 6);
		System.out.println("None Record greater than 6  = " + noneRecordGreaterThan); // true

		// Count number of records greater than 2
		// In Java 8 - count number of elements in IntStream
		long countRecordsGreaterThan = IntStream.of(1, 2, 3, 4, 5).filter((n) -> n > 2).count();
		System.out.println("Count number of records greater than 2 = " + countRecordsGreaterThan);

		//
		System.out.println("--3");
		// In Java 8 - Find sum of all between 1 to 5
		// using reduce method of IntStream
		OptionalInt reduced1 = IntStream.of(1, 2, 3, 4, 5).reduce((x, y) -> x + y); // n.e. 1 + 2 + 3 + 4 + 5
		System.out.println(reduced1.getAsInt());

		// In Java 8 - Find sum of all between 1 to 5 and add 10 to that
		// using reduce method of IntStream
		System.out.println("--2");
		int reduced2 = IntStream.of(1, 2, 3, 4, 5).reduce(10, (x, y) -> x + y); // n.e. 10 + 1 + 2 + 3 + 4 + 5
		System.out.println(reduced2);
	}
}

/*
 * Output
 * 
 * 2 4 1 2 3 4 5 -- 2 4 -- 2 4 --g1 3 4 5 --g2 4 -- 1 3 5 --x1 15 --x13- 6
 * --x13- max = 12 min = 3 count = 5 average = 2.0 --x1 optionalInt.getAsInt() =
 * 1 optionalInt2.getAsInt() = 1 Any Record greater than 2 = true All Record
 * greater than 2 = false None Record greater than 6 = true Count number of
 * records greater than 2 = 3 --3 15 --2 25
 * 
 */
