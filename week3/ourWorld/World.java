package week3.ourWorld;
import java.util.Scanner;

public class World {

  public int year;
  public Person[] persons;

  public World() {
    year = 0;
    persons = new Person[10];
  }

  public void addPerson(String name, char bloodType) {
    Person person = new Person(name, bloodType);
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] == null) {
        persons[i] = person;
      }
    }
  }

}
