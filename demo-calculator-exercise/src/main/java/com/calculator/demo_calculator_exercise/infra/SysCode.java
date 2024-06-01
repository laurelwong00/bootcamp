package com.calculator.demo_calculator_exercise.infra;

import lombok.Getter;

@Getter
public enum SysCode {
  OK(0, "success"),
  NOT_FOUND(1, "not found"),
  ;

  private int code;
  private String desc;

  private SysCode(int code, String desc) {
    this.code = code;
    this.desc = desc;
  }
}
