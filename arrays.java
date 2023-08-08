import javax.sound.midi.SysexMessage;

public class arrays{
  public static void main(String[] args) {
    String [] names = {"shreekrishna","madhava","hari","radhamadhava","narasimha","gopilola"};
    //length of array
    System.out.println("Length of names :" + names.length);
    //iterating array eliments
    System.out.println("For loop :");
    for (int x = 0;x < names.length;x++){
      System.out.println(names[x]);
    }
    //for each looping
    System.out.println("For each loop :");
    for (String i:names){
      System.out.println(i);
    }
    //calculating sum of array using for each loop
    System.out.println("Sum of array :");
    int [] scores = {45,65,34,23,89,34,67,55,99,87,68,59};
    int total = 0;
    for (int s:scores){
      total += s;
    }
    System.out.println(total);
  }
}