package com.calculator.demo_calculator_exercise.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.calculator.demo_calculator_exercise.Model.Body;
import org.springframework.web.bind.annotation.RequestParam;

import com.calculator.demo_calculator_exercise.Model.ResultResponse;

public interface CalculatorOperator {
  @GetMapping(value = "/{x}/{y}/{operation}")
  public ResultResponse calculate1(
      @PathVariable String x,
      @PathVariable String y,
      @PathVariable String operation);

  @GetMapping(value = "/operation")
    public ResultResponse calculate2(
        @RequestParam String x,
        @RequestParam String y,
        @RequestParam String operation);

  @PostMapping(value = "/operation")
    public ResultResponse calculate3(
        @RequestBody Body body
    );

}
