package comt.test.method.reference;

import java.util.Arrays;

public class SortStringArrayLambdaExpressionExample2 {
    public static void main(String... args) {
 
           String[] stringArray = { "ab", "ef", "cd" };
 
           System.out.println("1- Sort StringArray using > "
                        + "Reference to an instance method of a particular object");
           StringSort myStringSort = new StringSort();

           System.out.println("2 - Here String::stringSortMethod is a reference to "
                        + "> instance method StringSort "
                        + "> of class String");
           Arrays.sort(stringArray, myStringSort::stringSortMethod);
 
           System.out.print("Display sorted StringArray > ");
           for (String str : stringArray) {
                  System.out.print(str + " ");
           }
    }
}