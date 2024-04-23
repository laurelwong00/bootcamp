package week4.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

  private double price;
  private String author;

  public Book(double price, String author) {
    this.price = price;
    this.author = author;
  }

  private String getAuthor() {
    return this.author;
  }

  private double getPrice() {
    return this.price;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Book))
      return false;
    Book book = (Book) obj;
    return Objects.equals(this.price, book.getPrice())
        && Objects.equals(this.author, book.getAuthor());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getPrice(), this.getAuthor());
  } 

  @Override
  public String toString() {
    return "Book (" + "Price=" + this.price + " Author is " + this.author + ")";
  }
  public static void main(String[] args) {
    Book[] books = new Book[2];
    books[0] = new Book(10.2d, "Vincent");
    books[1] = new Book(8.4, "Jenny");

    System.out.println(books[0].author);
    System.out.println(books[0].getAuthor());

    // Array-list
    ArrayList<Book> books2 = new ArrayList<>();
    books2.add(new Book(3.4d, "Sally"));
    books2.add(new Book(3.4d, "Vincent"));
    books2.add(new Book(3.4d, "Tommy"));

    System.out.println(books2.size());
    books2.add(new Book(100.2d, "John"));
    System.out.println(books2.size());
    books2.add(new Book(50.2, "Vincent"));

    System.out.println(books2.contains(new Book(3.4d, "Vincent"))); // false ?

    //remove()
    books2.remove(new Book(50.2, "Vincent"));
    System.out.println(books2);

    books2.remove(0);
    System.out.println(books2.size()); 

    books2.set(0, new Book(29.8, "Bawa"));
    System.out.println(books2);

    System.out.println(books2.isEmpty()); 

    System.out.println(books2.subList(0,3)); //only 1 to 2

    ArrayList<Book> books3 = new ArrayList<>(List.of(new Book(10,"Babybara"), new Book(20, "Minibara")));
    List<Book> books4 = List.of(new Book(10,"Babybara"), new Book(20, "Minibara"));
    //ok if no modifications

    System.out.println(books3.size());
    System.out.println(books4.size());

    books3.add(new Book(10.9, "Cherry"));
    //books4.add(new Book(10.9, "Oscar")); // not allowed
  }
}
