package comt.test.lambda;

public class FindMatchingAnimals {
	private static void print(Animal animal, CheckTrait trait) {
		if (trait.test(animal))
			System.out.println(animal);
	}

	public static void main(String[] args) {
		//First method
		print(new Animal("fish", false, true), (Animal a) -> {return a.canHop();});
		print(new Animal("kangaroo", false, true), (Animal a) -> {return a.canHop();});

		//Second method
		print(new Animal("fish", false, true), a -> a.canHop());
		print(new Animal("kangaroo", true, false), a -> a.canHop());
	}
}