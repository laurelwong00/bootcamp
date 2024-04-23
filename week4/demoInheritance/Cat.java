package week4.demoInheritance;

public class Cat extends Animal{
  //Child class Cat object inherit all instance variables. instance method from parent class Animal object;
  // but it does not inherit constructor
  public Cat(){

  }
  private int age;

  private String CatName;

  public static String y = "DEF";

  public Cat(int age, String name) {
    super(name);
    this.age = age;
  }
  public String getCatName(){
    return CatName;
  }

  public void setCatName(String CatName) {
    this.CatName = CatName;
  }
  //Approach 2
  public String getAnimalName() {
    return "The name is cat " + super.getName();
  }

  public void setAge(int age) {
    this.age = age;
  }
  public int getAge() {
    return age;
  }
  public Cat(int age) {
    super(); //create Animal's constructor
    this.age = age;
  }
  @Override
  public void sleep() {
    System.out.println("sleepingzzz");
  } 

  public String upperX() {
    return Animal.x.toUpperCase();
  }
  
  public static void main(String[] args) {
    Cat cat = new Cat(13, "Jenny");
    cat.CatName = "Jenmiao";
    System.out.println(cat.getName()); //"Jenny"
    System.out.println(cat.getCatName());
    System.out.println(cat.getAnimalName());

    //cat has its own instance variable
    cat.setAge(10);
    System.out.println(cat.getAge());
    System.out.println(x);
    
    cat.sleep();
    cat.run();
    
  }
}
