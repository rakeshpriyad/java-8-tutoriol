package comt.test.method.reference;

import java.util.Arrays;

public class SortStringArrayMethodReferenceExample {
    public static void main(String... args) {
 
           String[] stringArray = { "ab", "ef", "cd" };
 
           System.out.println("1 - Sort StringArray using > reference to static method ");
           System.out.println("2 - Here StringArraySort::sortMethod is a reference to "
                        + "> static method sortMethod"
                        + "> of class StringArraySort");
           Arrays.sort(stringArray, StringArraySort::sortMethod);
 
           System.out.print("Display sorted StringArray > ");
           for (String str : stringArray) {
                  System.out.print(str + " ");
           }
    }
}