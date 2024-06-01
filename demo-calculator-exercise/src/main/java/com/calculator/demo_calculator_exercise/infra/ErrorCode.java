package com.calculator.demo_calculator_exercise.infra;

import lombok.Getter;

@Getter
public enum ErrorCode {
  INVALID_INPUT_TYPE(9,"Invalid Input."),
  NFE(9, "Number Format Exception"),
  AE(99, "Arithmetic Exception"),
  IOE(99,"IOException"),
  NPE(99, "Null Pointer Exception");

  private final int code;
  private final String desc;

  ErrorCode(int code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  public int getCode() {
    return this.code;
  }

  public String getDesc() {
    return this.desc;
  }

  @Override
  public String toString() {
    return this.code + ":" + this.desc;
  }
}
