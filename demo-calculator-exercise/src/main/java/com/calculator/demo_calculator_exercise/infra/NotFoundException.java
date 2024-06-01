package com.calculator.demo_calculator_exercise.infra;

public class NotFoundException extends BusinessException {
  
  public NotFoundException() {
    super(SysCode.NOT_FOUND);
  }
}
