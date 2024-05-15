package com.bootcamp.demomaven;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Builder
@Getter

public class Staff {
  public String name;
  public Staff(String name) {
    this.name = name;
  }
}
