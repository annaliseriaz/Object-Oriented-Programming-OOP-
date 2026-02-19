public class BookStoreMain {
  public static void main(String[] args) {
    //book 1 info
    BookStore myBook1 = new BookStore("Java Programming", "James Gosling", "978-134685991", 45.99, 10);
    System.out.println("=== Book 1 Information ===");
    myBook1.displayBookInfo();

    System.out.println("Selling 1 copy of '" + myBook1.getTitle() + " '...");
    myBook1.sellBook();
    System.out.println();
    System.out.println("Restocking '" + myBook1.getTitle() + "' with 5 copies");
    myBook1.restockBook(5);

    //book 2 info
    BookStore myBook2 = new BookStore("Programming for Beginners", "Tim-Berners Lee", "978-1980370505", 80.75, 20);
    System.out.println("=== Book 2 Information ===");
    myBook2.displayBookInfo();

    System.out.println("Selling 1 copy of '" + myBook1.getTitle() + " '...");
    myBook2.sellBook();
    System.out.println();
    System.out.println("Restocking '" + myBook1.getTitle() + "' with 7 copies");
    myBook2.restockBook(10);

    //book 3 info
    BookStore myBook3 = new BookStore("How to Learn Coding (for no experience ever at coding/programming)", "Bjarne Stroustrup", "978-0321563842", 100.00, 30);
    System.out.println("=== Book 3 Information ===");
    myBook3.displayBookInfo();

    System.out.println("Selling 1 copy of '" + myBook1.getTitle() + " '...");
    myBook3.sellBook();
    System.out.println();
    System.out.println("Restocking '" + myBook1.getTitle() + "' with 3 copies");
    myBook3.restockBook(20);
  }
}
