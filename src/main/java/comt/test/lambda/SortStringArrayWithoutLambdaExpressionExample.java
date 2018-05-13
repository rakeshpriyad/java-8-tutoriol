package comt.test.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringArrayWithoutLambdaExpressionExample {
      
    public static void main(String... args) {
 
        String[] stringArray = {"ab", "ef", "cd"};
       
        //Create Local class
        class StringSort implements Comparator<String> {
             public int compare(String a, String b) {
                  return a.compareTo(b);
            }
        }
      
        //Before Java 8 -  Sort String using Using Local class - Without Lambda expression
        System.out.println("Before Java 8 - Sort StringArray using Using "
          + " > Local class - i.e. Without Lambda expression");
        Arrays.sort(stringArray, new StringSort());
       
        //Display StringArray
          for (String str : stringArray) {
               System.out.print(str + " ");
          }
    }
}