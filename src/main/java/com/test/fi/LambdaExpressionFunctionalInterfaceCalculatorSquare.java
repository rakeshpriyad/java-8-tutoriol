package com.test.fi;
public class LambdaExpressionFunctionalInterfaceCalculatorSquare {
    public static void main(String[] args) {
 
           //Provide implementation (definition) of squareMethod using > Lambda expression
           // A will be type Integer
           CalculatorInterface<Integer> square = (val) -> (val * val);
 
           // Call squareMethod
           Integer result = square.squareMethod(2);
           System.out.println(result); // 4
    }
 
}