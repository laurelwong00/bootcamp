package week4.Sport;

public interface Action {
  
  void run();
  void walk();
  default void swim() { //person可以選擇繼承or not的 instance method
    System.out.println("swimming");
  }
  static void sleep() { //static method
    System.out.println("sleeping");
  }

  public static void main(String[] args) {
    Action.sleep();
    Person p = new Person();
    p.swim();
    p.sleep(); //sleep is not instance method
  }
}
