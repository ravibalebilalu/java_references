/*Assuming there is an author named "Ravi" who wrote books about java
 * programing and publishes by his own publication named "Rk publications",
 * below code demonstrate how we can use static variable in class
 */
class Book{
    String title;//changes with book
    static String author;//static variable: same author
    int edition;//changes with repitative publication 
    static String publisher;//static variable:same publisher
    int pages; //changes with book
    int price;//changes with book and editions

    void details(){
        System.out.println(
            "Title : " + title +
            "\nAuthor : " + author + 
            "\nEdition : " + edition + 
            "\nPublisher : " + publisher +
            "\nPages : " + pages + 
            "\nPrice : " + price
        );
        System.out.println(".................");
    }
}




public class static_variables {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Made Simple";
        b1.author = "Ravi";//need not to change
        b1.edition = 1;
        b1.publisher = "Rk publications";//need not to change
        b1.pages = 230;
        b1.price = 250;
        System.out.println("First book :");
        b1.details();
        

        Book b2 = new Book();
        b2.title = "Advanced Java";
        b2.edition = 1;
        b2.pages = 489;
        b2.price = 652;
        System.out.println("Second book :");
        b2.details();


    }
}
