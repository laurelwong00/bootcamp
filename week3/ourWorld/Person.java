package week3.ourWorld;
import java.util.Random;

import javax.management.loading.PrivateMLet;

public class Person {

  public int age;
  public String name;
  public char bloodType;
  public boolean isDownSyndrome;
  public Pet[] pets;
  
  public Person(String name, char bloodType) {
    this.age = 0;
    this.name = name;
    this.isDownSyndrome = new Random().nextBoolean();
    this.bloodType = bloodType;
    this.pets = new Pet[3];
  }

  public void adoptPet(String type, int size) {
    Pet pet = new Pet(size, type); 
    for (int i = 0; i< this.pets.length; i++) {
      if (this.pets[i] == null) {
        this.pets[i] = pet;
      }
    }
  }
}
