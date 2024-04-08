package week3.newClassExample;

public class Dog {

  private int age;
  private String firstName;
  private String lastName;

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

// Getter and setter methods for firstName
public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

// Getter and setter methods for lastName
public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

  public Dog(int age, String firstName, String lastName) {
    Dog dog = new Dog(8, "John", "Lau");
    this.age = age;
    this.firstName = firstName;
    this.lastName = lastName;
    System.err.println(dog.toString());
}


