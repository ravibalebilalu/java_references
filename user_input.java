import java.util.Scanner;
public class user_input{
    public static void main(String[] args) {
        //initialize scanner object
        Scanner sc = new Scanner(System.in);
        
        //ask user to enter name
        System.out.println("Enter ypur name ...");
        String name = sc.nextLine();

        //ask user  to enter age
        System.out.println("Enter your age...");
        int age = sc.nextInt();

        //ask user to enter about meritial state
        System.out.println("Are you  married?");
        System.out.println("If maried enter true, else false");
        boolean ismarried = sc.nextBoolean();

        //Ask user to enter weight
        System.out.println("Enter your weight...");
        double weight = sc.nextDouble();
        //print all the informations
        System.out.println(name + " of "+ age +" year old");
        System.out.println("This person weight is " + weight + " kg and meritial state is "+ ismarried);
        sc.close();

    }
}