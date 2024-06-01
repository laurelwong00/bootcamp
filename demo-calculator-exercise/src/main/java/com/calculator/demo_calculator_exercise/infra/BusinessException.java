package com.calculator.demo_calculator_exercise.infra;

public class BusinessException extends Exception{
  
  private int code;

  public BusinessException(SysCode sysCode) {
    super(sysCode.getDesc());
    this.code = sysCode.getCode();
  }

  public int getCode() {
    return this.code;
  }

}
