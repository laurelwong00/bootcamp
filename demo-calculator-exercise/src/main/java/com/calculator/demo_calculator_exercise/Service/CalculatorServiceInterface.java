package com.calculator.demo_calculator_exercise.Service;

import com.calculator.demo_calculator_exercise.Model.ResultResponse;

public interface CalculatorServiceInterface {
  
  public ResultResponse calculate(String x, String y, String operation) throws NumberFormatException, IllegalArgumentException, ArithmeticException;
}
