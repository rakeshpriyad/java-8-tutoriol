package com.test.fi;

@FunctionalInterface
interface CalculatorInterface<A> {
	A squareMethod(A val);
}