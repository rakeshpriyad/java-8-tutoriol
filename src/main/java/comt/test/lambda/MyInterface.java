package comt.test.lambda;
@FunctionalInterface
interface MyInterface<A, B> {
    A convertStringToIntegerMethod(B stringVal);
}