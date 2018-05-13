package com.test.fi;
public class FunctionalInterfaceDemo{
    public static void main(String...args) {
           
           //Write Anonymous inner class to implement method of MyInterface (FunctionalInterface)
           MyInterface myInterface = new MyInterface() {
                  @Override
                  public void myMethod() {
                        System.out.println("xx");
                  }
           };
           
           //Call myMethod()
           myInterface.myMethod();
    }
}