package week3.newClassExample;

public class Car {
  // Attributes
  private String color; // 因爲private, 不想比人看到, 但是car自己知道自己color

  private double speed;

  private int capacity;

  private boolean isOverSpeed; //false //多餘 -> we should use speed to derive isOverSpeed()
  //should be only a method not an attribute

  // 你都可以Print hello但係車唔會say hello 笑死

  // Behaviour or instance methods //eg driver just 踩, but 加速器負責加速, brake負責停,
  // button負責開門
  // 要Define 好每個object的行爲, driver如何觸發
  // Setter
  //要both Getter Setter 因爲 variable private
  public void setColor(String color) {
    this.color = color;
  }

  // Getter
  public String getColor() {
    return this.color;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
    if (speed > 90){
      this.isOverSpeed = true;
    }
  }

  public double getSpeed() {
    return this.speed;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getCapacity() {
    return this.capacity;
  }
  

  public static void main(String[] args) {
    System.out.println("I am your new car");
    Car c = new Car(); // c-> object reference
    Car c2 = new Car();
    c.setColor("RED");
    c.setSpeed(3.8);
    c.setCapacity(5);
    c2.setColor("BLUE");
    c2.setSpeed(2.3);
    c2.setCapacity(4);
    System.out.println(c.getColor());// RED
    System.out.println(c.getSpeed());
    System.out.println(c.getCapacity());
    System.out.println(c.toString());
  }
  public static void printer(String[] args) {
    Car car = new Car();
    car.setSpeed(0);
    System.out.println(car.getColor()); //null, 
    System.out.println(car.getSpeed()); //0.0
    System.out.println(car.getCapacity()); //0
    if (car.isOverSpeed()){

    }

    //int[] integers = null;
    //integers[0] = 1; //null pointer exception
  }

}
