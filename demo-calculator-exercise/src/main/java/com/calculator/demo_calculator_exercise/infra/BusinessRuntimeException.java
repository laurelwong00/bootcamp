package com.calculator.demo_calculator_exercise.infra;

public class BusinessRuntimeException extends RuntimeException{
  
  private int code;

  public BusinessRuntimeException(SysCode sysCode) {
    super(sysCode.getDesc());
    this.code = sysCode.getCode();
  }

  public int getCode() {
    return this.code;
  }
}
