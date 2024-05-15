package com.bootcamp.demomaven;

public class Cat {
  private String name;
  private int age;


  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // public Cat(String name, int age) {
  //   if (name == null) {
  //     throw new NullPointerException("Name cannot be null but is null");
  //   } else {
  //     this.name = name;
  //     this.age = age;
  //   }
  // }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    Cat c = new Cat("bawa", 1);
  }
}
