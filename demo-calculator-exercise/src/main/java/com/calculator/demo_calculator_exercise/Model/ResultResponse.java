package com.calculator.demo_calculator_exercise.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ResultResponse {
  private String x;
  private String y;
  private String operation;
  private String result;
}
