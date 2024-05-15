package week4.Generics.Cat;

import java.util.ArrayList;
import java.util.List;

public class Animal {
  public static void main(String[] args) {
    List<Object> obj = new ArrayList<>();
    Cat.addCat(obj);
    List<Cat> cats = new ArrayList<>();
    Cat.addSomething(cats); // why need call another class?
    cats.add(new Cat());
  }
}
