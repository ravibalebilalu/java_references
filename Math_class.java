public class Math_class {
    public static void main(String[] args) {
        //absolute value
        int xab = -10;
        int yab = Math.abs(xab);
        System.out.println("Absolute value of "+ xab + " is " + yab);

        //ceiling a double
        double xce  = 3.14;
        double yce = Math.ceil(xce);
        System.out.println("Ceiling of " + xce + " is "+ yce);

        //flooring a double

        double xfl = 3.14;
        double yfl = Math.floor( xfl);
        System.out.println("flooring of " + xfl + " is " + yfl);
        

        //minimum value 
        System.out.println("Minimum : "+ Math.min(3,6));

        //maximum value
        System.out.println("Maximum : " + Math.max(3,6));

        //power of number
        double xbase  = 20;
        double power = 2;
        System.out.println(xbase + " raised to " +  power + " is equal to " + Math.pow(xbase,power));

    
    }
}
