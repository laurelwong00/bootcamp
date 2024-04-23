package week4.Objects;

public class Person {
  
  private Dog dog;

  public Dog getDog() {
    return this.dog;
  }

  public void setDog(Dog dog) {
    this.dog = dog;
  }

  public static void main(String[] args) {
    Person vincent = new Person();
    vincent.setDog(new Dog(Color.BLACK));

    Dog vincentDog1 = vincent.getDog();

    vincent.setDog(new Dog(Color.RED));

    Dog vincentDog2 = vincent.getDog();

    Person oscar = new Person();
    vincent.setDog(new Dog(Color.BLACK));

    Dog oscarDog = oscar.getDog();
  }
  
}
