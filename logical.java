
import java.util.Scanner;
public class logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        //ask user for age
        System.out.println("Enter your age...");
        int age = sc.nextInt();
        
        if (age <=12)
        {System.out.println("Kid");}
        
        else if (age > 12 && age <=19)
        {System.out.println("Teenager");}

        else if (age > 19 && age <=40)
        {System.out.println("Young");}

        else if (age >40 && age <100)  
        {System.out.println("Old");}

        else if (age >= 100)
        {
        System.out.println("A centurian!");
        }

    }
}
