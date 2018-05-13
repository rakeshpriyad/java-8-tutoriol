package comt.test.method.reference;
class Employee {
    String firstName;
 
    Employee() {
       System.out.println("Employee constructor - No Argument");
    }
 
    Employee(String firstName) {
       System.out.println("3 - Employee constructor - One Argument (i.e. String argument)");
        this.firstName = firstName;
    }
   
    public String getName(){
       return firstName;
    }
}