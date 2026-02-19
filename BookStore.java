public class BookStore{
  //attributes
  private String title;
  private String author;
  private String isbn;
  private double price;
  private int availableCopies;

  //constructors
  public BookStore(String title, String author, String isbn, double price, int availableCopies){
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.price = price;
    this.availableCopies = availableCopies;
}

  //getter methods
  public String getTitle() {
    return title;
}
  public String getAuthor() {
    return author;
}
  public String getIsbn() {
    return isbn;
}
  public double getPrice() {
    return price;
} 
  public int getAvailableCopies() {
    return availableCopies;
}

  //displaying book info
  public void displayBookInfo() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("ISBN :" + isbn);
    System.out.println("Price: " + price);
    System.out.println("Available Copies: " + availableCopies);
    System.out.println();
}

  //selling book
  public void sellBook() {
    System.out.println();
    if(availableCopies > 0) {
      availableCopies --;
      System.out.println("Sale successful! Remaining Copies " + availableCopies);
} else {
      System.out.println("Sale failed! No copies available.");
    }
}

  //restock book
  public void restockBook(int quantity) {
    if(quantity > 0) {
      availableCopies += quantity;
      System.out.println("Restock successful! Available copies: " + availableCopies);
    } else {
      System.out.println("Invalid restock quantity.");
    }
}
}
