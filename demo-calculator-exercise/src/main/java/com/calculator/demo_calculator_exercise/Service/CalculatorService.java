package com.calculator.demo_calculator_exercise.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

import com.calculator.demo_calculator_exercise.Model.ResultResponse;

@Service
public class CalculatorService implements CalculatorServiceInterface{

  @Override
  public ResultResponse calculate(String x, String y, String operation) throws NumberFormatException, IllegalArgumentException, ArithmeticException{
    double numX = Double.parseDouble(x);
    double numY = Double.parseDouble(y);

    switch (operation) {
      case "add":
        return new ResultResponse(x,y,operation,String.valueOf(numX + numY));
      case "sub":
        return new ResultResponse(x,y,operation,String.valueOf(numX-numY));
      case "mul":
        return new ResultResponse(x,y,operation,String.valueOf(numX * numY));
      case "div":
        return new ResultResponse(x,y,operation,BigDecimal.valueOf(numX/numY).setScale(5, RoundingMode.HALF_UP).toString());
      default:
        throw new IllegalArgumentException("Invalid Operation");
    }
  }
}
