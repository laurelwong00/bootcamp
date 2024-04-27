package week4.Generics.Cat;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal{
  
  public static void addCat(List<? super Cat> cats) {
    cats.add(new Cat());
    cats.add(new RedCat());
    cats.add(new Animal());
  }

  public static <T extends Animal> void addCat1(List<T> cats) {
    cats.add(new Cat());
    cats.add(new RedCat());
    cats.add(new Animal());
  }


  public static void addCat3(List<Animal> cats) {
   
  }

  public static void addCat2(List<Cat> cats) {
   
  }

  public static void main(String[] args) {
    addCat(new ArrayList<>(List.of(new Animal(), new Animal())));
    addCat(new ArrayList<>(List.of(new Cat(), new Cat())));
    addCat(new ArrayList<>(List.of(new RedCat(), new RedCat())));

    addCat2(new ArrayList<>(List.of(new RedCat(), new RedCat())));
    addCat2(new ArrayList<>(List.of(new Cat(), new Cat())));
    //addCat2(new ArrayList<>(List.of(new Animal(), new Animal())));





  }
}
