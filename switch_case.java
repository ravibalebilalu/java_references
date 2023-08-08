//import scanner 
import java.util.Scanner;
public class switch_case{
    public static void main(String[] args) {
        
        //create a scanner object and assign a variable to capture user input
        Scanner sc = new Scanner(System.in);
        //ask user to enter day
        System.out.println("Enter day...");
        int day = sc.nextInt();
        //switch case start here
        switch(day){
            
            case 0:
            System.out.println("SUNDAY");
            break;

            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thursday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            default:
            System.out.println("Enter valid day");
        }
    }
}