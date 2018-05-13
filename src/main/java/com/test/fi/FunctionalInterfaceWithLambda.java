package com.test.fi;
public class FunctionalInterfaceWithLambda{
    public static void main(String...args) {
           
           //Write LAMBDA EXPRESSION to implement method of MyInterface (FunctionalInterface)
           MyInterface myInterface = () -> {
                 System.out.println("xx");
           };
           
           //Call myMethod()
           myInterface.myMethod();
    }
}