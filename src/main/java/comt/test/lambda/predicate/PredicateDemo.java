package comt.test.lambda.predicate;

import java.util.function.Predicate;
/**
 * Predicate Represents a predicate (boolean-valued function) of one argument
 * 
    @FunctionalInterface
	public interface Predicate<T> {

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param t the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     
    boolean test(T t);
    }
 * @author aayushraj
 *
 */
public class PredicateDemo {
	private static void print(Animal animal, Predicate<Animal> trait) {
		if (trait.test(animal))
			System.out.println(animal);
	}

	public static void main(String[] args) {
		print(new Animal("fish", false, true), a -> a.canHop());
		print(new Animal("kangaroo", true, false), a -> a.canHop());
	}
}