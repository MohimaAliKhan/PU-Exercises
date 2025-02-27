
package Book;


public class Book {
    
    private String title;
    private String author;
    private int yearPublished;
    private double price;
    private String coverArtist;
    
    
   public Book(String title,String author,int yearPublished,double price) {
      this.title = title;
      this.author= author;
      this.yearPublished = yearPublished;
      this.price = price;
    
    }
    
    public void displayDetails(){
    
    System.out.println("Book's name:"+title);
    System.out.println("Author:"+author);
    System.out.println("Publishing year:"+yearPublished);
    System.out.println("Price:"+price);
    }
    
    public void applyDiscount(double discount){
     this.price= price - price*discount/100;
    }
    
    public void setCover( String coverArtist){
    this.coverArtist=coverArtist; }
    
    public String getCover() {
    return this.coverArtist;
    }
}
