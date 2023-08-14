/* This code demonstrates how ploymorphism and override works. Asuming we have a desktop computer and a laptop we practice coding 
in desktop by following a youtube titorial which playing in laptop*/



class Computer{
    public void turnOn(){
        System.out.println("Computer is turning On.....");
    }

    public void turnOff(){
        System.out.println("Computer is turning Off...");
    }

    public void coding(){
        System.out.println("Coding is done...");
     }
     public void runYoutube(){
        System.out.println("Youtube is running ...");
     }
}

class Laptop extends Computer{
     public void turnOn(){
        System.out.println("Laptop is turning on...");
     }

     public void turnOff(){
        System.out.println("Laptop is turning Off....");
     }
     
     public void coding(){
        System.out.println("Coding is done in laptop...");
     }

     public void runYoutube(){
        System.out.println("Youtube is running in laptop  ...");
     }
}

class Desktop extends Computer{
 public void turnOn(){
    System.out.println("Desktop is turning on...");
 }
 public void turnOff(){
    System.out.println("Desktop is turning off...");
 }
 public void coding(){
    System.out.println("Coding is done in desktop...");
 }

 public void runYoutube(){
    System.out.println("Youtube is running in desktop ...");
 }
}

public class Polymorphism{
    public static void main(String[] args) {
        Computer computer =new Computer(); 
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

         
         laptop.turnOn();
        desktop.turnOn();
        laptop.runYoutube();
        desktop.coding();
        desktop.turnOff();
        laptop.turnOff();
    
    }
}