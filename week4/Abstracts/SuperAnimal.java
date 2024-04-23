package week4.Abstracts;

public abstract class SuperAnimal extends SuperObject { //1. you can't create an object for SuperAnimal

  private String name;

  public SuperAnimal(){ //2.Abstract class is still having constructor

  }

  public SuperAnimal(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sleep() {
    System.err.println("cat is sleeping");
  }

  public abstract eat() { //3. Abstract method, but it is a method signature only
    //the child class has to implement it. 一係唔好extend, 一係child 要終結返abstract method
  }

  public abstract sit() {

  }

  // 4. Automatically inherits abstract method from parent abastract class

  public static void main(String[] args) {
    //SuperAnimal sa = new SuperAnimal() ; //can't work
  }
}
