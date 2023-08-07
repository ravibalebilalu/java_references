//import scanner
import java.util.Scanner;
public class conditional{
    public static void main(String[] args) {
        //initialize scanner
        Scanner sc = new Scanner(System.in);
        //ask user to enter age
        System.out.println("Enter your age...");
        int age = sc.nextInt();

         //if age is less than or equal to 12 print "kid"
        if (age <= 12){
            System.out.println("Kid");
        }
        // if age is grater than 12 print "young"
        else if(age > 12){
            System.out.println("young");
        }
    }
}