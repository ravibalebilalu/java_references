 /*encapsulation ensures data hiding in java.In this code we can see 
 how data can be encapsulated */

class Employee{
    //name and age can be accessed from anywhare
    String name;
    int age;
    //salary is encapsulated
    private int salary; 
    //salary can changed using setter
    public void setSalary(int Salary){
            salary = Salary;
    }
    //salary can accessed using getter
    public int getSalary(){
        return salary;
    }
}


public class encapsulation {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        //directly accessble variables
        emp1.name  = "Ravi";
        emp1.age = 23;
        //accesing through setter
        emp1.setSalary(123400);

         System.out.println("Name :" + emp1.name);
         System.out.println("Age :" + emp1.age);        
         System.out.println("Salary :" + emp1.getSalary());
         
    }
}
