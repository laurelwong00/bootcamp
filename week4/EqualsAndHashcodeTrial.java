package week4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EqualsAndHashcodeTrial {
  
class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
      this.name = name;
      this.age = age;
  }
}
public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;
  Person person = (Person) o;
  return age == person.age && Objects.equals(name, person.name);
}
public static void main(String[] args) {
  Map<Person, Integer> map = new HashMap<>();

  Person person1 = new Person("Alice", 30);
  Person person2 = new Person("Alice", 30);

  map.put(person1, 1);
  map.put(person2, 2);

  System.out.println("Size of map: " + map.size());  //1
  System.out.println("Value for person1: " + map.get(person1));  //1
  System.out.println("Value for person2: " + map.get(person2));  //2
}
//with overriden equals(), it senses that the 2 new entries are with same value attributes so will be considered 1 object only, 
//that's why size is 1. but since without hashcode(), 
//in terms of hashcode it is still legal to form 2 same new objects with different hashcodes.


}

