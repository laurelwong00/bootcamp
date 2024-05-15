package com.bootcamp.demomaven;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.NonFinal;

@AllArgsConstructor
@RequiredArgsConstructor
@NonNull
public class Student {
  @Getter
  private String name; //only have getter
  @Setter
  private int age; //only have setter

  public static void main(String[] args) {
    Student st1 = new Student("Vincent", 1);
    System.out.println(st1.getName());


    st1.setAge(3);
  }
}
