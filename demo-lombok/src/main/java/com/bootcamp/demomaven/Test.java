package com.bootcamp.demomaven;

public class Test {
  public static void main(String[] args) {
    Staff s1 = new Staff("Vincent");
    Staff s2 = new Staff("Vincent");
    System.out.println(s1.equals(s2));
    System.out.println(s1.hashCode() == s2.hashCode());
    Dog d1 = new Dog("Jenny", 1);
    Dog d2 = new Dog("Jenny", 1);
    System.out.println(d1.equals(d2)); 
    System.out.println(d1.hashCode() == d2.hashCode());


    Customer c1 = new Customer("Vincent");
    c1.add(new Order("01"));
    Customer c2 = new Customer("Vincent");
    c2.add(new Order("01"));
    System.out.println(c1.equals(c2)); //order沒annotate equals 
    System.out.println(c1.orderCount()); //1
    System.out.println(c1.isVIP());

    Staff s = Staff.builder().name("Vincent").build();
    System.out.println(s);
    System.out.println(s.getName());
  }
  }