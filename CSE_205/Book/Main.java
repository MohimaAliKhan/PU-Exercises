
package Book;


public class Main {
   public static void main (String[] args){ 
   Book a = new Book ("Harry Potter","J.K Rowling", 1997,500);
   Book b = new Book ("Dark Region","Mansura Anzum", 2018,600);
    a.setCover("DAvid");
    b.setCover("Hafsa");
    a.displayDetails();
    System.out.println("Cover Artist:"+a.getCover());
    b.displayDetails();
    System.out.println("Cover Artist:"+b.getCover());
    
    System.out.println("\n");
    
    a.applyDiscount(10);
    b.applyDiscount(10);
    a.displayDetails();
    b.displayDetails();
   }
}
