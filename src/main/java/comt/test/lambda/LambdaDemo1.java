package comt.test.lambda;

public class LambdaDemo1 {

	public static void main(String[] args) {
		Duck a = new Duck("XX Duck");
		Duck b = new Duck("YY Duck");
		print( a, d -> a.quack());
		print( b, d -> { return b.quack();});
		print(new Animal("AAAA",true, false), new Duck("AAA"),(Animal p,Duck q) -> q.quack());
		print(new Animal("BBB",true, false), new Duck("BB"),(p,q) -> q.quack());
		/**
		 * valid lambda expression for refrence
		 */
		// () -> new Duck()
		// d -> {return d.quack();}
		//(Duck d) -> d.quack()
		//(Animal a, Duck d) -> d.quack()
		
		/**
		 * Invalid lambda expression for refrence
		 */
		
		// Duck d -> d.quack() // DOES NOT COMPILE 
		// a,d -> d.quack() // DOES NOT COMPILE
		// Animal a, Duck d -> d.quack()
		//They each require parentheses ()! As we said, parentheses can be omitted only if there is
		//exactly one parameter and the data type is not specified.
		
	}
	
	public static void print(Duck d, CheckQuack cq){
		if(cq.test(d)){
			System.out.println("Duck " + d.getName() + " Quack");
		}
	}
	
	public static void print(Animal a, Duck d, CheckQuack1 cq1){
		if(cq1.test(a,d)){
			System.out.println("Duck " + d.getName() + " Quack");
		}
	}
}
