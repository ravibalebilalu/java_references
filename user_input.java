//import scanner class from java utils package
import java.util.Scanner;


public class user_input{
    public static void main(String[] args) {
        //declare scanner object
        Scanner sc = new Scanner(System.in);
        //ask user to input name
        System.out.println("Enter your name ...");
        //assign user name to name variable
        String name = sc.nextLine();

        //ask user to input age
        System.out.println("Enter your Age..");
        //asign user age to age variable
        String age = sc.nextLine();

        //print the name and age
        System.out.println("Your name is "+ name + " and you are " + age + " year old.");
        //close the scanner object
        sc.close();
    }
}
