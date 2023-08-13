 /* This is the code to demonstrate inheritance in java 
 we need two classes to experiment with inheritance */

 //basic calculator class
 class Calc{
    public int add(int a,int b){
        return a + b;
    }

    public int sub(int a,int b){
        return a - b;
    }
 }
//advanced calculator class which inherits from basic class
 class AdvCalc extends Calc{
    public int multiplier(int x,int y){
        return x * y;
    }

    public double  devider(double p,double q){
        return p/q;
    }
 }

 public class inheritance{
    public static void main(String[] args) {
        //new object is advanced class
        AdvCalc calculator = new AdvCalc();
        
        System.out.println("Addittion :"+ calculator.add(56, 4));
        System.out.println("Subtraction :"+ calculator.sub(56 , 4));
        System.out.println("Multiplication :" + calculator.multiplier(10, 20));
        System.out.println("Division :" + calculator.devider(50, 3.14));
        
    }
 }