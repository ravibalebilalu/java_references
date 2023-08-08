public class while_loop{
     public static void main(String[] args) {
          //to find sum of 1 to 100
          int x = 0;
          int sum = 0;
          while (x <= 100){
               
          sum += x;
          x += 1;
          }
          System.out.println("Total sum of numbers from  1 to 100 : "+sum);
          //display the numbers from 1 to 10
          int d = 0;
          while (d < 10){
               d += 1;
               System.out.println(d);
          }
         
          //do while
          System.out.println("Do while loop :");
          int num = 1;
          do{
               System.out.println(num);
               num++;
          }while(num < 5);
     }

}