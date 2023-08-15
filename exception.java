public class exception {

    public static void main(String[] args) {
        String result;
        String names [] =  {"Java","python","Cpp"};
         /*as length off our array is 3,if we access 4th element 
         out put will return  error.if we use 'try catch' we can 
         replace error by usefull value*/


        try{
            result = names[3];
        }catch(Exception e){
            result = "Other";
        }
        System.out.println(result);
         
    }
}
