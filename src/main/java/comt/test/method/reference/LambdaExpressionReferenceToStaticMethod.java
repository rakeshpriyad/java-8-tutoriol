package comt.test.method.reference;
public class LambdaExpressionReferenceToStaticMethod {
    public static void main(String[] args) {
 
        // Provide implementation (definition) of sumMethod in java 8
        System.out.println("1 - Find sum of two numbers using > reference to static method ");
        System.out.println("2 - Here MyInteger::sum is a reference to "
                                             + "> static method sum"
                                             + "> of class MyInteger");
         CalculatorInterface<Integer, Integer> sum = MyInteger::sum;
 
          // Call sumMethod
          Integer sumResult = sum.sumMethod(2, 3);
          System.out.println("sumResult = " + sumResult); // 5
    }
 
}