package comt.test.method.reference;
import java.util.Arrays;
 
public class ReferenceToInstanceMethodOfArbitraryObjectOfParticularType {
    public static void main(String... args) {
       
        //Reference to an instance method of an arbitrary object of a particular type
        System.out.println("1 - Reference to an instance method of an arbitrary object of a particular type");
        System.out.println("2 - Here String::compareToIgnoreCase is a reference to "
                        + "> instance method compareToIgnoreCase "
                        + "> of class String");
           
        String[] stringArray = { "ab", "Ef", "cd" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);
 
        System.out.print("Display sorted StringArray > ");
        for (String str : stringArray) {
              System.out.print(str + " ");
        }    
    }
}
 
/* Output
 
1 - Reference to an instance method of an arbitrary object of a particular type
2 - Here String::compareToIgnoreCase is a reference to > instance method compareToIgnoreCase > of class String
Display sorted StringArray > ab cd Ef
 
*/