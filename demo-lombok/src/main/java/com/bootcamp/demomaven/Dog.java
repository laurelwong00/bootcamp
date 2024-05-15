package com.bootcamp.demomaven;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter


public class Dog {
  private String name;
  private int age;

  public Dog(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    Dog dog = new Dog("Vincent", 3);
    dog.setAge(10);
    System.out.println(dog.getAge());
  }
}
