package week4.List;

import java.util.ArrayList;
import java.util.List;

public class SuperArrayList extends ArrayList<Book> {

  private Arraylist<Book>books;
  
  public void inserthead(Book book) {
    List<Book> books = super.subList(0, super.size() - 1); //retrieve the original list
    
  }
}
