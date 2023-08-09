public class java_method{
//method to add two integers
    static int add_numbers(int a,int b){
        return a+b;
    }

    //method to find a number is odd or even
    static String odd_even(int num){
        if (num%2 ==0){
            return "even";
        }else{
            return "odd";}

    }

    public static void main(String[] args) {
        //call the method and assign the result to a variable
        int result = add_numbers(45, 89);
        System.out.println("Sum of two numbers :");
        System.out.println(result);

        System.out.println("Check a number odd or even :");
        System.out.println("givan number is : " +odd_even(4));
        System.out.println("Check array elements for odd or even :");
        int [] my_list = {4,6,7,9,0,56};

        for (int number : my_list){
            String results = number + " is "+ odd_even(number);
            System.out.println(results);
        }
    }

    
}