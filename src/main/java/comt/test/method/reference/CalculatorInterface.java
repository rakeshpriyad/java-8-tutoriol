package comt.test.method.reference;
@FunctionalInterface
interface CalculatorInterface<A, B> {
    A sumMethod(B val1, B val2);
}