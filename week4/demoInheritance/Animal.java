package week4.demoInheritance;

public class Animal {
  private String name;
  public static String x = "abc";
  public Animal() {


  }

  public Animal(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sleep() {
    System.out.println("sleepingzzz");
  }

  public void run() {
    System.out.println("running");
  }

  private void hello() {
    System.out.println("hello"); //cant be inherited
  }

  public String lowerY() {
    return Cat.y.toLowerCase();
  }
  public static void main(String[] args) {
    Animal animal = new Animal();
    System.out.println(animal.lowerY());
  }
}
