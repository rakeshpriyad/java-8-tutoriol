package comt.test.method.reference;
@FunctionalInterface
interface EmployeeGenerator{
   //createEmployee method returns Employee type object
   abstract Employee createEmployee(String firstName);
}