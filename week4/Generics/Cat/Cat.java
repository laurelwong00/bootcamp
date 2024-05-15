package week4.Generics.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cat extends Animal{
  
  public static void addCat(List<? super Animal> cats) {
    // ? element = (?) new Animal();
    cats.add(new Cat());
    cats.add(new RedCat());
    cats.add(new Animal());
    // cats.add(new Object());
  }

  public static <T extends Cat> void addSomething(List<T> list) {
    T element = (T) new Cat();
    list.add(element);
    // list.add(new RedCat());
  }

  public static <T extends Cat> void addCat1(List<T> cats) {
    // cats.add(new Cat());
    // cats.add(new RedCat()) ;
    // cats.add(new Animal());
  }


  public static void addCat3(List<Animal> cats) {
   
  }

  public static void addCat2(List<Cat> cats) {
   
  }

  public static <T extends List<U>, U extends Animal> void addSome(T list) {
    // Method body
  }

  public static int add(Object a, Object b) {
    if (!(a instanceof Integer)) {
      throw new IllegalArgumentException("a is not integer");
    }
    if (!(b instanceof Integer)) {
      throw new IllegalArgumentException("b is not integer");
    }
    return (int) a+ (int) b;
  }


  public static int middle(Object a, Object b) {
    int c = 0;
    c = add(a,b);
    // try {
    //   c = add(a,b);
    // } catch (IllegalArgumentException e) {
    //   System.out.println("none of my business");
    // }
    return c;
  }


  public static void main(String[] args) {
    addCat(new ArrayList<>(List.of(new Animal(), new Animal())));
    addCat(new ArrayList<>(List.of(new Cat(), new Cat())));
    addCat(new ArrayList<>(List.of(new RedCat(), new RedCat())));

    addCat2(new ArrayList<>(List.of(new RedCat(), new RedCat())));
    addCat2(new ArrayList<>(List.of(new Cat(), new Cat())));
    //addCat2(new ArrayList<>(List.of(new Animal(), new Animal())));

    ArrayList<RedCat> a = new ArrayList<RedCat>();
    addSomething(a);
    // System.out.println(a.get(0).getClass());

    ArrayList<Cat> b = new ArrayList<Cat>();
    addSomething(b);
    // System.out.println(b.get(0).getClass());
    

    Object c = 1.5;
    Object d = 4;
    try {
      middle(c, d);
      System.out.println("no error received");
    } catch (IllegalArgumentException err) {
      System.out.println(err.getMessage());
    } finally {
      Object[] arr = new Object[]{c,d};
      System.err.println(Arrays.toString(arr));
    }
  }
}
