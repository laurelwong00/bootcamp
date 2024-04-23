package week4.Abstracts;

public class SuperCat extends SuperAnimal{
  private int age;

  public SuperCat(int age) {
    super();
    this.age = age;
  }

  public SuperCat(int age, String name) {
    super(name);
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public void sleep() {
    System.err.println("cat is sleeping" + "haha");
  }

  @Override
  public void eat() {
    System.out.println("cat is eating");
  }

  @Override
  public void sit() {
    System.out.println("cat is sitting");
  }

  public static void main(String[] args) {
    SuperCat sc = new SuperCat(3, "Jelly");
    sc.getName();
    System.out.println(sc.getAge());
    System.out.println(sc.getName());
    sc.sleep();
    sc.eat();

    SuperCat sc2 = sc;
    System.out.println(sc2 == sc);
    System.out.println(sc2.equals(sc));
  }
}
