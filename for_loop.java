public class for_loop{
    public static void main(String[] args) {
        //simple for loop
        System.out.println("Simple for loop :");
        for(int i = 1;i<=10;i++) {
            System.out.println(i);
        }
        //for loop with break
        System.out.println("For loop with break :");
        for (int x=0;x<=10;x++){
            if(x==5){
                
                
                break;
            }
            System.out.println(x);
        }
        System.out.println("For loop with continue :");

        //for loop with continue
        for (int s = 10;s<20;s+=2){
            if (s == 16){
                continue;
            }
            System.out.println(s);
        }
    }
}