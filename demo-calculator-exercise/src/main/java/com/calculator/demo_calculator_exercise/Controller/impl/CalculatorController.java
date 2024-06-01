package com.calculator.demo_calculator_exercise.Controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.demo_calculator_exercise.Controller.CalculatorOperator;
import com.calculator.demo_calculator_exercise.Model.Body;
import com.calculator.demo_calculator_exercise.Model.ResultResponse;
import com.calculator.demo_calculator_exercise.Service.CalculatorService;

@RestController
public class CalculatorController implements CalculatorOperator {
  @Autowired
  CalculatorService calculatorService;

  @Override
  public ResultResponse calculate1(String x, String y, String operation) {
    return calculatorService.calculate(x, y, operation);
  }

  @Override
  public ResultResponse calculate2(String x, String y, String operation) {
    return calculatorService.calculate(x, y, operation);
  }

  @Override
  public ResultResponse calculate3(Body body) {
    return calculatorService.calculate(body.getX(), body.getY(), body.getOperation());
  }
  

}
