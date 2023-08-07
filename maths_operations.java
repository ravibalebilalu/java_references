public class maths_operations {
    public static void main(String[] args) {
        int x = 30;
        int y = 40;
        //basic math opertaions
        System.out.println(x + y);
        System.out.println(y - x);
        System.out.println(x * y);
        System.out.println(x/y);
        //we cant get right answer if we declare variables as int while division

        double result = y/x;
        System.out.println(result);
        //declaring variable as double
        double xd = 30;
        double yd = 40;
        double result_d = yd/xd;
        System.out.println(result_d);
        //modulo of an integer
        int a = 33;
        System.out.println(a%5);
        //concatination of two strings
        String one = "Hellow";
        String two = "World";
        System.out.println(one + " " +two);

    }
}
