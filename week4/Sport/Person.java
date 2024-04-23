package week4.Sport;

public class Person implements Action{
  
  @Override
  public void run() {
  System.out.println("running");
  }
  @Override
  public void walk() {
    System.out.println("walking");
  }
  @Override
  public void swim() {
    System.out.println("swimming");
  }
  public void cry() {
    System.out.println("crying");
  }

  public static void main(String[] args) {
    Action a = new Person();
    //Person p = null;
    if (a instanceof Person) {
      Person p = (Person)a; // p = (Person) a;
      p.cry();
    }
  }
}
